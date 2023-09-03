/* 1:
Crea una tabella chiamata "prodotti" con i seguenti campi:
- id (intero, chiave primaria)
- nome (stringa di lunghezza massima 50 caratteri)
- prezzo (decimale(6,2))
- quantita (intero)
nb: il valore relativo alla quantità non deve essere superiore a 100
*/
-- istrizione SQL di seguito
create table if not exists prodotti (
id int auto_increment,
nome varchar(50),
prezzo decimal (6,2),
quantita tinyint,
primary key (id)
);

show create table prodotti;


/* 2:
Modifica la tabella "prodotti" aggiungendo un nuovo campo chiamato "descrizione" di tipo testo.
Inserite il nuovo campo dopo il campo "nome"
*/
-- istrizione SQL di seguito

alter table prodotti
add descrizione text 
after nome;


/* 3:
Crea una tabella chiamata "ordini" con i seguenti campi:
- id (intero, chiave primaria)
- data_ordine (data)
- totale (decimale(10,2))
- id_cliente (intero)
*/
-- istrizione SQL di seguito
create table if not exists ordini(
id int auto_increment,
data_ordine date,
totale decimal (10,2),
id_cliente tinyint,
primary key (id)
);
show create table prodotti;


/* 4:
Crea una tabella chiamata "clienti" con i seguenti campi:
- id (intero, chiave primaria)
- nome (stringa di lunghezza massima 30 caratteri)
- cognome (stringa di lunghezza massima 30 caratteri)
- email (stringa di lunghezza massima 100 caratteri)
*/
-- istrizione SQL di seguito
create table if not exists clienti(
id int auto_increment,
nome varchar(30),
cognome varchar(30),
email varchar(100) unique,
primary key (id)
);
show create table clienti;

/* 5:
Modifica la tabella "clienti":
modifica la lunghezza massima del campo cognome da 30 caratteri a 50, 
aggiungi un nuovo campo chiamato "telefono", di tipo stringa di lunghezza massima 20 caratteri.
Scrivi un unica query.
*/
-- istrizione SQL di seguito
alter table clienti
change cognome cognome varchar (50),
add telefono varchar(20);



/* 6:
Crea le tabelle "americhe", "europa", "africa" (3 query)
Le tabelle hanno i seguenti attributi:
- id (intero, chiave primaria)
- stato (stringa di lunghezza massima 50 caratteri)
- capitale (stringa di lunghezza massima 50 caratteri)
*/
-- istrizione SQL di seguito
create table if not exists americhe(
id int auto_increment,
stato varchar(50),
capitale varchar(50),
primary key (id)
);
show create table clienti;

create table if not exists europa(
id int auto_increment,
stato varchar(50),
capitale varchar(50),
primary key (id)
);
show create table europa;

create table if not exists africa(
id int auto_increment,
stato varchar(50),
capitale varchar(50),
primary key (id)
);
show create table africa;



/* 7:
inserisci i seguenti record:

Tabella "americhe":
1) Stati Uniti, New York
2) Canada, Ottawa   
3) Brasile, Brasilia 

Tabella "africa":
1) Egitto, Il Cairo      
2) Sudafrica, Port Elizabeth
3) Marocco, Rabat         

Tabella "europa":
1) Italia, Roma
2) Francia, Lione
3) Germania, Berlino

Crea una "insert" unica per ogni tabella, le query risultanti saranno tre
*/
-- istrizione SQL di seguito
insert into americhe (stato,capitale)
values ('Stati Uniti', 'New York'),
('Canada','Ottawa'),
('Brasile','Brasilia') ;

insert into africa (stato,capitale)
values ('Egitto', 'Il Cairo'),
('Sudafrica','Port Elizabeth'),
('Marocco','Rabat') ;

insert into europa (stato,capitale)
values ('Italia', 'Roma'),
('Francia','Lione'),
('Germania','Berlino') ;

/* 8:
Aggiorna il record relativo alla capitale degli Stati Uniti con il valore corretto:
Washington D.C.
*/
-- istrizione SQL di seguito
update americhe 
set capitale = 'Washington D.C.'
where id = 1;

/* 9:
Aggiorna il record relativo alla capitale del Sudafrica con il valore corretto:
Città del Capo
*/
-- istrizione SQL di seguito
update africa 
set capitale = 'Città del Capo'
where id = 2;

/* 10:
Aggiorna il record relativo alla capitale della Francia con il valore corretto:
Parigi
*/
-- istrizione SQL di seguito
update europa 
set capitale = 'Parigi'
where id = 2;

/* 11
Crea una tabella chiamata "libro" con i seguenti campi:
- id (intero, chiave primaria)
- titolo (stringa di lunghezza massima 100 caratteri)
- prezzo (decimale(6,2))
- id_editore (intero)
*/
-- istrizione SQL di seguito
create table if not exists libro(
id int auto_increment,
titolo varchar(100),
prezzo decimal(6,2),
id_editore int,
primary key (id)
);
show create table africa;

/*
inserisci nella tabella libro il record seguente:
titolo: Marcovaldo
prezzo: 12.50
editore_id: 1
*/
-- istrizione SQL di seguito
update libro 
set titolo = 'Marcovaldo'
where id = 1;

update libro
set capitale = '12.50'
where id = 2;

update libro
set capitale = '1'
where id = 3;