alter table libro drop foreign key fk_libro_editore; -- e un modo per eliminare la fk

alter table libro
add 
constraint fk_libro_editore  -- questa riga e'opzionale
foreign key(editore_id) references editore(id)
-- on delete cascade on update restrict; -- cancellami a cascata tutte le righe
on delete set null on update set null;

show create table libro;
select * from libro;

-- on delete restrict -- no action e' la stessa cosa 
-- on update restrict 
insert into libro (titolo, editore_id)
values('guerra e pace',1000);

delete from editore where  id= 3; -- questa la blocca perche' nella tabella record di autore ci sono molti record con il valore di 1, e se cerco di cancellare questo record, l'id e' riferito per il campo editore id

delete from editore;

