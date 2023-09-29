create or replace view studenti_info as -- do nu nome alla lista
select
    nome,
    cognome, 
    email
from generation.studenti;

select * from information_schema.tables;

select * from studenti_info;
select cognome, count(*)
from studenti_info
where cognome like 'v%'
group by cognome;

desc studenti;
select * from studenti;
insert into studenti_info(cognome, email)
values('polacchi', 'pola@icloud.com');

drop view studenti_info;
select * from studenti;

create or replace view studenti_info as
select nome,cognome,email
from studenti;
drop view studenti_info;
use libro;

select * from studenti_info;

select * from studenti_info
where genere = 'f';
use libro;

select * from studenti;
create or replace view studenti_v as
select nome, cognome, genere, indirizzo, citta, provincia, regione, email, data_di_nascita
from studenti;
show tables; -- elenco delle tabelle

create or replace view studenti_to as
select nome, cognome, genere, indirizzo, citta, provincia, regione, email, data_di_nascita
from studenti where provincia = 'to' with check option; -- la lista e' stata modificata
select * from studenti_to;

insert into studenti_to(
nome, cognome,genere, indirizzo, citta, provincia,regione, email, data_di_nascita
)
values('maria', 'esposito','f','via garibaldi','napoli', 'na', 'campania','mesp@gmail.com','2002-12-25');
select * from studenti;

select * from studenti_v;
-- qyery table
select nome, cognome from studenti where provincia = 'to';
select provincia, genere, count(*)
from studenti group by provincia, genere order by provincia;
select nome, cognome from studenti where provincia != 'to' order by cognome;

-- query con vista
select cognome, nome, genere from studenti_v where provincia = 'to';
select provincia, genere, count(*)
from studenti_v group by provincia, genere order by provincia;
select nome, cognome from studenti_v where provincia != 'to' order by cognome;

alter table studenti rename column genere to gen;

create or replace view studenti_v as
select nome, cognome, gen genere, indirizzo, citta, provincia, regione, email, data_di_nascita
from studenti;

select * from studenti;
select * from studenti_v;

drop view studenti_v;