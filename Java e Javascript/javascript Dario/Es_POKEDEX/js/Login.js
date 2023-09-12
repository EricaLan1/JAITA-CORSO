let formReg = document.querySelector("#formReg");

function Login(event) {
    
    let nomeUtente = document.querySelector("#nome").value;


    if (nomeUtente == "") {
        alert("Inserisci Nome utente");
        event.preventDefault();
    } else {
       location.href = "./scegliPokemon.html";
        
    }



formReg.addEventListener("submit", Login);
}