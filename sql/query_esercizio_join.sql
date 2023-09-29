-- USATE SINTASSI JOIN
-- DATABASE libro
alter table libro rename column libro_id to id;
alter table editore rename column editore_id to id;
alter table autore rename column autore_id to id;
delete from libro where id = 23;
delete from libro where id = 23;
/*
1)
DATABASE catalogo libro
seleziona il titolo, le pagine, il prezzo e l'editore
il cui editore è 'bompiani' e ordinate per titolo

il result set dovrebbe restituire 3 record
*/
use libro;
select titolo, pagine, prezzo, editore.nome
from libro
join editore
on libro.editore_id = editore.id
where editore.nome = "bompiani" 
order by editore.nome, titolo;
-- order by editore.nome and titolo;
-- quando ordini per più campi i campi vengono elencati separati da ,
-- la query funziona ma ordina solo per editore.nome (and titolo viene ignorato)



/*
2)
seleziona il titolo, le pagine, il prezzo e l'editore
il cui prezzo è inferiore di 10 euro e ordinate per editore e per prezzo

il result set dovrebbe restituire 6 record
*/
select titolo, pagine, prezzo, editore.nome
from libro
join editore
on libro.editore_id = editore.id
where prezzo < 10
order by editore.nome and prezzo desc;
-- quando ordini per più campi i campi vengono elencati separati da ,
-- la query funziona ma ordina solo per editore.nome (and prezzo viene ignorato)
/*
3)
seleziona il titolo, le pagine, il prezzo e l'editore
il cui prezzo è inferiore di 10 euro e l'editore è 'mondadori' o 'bompiani' e ordinate per editore e per prezzo

il result set dovrebbe restituire 4 record
*/
use libro;
select titolo, pagine, prezzo, editore.nome
from libro
inner join editore
on libro.editore_id = editore.id
where prezzo < 10
and (editore.nome = "bompiani" or editore.nome = 'mondadori')
order by editore.nome, prezzo;

/*
4)
Selezionare nome e cognome dell'autore, titolo, prezzo dei libri, scritti da autori di nazionalità inglese
e ordinateli per cognome dell'autore

il result set dovrebbe restituire 6 record
*/
select a.nome, a.cognome, titolo, prezzo, a.nazionalita
from libro l
join autore a
on a.id = l.id
where a.nazionalita = 'en'
order by a.cognome;

/*
5)
seleziona il titolo, le pagine, il prezzo, il nome, il cognome dell'autore e la nazionalita
la cui nazionalità è 'en' o 'it' e ordinate per nazionalita e per prezzo dal più caro al più economico

il result set dovrebbe restituire 11 record
*/
select titolo, pagine, prezzo, a.nome, a.cognome, a.nazionalita
from libro l
join autore a
on a.id = l.id
-- where a.nazionalita = 'en' or a.nazionalita = 'it'
where (nazionalita = "en" or nazionalita = "it")
order by a.nazionalita, l.prezzo desc;
-- attenzione alle parentesi

/*
6)
seleziona solo gli editori per i quali non ci sono libri a catalogo e ordinate per editore

il result set dovrebbe restituire 2 record
*/
select nome
from editore e 
left join libro l
on e.id = l.editore_id
where l.editore_id is null
order by e.nome;

-- DATABASE liceo
/*
7)
selezionate nome, cognome, genere e nome aula assegnata
e ordinate per aula, genere e cognome

il result set dovrebbe restituire 25 record
*/
use liceo;
select al.nome, al.cognome, al.genere, a.nome aule
from alunni al 
join aule a
on a.id = al.aula_id
order by a.nome, al.genere, al.cognome;


/*
8)
selezionate nome, cognome, genere
degli studenti assegnati all'aula '5A'
e ordinate per genere e cognome

il result set dovrebbe restituire 5 record
*/
select al.nome, al.cognome, al.genere
from alunni al
join aule a
on a.id = al.aula_id
where al.aula_id = '5A'
order by al.genere, al.cognome;
-- funziona ma non dovrebbe
-- perchè aula_id accetta solo interi, tu hai indicato 5a
-- mentre dovevi indicare 5
-- altrimenti il WHERE doveva essere: WHERE a.nome = '5A'
/*
Se aula_id è un campo con tipo di dati intero e si inserisce
un valore come '5a', MySQL troncherà il valore al primo carattere non numerico,
quindi in questo caso troncherà '5a' a '5'.
Questo spiega perché la query funziona anche se hai specificato '5a' nella clausola WHERE.
Tuttavia, è importante notare che questa troncatura automatica potrebbe portare a risultati inaspettati
in altri contesti o se il campo aula_id contiene valori che potrebbero essere troncati in modo indesiderato.
Pertanto, è sempre una buona pratica assicurarsi che
le condizioni nella clausola WHERE riflettano correttamente la struttura e il contenuto dei dati nel tuo database.
*/

/*
9)
selezionate nome , cognome, genere dello studente e il nome aula assegnata
mostrando anche i nomi delle aule per le quali non esistono studenti assegnati
e ordinate per nome aula, genere e cognome

il result set dovrebbe restituire 30 record
*/
select al.nome, al.cognome, al.genere, a.nome Aule
from alunni al
right join aule a
on a.id = al.aula_id
order by a.nome, al.genere, al.cognome;

/*
10)
selezionate solo il nome delle aule per le quali non sono stati assegnati gli studenti

il result set dovrebbe restituire 5 record
*/

select  a.nome
from alunni al 
right join aule a 
on a.id = al.aula_id
where al.aula_id is null; 