//array= contenitore di elementi simili tra loro. dello stesso tipo. 


//su javascrit non si devono dichiarare le string, sappiamo che sono dello stesso tipo. L'array in JS e' definito attraverso le parentesi quadre e non bisogna specificare né il tipo né il numero di elementi che conterrà
//ATT: in JV posso fare degli Array misti ma la logica me lo impeisce
//let mioArray=["Puruh","nani",123,true,"ok"];
//Gli Array sono 0-base

let colori= ["verde","blu","giallo","rosso"]
let primoColore=colori[0]
console.log("il primo colore è "+primoColore);

// per richiamare i singoli elementi nell'array nomeArray[indice]
let secondoColore=colori[1]
console.log("il secondo colore è "+secondoColore);

let ultimoColore= colori[colori.length -1];
console.log("L'ultimo colore e': "+ultimoColore);

//qui stampo la lunghezza dell'Array
let numColori= colori.length;
console.log("L'array contiene "+numColori+" elementi");

//stampo tutto l'array
console.log(colori);

//stampo i singoli elementi
//for(inizializzazione;condizione;aggiornamento)
for (let i = 0; i < colori.length; i++) {
    //1giro i=; 0<4 True; i=1
    //2giro i=1; 1<4 True; 1=2
    //3giro i=2; 2<4 True; 1=3
    //4giro i=3; 3<4 True; i=4
    //5giro i=4; 4<4 Falso; X il giro si stacca e non viene eseguito ecco perche' usiamo color.length
    console.log(colori[i]);   
}

//metodi solitamente sono dei verbi
//prop sono sostantivi
//metodi per array

//aggiungo un elemento all'array di colori
colori.push("viola");
console.log(colori);

//ordino l'arrray alfabeticamente
colori.sort();
console.log(colori);
//control r apri i file recenti 
//inverto  l'ordine dell'array
colori.reverse();
console.log(colori);

//elimino l'ultimo elemento dell'array
colori.pop();
console.log(colori);
//ricerca di un elemento
console.log(colori.indexOf("rosso"));//restituisce l'indice nel quale si trova il colore rosso
console.log(colori.indexOf("arancione")); //-1
console.log(colori.includes("giallo"));//true
console.log(colori.includes("magenta"));//false