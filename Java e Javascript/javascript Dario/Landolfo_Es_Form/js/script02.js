function User(nomeCognome2, codiceFiscale2, eta2,){
    this.nomeCognome2 = nomeCognome2;
    this.codiceFiscale2 = codiceFiscale2;
    this.eta2 = eta2;

    this.toString = function() {
        let presentazione = `Utente: ${this.nome2}${this.cognome2}  -Codice Fiscale: ${this.codiceFiscale2}-Eta': ${this.eta2}`;

        return presentazione;
    }
}


    let btn2 = document.getElementById("btn2");
    let feed2 = document.getElementById("feed2");

    let nome2 = document.getElementById("nome2");
    let eta2= document.getElementById("eta2");
    let codFisc2= document.getElementById("codFisc2");



    function controllaCampic() {
        if (controllaform2(nome2.value.trim(),codFisc2, eta2)){
            
        let mioUser = new User(nome2.value, codFisc2.value, eta2.value);
        feed2.innerHTML += "<li>"+mioUser.toString()+ "</li>"
       
        }
    }


    function controllaform2(nomeCognome2, codFisc2,eta2) {
        feed2.innerHTML = "";
        let parola2 = nomeCognome2.split(" ");
        let nome2 = parola2[0];
        let cognome2 = parola2[1];

        if (nome2 != "" && cognome2 != "" &&codFisc2!= "" &&  codFisc2.length != 16 && eta2 != "" & eta2>= 18) {
            feed2.innerHTML = "Inviati";
            return true;
        }else{
            if (parola2.length != 2) {
                feed2.innerHTML += "Il nome e cognome devono essere inseriti tra due parole separate  <br>";
            }

            if (nome2 =="" || cognome2 == "") {
                feed2.innerHtml = "Il nome e cognome non e' ben compilato <br>"
            }
         
            if (codFisc2 == "" || codFisc2.length < 16) {
            feed2.innerHTML += "il codice fiscale non e' ben compilato<br>";
            }

            if (eta2 == "" || Number(eta2) <18) {
            feed2.innerHTML += "Eta' non e' compatibile <br>";
            }
            return false;
            
        }
    }

    btn2.addEventListener("click", controllaCampic);