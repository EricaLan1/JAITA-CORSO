let demo = document.getElementById("demo");

function recuperoNum1() {
    let num1 = document.getElementById("num1").value;
    
    return num1;
   
}

function recuperoNum2() {
    let num2 = document.getElementById("num2").value;

    return num2;
}

function somma() {
    let num1 = recuperoNum1()
    let num2 = recuperoNum2()

        let somma = Number(num1) + Number(num2);
        

        demo.innerHTML = somma;
        return somma
        
}

function moltiplica() {
    let num1 = recuperoNum1()
    let num2 = recuperoNum2()

    let moltiplicazione = num1 * num2;
    
    
    demo.innerHTML = moltiplicazione;
    return moltiplicazione
}

function sottrai() {
    let num1 = recuperoNum1()
    let num2 = recuperoNum2()

    let sottrazione = num1 - num2;
    
    
    demo.innerHTML = sottrazione;
    return sottrazione
}

function dividi() {
    let num1 = recuperoNum1()
    let num2 = recuperoNum2()

    let divisione = num1 / num2;
    
    demo.innerHTML = divisione;
    return divisione
}

function calcolaTutto() {
    // let num1 = document.getElementById("num1").value;
    // let num2 = document.getElementById("num2").value;

    // let somma1 = somma(Number(num1) + Number(num2));
    // let sottrazione1 = sottrai(num1 - num2);
    // let moltiplicazione1 = moltiplica(num1 * num2);
    // let divisione1 = dividi(num1 / num2);

    let somma1 = somma();
    let sottrazione1 = sottrai();
    let moltiplicazione1 = moltiplica();
    let divisione1 = dividi();

   
    
    demo.innerHTML = somma1 + " " + sottrazione1 + " " + moltiplicazione1 + " " + divisione1 + " ";
}

// function calcolaTutto() { STAMPA OPERAZIONE INTERA
//     let numero1= parseFloat(document.getElementById("num1").value);
//     let numero2= parseFloat(document.getElementById("num2").value);
//     let stampa ="";
//     stampa += numero1 + "+"+numero2 + "="+(numero1+numero2)+ "<br> ";
//     stampa += numero1 + "-"+numero2 + "="+(numero1-numero2)+ "<br>";
//     stampa += numero1 + "*"+numero2 + "="+(numero1*numero2)+ "<br> ";
//     stampa += numero1 + "/"+numero2 + "="+(numero1/numero2)+ "<br> ";

//     demo.innerHTML= stampa;

// }

// -------------------VERSIONE NON RIUSCITA----------
// let demo = document.getElementById("demo");

// function somma() {
//     let numero1= parseFloat(document.getElementById("num1").value);
//     let numero2= parseFloat(document.getElementById("num2").value);

//     let Risultato;
//     Risultato= numero1+numero2;
//     demo.innerHTML= Risultato;
// }

// function sottrai() {
//     let numero1= parseFloat(document.getElementById("num1").value);
//     let numero2= parseFloat(document.getElementById("num2").value);
//     let Risultato;
   
//     Risultato= numero1-numero2;
//     demo.innerHTML= Risultato;
// }
// function moltiplica(operazione) {
//     let numero1= parseFloat(document.getElementById("num1").value);
//     let numero2= parseFloat(document.getElementById("num2").value);
//     let Risultato;

//     Risultato= numero1*numero2;
//     demo.innerHTML= Risultato;
// }
// function dividi() {
//     let numero1= parseFloat(document.getElementById("num1").value);
//     let numero2= parseFloat(document.getElementById("num2").value);
//     let Risultato;

//     Risultato= numero1/numero2;
//     demo.innerHTML= Risultato;
// }

// function calcolaTutto() {
//     let numero1= parseFloat(document.getElementById("num1").value);
//     let numero2= parseFloat(document.getElementById("num2").value);
//     let stampa ="";
//     stampa += numero1 + "+"+numero2 + "="+(numero1+numero2)+ "<br> ";
//     stampa += numero1 + "-"+numero2 + "="+(numero1-numero2)+ "<br>";
//     stampa += numero1 + "*"+numero2 + "="+(numero1*numero2)+ "<br> ";
//     stampa += numero1 + "/"+numero2 + "="+(numero1/numero2)+ "<br> ";

//     demo.innerHTML= stampa;

// }

