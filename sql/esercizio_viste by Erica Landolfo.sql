-- Creare una vista che mostri il cognome, il nome, l'email e l'età degli studenti
-- che hanno meno di 30 anni
-- chiamate la vista "studenti_giovani"
-- le intestazioni delle colonne risultanti della vista dovranno essere:
-- cognome, nome, email, età
		create or replace view studenti_giovani as 
		select
		nome,
		cognome, 
		email,
        timestampdiff(year,data_di_nascita,curdate()) `eta`
		from generation.studenti
		where timestampdiff(year,data_di_nascita,curdate()) < 30
        order by eta desc;
		
        select * from studenti_giovani;

-- Creare una vista che mostri solo gli editori per i quali non esistono libri a catalogo
-- chiamate la vista "editori_nolibri"
-- l'intestazione della colonna risultante della vista sarà:
-- Editore
		
        use libro;
        
		create or replace view studenti_nolibri as 
		select nome `editore` 
		from editore e
		where not exists (SELECT editore_id FROM libro WHERE editore_id = e.id);

-- Creare una vista che mostri quanti libri ci sono a catalogo per ogni editore
-- la vista deve riportare i record ordinati per quantità in ordine discendente
-- chiamate la vista "editori_quanti_libri"
-- le intestazioni delle colonne risultanti della vista dovranno essere:
-- Editore, Quantità

		create or replace view editore_quanti_libri as
        select e.nome `Editore`,
        count(*) quanti
		from libro l
		join editore e
		on l.editore_id = e.id
		group by e.nome 
		order by quanti desc;
		 