const datiMemorizzati = localStorage.getItem("pokemonScelti");
let pokemonSelezionati = document.querySelector("#Pokedex");


if (datiMemorizzati) {
    const scelta = JSON.parse(datiMemorizzati);
    console.log(scelta);
}



function card(params) {

    pokedex.innerHTML = "";
    

let card = `
    <div class="col-4 mt-5">
        <div class="card">
            <div class='card-body ${classBgCard}'>
            <img class="card-img-top " src=${datiMemorizzati.url}>
                <h3 class="card-title">${datiMemorizzati.name}</h3>
              
            </div>
        </div>
    </div>`;

    listaDocenti.innerHTML += card;
}