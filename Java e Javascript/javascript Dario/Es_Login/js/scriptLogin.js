let formReg = document.querySelector("formReg");
let utenteConnesso = localStorage.getItem("users");
let utente = JSON.parse(utenteConnesso);

function checkSessione() {
    let utenteConnesso = sessionStorage.getItem("users");
    
    
    if (utenteConnesso != null) {
        location.href = "./benvenuto.html";
    }
}
document.addEventListener("DOMContentLoaded", checkSessione);


function Login() {
    
    let nomeUtente = document.querySelector("#nome");
    let password = document.querySelector("pass");
    let cercaUtente = userRegistrati.find((element)=> element.nome == nomeUtente.value && element.pass == password.value ) !== undefined;
    console.log("Benvenut* "+ cercaUtente);

    if (cercaUtente) {
    if (nomeUtente.value != "" && password.value !="") {
        
        let userJSON = JSON.getItem(userRegistrati);
        event.preventDefault();

    }else {
            alert ("Non hai inserito i dati necessari");
            event.preventDefault();
            console.log(event);
    }

    

    
        
    }

}
formReg.addEventListener("submit", function(){
    Login();
});