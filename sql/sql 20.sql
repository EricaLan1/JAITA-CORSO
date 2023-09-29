select distinct cognome from studenti;
select cognome from studenti group by cognome; -- esegue un raggruppamento all'interno delle righe che hanno lo stesso valore


select cognome, count(*) quanti
from generation.studenti
group by cognome  -- ha un senso quando si usano le funzioni di aggregazioni
having quanti > 1
order by quanti desc;

use libro;
select 
	e.nome,
    count(*)
from libro l 
join editore e
on l.editore_id = e.id
group by e.nome
order by e.nome;

use generation;
select genere, provincia
from generation.studenti
where provincia = 'to'
group by genere;

use libro;
select e.nome, sum(prezzo) valore
from libro l
join editore e
on l.editore_id = e.id
group by e.nome
order by valore;


select
 genere,
 floor(avg(timestampdiff(year, data_di_nascita, curdate())))
 from generation.studenti
 group by genere;
 
 -- quanti libri dll'editore, il valore dell'editore, il prezzo medio e piu' caro
 use libro;
 select
	e.nome,
    count(*) quanti,
    sum(prezzo) valore,
    round(avg(prezzo),2) `valore medio`, -- arrotondamento del valore medio sul prezzo
    max(prezzo) `piu' caro`,
	min(prezzo) `piu' economico`
from libro l
join editore e
on l.editore_id = e.id
group by e.nome
having quanti > 1 -- a differenza del where puo' leggere gli alias
order by e.nome;
    
select gen, count(*)
from generation.studenti
where gen is not null
group by gen;    

select 
	provincia,
    genere,
    floor(avg(timestampdiff(year, data_di_nascita, curdate())))`eta media`,
    count(*)
from generation.studenti
where genere is not null
group by provincia,genere
having quanti > 1
order by provincia, genere;

select
	provincia,
   -- genere,
    count(*) quanti,
    grouping(provincia)
    from generation.studenti
    group by provincia, genere WITH rollup;
    -- having quanti > 1;
    
select
	if(grouping(provincia), 'tutte le provincie', provincia) provincia,
    count(*) quanti
from generation.studenti
group by provincia, genere WITH rollup;

select
	if(grouping(provincia), 'totale provincie', provincia) provincia,
    if(grouping(genere), 'tuttale genere',genere) genere,
    count(*) quanti
from generation.studenti
where genere is not null
group by provincia, genere WITH rollup;

use liceo;
-- studenti che sono stati assegnati alle aule
select 
	if(grouping(a.nome), 'totale', a.nome) aule,
	count(*) quanti
from alunni al
join aule a
on al.aula_id = a.id
group by a.nome with rollup;

use generation;
select provincia, count(*);

select 
	year(data_di_nascita) anno,
    count(*)quanti
from studenti where data_di_nascita is not null
group by anno
having quanti > 1
order by anno;
