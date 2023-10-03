-- indici 

select * from cliente;

insert into cliente(cognome, nome, email, indirizzo, citta,provincia, regione)
select cognome, nome, email, indirizzo, citta,provincia, regione from generation.studenti
where id <= 50;

select rand();

select round(rand()*10000);

update cliente set credito = round(rand()*10000) where credito = 0 ;

explain
select * from cliente where provincia= 'mi';
drop index k_prov on cliente;
create index k_prov on cliente(provincia);


explain
select * from cliente where provincia= 'to' and credito > 3000;
drop index k_credito  on cliente;
create index k_credito on cliente(credito);
create index k_prov_credito on cliente(provincia,credito);

explain
select * from cliente use index( k_prov_credito) where provincia = 'to' and credito > 3000;

drop index k_prov on cliente;

explain
select * from cliente  where provincia = 'mi';

create index k_credito_prov on cliente(credito, provincia);

explain
select * from cliente use index( k_credito_prov) where provincia = 'to' and credito > 3000;

select count(distinct provincia) from cliente;
select count(distinct credito) from cliente;

explain
select * from cliente  where credito > 3000;

analyze table cliente;

desc cliente;