use generation;

select * from studenti;

select cognome,nome, data_di_nascita,'X' Generazione -- dividere gli studenti di una specifica generazione, nel nostro 3 generazioni
from studenti
where data_di_nascita <= '1980-12-31'
union all
select cognome,nome, data_di_nascita,'Millenials' Generazione -- dividere gli studenti di una specifica generazione, nel nostro 3 generazioni
from studenti
where data_di_nascita between '1981-01-01' and '1996-12-31'
union all -- sia union che union all, cn all si crea piu'velocemente
select cognome,nome, data_di_nascita,'Z' Generazione -- dividere gli studenti di una specifica generazione, nel nostro 3 generazioni
from studenti
where data_di_nascita >= '1997-01-01'
order by data_di_nascita;

select * from europa;

select nome, cognome, email
from studenti
union all
select nome, cognome, email
from clienti;

select * from clienti; -- i clienti non ci sono ma la query va bene lo stesso

-- 