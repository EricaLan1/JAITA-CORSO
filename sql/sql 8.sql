SELECT titolo, prezzo, nome  -- voglio farmi restituire n occorenze di quello specifico editore
from libro, editore  -- seleziono le tabelle da cui ricaviamo le occorenze
where editore.id = libro.editore_id -- scrivere la condizione
order by nome;

select titolo, cognome,nome
from libro, autore_libro, autore
where libro.id = autore_libro.libro_id
and autore.id = autore_libro.autore_id;

select titolo, prezzo, pagine, editore_id, editore.id,nome, email
from libro, editore
where editore.id = libro.editore_id
and nome = 'mondadori' and prezzo > 15.00;


select libro.titolo, autore.cognome, autore.nome
from libro, editore, autore_libro, autore


where libro.id =  autore_libro.libro_id
and autore.id = autore_id;


-- elenco dei libri, relativi editori e autori (nome e cognome)
select libro.titolo, editore.nome, autore.cognome, autore.nome
from libro, editore, autore, autore_libro
where libro.editore_id = editore.id
and libro.id = autore_libro.libro_id
and autore.id = autore_libro.autore_id;

select l.titolo Titolo, -- As e' opzionale, sono etichette. Automaticamente diventano Alias
		e.nome  Editore,
        a.nome  `Nome autore`,
        a.cognome  `Cognome autore`
from  libro AS l,
	  editore  AS e,
      autore AS a,
      autore_libro AS al
where e.id = l.editore_id
and l.id = al.libro_id
and a.id = al.autore_id;

select * from libro;
