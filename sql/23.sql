-- subquery sono nient'altro che query inserite in altre query sql di vario tipo, che faccia una select o inserimento
-- di record, aggiornamento o delete

select * from cliente;
select * from ordine;
select * from articolo;
select * from ordine_dettaglio;
select * from impiegato;
select * from ufficio;


select nome, cognome, stipendio 
from impiegato where stipendio > (select stipendio from impiegato where id = 6); -- ci dovra' restituire solo un
-- valore per poter essere ocnfrontato, se ottengo piu' righe vado in errore. Come ad esempio:
select nome, cognome, stipendio 
from impiegato where stipendio > (select stipendio from impiegato where cognome = 'Barba'); 
-- ovvero la subquery ritorna piu' di una riga

select max(editore_id)from libro.libro; -- il valore id piu' del mio database libro e' 10

select e.nome, titolo 
from libro.editore e
join libro.libro l
on e.id = l.editore_id -- estraggo l'associazione di tutti gli id ad editore
where editore_id = (select max(editore_id)from libro.libro); -- nelle parentesi mi estraggo il valore mentre
-- nelle altre il processo 

select titolo, prezzo from  libro.libro where prezzo > avg(prezzo);

select titolo, prezzo
from libro.libro
where prezzo > (select avg(prezzo) from libro.libro)
order by prezzo desc; 

select nome, cognome, stipendio
from impiegato
where stipendio < (select avg(stipendio) from impiegato);

-- subquert che restituisca piu' righe, e quindi fare attenzione che l'operatore di confronto sia piu' adatto quindi ALL

select ufficio_id, avg(stipendio) from impiegato group by ufficio_id;

-- ufficio con lo stipendio alto tra tutti gli uffici con join tra ufficio e impiegato:

-- select u.nome, avg(stipendio) `stipendio medio`
select u.nome, round(avg(stipendio) ,2)`stipendio medio`
from impiegato i 
join ufficio u
on i.ufficio_id = u.id
group by i.ufficio_id
having `stipendio medio` >=  ALL -- nel secondo caso tra i commenti e senza ALL, quindi senza arrotondamentui
-- (select AVG(stipendio) from impiegato); -- group by ufficio_id);
(select round(AVG(stipendio),2) from impiegato group by ufficio_id);

 

select nome, cognome
from impiegato 
where ufficio_id = ANY
(select id from ufficio where regione = 'piemonte');-- id degli impiegati che lavorano in impiemonte in questo caso 1 e 

select 'piemonte', count(*)
from impiegato 
where ufficio_id = ANY
(select id from ufficio where regione = 'piemonte'); --  gli impiegati che lavorano in piemonte

select distinct cognome, nome
from cliente c
join ordine o
on c.id = o.cliente_id;   

select cognome, nome, telefono
from cliente
where id IN ( select cliente_id from ordine);

select cognome, nome, telefono
from cliente c
left join ordine o
on c.id = o.cliente_id
where o.cliente_id is null;

select cognome, nome, telefono
from cliente
where id not IN(select cliente_id from ordine); -- lista di clienti che non hanno effettuato degli ordini

-- l'operatore di riga
select cognome, nome
from impiegato
where row(cognome, nome, ruolo) = ('rossi', 'mario', 'tecnico');

-- crea tabelle in generation mancanti

create table amici(
id int auto_increment primary key,
nome varchar(30),
cognome varchar(50)
)
select nome, cognome  from studenti;
select * from amici;

select nome, cognome
from amici
where row(nome, cognome) = (select nome, cognome from studenti where id =
 (select id from studenti where nome = 'sara'and cognome = 'rossi'));

select * from articolo;
select * from ordine_dettaglio;

update articolo
set rimanenza = 100;

update articolo a 
set rimanenza = rimanenza - 
(select  sum(quantita) from ordine_dettaglio od  -- inserire questa query all'interno di una update
where a.id = od.articolo_id
group by a.id);

-- complicare la query di sopra con la condizione if

update articolo set rimanenza = if(calcolo> 0, rimanenza - calcolo, rimanenza);

update articolo a 
set rimanenza = if(  
	(select  sum(quantita) 
	from ordine_dettaglio od 
	where a.id = od.articolo_id
	group by a.id)> 0,
	100 -( select sum(quantita)
	from ordine_dettaglio od
	where a.id = od.articolo_id
	group by a.id),
	100
);

-- ------------------------------
select * from cliente;
update cliente set credito = 0;

 select c.id, sum(prezzo*quantita)
 from ordine o
 join ordine_dettaglio od
 on  od.ordine_id = o.id 
 join cliente c
 on c.id = o.cliente_id
 group by c.id ;
 
 update cliente c set credito = if(
	(select sum(prezzo*quantita)
	from ordine o
	join ordine_dettaglio od
	on  od.ordine_id = o.id 
	where c.id = o.cliente_id
	group by c.id) > 0,
	(select sum(prezzo*quantita)
    from ordine o 
    join ordine_dettaglio od
    on od.ordine_id = o.id
    where c.id = o.cliente_id
    group by c.id),
    0
 );
 
 -- --------------------------------
 select * from cliente;
 update cliente set credito = 0 where id = 3; -- credito 0 id 3
  update cliente c set credito = if(
	(select sum(prezzo*quantita)
	from ordine o
	join ordine_dettaglio od
	on  od.ordine_id = o.id 
	where c.id = o.cliente_id) > 0,
	(select sum(prezzo*quantita)
    from ordine o 
    join ordine_dettaglio od
    on od.ordine_id = o.id
    where c.id = o.cliente_id),
    0
 )
 
 where c.id = 3; -- effettua il calcolo e aggiorna id 3 se maggiore di 0.
 
 -- ---------------------------
 use libro;
 
 select nome from editore e
 where exists
	(select editore_id from libro where editore_id = e.id);
    
select nome
from editore e
left join libro l
on e.id = l.editore_id
where l.editore_id is null;

-- 
use generation;
select * from studenti_v;
select nome,cognome,genere, indirizzo, citta, provincia, regione, email, data_di_nascita
from studenti;

-- interrogazione della lista
select * from (
	select nome,cognome,genere, indirizzo, citta, provincia, regione, email, data_di_nascita
	from studenti
    
) as studenti_v;

-- vogliamo ricavare la quantita di articolo massimi e minimi, e la media rispetto a tutti gli ordini, si usano le funzioni di aggregazione, dopo di cio'si interroga una tabella che restituisca la somma degli articoli ordinati raggruppati sulla base dell'ordine che e'stato fatto.


use gestionale;
select max(qt_articoli), min(qt_articoli), round(avg(qt_articoli))
from 
(select ordine_id, sum(quantita) qt_articoli
from ordine_dettaglio od
group by ordine_id) as tbl;canzoni