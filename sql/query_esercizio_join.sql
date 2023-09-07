/*

USARE LA SINTASSI JOIN

seleziona il titolo, le pagine, il prezzo e l'editore
il cui editore è 'bompiani' o 'Einaudi', ordinate per editore e per titolo
*/
select titolo, pagine,prezzo, editore.nome
from libro
inner join editore
on libro.editore_id = editore.id
where editore.nome = "bompiani" or editore.nome = "einaudi"
order by editore.nome and titolo;

/*
seleziona il titolo, le pagine, il prezzo e l'editore
il cui prezzo è inferiore di 10 euro e ordinate per prezzo
*/
select titolo, pagine, prezzo, editore.nome
from libro
inner join editore
on libro.editore_id = editore.id
where prezzo < 10
order by prezzo desc;

/*
seleziona il titolo, le pagine, il prezzo, il nome e il cognome dell'autore
la cui nazionalità è 'en' o 'it' e ordinate per nazionalita
*/
select libro.titolo, libro.pagine, libro.prezzo, autore.nome, autore.cognome, autore.nazionalita
from libro 
inner join autore_libro 
on autore_libro.libro_id = libro.id
inner join autore
on autore_libro.autore_id = autore.id
where nazionalita = 'en' or nazionalita = 'it' 
order by nazionalita desc;

/*
seleziona il titolo e il nome dell'editore
mostrando anche gli editori per i quali non esistono libri a catalogo
*/
select titolo, nome
from libro l
left join editore e 
on e.id = l.editore_id
where e.id is null; 

/*
seleziona gli editori
per i quali non esistono libri a catalogo
*/
select nome
from editore e 
left join  libro l
on e.id = l.editore_id
where e.id is null;

/*
seleziona nome, cognome degli alunni e il nome dell'aula assegnata
ordina per aula
*/
use liceo;
select al.cognome, al.nome, a.nome
from alunni al
join aule a
on a.id = al.aula_id
order by a.id desc;

/*
seleziona nome dell'aule per le quali non sono stati assegnati gli alunni
ordina per aula
*/
select  a.nome
from alunni al 
right join aule a 
on a.id = al.aula_id
where al.aula_id is null
order by aula_id desc; 