let URL = "https://pokeapi.co/api/v2/pokemon/?limit=20&offset=0";
let demo = document.querySelector("#demo");
let btn=document.querySelector("#btn");
let btnAllert= document.querySelector(".alert");

fetch(URL)
.then(data => {
    return data.json();
})

.then(Response => {
    // console.log(Response.results[0].name);  
    for (let i =0;i<Response.results.length;i++)
        {
        let card = document.createElement("div");
        card.classList.add("col-md-4", "mb-3");
        card.innerHTML = `
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">${Response.results[i].name}</h5>
                    <button type="button" class="btn btn-primary"onclick='pokemon("${Response.results[i].name}", "${Response.results[i].url}")'>Aggiungi al Pokedex</button>
                    </div>
            </div>
        `;
        demo.appendChild(card);
      
        }
       
        


    
})


let scelta = [];
function pokemon(nome,url)
{

    if (scelta.length<=8)
    {
        scelta.push(nome,url)
        console.log(scelta);

        let spazioAlert = document.querySelector("#spazioAlert");

        let alert = `
        <div class="alert alert-warning alert-dismissible fade show" role="alert">
            <strong>Complimenti!</strong> Hai selezionato il tuo pokemon.
                 <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>`;

            spazioAlert.innerHTML = alert;

    }
    else
    {
        alert("Non puoi più aggiungere pokemon")
    }


}

btn.addEventListener("click",pokemon);

//
btn.addEventListener("click", () => {
    
    if (scelta.length > 3) {
        
        localStorage.setItem("pokemonScelti", JSON.stringify(scelta));

        window.location.href = "pokedex.html";
    } else {
        alert("Devi selezionare almeno tre Pokémon.");
    }
});


//sdgsgsdgs