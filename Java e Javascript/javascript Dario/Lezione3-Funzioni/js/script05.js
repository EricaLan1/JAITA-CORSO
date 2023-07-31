let demo = document.getElementById("demo");

function recuperaUsername() {
    let username = document.getElementById("username").value;

    return username;
}

function controlla() {//controlla a sua volta che cosa fa, deve controllare se l'username dell'utente e' vuoto oppure no
    let username = recuperaUsername();

    if(username ==""){
        return false;
    }else{
        return true;
    }
}

function stampa(username) { // si prende in input un username, 
    demo.innerHTML = "Benvenuto "+ username+ "!!";
}

function eseguiTutto() {
    let flag = controlla(); // flag e' un booleano perche' restituisce true a false
    
    if(flag){
        stampa(recuperaUsername());
    }else{
        demo.innerHTML = "Mi dispiace non hai fornito uno username"
    }
    
    //riprende la function controlla e ci restituisce true or false
}
// questa funzione e' lunga inreale 35 righe di codice per 2 cose. O almeno fin quando non sono 5-7 cose e' utile