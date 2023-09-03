select * from generation.libro;
select titolo, prezzo, prezo * 1.10
from libro;

select * from studenti where nome regexp '^mar';  -- l'accento circonflesso stabilisce che debba iniziare
select * from studenti where nome regexp 'co$';   -- mi permette di individuare persone che finiscano per co. Il dollaro stabilisce che deve finire con o
select * from studenti where nome regexp '^mar|ara|ola';   -- | signifa o e separa i simboli  

select * from studenti where nome regexp '[mcp]a';  -- nelle quadre cerca tutti quei nomi che contengono quella sottostringa con ma, ca, pa.
select * from studenti
where nome regexp 'a[ero]';  -- estraggo una serie di nomi che contenga questa stringa

select * from studenti where nome regexp 'l[ao]$';  -- tutti i nomi che finiscono per la e lo
select * from studenti
where cognome regexp '^[a-m]'  -- il trattino prende tutte le lettere nell'intervallo stabilito, che iniziano da a AD m
order by cognome;
select*from studenti
where cognome regexp '^[n-z]'