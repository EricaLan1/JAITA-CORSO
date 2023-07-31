console.log("Ho collegato lo script esterno !");
console.log("Ciao!Sono Erica Landolfo");
console.log("Ho 23 anni e vivo a Casalnuovo di Napoli.");

//Dichiaro e assegno allo stesso momento
//Ricorda: le variabili vanno dichiare in CamelCase
let nomeStudente = "Erica";
let cognomeStudente ="Landolfo";
let corso = "JAITA93";
let etaStudente = 23;
let presenza = true;
let annoIscrizione = "2023";
let citta = "Napoli";
let paese = "Casalnuovo";
alert("Stai presentando uno studente!");
document.write(nomeStudente+" "+cognomeStudente+", età: "+etaStudente+ "<br>");
document.write(paese+ " provincia di "+citta+"<br>");
document.write("Anno Iscrizione:" +annoIscrizione+ "<br>");
document.write("Presenza:" +presenza+ "<br>");
//JavaScript è debolmente tipizzato, cioè conosce benissimo i tipi di dato solo che non siamo obbligati a dichiararli. In java sì. 
//Let è una parola chiave come var per indicare una variabile che andrà davanti.