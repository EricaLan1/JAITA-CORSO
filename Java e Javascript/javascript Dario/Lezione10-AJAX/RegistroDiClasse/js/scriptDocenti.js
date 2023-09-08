let listaDocenti = document.querySelector("#listaDocenti");
const URLDoc = "http://localhost:3000/docente";

fetch(URLDoc)
.then(data =>{return data.json()})
.then(response =>{
    console.log(response);

    response.forEach(docente => {
        let card = document.createElement("li");

        imgDoc.setAttribute("src","https://png.pngtree.com/png-vector/20190710/ourlarge/pngtree-user-vector-avatar-png-image_1541962.jpg");
        card.setAttribute("class","list-group-item");
        card.textContent = `${docente.id} - ${docente.nome} - ${docente.materia} - ${docente.status}`;

        listaDocenti.appendChild(card);
    });
})