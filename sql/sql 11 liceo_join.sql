select cognome, alunni. nome, aule.nome
from alunni, aule
where aule.id = alunni.aula_id;

select cognome, alunni.nome, aule.nome
from alunni
join aule
on aule.id = alunni.aula_id;

select cognome, alunni.nome, aule.nome
from alunni
inner join aule -- estra esclusivamente i valori che hanno corrispondenza su tutte le tabelle
on aule.id = alunni.aula_id;

select cognome, alunni.nome, aule.nome
from alunni
left join aule -- estrae tutti i valori a sinistra, anche se non hanno corrispondenza a destra
on aule.id = alunni.aula_id;

select cognome, alunni.nome, aule.nome
from alunni
right join aule -- right join estrae tutti i valori a destra, anche se non hanno corrispondenza a sinistra
on aule.id = alunni.aula_id;

select cognome, alunni.nome, aule.nome
from alunni
left join aule 
on aule.id = alunni.aula_id 
where aule.id is null;  -- se voglio solo gli alunni non assegnati a nessun aula

select cognome, alunni.nome, aule.nome
from alunni
right join aule 
on aule.id = alunni.aula_id 
where aule_id is null;  -- dove gli alunni sono nulli