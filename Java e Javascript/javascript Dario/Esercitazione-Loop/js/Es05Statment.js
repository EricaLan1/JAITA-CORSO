//Es5 Scrivi un programma che somma i multipli di 3 e multipli di 5 sotto il numero 1000. ris: 233168
let somma=0;
for (let i = 1; i < 1000; i++) {
    if (i%3===0||i%5===0) {
        somma+= i;
        
        
    }
    
}
console.log(somma);