USE generation;
USE libro;
SELECT * FROM libro;

USE libro;
select titolo, pagine, prezzo
from libro where prezzo > 10
and pagine >300
order by prezzo desc;

USE generation;
select nome, cognome, genere, data_di_nascita
from studenti
where  data_di_nascita BETWEEN '1985-01-01' AND '1995-12-21';

truncate studenti;

USE generation;
select nome, cognome, genere, data_di_nascita
from studenti
where provincia = 'cn' or provincia = 'at' or provincia = 'no';

select nome, cognome, genere, data_di_nascita
from studenti
where provincia in ('cn','no','at') ;

select nome, cognome, genere, data_di_nascita
from studenti
where citta <> 'torino'; --  where citta = per dire in quale citta', != non e' in quella citta e si puo' scrivere anche con <>

USE libro;
select titolo, nome
from libro, editore
where editore_id = editore.id;

select * from libro;

USE libro;
select titolo, nome, editore.id, editore_id
from libro, editore
where editore.id = editore_id -- condizione che unisce le due tabelle
and nome = 'Mondadori' -- agiungo una condizione
and prezzo >10; -- aggiungo condizione prezzo