// jason non e' in grado di comprendere questa formula, per tanto hanno creato JSON. CREO un obj in JS con notazione letterale
let studente = {
    nome: "Erica",
    cognome: "Landolfo",
    mail: "ericalandolfo1@gmail.com",
    eta:23,
    id:2
}

// traduco il mio obj in un JSON [javascript object Notation] ( notazione a stringa)
// da questo momento in poi posso "inviare" questa stringa presso un endopoint di un'altra tecnologia
let studenteJSON = JSON.stringify(studente);

console.log(studenteJSON);
/////////////////////////

//funziona anche con istanze create da funzioni
function Docente(id,nome,cognome,materia) {
    this.id = id;
    this.nome = nome;
    this.cognome = cognome;
    this.materia = materia;
}

let docente = new Docente (1, "Milo", "Spandre",[
    {
        idMat:0,
        nomeMat: "HTML",
        ore: 56
    },
    {
        idMat: 1,
        nomeMat: "CSS",
        ore:38
    }
]);

console.log(docente);

let docenteJSON = JSON.stringify(docente);

console.log(docenteJSON);

//////////////////////

function User(id,nickname,role,info) {
    this.id = id;
    this.nickname = nickname;
    this.role = role;
    this.info = info;
}

let user = new User(2, "Thalitha", "player",[
    {nome: "Erica",
    cognome: "Landolfo",
    accoutAssociati: 2,
    coloriPreferiti: ["azzurro", "viola","ororosato"]},
    {
        nomeAlt: "Dario",
        cognomeAlt: "Mennillo",
        accoutAssociati: 3,
        coloriPreferiti: ["blu", "bianco", "arancione"]
    }
], "29/08/2023");

console.log(user);

///////////////////////////////
//"Ricevo" un json per trasformarlo in un oggertto di JS

let playerJSON = '{"nome": "ConcettaPancetta", "role": "Player", "id": 0, "attivo": true}';

console.log(playerJSON);

//Trasformo questa string in un obj di tipo JS 

let player = JSON.parse(playerJSON);

console.log(player);
console.log(player.nome);
console.log(player.role);

//"Mappo" l'oggetto per poter avere i suggerimenti e non programmare al buio
function PlayerOBJ(nome, role, id, attivo) {
    this.nome = nome;
    this.role = role;
    this.id = id;
    this.attivo = attivo;
}

//questa mappatura per avere i suggerimenti
let mioPlayerObj = new PlayerOBJ(player.nome, player.role, player.id, player.attivo);

console.log(mioPlayerObj.nome);