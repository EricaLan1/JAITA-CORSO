//ES1 Scrivi, utilizzando if-statement, un programma per trovare il numero più grande tra 5 numeri. Mostra il risultato in un alert.
let numeri=[1,2,3,4,5]
let numGrande= numeri[0];

for (i = 0; i < 5; i++) {
    if (numeri[i]> numGrande) {
    numGrande= numeri[i];    
    }
}

alert("il numero grande e': "+numGrande);