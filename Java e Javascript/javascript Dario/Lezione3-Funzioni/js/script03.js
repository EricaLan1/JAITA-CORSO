function calcolaArea(base,altezza) {
    let area= base * altezza;
    return area;
}

// function calcolaVolume(profondita) {
//     let area = calcolaArea(4,5);// posso richiamare delle funzioni dall'interno di altre funzioni.
//     let volume = area * profondita;

//     return volume;
// }

// let volume = calcolaVolume(6);
// console.log(volume);

function calcolaVolume(area, profondita) {
    let volume= area * profondita;
    return volume;
}
// posso passare una funzione come parametro ad altre funzioni - Callback Function
let volume = calcolaVolume(calcolaArea(4,5), 6);
console.log(volume);