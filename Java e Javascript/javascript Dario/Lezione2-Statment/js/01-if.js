//operatori di confronto, producono sempre un boolean

var num1 = 10;
var num2 = 15;

let conf1 = num1 > num2;//false
let conf2 = num1 < num2;//true

let conf3 = num1 == num2;//false
 //confronta due cose per vedere se sono uguali, solo nel contenuto.

 let num3 = 5;
 let num4 = "5";

 let conf4 = num3 == num4; //true


 //il triplo uguale confronta anche il tipo del dato
 let conf5 = num3 === num4; //false
 console.log(conf5);

 //il ! nega le condizioni e valutazioni
 let conf6 = num3 != num4;//false

 //!== strettamente diverso
 let conf7 = num3 !== num4;//true

 //////////////IF STATEMENT/////////////////////

 let etaUser = 20;

 

 if(etaUser < 18){
    console.log("Mi spiace, non puoi accedere");
 }else if(etaUser > 70){
    console.log("Mi spiace, sei troppo vecchio per certe cose");
 }else{
 console.log("Benvenuto");
 }

 ////////////IF STATEMENT AND e OR Logico///////
 let punteggio = 30;
 let skill = 12;

 //per superare il livello, il punteggio deve essere superiore a 25 e le skill superiori a 10;

 if(punteggio >= 25 && skill >= 10){
    console.log("Bravo, hai superato il livello!");

 }else if (punteggio < 25 && skill >=10){
 console.log("Mi spiace, il tuo punteggio non è sufficiente");

 }else if(punteggio >=25 && skill <10){
    console.log("Mi spiace, le tue skill non sono sufficienti");

}else{
    console.log("Cambia gioco che non fa per te!!"); 
}

//EASY MODE: per superare il livello basta che uno dei due sia sopra soglia 
//OR Logico -> ||

if(punteggio >= 25 || skill >=10){
    console.log("Bravo, hai superato il livello");
}else{
    console.log("Fai schifo!");
}

/////////////////////////RESTO DIVISIONE////////
let restoDiv = 24 % 2;//0 -> Pari
let restoDiv2 = 25 % 2;//1 -> Dispari

/////OPERATORE TERNARIO///
let oraEsatta= 20;
let saluto= oraEsatta<= 18?"Buongiorno" : "Buonasera";
console.log(saluto);