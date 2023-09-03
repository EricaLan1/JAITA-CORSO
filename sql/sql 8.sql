select nome,cognome
from studenti
order by cognome DESC -- questo e' l'ordinamento
limit 0,10 ;

select*
from studenti
where data_di_nascita != 'to'
or genere= 'f'
order by provincia;

select * from studenti
where cognome = 'verdi' or cognome = 'rossi'
and provincia = 'to' or provincia= 'al';

