use generation;
create table if not exists articolo(
    id int auto_increment primary key,
    descrizione varchar(100),
    specifiche json
);

desc articolo;
select * from articolo;

insert into articolo( descrizione, specifiche)
value(
	'TV SAMSUNG 32" SMART TV',
    '{
		"marca": "SAMSUNG",
        "pesoKG": 5.12,
        "schermo":"LCD",
        "pollici": 32,
        "uscite": ["HDMI","USB"]
        }'
);

insert into articolo (descrizione, specifiche)
values(
	'TV SONY 32" SMART TV',
    json_object(
		"marca", "SONY",
        "pesoKG", 6.5,
        "schermo","LED",
        "pollici", 55,
        "uscite", json_array("hdmi","rca","usb", "coaxial", "scart")
    )
);

select json_extract(specifiche, '$.uscite')
from articolo;

select json_extract(specifiche, '$.marca', '$.uscite')
from articolo;

select specifiche -> '$.uscite', specifiche -> '$.marca'
from articolo;

select descrizione, json_extract(specifiche, '$.uscite[0]')
from articolo;

select descrizione, specifiche -> '$.uscite[0]'
from articolo;

select json_extract('[10,20,[30,40]]', '$[1]') `numero estratto` ; -- 20

select json_extract('[10,20,[30,40]]', '$[2][0]') ` numero estratto`; -- 30

select json_extract('[10,20,[30,40]]', '$[2][1]') `numero estratto`; -- 40

update articolo 
set specifiche = 
    json_set(
        specifiche,
        '$.marca', 'LG',
        '$.uscite', json_array('hdmi', 'scart', 's/pdif'),
        '$.ingressi', json_array('eterneth', 'usb')
        )
where id = 1;


update articolo
set specifiche =
    json_insert(
        specifiche,
        '$.uscite[2]', 'RGB'
    )
where id = 1;

update articolo
set specifiche =
    json_insert(
        specifiche,
        '$.uscite[3]', 'RGB'
    )
where id = 1;
select * from articolo;

update articolo
set specifiche =
	json_replace(
		specifiche,
        "$.uscite[1]", "HDMI2"
	)
where id = 1;

select * from articolo;
update articolo
set specifiche =
	json_remove(
		specifiche,
        '$.uscite[1]'
	)
where id = 1;

select distinct cognome
from studenti
where cognome like 'v%'
order by cognome;

select cognome
from studenti
group by cognome
order by cognome;

select count(genere) from studenti where genere = 'f';
select count(genere) from studenti where genere = 'm';

select genere, count(*) -- * conta anche i valori nulli
from studenti
-- where genere is not null
group by genere;

use libro;

select e.nome, count(*) quanti
from libro l
join editore e
on l.editore_id = e.id
group by e.id
order by quanti desc; -- mi mostra quanti libri autore esistono numerati in ordine e gruppi

use generation;
select genere,
	floor(avg(timestampdiff(year, data_di_nascita,curdate())))
from studenti
where genere is not null
group by genere;

select e.nome, sum(prezzo) valore
from libro.libro l 
join libro.editore e
on e.id = l.editore_id
group by e.id
order by valore desc;