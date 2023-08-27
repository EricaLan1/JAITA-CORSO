//------ESERCIZIO SBAGLIATO--------

 
// let estrazione= (document.getElementById("estrazione"));
// for (let i = 0; i<5; i++) {
//     let numeriCasuali = Math.round(Math.random()*90+1);
    
// if (i>0) {
//     numerEstratti+= ", ";
//     numerEstratti += numeriCasuali;
//     console.log("il numero estratto e'"+numeriCasuali);
//     document.getElementById("casuale").innerHTML= "Numeri generati" +numerEstratti;
// }else{document.getElementById("Casuali").innerHTML= numerEstratti;

// }
// }
//-----------ESERCIZIO SBAGLIATO--------


//-----------ESERCIZIO CORRETTO CON FOR---------
// let numerEstratti =[];
// let numGiri=0;
// let doppioni=[];
//     for (let i = 0; i < 5; i++) {
//     let numeroCasuale= Math.ceil(Math.random()*90);


//    if(numerEstratti.includes(numeroCasuale)){
//        i--;
//         doppioni.push(numeroCasuale);
//     }else{
//        numerEstratti.push(numeroCasuale);
//    }
//    numGiri++;
//  }
// console.log(numerEstratti);
// console.log("Giro tondo: "+numGiri);
// console.log("Doppioni: "+doppioni);

//--------ESERCIZIO CORRETTO CON WHILE-----------

// let numeriEstratti= [];
// let numGiri=0;
// let doppioni=[];
// while (numeriEstratti.length<10) {
//         var numeroCasuale = Math.ceil(Math.random() * 90);

//         if (!numeriEstratti.includes(numeroCasuale)) {
//         numeriEstratti.push(numeroCasuale);//! non include
//             //! non include
//         }else{
//             doppioni.push(numeroCasuale);
//         }
//         numGiri++;
// }

// console.log(numeriEstratti);
// console.log("Giri necessari: "+numGiri);
// console.log("Dopopioni: "+doppioni);
//---------SOLUZIONE CON UN SET DI 90N-----------
let numeri90=[];

    for (let i = 0; i < 90; i++) {
        numeri90.push(i+1);
    }
    console.log(numeri90);

    let numeriEstratti= [];
    let numGiri=0;
    for (let i = 0; i <20; i++){
        let indiceCasuale= Math.floor(Math.random()* numeri90.length);
        numeriEstratti.push(numeri90[indiceCasuale]);
        numeri90.splice(indiceCasuale, 1);
        numGiri++;
}
console.log(numeriEstratti);
console.log(numGiri);


//Math.random()
//let numeroACaso= Math.random()
//console.log(Math.ceil(numeroACaso*10));
//Math.ceil()arrotonda all'intero superiore
//Math.floor() arrotonda all'intero inferiore