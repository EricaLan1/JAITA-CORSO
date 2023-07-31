function Docente(nome,cognome, corsoAssegnato,materia){
        this.nome = nome;
        this.cognome = cognome;
        this.corsoAssegnato = corsoAssegnato;
        this.materia = materia;
    
    
    insegnaMateria= function(){
        return "Sto insegnando "+ this.materia;
    }

    this.info = function(){
        let presentazione = "Docente: "+this.nome+ " " +this.cognome + ". Corso: "+this.corsoAssegnato + " "+this.insegnaMateria();

        return presentazione;
    }

}

let docentiCorso = [
    new Docente("Dario", "Mennillo","JAITA93","Javascript"),
    new Docente("Mauro", "Bogliaccino","JAITA93","Java"),
    new Docente("Davide", "Ghione","JAITA93","HTML"),
    new Docente("Oscar", "Vecchione","JAITA93","SQL")
];

let elencoDoc = document.getElementById("elencoDoc");


docentiCorso.forEach(docente =>{
    elencoDoc.innerHTML += ` <div class = "dimDiv"> <p>Nome Docente: ${docente.nome} ${docente.cognome}</p>
    <p>Materia: ${docente.materia}</p>
    <p>Corso: ${docente.corsoAssegnato}</p>
    </div>`

    
    //backtic, al posto delle virgolette doppie, ha un modo di leggere quello che andremmo a fare in maniera totalmente diversa. Una valutazione di una variabile che sta da qualche parte, non mi serve mettere quei piu' e serve quando l'html si complica. Inoltre posso andare a capo cosa che non potrei fare normalmente con gli apici
})
