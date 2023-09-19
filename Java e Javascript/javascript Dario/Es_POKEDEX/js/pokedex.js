// const datiMemorizzati = localStorage.getItem("pokemonScelti");
// if (datiMemorizzati) {
//     const scelta = JSON.parse(datiMemorizzati);
//     console.log(scelta);
// }


document.addEventListener("DOMContentLoaded", function () {
    const datiMemorizzati = localStorage.getItem("pokemonScelti");

    if (datiMemorizzati) {
        const scelta = JSON.parse(datiMemorizzati);
        console.log(scelta);

        const cardContainer = document.querySelector("#Pokedex");

        // Creare una riga Bootstrap
        const row = document.createElement("div");
        row.classList.add("row");

        for (let i = 0; i < scelta.length; i += 2) {
            const nome = scelta[i];
            const url = scelta[i + 1];

            // Creare una colonna Bootstrap per ogni card
            const col = document.createElement("div");
            col.classList.add("col-md-4", "mb-3");

            // Creare la card all'interno della colonna
            const card = document.createElement("div");
            card.classList.add("card");

            fetch(url)
                .then(data => data.json())
                .then(pokemon => {
                    const imageUrl = pokemon.sprites.other["official-artwork"].front_default;

                    card.innerHTML = `
                        <img src="${imageUrl}" alt="${nome}" class="card-img-top">
                        <div class="card-body">
                            <h2 class="card-title">${nome}</h2>
                        </div>
                    `;

                    // Aggiungere la card alla colonna
                    col.appendChild(card);
                })
                .catch(error => console.error(error));

            // Aggiungere la colonna alla riga
            row.appendChild(col);
        }

        // Aggiungere la riga con tutte le colonne al contenitore
        cardContainer.appendChild(row);
    }
});