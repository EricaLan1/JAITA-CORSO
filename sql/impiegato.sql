use generation;

-- creare tabella impiegato con i seguenti attributi:
-- nome,cognome, ruolo, id_resp, stipendio, ufficio_id
create table if not exists impiegato(
id int auto_increment primary key,
nome varchar (50),
cognome varchar (100),
ruolo varchar (20),
id_resp tinyint,
stipendio decimal (6,2),
ufficio_id tinyint 
);

INSERT INTO `impiegato`
VALUES (1,'Mario','Rossi','tecnico',NULL,2500.00,1),
(2,'Marco','Bianchi','amministrativo',7,1600.00,2),
(3,'Paolo','Verdi','amministrativo',7,1600.00,2),
(4,'Enrico','Marrone','venditore',8,1300.00,3),
(5,'Nicola','Testa','venditore',8,1300.00,3),
(6,'Franco','Barba','tecnico',1,1500.00,1),
(7,'Elena','Totti','amministrativo',NULL,2600.00,2),
(8,'Paola','Capra','venditore',NULL,2300.00,3),
(9,'Mauro','Barba','venditore',8,1300.00,3);
select * from impiegato;