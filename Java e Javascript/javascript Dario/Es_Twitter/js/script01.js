let demo = document.querySelector("#demo");
let btn = document.querySelector("#btn");
let formReg = document.querySelector("#formReg");

let nomeUtente= document.querySelector("#nome");
let password= document.querySelector("#password");

let regexPassw = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%#?&])[A-Za-z\d@$!%*#?&]{8,20}$/;


function login() {
    
    demo.innerHTML = "";

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

   // location.href = "./twitt er.html"; 
   
}

formReg.addEventListener("submit", login);


