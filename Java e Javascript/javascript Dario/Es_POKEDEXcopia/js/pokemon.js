let URL = "https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0";
let demo = document.querySelector("#demo");
let btn = document.querySelector("#btn");
let btn1 = document.querySelector("#btn1");
let collezione = document.querySelector("#collezione");
let pokedex = [];

// Funzione per creare una card per un Pokémon
function cartaPokemon(pokemon) {
    let card = document.createElement("div");
    card.classList.add("col-md-4", "mb-3");
    card.innerHTML = `
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">${pokemon.name}</h5>
                <button type="button" class="btn btn-primary bottoneAggiungi">Aggiungi al Pokedex</button>
            </div>
        </div>
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
            <strong>Scelgo!</strong> Hai selezionato correttamente il tuo pokemon!
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
                <strong>hai scelto correttamente i tre pokemon</strong>
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
                        demo.appendChild(card);
                    });
            });
        });
}

// Chiama la funzione per ottenere i dati dei Pokémon e creare le card
listaPokemon();
