let formReg = document.querySelector("#formReg");
let utenteConnesso = localStorage.getItem("userRegistrati");
let utente = JSON.parse(utenteConnesso);

function Login(event) {
    
    let nomeUtente = document.querySelector("#nome").value;
    let password = document.querySelector("#password").value;

    let cercaUtente = utente.data.find(cercaUtente => cercaUtente.nome == nomeUtente && cercaUtente.pass == password );
    console.log("Benvenut* "+ cercaUtente);

    if (cercaUtente !== undefined) {
        sessionStorage.setItem("utente", JSON.stringify(cercaUtente))

    }else{
        alert ("Non hai inserito i dati necessari");
        event.preventDefault();
    }


    }



formReg.addEventListener("submit", Login);