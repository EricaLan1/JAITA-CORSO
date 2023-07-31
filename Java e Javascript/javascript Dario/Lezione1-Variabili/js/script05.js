let ListaColleghi= document.getElementById("ListaColleghi");
let L=document.getElementById("L");

// let dichiara la variabile, questa variabile e' di tipo Array iquanto iniziata con la parentesi quadra, e instaziata con il contenuto 
let ListaNome=["Fabiola","Piera","Laura","Anna","Ada","Ilaria"];
let ListaCognomi=["Riccardi","Scognamiglio","Comparelli","nonricordo","nonricordo","nonricordo"];
for (let i = 0; i < ListaNome.length; i++) {
   let listaGrande= ListaNome[i]; 
   let inizialeMaiuscola=listaGrande.charAt(0).toUpperCase();
   let finaleMaiuscola= listaGrande.charAt(listaGrande.length-1).toUpperCase();
    ListaColleghi.innerHTML += "<li>Nome:" + inizialeMaiuscola+listaGrande.slice(1,-1)+finaleMaiuscola+"</li>";
}
// lo slice taglia un pezzo di stringa.

// p<listacognomi quando il for finisce. p++ indica la condizione della variabile che ho dichiarato, se si scrive ++p lo dichiara un po' prima della fine.
for (let p = 0; p < ListaCognomi.length; p++) {
   let cognome=ListaCognomi[p]; 
   let cognomeModificato= " ";
   // variabili di suporto

for (let t = 0; t < cognome.length; t++) {
    let lett=cognome[t];

if (t%2===0) {
    cognomeModificato+= lett.toLowerCase();
}else{ cognomeModificato+= lett.toUpperCase();
}
    
}
L.innerHTML+= "<li>Cognome: "+cognomeModificato+"</li>";
}