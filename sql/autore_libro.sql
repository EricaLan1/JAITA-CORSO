SELECT * FROM libro.autore_libro;

select titolo,cognome, a.nome, nazionalita, e.nome Editore
from libro l , autore a, autore_libro al, editore e -- AS per assegnare le etichette con meno codice e' opzionale posso anche non metterlo il programma sa che sono abbreviazioni di per se che non cambiano le tabelle
where l.id = al.libro_id
and a.id = al.autore_id
and l.editore_id = e.id
and nazionalita = 'en'
and cognome like 'C%'; -- operatore like e' un pattern che cerca tutti quei cognomi che iniziano per 

select * from editore;

insert into editore values(11, 'Boringhieri','email@nuovo.it'); -- sono obbligato a inserire tutti i valori dei campi, tento di inserire un recordo in cui un id e gia' presente

desc generation.studenti;
select * from generation.studenti;

insert into generation.studenti (cognome, email)
values ('paperone', 'franco.rossi@gmail.com');

use generation;
create table if not exists libro(
	id int auto_increment,
    titolo varchar(100),
    pagine smallint unsigned check(pagine >0), -- unisgned accetta per le pagine solo valori positivi
    prezzo decimal(6,2) constraint chk_prezzo check (prezzo >0),
    editore_id int,
    primary key(id),
    constraint chk_prezzo_pagine check (prezzo >0 and pagine >0)
);

show create table libro;

insert into libro (titolo, pagine, prezzo, editore_id)
values('titolo',100,10.50,1);

alter table libro drop constraint chk_prezzo_pagine;
alter table libro drop constraint chk_prezzo;
alter table libro drop constraint libro_chk_1;
select * from libro;
alter table libro add check (prezzo >0); -- ho aggiungo la constraint direttamente con una espressione
alter table libro add constraint chk_pagine check (pagine >0); -- oppure l'aggiungo con nome di tipo 
