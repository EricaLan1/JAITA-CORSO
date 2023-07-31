let nomi=["Alfredo","Erica","Emilio"];
for (let i = 0; i < nomi.length; i++) {
   let nome= nomi[i];
    //ogni for cambia valore asseconda del valore di i.
    for (let p = 0; p < nome.length; p++) {
        console.log(nome.charAt(p));
    
    } 
    console.log(".");
}
