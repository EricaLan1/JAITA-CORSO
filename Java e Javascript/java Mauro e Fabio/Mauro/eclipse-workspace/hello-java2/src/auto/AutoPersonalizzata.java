package auto;

public class AutoPersonalizzata {

	public static void main(String[] args) {
		//Auto autoPersonalizzata = new Auto();  /* se inserisco il metodo senza parametri, allora mi riferisco al primo costruttore, 
		//se inserisco con allora riprendo il secondo*/
		//System.out.println(autoPersonalizzata.getInfo()); /* se prendo il primo mi stampa i valori di default*/
		
		Auto autoPersonalizzata = new Auto("verde", 9, true);
		System.out.println(autoPersonalizzata.getInfo()); /* prendo il secondo costrutto con all'ingresso i parametri. Quindi il secondo costruttore è quello 
		più veloce e compatto per dare in un colpo solo il valore a tutti gli attributi di una classe. Quando crei i costruttori invece automatici ti mette 
		this per differenziare i nomi dei parametri che non li cambierà. Quindi this richiama i parametri specificando che è il nostro*/
	}

}
