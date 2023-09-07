select i.cognome, i.nome, i.ruolo, r.cognome, r.nome
from impiegato i
join impiegato r
on i.id_resp = r.id;

use generation;
select * from impiegato;

use libro;
select * from libro;
select * from editore;

alter table editore
rename column id to editore_id;
alter table libro rename column id to libro_id;
alter table autore rename column id to autore_id;

select titolo, pagine, prezzo, nome editore
from libro 
join editore
using(editore_id);

select titolo, cognome, nome
from libro l
join autore_libro al using(libro_id)
join autore a using(autore_id);