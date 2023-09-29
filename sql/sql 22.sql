use libro;
insert into libro(titolo, prezzo, editore_id)
values('testo1', 10.50,1);

alter table libro drop foreign key fk_libro_al;