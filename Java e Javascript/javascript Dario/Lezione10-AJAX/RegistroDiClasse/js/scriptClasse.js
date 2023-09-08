let listaStudenti = document.querySelector("#listaStudenti");
const URL = "http://localhost:3000/studenti";

fetch(URL)
.then(data =>{return data.json()})
.then(response =>{
    console.log(response);

    response.forEach(studente => {
        let card = document.createElement("li");
        card.setAttribute("class","list-group-item");
        card.textContent = `${studente.id} - ${studente.nome} - ${studente.cognome}`;

        listaStudenti.appendChild(card);
    });
})