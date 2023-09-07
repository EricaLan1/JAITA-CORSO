fetch("../db/prova.json")
.then( data => {return data.json()})
.then(response =>{
    console.log(response);
})