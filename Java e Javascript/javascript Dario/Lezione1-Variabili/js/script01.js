let nomeUser ="bruh"; //variabile di tipo String
let mailUser ="bruh@mail.it"; // i tipi esistono semplicemente non li dichiariamo, java è fortemente tipizzato javascript no
let idUser=8;
let connessioneAttiva=true;

console.log("Username: "+nomeUser+" Email:"+mailUser+" -id: "+idUser+ " Conn:"+connessioneAttiva);

//somma tra due numeri
let primoNum= 3111123;
let secondoNum= 7.5 ;
let somma= primoNum+secondoNum;
let prodotto= primoNum*secondoNum;
let differenza= primoNum-secondoNum;
let quoziente= primoNum/secondoNum;

console.log("la sommma vale: "+somma);//Salto di tipo
console.log("il prodotto vale: "+prodotto);
//toPrecision(3)imposta il numero di cifre significative dopo la virgola
console.log("il differenza vale: "+differenza);
console.log("il quoziente vale: "+quoziente);
// Crea le variabile che la vita è breve
//Recupera gli elementi dall HTML, valli a pescare.
//id all'interno della pagina e' univoco
//tale parametro di sopra e' una stringa corrispondente all'id dichiaro nella pagina html
//ogni elemento html e' un oggetto
//Modifico quello che e' scritto nel mio elemento html
let numeri= document.getElementById("numeri");
numeri.innerHTML="I numeri sono: "+primoNum+" e "+secondoNum;

let elSomma= document.getElementById("elSomma");
let elProdotto= document.getElementById("elProdotto");
let elDifferenza= document.getElementById("elDifferenza");
let elQuoziente= document.getElementById("elQuoziente");

elSomma.innerHTML="la somma vale: "+somma;
elProdotto.innerHTML="Il prodotto vale: "+prodotto;
elDifferenza.innerHTML="La differenza vale: "+differenza;
elQuoziente.innerHTML="Il quoziente vale: "+quoziente;