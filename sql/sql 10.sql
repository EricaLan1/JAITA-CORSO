create table if not exists editore (
id int auto_increment,
nome varchar(30),
email varchar(100),
primary key (id)
);

create table if not exists libro (
id int auto_increment,
titolo varchar(100),
prezzo decimal (6,2),
pagine smallint, -- small int perche' non e' eccessivo
editore_id int,
primary key (id)
);

create table if not exists autore_libro (
libro_id int,
autore_id int,
primary key(libro_id, autore_id)
);

create table if not exists autore (
id int auto_increment,
nome varchar(30),
cognome varchar(50),
nazionalita char(2),
primary key (id)
);