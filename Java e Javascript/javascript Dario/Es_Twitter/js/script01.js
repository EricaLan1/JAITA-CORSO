let demo = document.querySelector("#demo");
let formReg = document.querySelector("#formReg");

let nomeUtente= document.querySelector("#nome");
let password= document.querySelector("#password");
let regexPassw = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%#?&])[A-Za-z\d@$!%*#?&]{8,20}$/;

let utentiRegistrati = [
    { //Erica
        username: "biscottopuru",
        password: "Biscottopuru1!"
    },
    {   //Federico
        username: "Federico",
        password: "Federico?99"
    },
    {   //Leonardo
        username: "Leoleoleo",
        password: "Qwerty25%"
    },

];


function login() {
    
    demo.innerHTML = "";
    let trova = utentiRegistrati.find((element)=> element.username == nomeUtente.value && element.password == password.value ) !== undefined; // for(elemento1) + if(elemento1)
    console.log("Benvenut* "+ trova);
    
    if (trova) {
        if (formReg.nomeUtente.value == "") {
            demo.innerHTML += "Hai dimenticato il nome <br>";
            event.preventDefault();
            return; //quando incontra un errore esce fuori e non continua
        }
    
        if (formReg.password.value == "") {
            demo.innerHTML += "Hai dimenticato la password<br>";
            event.preventDefault();
            return; //quando incontra un errore esce fuori e non continua
        }
    
       
    
        if (!(nomeUtente.value.length >= 8 && nomeUtente.value.length <= 15)) {
            demo.innerHTML += "Nome utente non valido<br>";
            event.preventDefault();
            return; //quando incontra un errore esce fuori e non continua
        } else {
            demo.innerHTML += "Nome utente esatta<br>";
            
        }
    
        if (password.value.match(regexPassw)) {
            demo.innerHTML += "password esatta";
        } else {
            demo.innerHTML += "password errata";
            event.preventDefault();
            return; //quando incontra un errore esce fuori e non continua
        }
       
    }else{
        demo.innerHTML = "Utente non trovato";
        event.preventDefault();
        return;
    }
    



    
}


formReg.addEventListener("submit", login);


