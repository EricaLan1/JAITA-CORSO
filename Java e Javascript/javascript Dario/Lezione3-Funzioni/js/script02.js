//funzioni con parametri
function calcolaArea(altezza, base) {
    let area = base * altezza;
    console.log("L'area vale: "+area);
}
//quando richiamo una funzione con parametri sono obbligato a fornire il valore dei parametri
calcolaArea(4,6);

//---funzione parametrica con una restituzione---RETURN. la funzione di sopra non ci restituisce nulla, esegue solo dei comandi. Mentre adesso voglio che mi restituisca qualcosa

function calcolaVolume(base,altezza,profondita) {
    let volume= base * altezza * profondita;

    return volume; // mi faccio restituire un numero
}
console.log(calcolaVolume(4,5,6));

//oppure

let mioVolume = calcolaVolume(5,6,7);
console.log(mioVolume);

//oppure
//possso dichiarare una var volume poirche' quella della riga 12 e' una var locale, quindi 'invisibile' all'esterno;
let volume = calcolaVolume(6,7,8);
console.log(volume);