

let utenteJSON = localStorage.getItem("utente");
let utenteA = JSON.parse(utenteJSON);

let demo = document.querySelector("#demo");
demo.textContent= utenteA.nome;

/*

let saluta = document.querySelector("#saluta");
let imgAvatar =  document.querySelector("#avatar");
let btnLogout =  document.querySelector("# btnLogout");

function stampaInfo(){

    if(utenteConnesso == null){
         location.href = "./404.html"; 
    }else{
         saluta.innerHTML = `Ciao ${utenteConnesso.nome} ${utenteConnesso.cognome}`;
         imgAvatar.setAttribute("src", utenteConnesso.avatar);
    }
    
}

document.addEventListener'("DOMContentLoad",stampainfo);

function logout(){
    localStorage.clear(); pulisce tutto
    location.href = "./index.html"; torna indietro alla pagina registrazione
}

btnLogout.addEventListener("click",logout);
*/