//let box = document.querySelectorAll(".box");
//document.body = cambioBody;
/**
 * 
 
 */
//function cambiaSfondo(elemento){
//    elemento.setAttribute("style", `background-color: rgb(${red}, ${green}, ${blue})`);
//}

//function rimuoviSfondo(elemento){
  //  elemento.removeAttribute("style");
//}

//box.addEventListener("click",function () {
  //  this.classList.add();
//}); 
    
//box.addEventListener("click", function () {
  //  this.classList.remove();   
//});

// SOLUZIONE 1
// let body = document.querySelector("body");
//let box1 = document.querySelector("#box1");

// box1.addEventListener("click",function () {
    //recupero lo stile dal box con get, e assegno lo stile a body con set.
//    let stileBG = this.getAttribute("style");
//    body.setAttribute("style", stileBG);
//})

//bisognerebbe che abbia capito di prendere la classe dire di modificare il body ch abbiamo ripreso e stamparlo nel html

let boxes = document.querySelectorAll("div.box");
let body = document.querySelector("body");
let demoColor = document.querySelector("#demoColor")

    boxes.forEach( box => {
        box.addEventListener("click", function() {
            //let nomeColore = evento.target.style.backgroundColor;
            let regolaStyle = this.getAttribute("style");
            body.setAttribute("style", regolaStyle);
            console.log(regolaStyle);

            let colore = regolaStyle.split(" ")[1];
            console.log(colore);

            demoColor.innerHTML = "<h1>" +colore+ "</h1>";
        })
    })
        
    