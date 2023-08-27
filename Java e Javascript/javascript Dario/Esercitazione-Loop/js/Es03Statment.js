//Es3 Scrivi un programma che itera tutti i numeri interi da 1 a 100. Per i multipli di 3 stamperà “Zoom” mentre per i multipli di 5 stamperà “Boom”. Controlla anche il caso in cui il numero è divisibile sia per 3 sia per 5 stampando “Zoom Boom”.

for (let i = 1; i < 100; i++) {
    if (i%3===0&&i%5===0) {
        console.log("Zoom Boom");
        
    }else if(i%3===0){
        console.log("Zoom");

    }else if(i%5===0){
        console.log("Boom");
    }else{
        console.log(i);
    }

}