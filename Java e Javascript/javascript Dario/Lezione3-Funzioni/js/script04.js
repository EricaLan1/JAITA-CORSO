let demo = document.getElementById("demo");

// voglio costruire una funzione che collegata al click sul pulsante saluta un utente
// il value serve a recuperare quello che scrive un utente nei campi input


// vengono recuperati subito quando la variabile username e' fuori o dopo la pagina. deve stare all'interno della funzione. TEMPI DI ESECUZIONE DELLO SCRIPT. 

function salutaUtente() {
    let username= document.getElementById("nomeUtente").value;
    
    //il metodo trim() cancella gli spazi vuoti intorno ad una stringa
    if (username.trim()=="") {
        demo.innerHTML= "Non hai inserito il nome!";

    }else{
        let saluto = "Ciao "+username+ " benvenuta sulla pagina!";
        demo.innerHTML = saluto;

    }
}

// FARE LA STESSA FUNZIONE di sopra ma senza il value sulla variabile getelement, che si trova fuori dal function.Poi creare una variabile let username = elUsername.value; con il value all'interno di function