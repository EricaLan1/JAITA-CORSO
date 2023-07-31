let numerEstratti =[];
let estrazione= (document.getElementById("estrazione"));
for (let i = 0; i<5; i++) {
    let numeriCasuali = Math.round(Math.random()*90+1);
    
if (i>0) {
    numerEstratti+= ", ";
    numerEstratti += numeriCasuali;
    console.log("il numero estratto e'"+numeriCasuali);
    document.getElementById("casuale").innerHTML= "Numeri generati" +numerEstratti;
}else{document.getElementById("Casuali").innerHTML= numerEstratti;

}
}



//Math.random()
//let numeroACaso= Math.random()
//console.log(Math.ceil(numeroACaso*10));
//Math.ceil()arrotonda all'intero superiore
//Math.floor() arrotonda all'intero inferiore