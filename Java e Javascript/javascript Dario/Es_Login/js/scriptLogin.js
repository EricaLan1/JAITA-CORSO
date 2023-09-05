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
    let password = document.querySelector("password");

    if (nomeUtente.value == "") {
        demo.innerHTML += "Hai dimenticato il nome <br>";
        let userJSON = JSON.getItem(userRegistrati);
        event.preventDefault();

    }

    if (password.value == "") {
        demo.innerHTML += "password esatta";
         } else {
                demo.innerHTML += "password errata";
                event.preventDefault();
                
            
                alert ("Non hai inserito i dati necessari");
                event.preventDefault();
                console.log(event);
    }

    let cercaUtente = userRegistrati.find((element)=> element.nome == nomeUtente.value && element.pass == password.value ) !== undefined;

    if (cercaUtente) {
        
    }

}
formReg.addEventListener("submit", function(){
    Login();
});