-- istruzioni di data manipulation language DML
insert into studenti (cognome, email)
values('fabiola','fabiolariccardi99@gmail.com');

insert into studenti(cognome, email)
values('riccati e di ceva e di san michele e di moncalieri eccc','bruni@gmail.com');

insert into studenti (cognome, email)
values('riccardi','riccardi@gmail.com'),
('verdi','verdi@gmail.com'),
('rossi','rossi@gmail.com');

insert into studenti (nome,cognome,genere,indirizzo,citta,provincia,regione,email,data_di_nascita)
values('fabiola','riccardi','f','vico san giacomo 122','napoli','na','campania','fr@gmail.com','1999-02-16'),
('franca','villa','f','via milano 25','milano','mi','lombardia','fv@gmail.com','2001-10-23');

insert into studenti
values(15,'mario','vecchio','m','via lombardia 25','bergamo','bg','lombardia','mvecchio@gmail.com','2001-09-10','2023-07-05 16:40:00');

insert into studenti(email,cognome)
values('osss@aruba.it','paperone');

