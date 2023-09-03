create table if not exists studenti(
id int auto_increment,
nome varchar(20),
cognome varchar(30) not null, 
genere enum('m','f','n'),
indirizzo varchar(100),
citta varchar(30),
prinvicia char(2)default 'to', -- hanno 2 caratteri, N e A
regione varchar(30)default 'Campania',
email varchar(100)not null unique, -- vogliamo evitare che l'email di uno studente sia assegnato ad un altro
data_di_nascita date, -- anno mese e giorno
ins timestamp default current_timestamp on update current_timestamp,  -- definiamo il data type con timestamp,indichiamo il valore di default
primary key (id)
);
show tables;
drop table text;