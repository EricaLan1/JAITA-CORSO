use liceo;
select * from alunni;
select * from aule;

-- conoscere nome e cognome studenti con la tabella assegnata
select cognome, al.nome, a.nome
from alunni al, aule a
where a.id = al.aula_id;

select cognome, al.nome, a.nome
from alunni al -- sinistra
inner join aule a -- unisci la tabella alunni con una join interna, ovvero aule. Destra
on a.id = al.aula_id;

select cognome, al.nome, a.nome
from alunni al-- 
join aule a -- 
on a.id = al.aula_id;

select cognome, al.nome, a.nome
from alunni al 
left join aule a 
on a.id = al.aula_id
where a.id is null; -- per intercettare gli esclusi

select cognome, al.nome, a.nome
from alunni al 
right join aule a -- restituisco gli studenti con le aule assegnati e le aule con gli studenti non assegnati
on a.id = al.aula_id;

select  a.nome
from alunni al 
right join aule a 
on a.id = al.aula_id
where al.aula_id is null; -- elenco delle aule con alunni non assegnati

select  a.nome
from alunni al 
left join aule a
on a.id = al.aula_id
where al.aula_id is null;


select cognome, al.nome, a.nome
from alunni al 
left join aule a 
on a.id = al.aula_id
union
select cognome, al.nome, a.nome
from alunni al 
right join aule a 
on a.id = al.aula_id;

----------------------------------

select cognome, al.nome, a.nome
from alunni al 
left join aule a 
on a.id = al.aula_id where a.id is null
union
select cognome, al.nome, a.nome
from alunni al 
right join aule a 
on a.id = al.aula_id where al.aula_id is null; -- usare union come  full outer join

