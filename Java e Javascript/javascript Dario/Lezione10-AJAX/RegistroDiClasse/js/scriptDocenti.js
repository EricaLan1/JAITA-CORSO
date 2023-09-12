let listaDocenti = document.querySelector("#listaDocenti");
let btnOnline = document.querySelector("#btnonline");
let btnOffline =document.querySelector("#btnoffline");
let btnTutti = document.querySelector("#btntutti");

const URLDoc = "http://localhost:3000/docente";



function seleziona(statoselezionato) {

fetch(URLDoc)
.then(data =>{return data.json()})
.then(response =>{
    console.log(response);
    
    listaDocenti.innerHTML = "";

    response.forEach(docente => {
        if (docente.status === statoselezionato || statoselezionato == "tutti") {
        let card = document.createElement("div");
        let h4 = document.createElement("h4");
        let lorem = document.createElement("p");
        let info = document.createElement("p");
        let body = document.createElement("div");
        let column = document.createElement("div");
       
        
        column.setAttribute("class", "col-4");
        h4.setAttribute("class","card-title");
        lorem.setAttribute("class","card-text");
        info.setAttribute("class","card-text");
        body.setAttribute("class","card-body");
        
        
       if (docente.status === "online" ) {
            card.setAttribute("class","card border-success" );
       }else{
            card.setAttribute("class","card border-danger" );
       }

        h4.textContent = `${docente.nome}`
        info.innerHTML = ` <img class="card-img-top " src=${docente.imgDoc}><br><strong>Id:</strong> ${docente.id} <br> <strong>Materia: </strong> ${docente.materia}<br> <strong>Status: </strong> ${docente.status}`;
        lorem.textContent = `Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. `

        
        
        body.appendChild(h4);
        body.appendChild(info);
        body.appendChild(lorem);
        card.appendChild(body);
        
        column.appendChild(card);
        listaDocenti.appendChild(column);
        
        }
        
    });
    
})

}


btnOnline.addEventListener("click", function() {
    seleziona("online");
});
btnOffline.addEventListener("click", function () {
    seleziona("offline");
});
btnTutti.addEventListener("click", function () {
    seleziona("tutti");
});