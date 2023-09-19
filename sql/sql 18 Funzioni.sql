select 
	max(prezzo) `piu caro`,
    min(prezzo) `piu economico`
from libro;

select sum(prezzo) `valore magazzino` from libro;

select * from libro;
select prezzo, floor(prezzo), ceiling(prezzo)
from libro;

select * from libro;
select prezzo, floor(prezzo), ceiling(prezzo), round(prezzo,1)
from libro;

select 
	cognome, 
    length(cognome)
from generation.studenti;

select 
	concat(nome, cognome)`nome completo`, 
    email
    from generation.studenti;
    
    select 
		concat_ws(' ',nome,cognome,email) `info completa`
         from generation.studenti;
         
select cognome, substring(cognome,1,3)
	from generation.studenti;
    
select cognome, left(cognome,1)
from generation.studenti; -- indichiamo la quantita dei caratteri estratti da sinistra

select 
	cognome,
	left(cognome,2),
    right(cognome,2)
    from generation.studenti;  -- queste sono funzioni
    
select cognome,nome, length(cognome)+ length(nome)
    from generation.studenti;
    
 select avg(length(cognome) + length(nome))   -- la quantita media
	from generation.studenti;
    
select avg(length(concat(cognome,nome)))-- eseguo un conteggio della concatenazione
from generation.studenti;

select round(avg(length(concat(cognome,nome))),1)
	from generation.studenti;

select database();
select user();

select * from generation.studenti;
insert into generation.studenti(cognome,email)
value('storti','str_ti@gmail.com');

select last_insert_id(); -- ultimo id della tabella inserito, ma il primo di una serie se inserisco piu' di un record

insert into generation.studenti(cognome,email)
value('storti','str_ti@gmail.com');

select * from generation.studenti;
update generation.studenti
set email = replace (email, '.com', '.it');

select now();
select curdate() data_oggi; -- anno mese giorno
select curtime(); -- orario

select year('1998-01-01'); -- estraggo l'anno
select month('1998-01-01'); -- mese
select dayname('1998-01-01'); -- nome del giorno ecc.

select second (curtime()); -- estraggo il giorno della settimana
select dayofweek(curdate()); 
select dayname('2000-07-01');

select @@lc_time_names; -- valore, nomi del tempo
set lc_time_names = 'it_IT'; -- ora parla italiano
select second(curtime());

select data_di_nascita, year(data_di_nascita)
from generation.studenti;

select date_format(curdate(), '%d/%m/%Y');

select cognome, nome, date_format(data_di_nascita,'%d/%m/%Y')
from generation.studenti;

select time_format('17:00:00','%h %p');

select str_to_date('05/10/1969','%d/%m/%Y');

insert into generation.studenti(cognome,email,data_di_nascita)
values('pinto','pint@icloud.it',str_to_date('01/05/2000','%d/%m/%Y'));
select * from generation.studenti;

insert into generation.studenti(cognome,email,data_di_nascita)
values('pinto','pint@icloud.it',
str_to_date(concat('05','10','2001'),'%d%m%Y'));
select * from generation.studenti;

select adddate(curdate(),interval 1 day);

select cognome,data_di_nascita, datediff(data_di_nascita, curdate())
from generation.studenti;

select cognome,data_di_nascita, timestampdiff(year,data_di_nascita,curdate()) `eta`
from generation.studenti
order by `eta`;

select cognome, data_di_nascita, dayofyear(data_di_nascita)
from generation.studenti;
