let utenteJSON = localStorage.getItem("utente");
let utenteA = JSON.parse(utenteJSON);

let demo = document.querySelector("#demo");
demo.textContent= utenteA.nome;