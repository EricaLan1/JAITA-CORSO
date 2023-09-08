const URL = "http://localhost:3000/studenti";

fetch(URL)
.then(data =>{return data.json()})
.then(response =>{
    console.log(response);
})