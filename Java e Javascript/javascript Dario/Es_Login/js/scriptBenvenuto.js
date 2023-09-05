let Ciao = document.querySelector("#salutaUser");

function infoUser() {
    let utenteConnesso = JSON.parse(localStorage.getItem("userRegistrati"));

    if (utenteConnesso == null) {
        location.href = "./404.html";
    } else {
        Ciao.innerHTML = `Ciao ${utenteConnesso.nome} <br> Email: ${utenteConnesso.mail}<br> id:  ${utenteConnesso.id}`;
    }
}

document.addEventListener("DOMContentLoaded", infoUser);

function logout() {
    localStorage.clear();
    location.href = "./arrivederci.html";
}

let btnLogOut = document.querySelector("#btnLogOut");

btnLogOut.addEventListener("click", logout);