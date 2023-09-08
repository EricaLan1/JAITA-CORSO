-- funzioni
-- funzioni di aggregazione 

select * from libro;
select avg (prezzo) `prezzio medio`
from libro;
show create table libro;

select count(*) from libro;
select count(pagine) from libro;