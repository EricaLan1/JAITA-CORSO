let Ciao = document.querySelector("#salutaUser");

function infoUser() {
    let utenteConnesso = JSON.parse(sessionStorage.getItem("utente"));
    
    if (utenteConnesso == null) {
        location.href = "./404.html";
    } else {
        Ciao.innerHTML = `Ciao ${utenteConnesso.nome} <br> Email: ${utenteConnesso.mail}<br>`;
    }
}

document.addEventListener("DOMContentLoaded", infoUser);

function logout() {
    sessionStorage.clear();
    location.href = "./arrivederci.html";
}

let btnLogOut = document.querySelector("#btnLogOut");

btnLogOut.addEventListener("click", logout);