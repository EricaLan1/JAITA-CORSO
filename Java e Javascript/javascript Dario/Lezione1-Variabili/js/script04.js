let txt= "Benvenuti al corso Jaita93";

//1. le stringhe sono 0-base. Un array di caratteri solo che noi non lo abbiamo
//2. Anche lo spazio e' un carattere

let lunghezzaTxt= txt.length;
console.log(lunghezzaTxt);

let carattere0 = txt.charAt(0);
console.log(carattere0);

let carattereUlt= txt.charAt(txt.length -1);
console.log(carattereUlt);

//metodi per ricerca
//indexOf mi restituisce l'indice nel quale si trova quella stringa o quel carattere
let search1=txt.indexOf("corso");
console.log(search1);

let search2=txt.indexOf("e"); //1
console.log(search2);

let search3=txt.lastIndexOf("e"); //4
console.log(search3);

let search4=txt.indexOf("c");//posso anche cercare un pattern. Si ripetono.
console.log(search4);

//metodi per il taglio
let stringa= "Questo corso terminera' con un Projectwork";
let taglio1= stringa.slice(3,15);
console.log(taglio1);
let taglio2 = stringa.substring(3,15);

// metodi per la sostituzione
let stringa2="Edge e' il miglior browser al mondo!!";
let rep= stringa2.replace("Edge","Chrome");
console.log(rep);

let upp= rep.toUpperCase();
console.log(upp);

let low= rep.toLowerCase();
console.log(low);

// Metodi per scomposizione in Array 

let parola= "Dario";

//il metodo split trasforma una stringa in un Array
let parolaArr= parola.split(""); //""vuol dire splittare ogni singolo carattere
console.log((parolaArr));

let frase= "Provo con una frase qualunque";
let fraseArr= frase.split("");
console.log(fraseArr);

let fraseArr2= frase.split(" ");
console.log(fraseArr2);

let fraseArr3=frase.split("r");
console.log(fraseArr3);

let nomeFile="carta di identita'.pdf";
//l'utente e' una testa di cazzo.
let nomeFileArr= nomeFile.split(" ");
console.log(nomeFileArr);
//ricompongo il nomeFile mettendo l'underscore_
let nomeFileOk= nomeFileArr.join("_");
console.log(nomeFileOk);

//esempio2
let nomeFile2="patente di guida.jpg";
let nomeFileOk2= nomeFile2.split(" ").join("_"); //posso utilizzare metodi uno dopo l'altro
console.log(nomeFileOk2);

//esempio3- data la seguente stringa scrivila al contrario
let miaFrase= "Ciao a tutta la classe del corso";
let fraseAlContrario= miaFrase.split("").reverse().join("");

console.log(fraseAlContrario);

let miaFrase2= "i topi non avevano i nipoti";
let fraseAlContrario2= miaFrase2.split("").reverse().join("");
console.log(fraseAlContrario2);

//esercizio:
//elabora uno script per fare la seguente manipolazione:
//oggi sono a lezione -> Oggi Sono A Lezione
//uppercase della prima lettera di ogni singola parola

let frase2= "oggi sono a lezione";
let frase2Arr= frase2.split(" ");
console.log(frase2Arr[0][0].toUpperCase());
// Le i sono gli indici fra gli Array
let nuovaFrase= ""
for (let i = 0; i < frase2Arr.length; i++) {
    let inizialeMaius=  frase2Arr[i][0].toUpperCase();
    let restoParola= frase2Arr[i].substring(1);

    nuovaFrase+= inizialeMaius+ restoParola+ " ";
    
}
console.log(nuovaFrase);

//esercizio2: elabora uno script per estrarre l'estensione di un file. es "immagineBG.jpg"-> "l'estensione del file e'jpg"

let immaginefile= "immagineBG.jpg";
let tagli1= immaginefile.split(".").pop();
console.log("l'estensione del file e' "+tagli1);








