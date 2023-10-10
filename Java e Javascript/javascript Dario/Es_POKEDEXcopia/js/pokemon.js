let URL = "https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0";
let demo = document.querySelector("#demo");
let btn = document.querySelector("#btn");
let btn1 = document.querySelector("#btn1");
let collezione = document.querySelector("#collezione");
let pokedex = [];
let stampaGruppi = document.querySelector("#lista");


function cartaPokemon(pokemon) {
    
    let card= document.createElement("li");
            card.classList.add("list-group-item");
            card.innerHTML = `
                <img src=`${pokemon.}` >
                <h6>${pokemon.name}</h6>
                <button type="button" class="btn btn-primary bottoneAggiungi">Aggiungi al Pokedex</button>
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
                        
                        stampaGruppi.appendChild(card)
                    });
            });
        });
}

// Chiama la funzione per ottenere i dati dei Pokémon e creare le card
listaPokemon();







    // <div class="container mt-4">
    //     <h1>Pokemon List</h1>
    //     <ul id="pokemonList" class="list-group">
    //     </ul>
    // </div>

    // 
    //     let URL = "https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0";
    //     let demo = document.querySelector("#pokemonList");
    //     let pokedex = [];


    //         let addButton = listItem.querySelector(".bottoneAggiungi");
    //         addButton.addEventListener("click", () => {
    //             if (pokedex.length < 3) {
    //                 let pokemonName = pokemon.name;
    //                 if (!pokedex.includes(pokemonName)) {
    //                     pokedex.push(pokemonName);
    //                     alert("Hai selezionato correttamente il tuo Pokémon!");
    //                 } else {
    //                     alert("Errore! Pokémon già selezionato.");
    //                 }

    //                 if (pokedex.length >= 3) {
    //                     alert("Hai scelto correttamente i tre Pokémon");
    //                     localStorage.setItem("pokemonScelti", JSON.stringify(pokedex));
    //                 }
    //             }
    //         });

    //         return listItem;
    //     }

    //     function listaPokemon() {
    //         fetch(URL)
    //             .then((data) => {
    //                 return data.json();
    //             })
    //             .then((response) => {
    //                 response.results.forEach((pokemon) => {
    //                     fetch(pokemon.url)
    //                         .then((data) => {
    //                             return data.json();
    //                         })
    //                         .then((response) => {
    //                             let listItem = elementoListaPokemon(response);
    //                             demo.appendChild(listItem);
    //                         });
    //                 });
    //             });
    //     }

    //     // Chiama la funzione per ottenere i dati dei Pokémon e creare gli elementi della lista
    //     listaPokemon();
   
