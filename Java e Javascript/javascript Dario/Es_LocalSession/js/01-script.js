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

/*

form con method = post per impedire che si visualizzino i dati sul líndirizzo


function User(nome, cognome,email,username,avatar) {
    this.nome = nome,
    this.cognome = cognome,
    this.email = email,
    this.username = this.username,
    this.avatar = this.avatar
}

function registrati() {
    let nome = document.querySelector("#nome");
    let cognome = document.querySelector("#cognome");
    let email = document.querySelector("#email");
    let username = document.querySelector("#username");
    let avatar = document.querySelector("#avatar");

    if (nome.value != ""&& cognome.value != "" && email.value != "" && username.value != "" && avatar.value != "") {

        let user = new User(nome.value, cognome.value,email.value,username.value,avatar.value)


        let utenteJSON = JSON.stringify(user);
        localStorage.setItem("utente",userJSON);
        
    }else{
        alert ("Non hai inserito i dati necessari");
        event.preventDefault(); 
        console.log(event); per evitare di andare avanti
    }


}

formReg.addEventListener ("submit", function(){
    registrati();  per togliere event deprecato, ovvero sbarrato
}

*/
