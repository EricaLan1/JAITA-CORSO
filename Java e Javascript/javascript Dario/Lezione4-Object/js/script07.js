function User(nome,cognome,alias, eta,email,data) {
    this.nome = nome;
    this.cognome = cognome;
    this.alias = alias;
    this.eta = eta;
    this.email = email;
    this.data = data;

    this.toString = function() {
        let presentazione = `Utente: ${this.nome}${this.cognome} -Alias: ${this.alias} - Eta': ${this.eta} -Email: ${this.email}- DataRec: ${this.data}`;

        return presentazione;
    }
}

let elencoUsers = document.getElementById("elencoUsers");
let btnRec = document.getElementById("btnRec");

/**
 * Questa funzione si occupera' di recuperare tutti i campi del form e creare l'oggetto User
 */

let nome = document.getElementById("nome"); //non pecare il .value fuori la tonda che non va a pescare nulla

function recuperaInfo() {
    let nome = document.getElementById("nome").value;
    let cognome = document.getElementById("cognome").value;
    let alias = document.getElementById("alias").value;
    let email = document.getElementById("email").value;
    let data = document.getElementById("data").value;
    let eta= document.getElementById("eta").value;

    //controllo semplice da trasformare in un controllo concreto

    if(controllaCampi(nome,cognome,alias,email,data,eta)){
        //alert("il tuo form non e' ben compilato");
    //}else{
        let mioUser = new User(nome, cognome, alias, eta,email,data);
        elencoUsers.innerHTML += "<li>"+mioUser.toString()+ "</li>"
        pulisciCampi();
    }
}

function pulisciCampi() {
    
     document.getElementById("nome").value == "";
     document.getElementById("cognome").value == "";
     document.getElementById("alias").value == "";
     document.getElementById("email").value == "";
     document.getElementById("data").value == "";
     document.getElementById("eta").value == "";
}

let feed = document.getElementById("feed");

function controllaCampi(nome, cognome, alias,  email, data, eta) {

    feed.innerHTML= ""; //vuoto altrimenti si sovrascrive
    

    if (nome != ""&& cognome != ""&& alias !="" && email !="" && data !=""&& Number(eta )>18) {
        feed.innerHTML += "Dati inviati";
        return true;
    }else{

    if( nome =="" || nome.length <= 1){
        feed.innerHTML += "il nome non e' ben compilato<br>";
       
    }
    if (cognome =="" || cognome.lenght <=1) {
        feed.innerHTML += "il cognome non e' ben compilato <br>";
       
    }
    if (alias == ""|| alias.length <8) {
        feed.innerHTML += "l'asias non e' ben compilato <br>";
        
    }
    if (email ==""){   
        feed.innerHTML += "Email vuota <br>";
        
    }
    if (data=="") {
    feed.innerHTML += "hai dimenticato la data<br>";
    
    }
    if (eta ==""||Number(eta)<18) {
    feed.innerHTML += "Eta non compatibile <br>";
    }
        return false;
        }
    }
//control d selezionare piu' volte la stessa parola per eliminare in massa, control shift + freccia verso destra per seleziona i gruppi verso destra

btnRec.addEventListener("click",recuperaInfo)