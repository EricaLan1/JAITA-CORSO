//inserisco un item, inseirisco una persona, clicco su aggiungi e compare nella lista ACCANTO I CAMPI INPUT.
//Per creare lo script utilizzare gli oggetti. 
//Utilizza un oggetto TODO con le prop item e persona

//Quando si inserisce un nuovo item deve comparire scivolando da sinistra verso destra. Utilizza Animate CSS


function Todo(item, persona) {
    this.item = item;
    this.persona = persona;
}

function aggiungiLista(){
    let item = document.getElementById("item").value ;
    let persona = document.getElementById("persona").value;
    let lista = document.getElementById("listaTodos");

    let todo = new Todo(item,persona);
    let listaItem = document.createElement("li");
    listaItem.innerHTML =  todo.item + " -" +todo.persona;
    listaItem.classList.add("animate__animated", "animate__slideInLeft");
    lista.appendChild(listaItem);

    document.getElementById("item").value = "";
    document.getElementById("persona").value = "";
}
let btn = document.getElementById("btn");
btn.addEventListener("click",aggiungiLista);



