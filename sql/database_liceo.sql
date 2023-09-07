/*
----------------------------
CREATE il database liceo;

Assegnate i privilegi all'utente app_java per questo nuovo database;

Nel database liceo create 2 tabelle: aule e alunni:

La tabella aule ha i seguenti attributi:
nome, capienza, piano
i campi devono essere tutti obbligatori

il nomi delle aule sono: 1A, 2A, 3A, 4A, 5A, 1B, 2B, 3B, 4B, 5B;
la capienza per ciascuna aula è di 10 alunni;
i piani disponibili sono: 1° piano, 2°piano , seminterrato;

inserite i record relativi alle aule:
1A, 10, 1° piano;
2A, 10, 2°piano;
3A, 10, seminterrato;
4A, 10, 1° piano',
5A, 10, 2° piano';
1B, 10, 1° piano;
2B, 10, 2°piano;
3B, 10, seminterrato;
4B, 10, 1° piano',
5B, 10, 2° piano';

La tabella alunni ha i seguenti attributi:
cognome, nome, genere, eta, aula_id
i campi cognome, nome, devono essere obbligatori;

inserite 50 record prendendoli dalla tabella studenti,
copiate il cognome, il nome e il genere
(usare l'istruzione INSERT INTO... SELECT)

aggiornate le età (dovete usare l'istruzione UPDATE)
assegnate 14 anni ai primi 10 record della tabella alunni (quelli con id da 1 a 10 compreso),
assegnate 15 anni ai successivi 10 record della tabella alunni (quelli con id da 11 a 20 compreso),
assegnate 16 anni ai successivi 10 record della tabella alunni (quelli con id da 21 a 30 compreso),
assegnate 17 anni ai successivi 10 record della tabella alunni (quelli con id da 31 a 40 compreso),
assegnate 18 anni ai successivi 10 record della tabella alunni (quelli con id da 41 a 50 compreso),

assegnate ad ogni aula 5 alunni della medesima età per ogni classe
(5 studenti che hanno 14 anni alla classe 1A),
(5 studenti che hanno 15 anni alla classe 2A),
(5 studenti che hanno 16 anni alla classe 3A),
(5 studenti che hanno 17 anni alla classe 4A),
(5 studenti che hanno 18 anni alla classe 5A),
usate gli id delle aule per aggiornare il campo aula_id degli studenti;

dopo aver creato le tabelle e inserito i record
scrivete le query seguenti:

seleziona il cognome, il nome, il genere, piano aula di tutti gli studenti
seleziona il cognome, il nome, il genere, piano aula degli studenti assegnati alla 1A
seleziona il cognome, il nome, il genere, piano aula degli studenti assegnati alla 2A
seleziona il cognome, il nome, il genere, piano aula degli studenti assegnati alla 3A
seleziona il cognome, il nome, il genere, piano aula degli studenti assegnati alla 4A
seleziona il cognome, il nome, il genere, piano aula degli studenti assegnati alla 5A


----------------------------
scrivete di seguito in questo file l'SQL 
- per la creazione delle tabelle
- per l'inserimento dei record
- le query di selezione
*/
use liceo;
create table if not exists aule(
id int auto_increment ,
	nome varchar(50) not null,
    capienza tinyint (10) not null,
    piano tinyint(3) not null,
    primary key (id)
);
show tables;
alter table aule modify piano varchar(30);

insert into aule (nome, capienza,piano)
values('1A','10','1° piano'),
('2A','10','2° piano'),
('3A','10','seminterrato'),
('4A','10','1° piano'),
('5A','10','2° piano'),
('1B','10','1° piano'),
('2B','10','2° piano'),
('3B','10','seminterrato'),
('4B','10','1° piano'),
('5B','10','2° piano');

/*--------------------------------------------*/

create table if not exists alunni(
	id int auto_increment primary key,
    cognome varchar(100) not null,
	nome varchar(50) not null,
    genere enum('m','f','n'),
    eta tinyint unsigned ,
    aula_id int 
);
show tables;

/*--------------------------------------*/
insert into alunni(nome, cognome, genere)
select nome, cognome, genere
from generation.studenti;

update alunni
set eta = 14
where id between 1 and 10;

update alunni
set eta = 15
where id between 11 and 20;

update alunni
set eta = 16
where id between 21 and 30;

update alunni
set eta = 17
where id between 31 and 40;

update alunni
set eta = 18
where id between 41 and 50;
/*----------------------*/
select * from alunni;
select * from aule;

update alunni
set aula_id = 1
where id between 1 and 5;

update alunni
set aula_id = 2
where id between 11 and 15;

update alunni
set aula_id = 3
where id between 21 and 25;

update alunni
set aula_id = 4
where id between 31 and 35;

update alunni
set aula_id = 5
where id between 41 and 45;
/*-----------------------------------*/

select alunni.cognome, alunni.nome, alunni.genere, piano, aula_id
from aule, alunni
where aule.id = alunni.aula_id;

select alunni.cognome, alunni.nome, alunni.genere, piano, aula_id
from aule, alunni
where aule.id = alunni.aula_id 
and aule.id = 1;

select alunni.cognome, alunni.nome, alunni.genere, piano, aula_id
from aule, alunni
where aule.id = alunni.aula_id 
and aule.id = 2;

select alunni.cognome, alunni.nome, alunni.genere, piano, aula_id
from aule, alunni
where aule.id = alunni.aula_id 
and aule.id = 3;

select alunni.cognome, alunni.nome, alunni.genere, piano, aula_id
from aule, alunni
where aule.id = alunni.aula_id 
and aule.id = 4;

select alunni.cognome, alunni.nome, alunni.genere, piano, aula_id
from aule, alunni
where aule.id = alunni.aula_id 
and aule.id = 5;


