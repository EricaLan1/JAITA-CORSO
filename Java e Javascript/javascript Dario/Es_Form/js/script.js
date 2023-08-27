function User(nomeCognome, codiceFiscale, eta,){
    this.nomeCognome = nomeCognome;
    this.codiceFiscale = codiceFiscale;
    this.eta = eta;

    this.toString = function() {
        let presentazione = `Utente: ${this.nome}${this.cognome}  -Codice Fiscale: ${this.codiceFiscale}-Eta': ${this.eta}`;

        return presentazione;
    }
}


    let btn1 = document.getElementById("btn1");
    let feed1 = document.getElementById("feed1");

    let nome = document.getElementById("nome");
    let eta= document.getElementById("eta");
    let codFisc= document.getElementById("codFisc");



    function controllaCampi() {
        if (controllaform1c(nome.value.trim(),codFisc.value, eta.value)){
            
        let mioUser = new User(nome.value, codFisc.value, eta.value);
        feed1.innerHTML += "<li>"+mioUser.toString()+ "</li>"
       
        }
    }


    function controllaform1c(nomeCognome, codFisc,eta) {
        feed1.innerHTML = "";
        let parola = nomeCognome.split(" ");
        let nome = parola[0];
        let cognome = parola[1];
        
        if (nome != "" && cognome != "" &&codFisc!= ""  && eta != "" & eta>= 18) {
            feed1.innerHTML = "Inviati";
            return true;
        }else{

         if (parola.length != 2) {
                feed1.innerHTML += "Il nome e cognome devono essere inseriti tra due parole separate  <br>";
                
            }

            if (nome =="" || cognome == "") {
                feed1.innerHtml = "Il nome e cognome non e' ben compilato <br>"
            }

            if (codFisc == "" || codFisc.length != 16) {
            feed1.innerHTML += "il codice fiscale non e' ben compilato<br>";
        
            }

            if (eta == "" || Number(eta) <18) {
            feed1.innerHTML += "Eta' non e' compatibile <br>";
            }
            return false;
            
        }
    }

    btn1.addEventListener("click", controllaCampi);