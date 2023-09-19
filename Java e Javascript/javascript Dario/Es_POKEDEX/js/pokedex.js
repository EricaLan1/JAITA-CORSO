const datiMemorizzati = localStorage.getItem("pokemonScelti");
if (datiMemorizzati) {
    const scelta = JSON.parse(datiMemorizzati);
    console.log(scelta);
}