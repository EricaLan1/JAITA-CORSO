-- DB generation
-- 1) Contate gli studenti divisi per genere
-- la tabelle risultante mostrerà i seguenti attributi
-- Genere, Quanti
		use generation;
    
		select  genere,
		count(*) quanti
		from studenti
		group by genere;
    
-- 2) Contate gli studenti divisi per genere solo della provincia di Alessandria
-- la tabelle risultante mostrerà i seguenti attributi
-- Genere, Quanti
		select genere, provincia,
		count(*) quanti
		from studenti
		where provincia = 'al'
		group by genere;


-- 3) Contate gli studenti divisi per regione
-- la tabelle risultante mostrerà i seguenti attributi
-- Regione, Quanti
		select regione,
        count(*) quanti
        from studenti
        group by regione;

-- 4) Contate gli studenti divisi per regione e per genere
-- la tabelle risultante mostrerà i seguenti attributi
-- Regione, Genere, Quanti
		select regione, genere,
        count(*) quanti
        from studenti
        group by regione, genere;

-- 5) Contate gli studenti divisi per regione e per genere mostrando anche i totali aggregati
-- ricordatevi della funzione grouping() e dell'istruzione with rollup
-- la tabelle risultante mostrerà i seguenti attributi, con le righe in più dei subtotali e del totale
-- Regione, Genere, Quanti
		select if(grouping(genere), 'tutti i generi', genere) genere,
		if(grouping(regione), 'tutte le regioni', regione) regione,
        count(*) quanti
        from studenti
        group by genere, regione WITH rollup;

-- 6) Contate gli impiegati divisi per ruolo
-- la tabelle risultante mostrerà i seguenti attributi
-- Ruolo, Quanti
		select ruolo,
		count(*) quanti
		from impiegato
		group by ruolo;

-- DB liceo
-- 7) Contate gli alunni assegnati alle diverse aule
-- la tabelle risultante mostrerà i seguenti attributi
-- Nome aula, Numero studenti
		use liceo;
		
        select 
		if(grouping(a.nome), 'totale', a.nome) aule,
		count(*) quanti
		from alunni al
		join aule a
		on al.aula_id = a.id
		group by a.nome with rollup;

-- DB libro
-- 8) Contate gli autori divisi per nazionalità
-- la tabelle risultante mostrerà i seguenti attributi
-- Nazionalità, Quanti
		use libro;
    
		select nazionalita,
		count(*) quanti
		from autore
		group by nazionalita;

-- 9) Contate i libri per editore e il valore dei libri, ordinate per Editore
-- la tabelle risultante mostrerà i seguenti attributi
-- Editore, Quanti, Valore
		select e.nome, sum(prezzo) valore,
        count(*) quanti
		from libro l
		join editore e
		on l.editore_id = e.id
		group by e.nome
		order by e.nome;
	