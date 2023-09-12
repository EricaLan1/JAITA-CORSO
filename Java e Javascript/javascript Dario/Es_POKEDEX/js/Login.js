let formReg = document.querySelector("#formReg");
let demo = document.querySelector("#demo");

function Login(event) {
    demo.innerHTML = "";
    let nomeUtente = document.querySelector("#nome").value;


    if (nomeUtente == "") {
        alert("Inserisci Nome utente");
        event.preventDefault();
    } else {
       location.href = "./scegliPokemon.html";
        
    }



formReg.addEventListener("submit", Login);
}