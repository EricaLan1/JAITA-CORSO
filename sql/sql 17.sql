desc alunni;

select * from aule;
show create table alunni;

-- set null
alter table alunni 
add constraint fk_alunni_aule
foreign key(aula_id) references aule(id)
on delete set null
on update cascade;

desc alunni;
use libro;
alter table libro drop foreign key fk_libro_editore;


-- foreign key che lega libro a editore
alter table libro
add constraint fk_libro_editore
foreign key(editore_id) references editore(id)
on delete cascade
on update cascade;
-- foreign key che lega autore_libro a libro
alter table autore_libro
add constraint fk_al_libro
foreign key(libro_id) references libro(id)
on delete cascade
on update cascade;
-- foreign key che lega autore_libro a autore
alter table autore_libro
add constraint fk_al_autore
foreign key(autore_id) references autore(id)
on delete cascade
on update cascade;
-- foreign key che lega libro ad autore_libro
alter table libro
add constraint fk_libro_al
foreign key(id) references autore_libro(libro_id)
on delete cascade
on update cascade;

select * from editore;
select * from libro;
select * from autore_libro;
select * from autore;

delete from editore where id = 5;
delete from libro where id = 11;
delete from autore where id = 9;
delete from autore where id = 2;

-- eliminare coccodrillo come fa che non aveva id, per poter eseguire la query di sopra
select * from autore_libro;
delete from libro where id >= 27