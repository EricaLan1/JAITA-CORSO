let conta2 = document.querySelector("#conta2");
let textarea = document.querySelector("#textarea");


textarea.addEventListener("input", ContaCaratteri)


function ContaCaratteri(){
    let massimo = 280;
    let contatesto = massimo - document.modulo.testo.value.length;
    conta2.textContent= "Caratteri rimanenti: "+ contatesto;


    if (contatesto <= 0 ) {
        alert("Caratteri massimi 280");
        
    }

}
