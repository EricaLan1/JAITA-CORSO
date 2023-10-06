let maxId;
document.addEventListener("DOMContentLoaded", function () {
    let URL = "https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0";
    let datiMemorizzati = localStorage.getItem("pokemonScelti");
    let scelta = JSON.parse(datiMemorizzati);
    console.log(scelta);
    let cardContainer = document.querySelector("#Pokedex");
    let row = document.createElement("div");
    row.classList.add("row");
    

    //geocalizzazione
   

    
  //let status = this.getAttribute("data-numerocard");
  //data-numerocard = `${}`
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
                            fetch(poke2.species.url)
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
                                <img src="${poke2.sprites.front_default}" alt="${poke2.name}" class="card-img-top">
                                <div class="card-body">
                                    <h2 class="card-title name">${poke2.name}</h2>
                                    <p class="card-title type"> ${tipoPokemon}</p>
                                    <p class="card-title type descrizioneP"> ${descrizionePokemon}</p>
                                    <button class="btn btn-primary modificaBtn " id="btn" onclick="modificaPokemon (${numeroCard})">Modifica</button>
                                    <button class="btn btn-primary modificaBtn "  onclick="geocalizza(${numeroCard})">Geocalizzazione</button>
                                    <div class="map-wrap">
                                     <div id="map"></div>
                                    </div>

                                    <input type="text" id="addressInput" placeholder="Inserisci un indirizzo">
                                     <button onclick="moveToAddress()">Vai all'indirizzo</button>

                                    <div id="weather-info"></div>
                                    </div>
                            `;
                            col.appendChild(card);
                            row.appendChild(col);
                            maxId = numeroCard;
                            
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
        console.log(numero);
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



    // GEOCALIZZAZIONE 
    

    for (let index = maxId; 0 <= index; index--) {
        let map = new L.Map('map' + index);
        let url = 'http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png';
        let attrib = 'Map data (c)OpenStreetMap contributors';
        let osm = new L.TileLayer(url, {minZoom: 8, maxZoom: 16, attribution: attrib});
    
        map.setView(new L.LatLng(41.88,12.47),16);
        map.addLayer(osm);

        let pokemonIcon = L.icon({
    
            iconUrl: './img/pokemongeo.svg',
        
            // for, maxId verso 0, gli Id di ogni card crei la mappa
            
           
        
            iconSize:     [38, 55], 
            shadowSize:   [50, 64], 
            iconAnchor:   [22, 94], 
            //correspond to marker's location
            shadowAnchor: [4, 62],  // the same for the shadow
            popupAnchor:  [-3, -76] // point from which the popup should open relative to the iconAnchor
            });
        
        L.marker([51.5, -0.09], {icon: pokemonIcon}).addTo(map);
        
        
    }
    

function moveToAddress() {
    let address = document.getElementById('addressInput').value;
    let url = `https://nominatim.openstreetmap.org/search?format=json&q=${address}`;
    let apiKey = '6863f87c35ab0ada8f889f4eb4c76ef7'
    
         fetch(url)
            .then(response => response.json())
            .then(data => {
            if (data && data.length > 0) {
                const lat = parseFloat(data[0].lat);
                const lon = parseFloat(data[0].lon);
                map.setView([lat, lon], 16);
                L.marker([lat, lon] ,{icon: pokemonIcon}).addTo(map).bindPopup("Indirizzo desiderato").openPopup();
                fetch(`https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${apiKey}`).then(response=>response.json()).then(weatherData=>{
                    console.log(weatherData);
                    let tempMin = weatherData.main.temp_min;
                    let min = tempMin-274.15
                    let numero = parseFloat(min.toFixed(1));
                    let tempMax = weatherData.main.temp_max;
                    let max = tempMax - 274.15
                    let numero1 = parseFloat(max.toFixed(1));
    
                    let icon = weatherData.weather[0].icon;
                    let weatherInfoContainer = document.getElementById('weather-info');
    
                        let markup = `
                            <h3>Temperatura minima: ${numero} °C</h3>
                            <h3>Temperatura massima: ${numero1} °C</h3>
                            <img src="https://openweathermap.org/img/w/${icon}.png" alt="Icona meteo">
                        `;
    
                        weatherInfoContainer.innerHTML = markup;
    
                })
    
                } else {
                    alert('Indirizzo non trovato.');
                }
            })
            .catch(error => console.error('Errore nella richiesta:', error));
    }
  