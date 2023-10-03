### Pokedex

ATT: quando carico la pagina deve esserci un form nel quale si chiede all'utente il suo nome. 

Utilizzando l' API dei pokemon stampa una lista casuale di pokemon
https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0

Accanto ad ogni pokemon ci sarà un pulsante "Inserisci nel Pokedex" con un massimo di 3 pokemon iniziali.
Raggiunti i 3 pokemon non ne posso più inserire altri.

In alto nella navbar ci sarà la voce di menu "Pokedex", questa voce ti trasferirà sulla pagina pokedex.html nella quale verranno mostrati i 3 pokemon scelti. 

Per ogni pokemon scelto dovra esserci la possibilita' di modificare le informazioni. Se ci sono vengono mostrate nella card stessa altrimenti niente.
Nella card dovra' esserci la voca 'Localizza', al click su questa voce compare una mappa con il segnalino della maposizione del pokemon. Alla comparsa della comparira' un'altra voce "Controlla meteo nella localita' ". Al click compare una finestra nella quale verra' mostrato il meteo attuale(temp,meteo icona, umidita').

 ES: Nome Pikachu. Tipo: Elettro. Descrizione: da abbinare a contatori autorizzati

Al click sul pulsante modifica posso aggiungere altre info attraverso un form inserendo : nickname: Alfredo. 
Geolocalizzazione: via dei matti nm 0, Roma (inserisco un indirizzo)


USARE BS 5.3

Pagina Home:
Usare un list-group di bs5 per mostrare i pokemon.
All'inserimento far comparire un avviso in un alert di bs5 (dismissable) con posizione absolute in basso a destra dello schermo.

Pokedex:
Usare le card di bs5
