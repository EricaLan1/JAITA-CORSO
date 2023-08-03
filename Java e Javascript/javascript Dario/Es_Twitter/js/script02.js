let conta2 = document.querySelector("#conta2");
let textarea = document.querySelector("#textarea");
let modulos = document.querySelector("#modulos");
let btnInvio = document.querySelector("#btnInvio");
let boxMessaggi = document.querySelector("#boxMessaggi");



function ContaCaratteri(){
    let massimo = 280;
    let contatesto = massimo - document.modulo.testo.value.length;
    conta2.textContent  = "Caratteri rimanenti: "+ contatesto;


    if (contatesto <= 0 ) {
        alert("Caratteri massimi 280");
        
    }
    
}
textarea.addEventListener("input", ContaCaratteri)


btnInvio.addEventListener("click", function () {
    let messaggioStampato = document.modulo.testo.value +" "+ new Date().toLocaleString(); //visto sugli esempi di mdn
    
    boxMessaggi.innerHTML += " "+messaggioStampato +"<br>";

    document.modulo.testo.value = "";

})

