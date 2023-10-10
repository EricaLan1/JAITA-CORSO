let URL = "https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0"; // api pokemon
let demo = document.querySelector("#demo");
let btn = document.querySelector("#btn");
let btn1 = document.querySelector("#btn1");
let collezione = document.querySelector("#collezione");
let pokedex = [];
let stampaGruppi = document.querySelector("#lista");


function cartaPokemon(pokemon) {  //creaiamo
    let animatedImageURL = pokemon.sprites.versions['generation-v']['black-white'].animated.front_default;
    let card= document.createElement("li");
            card.classList.add("list-group-item");
            card.innerHTML = `
                <img src= "${animatedImageURL}">
                <span>${pokemon.name}</span>
                <button type="button" class="btn btn-danger bottoneAggiungi d-inline-block ms-5 float-end">Aggiungi al Pokedex</button>
            `;

    
        
    // Aggiungi l'event listener per il clic sul pulsante "Aggiungi al Pokedex"
    let addButton = card.querySelector(".bottoneAggiungi");
    addButton.addEventListener("click", () => {
       
        if (pokedex.length < 3) {
            let pokemonName = pokemon.name;
            console.log(pokemonName);
            if (!pokedex.includes(pokemonName)) {
                pokedex.push(pokemonName);
                console.log(pokedex);
                let spazioAlert = document.querySelector("#spazioAlert");

        let alert = `
        <div class="alert alert-danger alert-dismissible fade show" role="alert">
            <strong>Scelgo te ${pokemon.name}!</strong> Hai selezionato correttamente il tuo pokemon!
            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
        </div>`;

        spazioAlert.innerHTML = alert;

            } else {
                let alert = `
                <div class="alert alert-danger alert-dismissible fade show" role="alert">
                    <strong>errore!</strong> 
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>`;
                spazioAlert.innerHTML = alert;
            }

            if (pokedex.length >= 3) {
                let alert = `
            <div class="alert alert-danger alert-dismissible fade show" role="alert">
                <strong>hai selezionato correttamente i tre pokemon, </strong>procedi nel pokedex per la visualizzazione
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>`;
    
            spazioAlert.innerHTML = alert;
                localStorage.setItem("pokemonScelti", JSON.stringify(pokedex));
        
            }
        }
    });

    return card;
    
}


function listaPokemon() {
    fetch(URL)
        .then((data) => {
            return data.json();
        })
        .then((response) => {

            
            response.results.forEach((pokemon) => {
                fetch(pokemon.url)
                    .then((data) => {
                        return data.json();
                    })
                    .then((response) => {
                        let card = cartaPokemon(response); 
                        
                        stampaGruppi.appendChild(card)
                    });
            });
        });
}

// Chiama la funzione per ottenere i dati dei Pokémon e creare le card
listaPokemon();



