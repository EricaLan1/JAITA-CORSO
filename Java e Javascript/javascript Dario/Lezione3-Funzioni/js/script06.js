//le funzioni sono dei compartimenti stagni in cui possono essere ripetuti in qualsiasi punto dell'html.Servono a raggruppare codici.

//prendiamo tutto cio' che e's tatico che l'utente non interagisce scrivendoci dentro

const demo = document.getElementById("demo");

const btn = document.getElementById("btn");

const btnColor = document.getElementById("btnColor");

function inviaTweet() {
    let messaggio = document.getElementById("messaggio").value;

    if (messaggio=="") {
        demo.innerHTML = "Non hai scritto niente!!"
    }else{
        demo.innerHTML = "<p>" +messaggio+ "</p>";
    }

        // per cancellare cio' che scrivo nella textarea
        document.getElementById("messaggio").value ="";
}

function cambiaColore() {
    //il metodo setAttribute setta un attributo
    demo.setAttribute("class","txtBlue");
}

// ATT: le funzioni degli event Listener non hanno le parentesi tonde, MAI!!!
//oggettoHTML.addEventListener("evento",funzione);
btn.addEventListener("click", inviaTweet);
btnColor.addEventListener("click", cambiaColore)