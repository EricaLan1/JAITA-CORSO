let utente = {
    nome: "Erica",
    cognome: "Landolfo",
    email: "ericalandolfo1@gmail.com",
    username: "Thalitha",
    Avatar: "https://upload.wikimedia.org/wikipedia/it/3/3e/Una_settimana_da_dio.png"
}


document.addEventListener("submit", Verifica);

function Verifica() {
    let nome = document.querySelector("#nome").value;
    let cognome = document.querySelector("#cognome").value;
    let email = document.querySelector("#email").value;
    let username = document.querySelector("#username").value;
    let avatar = document.querySelector("#avatar").value;

    let trova = utente.find((element)=> element.nome == nome.value && element.cognome == cognome.value && element.email == email.value && element.username == username.value && element.avatar == avatar.value) !== undefined; //

    console.log("Benvenut* "+ trova);

    if (trova) {
        let utenteJSON = JSON.stringify(utente);
        localStorage.setItem("utente",utenteJSON);
        
    }


}

