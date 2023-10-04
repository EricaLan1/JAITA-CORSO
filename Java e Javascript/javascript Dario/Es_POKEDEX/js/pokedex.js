document.addEventListener("DOMContentLoaded", function () {
    let URL = "https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0";
    let datiMemorizzati = localStorage.getItem("pokemonScelti");
    let scelta = JSON.parse(datiMemorizzati);
    console.log(scelta);
    let cardContainer = document.querySelector("#Pokedex");
    let row = document.createElement("div");
    row.classList.add("row");

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
                                <div class="card-body">
                                    <h2 class="card-title">${poke2.name}</h2>
                                    <p> ${tipoPokemon}</p>
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

//if (datiMemorizzati) {
//let scelta = JSON.parse(datiMemorizzati);
//console.log(scelta);

//let cardContainer = document.querySelector("#Pokedex");

// Creare una riga Bootstrap
//let row = document.createElement("div");
//row.classList.add("row");

//for (let i = 0; i < scelta.length; i += 2) {
//let nome = scelta[i];



// Creare una colonna Bootstrap per ogni card
//let col = document.createElement("div");
//col.classList.add("col-md-4", "mb-3");

// Creare la card all'interno della colonna
//let card = document.createElement("div");
//card.classList.add("card");



//fetch("https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0")
//.then(data => data.json())
//.then(pokemon => {
//pokemon.results.forEach(pokemonT => {
//let trovato = scelta.find((poke2) => pokemonT.name === poke2);
//if (trovato) {
//fetch(pokemon.url)
//.then(data => data.json())
//.then(poke2 =>{
//card.innerHTML = `
//<img src="${poke2.sprites.front_default}" alt="${poke2.name}" class="card-img-top">
//<div class="card-body">
//<h2 class="card-title">${poke2.name}</h2>
//</div>
// `;
//})
// }

//});


// let imageUrl = pokemon.sprites.other["official-artwork"].front_default;
// card.innerHTML = `
//     <img src="${imageUrl}" alt="${nome}" class="card-img-top">
//     <div class="card-body">
//         <h2 class="card-title">${nome}</h2>
//     </div>
// `;

// Aggiungere la card alla colonna
//col.appendChild(card);
//})
// .catch(error => console.error(error));

// Aggiungere la colonna alla riga
// row.appendChild(col);
//}

// Aggiungere la riga con tutte le colonne al contenitore
// cardContainer.appendChild(row);
// }
//});