//Dichiaro una funzione 
function salutaUtente(){
    console.log("Ciao, Erica");
}

//Richiamo la funzione
salutaUtente();
//demo e' uana variabile globale, visibile ovunque
let demo= document.getElementById("demo");

function benvenuto() {
    //mesaggio e' una variabile locale
    let messaggio = "Ciao, Erica benvenuto sulla pagina!";
    demo.innerHTML = messaggio;
    console.log(messaggio);
}

benvenuto();
 //restituisce un errore
