//FOR
let nomi= ["Dario","Lucia","Maria","Paolo","Pippo"]
// let i=0; inizializzazione
// i<nomi.lenght; condizione
// i++; aggiornamento
for (let i = 0; i < nomi.length; i++) {
    console.log(nomi[i]);  
}
// 1 giro (i=0; 0<5 -->T;1) { console.log(nomi[0]}
// 2 giro (i=1; 0<5 -->T;2) { console.log(nomi[1]}
// ... cosi via
// 5 giro (i=4; 0<5 -->T;5) { console.log(nomi[4]} --> Pipppo
// 6 giro (i=5; 5<5 -->FALSE;X) XXX si intemmpo il giro

// for al contrario

for(let i= nomi.length-1; i>=0; i--){
    console.log(nomi[i]);
}

//tabelline
for (let i = 1; i <=10; i++) {
    console.log(2*i);
    
}
//for of e for in poco utilizzato. Tarato per gli Array. FOR OF
let numeriLotto=[12,56,7,2,14]
for (const nome of nomi) {
    console.log(nome);
}
// FOR IN
for (const index in nomi) {
   console.log(nomi[index]);
}
//Foreach, si applica solo agli array
// array.foreach (elemento =>{corpo})

nomi.forEach(nome => {
    console.log(nome);
});
// esempio innesto for if
// nei numeriLotto voglio capire chi e' pari chi dispari
for (let i = 0; i < numeriLotto.length; i++) {
    if (numeriLotto[i]%2==0) {
    console.log(numeriLotto[i]+" e' pari");
    
}else{
    console.log(numeriLotto[i]+ "e' dispari");
}
}

console.log("-------------------");
numeriLotto.forEach(numero => {
    if(numero%2==0){
        console.log(numero+" e' pari");

    }else{
        console.log(numero +" e' dispari");
    }
});