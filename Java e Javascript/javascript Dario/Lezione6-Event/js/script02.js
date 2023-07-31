let strobo = document.querySelector("#strobo");
/**
 * @param {HTMLElement} strobo
 */
//strobo.addEventListener("mouseover", function () {
//    this.classList.add("sfondo"); //con this faccio riferimento allo strobo, poiche' l'oggetto storbo e' quello sul quale applicanto l'event listener
//})

//strobo.addEventListener("mouseout", function () {
//   this.classList.remove("sfondo");
//})

//function mettiSfondo() {
  //  strobo.classList.add("sfondo");
//}

//function toglisfondo() {
  //  strobo.classList.remove("sfondo");
//}

//strobo.addEventListener("mouseover",mettiSfondo);
//strobo.addEventListener("mouseover",toglisfondo);

//faccio la stesa cosa con funzioni generiche
/**
 * 
 * @param {HTMLElement} elementoDellaPagina 
 */
function mettiSfondo(elementoDellaPagina) {
    elementoDellaPagina.classList.add("sfondo");
}

function toglisfondo(elementoDellaPagina) {
    elementoDellaPagina.classList.remove("sfondo");
}

strobo.addEventListener("mouseover", function () {
    mettiSfondo(this);
    //con this si intende lo strobo, quindi mettiamo lo sfondo allo strobo
});

strobo.addEventListener("mouseout", function () {
    toglisfondo(this);
})