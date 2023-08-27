//Scrivi un programma che stampa un pattern come il seguente triangolo, chiedendo all’utente il numero di righe:
let numeri= prompt("Inserisci il numero di righe");
let qualcosa="";
for (let i = 1; i <= numeri; i++) {
    qualcosa+= i; 
    console.log(qualcosa);
}


