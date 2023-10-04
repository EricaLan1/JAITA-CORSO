document.addEventListener("DOMContentLoaded", function () {
    let URL = "https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0";
    let datiMemorizzati = localStorage.getItem("pokemonScelti");
    let scelta = JSON.parse(datiMemorizzati);
    console.log(scelta);
    let cardContainer = document.querySelector("#Pokedex");
    let row = document.createElement("div");
    row.classList.add("row");

  let status = this.getAttribute("data-numerocard");


    fetch(URL)
        .then((data) => data.json())
        .then((response) => {
            response.results.forEach((pokemonT) => {
                let trovato = scelta.find((poke2) => pokemonT.name === poke2); // se il nome dell'array si trova nell'api, stampami la card
                if (trovato) {
                    fetch(pokemonT.url)
                        .then((data) => data.json())
                        .then((poke2) => {
                            let col = document.createElement("div");
                                col.classList.add("col-md-4", "mb-3");
                            let tipoPokemon= poke2.types[0].type.name;
                                console.log(tipoPokemon);
                            let card = document.createElement("div");
                                card.classList.add("card");
                                 card.innerHTML = `
                                     <img src="${poke2.sprites.front_default}" alt="${poke2.name}" class="card-img-top">
                                     <div class="card-body" data-numerocard = `${}`>
                                         <h2 class="card-title name">${poke2.name}</h2>
                                        <p class="card-title type"> ${tipoPokemon}</p>
                                        <button class="btn btn-primary modificaBtn " id="btn" onclick="modificaUser(event)">Modifica info</button>

                                    </div>
                            `;
                            col.appendChild(card);
                            row.appendChild(col);
                        });
                }
            });
        });
    cardContainer.appendChild(row);
});

function modificaUser(event){
    event.preventDefault();
    let divModifica = document.querySelector("#divModifica");
    divModifica.classList.remove("d-none");

        let nome = document.querySelector("#nome").value
        let tipo = document.querySelector("#tipo").value
      
        document.querySelector(`.card-title.name`).innerText = nome;
        document.querySelector(`.card-title.type`).innerText = tipo;
}

formModifica.addEventListener("submit", modificaUser);



function annullaModifiche(){
    let divModifica = document.querySelector("#divModifica");
    divModifica.classList.add("d-none");
}

let btnAnnulla = document.querySelector("#btnAnnulla");

btnAnnulla.addEventListener("click", annullaModifiche);
