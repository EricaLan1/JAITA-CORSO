let formReg = document.querySelector("formReg");
let utenteConnesso = localStorage.getItem("userRegistrati");
let utente = JSON.parse(utenteConnesso);

// function checkSessione() {
//     let utenteConnesso = sessionStorage.getItem("userRegistrati");
    
    
//     if (utenteConnesso != null) {
//         location.href = "./benvenuto.html";
//     }
// }
// document.addEventListener("DOMContentLoaded", checkSessione);


function Login(event) {
    
    let nomeUtente = document.querySelector("#nome");
    let password = document.querySelector("password");

    let cercaUtente = utente.data.find((element)=> element.nome == nomeUtente.value && element.password == password.value ) !== undefined;
    console.log("Benvenut* "+ cercaUtente);

    if (cercaUtente) {
        sessionStorage.setItem("utente", JSON.stringify(cercaUtente))

    }else{
        alert ("Non hai inserito i dati necessari");
        event.preventDefault();
        console.log(event);
    }


    }



formReg.addEventListener("submit", Login);