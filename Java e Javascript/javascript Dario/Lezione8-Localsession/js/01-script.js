//Quando voglio utilizzare il modernizr wrappo il codice da verificare per controllare se sia compartibile, in un if la cui condizione e' specificata dalla libreria stessa

//  if(Modernizr.localstorage){
    // let nomeUtente = "Erica";
    // localStorage.setItem("nomeUser", nomeUtente);

// }else{
//     console.log("Sul tuo browser non funziona il localStorage");
// }

//Questa funzione si occupera' di guardare in local e sessione storage per vedere se esiste un utente connesso
function verificaSessione() {
    let utenteConnesso = localStorage.getItem("nomeUser");


    if(utenteConnesso != ""){
        console.log("Benvenuto "+ utenteConnesso);
    }else{
        console.log( "Esegu il login");
    }

}

//domcontent permette di lanciare delle funzioni su cui verra' applicata la pagina.
document.addEventListener("DOMContentLoaded", verificaSessione);