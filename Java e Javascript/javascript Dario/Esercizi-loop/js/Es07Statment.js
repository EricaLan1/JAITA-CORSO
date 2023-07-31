//Scrivi un programma che stampa il seguente pattern, vabbeh si:

let numeri= prompt("Inserisci il numero di righe");
let contatore= 1;
for (let i = 1; i <= numeri; i++) { //i deve arrivare al numero prestabilito, incrementato il giro
    let qualcosa="";
    for (let j = 1; j <=i; j++) {  //controllo i numeri da aggiungere
        qualcosa+= contatore+" ";  
        contatore++;
    }
    console.log(qualcosa);
}