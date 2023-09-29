-- 1) contate il numero di libri editi da mondadori
		select * from libro;
		select count(*) from libro.libro where editore_id = (select id from editore where nome = 'Mondadori');

-- 2) calcolate il valore del catalogo libri
	select sum(prezzo) `somma libri` from libro.libro;

-- 3) calcolate età media degli studenti, restituendo un valore intero

select floor(avg(timestampdiff(year,data_nascita,curdate()))) `Età media` from studenti;

-- 4) seleziona gli studenti e l'email creando un attributo in cui rappresentate il nome completo
-- es 'Marco Rossi' | 'marco_rossi@gmail.com'
select concat (nome, '  ',cognome)`nome completo`,
		concat(nome, '_',cognome, '@gmail.com') email
from generation.studenti;
-- volevo: select concat(nome, cognome), email
-- ma è colpa mia: l'esempio ha confuso

-- 5) sostituite nella tabella studenti gli indirizzi contenenti 'Corso '  con 'Viale '
-- usare funzione REPLACE, attenzione che è case sensitive: 'viale' è diverso da 'Viale'
	update generation.studenti
    set indirizzo = replace(indirizzo, 'Corso', 'Viale');
    -- where indirizzo like '%Corso%';
-- non serve il WHERE, la funzione REPLACE fa quello che serve

-- 6) selezionare nome,cognome,email, data_nascita degli studenti mostrando della data di nascita solo l'anno
	select nome,cognome,email, 
   year(data_di_nascita) anno
   from generation.studenti;

-- 7) selezionare nome,cognome,email, data_nascita degli studenti mostrando la data di nascita nel formato italiano
	select nome, cognome, email,
 date_format(data_di_nascita, '%d/%m/%Y') anno
 from generation.studenti;

-- 8) selezionate cognome, nome  degli autori e indicate se l'autore è 'Italiano' o 'Straniero'. Usare funzione if 
	select cognome, nome ,
    if(nazionalita = 'it','italiano' ,'Straniero') nazionalita
    from libro.autore;
/*
-- 9)
inserite nella tabella articolo, l'articolo seguente:
descrizione: Canon 7d
specifiche: marca: canon, modello: 7d, schermo: lcd, peso: 1.5 kg, sensore: CMOS, rapporto: 3:2, fullframe: no, uscite: hdmi mini, mini jack stero
*/
-- dovevi usare funzioni JSON_OBJECT e JSON_ARRAY
-- di seguito la query corretta:
insert into articolo(descrizione, specifiche)
values(
	'Canon 7d',
	json_object(
		"marca","Canon",
        "modello", "7d",
        "schermo", "lcd",
        "pesoKg", 1.5,
        "sensore", "CMOS",
        "rapporto", "3:2",
        "fullframe", "no",
        "uscite", json_array('hdmi mini', 'mini jack stero')
	)
);

-- 10) selezionate la marca dalla tabella articolo, estraendola dalla colonna json

select json_extract(specifiche,'$.marca') `marca estratte` 
from generation.articolo;