let maxId;
document.addEventListener("DOMContentLoaded", function () {
    let URL = "https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0";
    let datiMemorizzati = localStorage.getItem("pokemonScelti");
    let scelta = JSON.parse(datiMemorizzati);
    let cardContainer = document.querySelector("#Pokedex");
    let row = document.createElement("div");
    row.classList.add("row");
    
    let numeroCard = 0;
    fetch(URL)
        .then((data) => data.json())
        .then((response) => {
            response.results.forEach((pokemonT) => {
                let trovato = scelta.find((poke2) => pokemonT.name === poke2); // se il nome dell'array si trova nell'api, stampami la card
                if (trovato) {
                    fetch(pokemonT.url)
                        .then((data) => data.json())
                        .then((poke2) => {
                            fetch(poke2.species.url) // si prende la descrizione 
                            .then((data) => data.json())
                            .then((poke3) => {
                            let trovato_3 = poke3.flavor_text_entries.find(it => it.language.name == "it"); 
                            let col = document.createElement("div");
                            col.classList.add("col-md-8", "mb-3");
                            let tipoPokemon= poke2.types[0].type.name;
                            let descrizionePokemon = trovato_3?trovato_3.flavor_text: "error"; // operatore ternario sostitutivo di if. if trovato 3 , se e' pieno prendo la descrizione dell'indice, mettimi la descrizione pokemon se no errore
                                
                            
                            let card = document.createElement("div");
                            card.classList.add("card");
                            card.setAttribute("data-numeroCard", numeroCard);
                            card.innerHTML = `
                                
                                
                                    
                                    
                            `;
                            col.appendChild(card);
                            row.appendChild(col);
                            maxId = numeroCard++;
                            
                            })
                        });

                }
            });
        });
    cardContainer.appendChild(row);
});

    function modificaPokemon(numero){
        
        let divModifica = document.querySelector("#divModifica");
        divModifica.classList.remove("d-none");
        let inputNumero= document.querySelector("#numeroCard");
        document.querySelector("#tipo").value = "";
        document.querySelector("#nome").value = "";
        document.querySelector("#descrizione").value ="";
        
        inputNumero.value = numero;
    }

    function salvaPokemon(event) {
        event.preventDefault();
        let tipo = document.querySelector("#tipo").value;
        let nome = document.querySelector("#nome").value;
        let descrizione = document.querySelector("#descrizione").value;
        let numeroCard = document.querySelector("#numeroCard").value;

        let listaCards= document.querySelectorAll(".card");
        listaCards.forEach(card => {
           let numero = card.getAttribute("data-numeroCard");
          

            if (numero === numeroCard) {
                card.querySelector("h2").innerHTML = nome;
                card.querySelector("p").innerHTML = tipo;
                card.querySelector(".descrizioneP").innerHTML = descrizione;
                
            }

        });
        
        let divModifica = document.querySelector("#divModifica");
        divModifica.classList.add("d-none");

        
    }
    formModifica.addEventListener("submit", salvaPokemon);



    function annullaModifiche(){

        let divModifica = document.querySelector("#divModifica");
        divModifica.classList.add("d-none");

    }

    let btnAnnulla = document.querySelector("#btnAnnulla");
    btnAnnulla.addEventListener("click", annullaModifiche);


  
    

        