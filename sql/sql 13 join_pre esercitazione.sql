use libro;

select l.titolo, e.nome
from libro l
inner join editore e
on l.editore_id = e.id
order by titolo;

-- titolo dei libri e nome e cognome dell'autore
select libro.titolo, autore.nome, autore.cognome
from libro 
inner join autore_libro 
on autore_libro.libro_id = libro.id
inner join autore
on autore_libro.autore_id = autore.id;

-- libri e relativi editori
select titolo, pagine, prezzo, nome editore
from libro l
inner join editore e
on e.id = l.editore_id;
-- on l.editore_id = l.id; e' la stessa cosa

-- voglio ottenere anche i libri per cui non ci sono gli editori
select titolo, pagine, prezzo, nome editore
from libro l
left join editore e
on e.id = l.editore_id;
-- solo gli editori per i quali non ho i libri a catalogo
select nome editore
from libro l
right join editore e
on e.id = l.editore_id
where l.editore_id is null;
-- union
select titolo, pagine, prezzo, nome editore
from libro l
left join editore e
on e.id = l.editore_id
union
select titolo, pagine, prezzo, nome editore
from libro l
right join editore e
on e.id = l.editore_id;
-- solo gli esclusi sia della right che della left
select titolo, pagine, prezzo, nome editore
from libro l
left join editore e
on e.id = l.editore_id
where e.id is null
union
select titolo, pagine, prezzo, nome editore
from libro l
right join editore e
on e.id = l.editore_id
where l.editore_id is null;
-- elenco dei libri e il nome e cognome dell'autore
select titolo, nome, cognome
from libro l
join autore_libro al on l.id = al.libro_id
join autore a on a.id = al.autore_id;
-- anche i libri che non hanno autori
select titolo, nome, cognome
from libro l
join autore_libro al on l.id = al.libro_id
left join autore a on a.id = al.autore_id;
-- anche autori che non hanno i libri
select titolo, nome, cognome
from libro l
join autore_libro al on l.id = al.libro_id
right join autore a on a.id = al.autore_id;
-- cercare autori che non hanno i libri
select titolo, nome, cognome
from libro l
join autore_libro al on l.id = al.libro_id
right join autore a on a.id = al.autore_id
where al.autore_id is null;
-- semplifichiamo la query precedente 
select cognome, nome
from autore_libro al 
right join autore a on a.id = al.autore_id
where al.autore_id is null;
