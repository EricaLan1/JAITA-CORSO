
let filmJSON ='{"Title":"Barbie","Year":"2023","Rated":"PG-13","Released":"21 Jul 2023","Runtime":"114 min","Genre":"Adventure, Comedy, Fantasy","Director":"Greta Gerwig","Writer":"Greta Gerwig, Noah Baumbach","Actors":"Margot Robbie, Ryan Gosling, Issa Rae","Plot":"Barbie suffers a crisis that leads her to question her world and her existence.","Language":"English, Spanish","Country":"United States, United Kingdom","Awards":"2 wins & 1 nomination","Poster":"https://m.media-amazon.com/images/M/MV5BOWIwZGY0OTYtZjUzYy00NzRmLTg5YzgtYWMzNWQ0MmZiY2MwXkEyXkFqcGdeQXVyMTUzMTg2ODkz._V1_SX300.jpg","Ratings":[{"Source":"Internet Movie Database","Value":"7.4/10"},{"Source":"Rotten Tomatoes","Value":"88%"},{"Source":"Metacritic","Value":"80/100"}],"Metascore":"80","imdbRating":"7.4","imdbVotes":"238,040","imdbID":"tt1517268","Type":"movie","DVD":"N/A","BoxOffice":"$541,907,382","Production":"N/A","Website":"N/A","Response":"True"}';

//Trasforma questo JSON in in OBJ e inserisci nello HTML le varie informazioni nella posizione corretta.

let filmBarbie = JSON.parse(filmJSON);

console.log(filmBarbie);

let titolo = document.querySelector("#titolo");
let locandina = document.querySelector("#locandina");
let attori = document.querySelector("#attori");
let regista = document.querySelector("#regista");
let valutazioni = document.querySelector("#valutazioni");

titolo.innerHTML = filmBarbie.Title;
locandina.setAttribute("src", filmBarbie.Poster);
attori.innerHTML = "Attori: " + filmBarbie.Actors;
regista.innerHTML = "Regista: " + filmBarbie.Director;

filmBarbie.Ratings.forEach(rating => {
    valutazioni.innerHTML += "<li>" + rating.Source + " Valore: " + rating.Value + "</li>"
});