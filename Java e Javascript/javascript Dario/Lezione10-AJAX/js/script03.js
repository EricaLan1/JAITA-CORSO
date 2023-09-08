fetch("../db/prova.jso.n")
.then( data => {return data.json()})
.then(response =>{
    console.log(response);
})