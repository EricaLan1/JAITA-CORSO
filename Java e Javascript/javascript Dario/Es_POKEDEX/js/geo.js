let map = new L.Map('map');
let url = 'http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png';
let attrib = 'Map data (c)OpenStreetMap contributors';
let osm = new L.TileLayer(url, {minZoom: 8, maxZoom: 16, attribution: attrib});

map.setView(new L.LatLng(41.88,12.47),16);
map.addLayer(osm);

L.marker([41.88,12.47]).addTo(map).bindPopup("I’m here!").openPopup();
let pokemonIcon = L.icon({
    
    iconUrl: './img/pokemongeo.svg',
   

    iconSize:     [38, 55], 
    shadowSize:   [50, 64], 
    iconAnchor:   [22, 94], 
    //correspond to marker's location
    shadowAnchor: [4, 62],  // the same for the shadow
    popupAnchor:  [-3, -76] // point from which the popup should open relative to the iconAnchor
});

L.marker([51.5, -0.09], {icon: pokemonIcon}).addTo(map);


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