alter table libro drop foreign key libro_ibfk_1;
alter table libro drop foreign key fk_libro_editore;
alter table libro
add 
constraint fk_libro_editore
foreign key(editore_id) references editore(id);
-- on delete cascade on update cascade
-- on delete set null on update set null;
show create table libro;
-- on delete restrict
-- on update restrict

select*from libro;

select * from editore;

insert into libro(titolo, editore_id)
values('Guerra e pace',1000);

delete from editore where id = 1;
delete from editore where id = 3;

delete from libro where editore_id = 1;

select titolo, nome
from libro, editore
where editore.id= libro.editore_id
order by titolo;

delete from libro;
delete from editore;

select * from libro;
select * from editore;
