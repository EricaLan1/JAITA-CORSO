package gatto;

public class Gatto {

	//Attributi
	
	String razza;  // con eccezioni non deve essere nulla o vuota
	int age; // non deve essere < 0
	String genere; // deve esere maschio o femmina
	String nome;  // non deve essere nullo o vuoto
	
	//Costruttore
	 public Gatto(String razza, int age, String genere, String nome) throws IllegalArgumentException {  // questo è un avviso che se lo chiami, potrebbe tirare una eccezione
		if( razza == null || razza.isEmpty()) {
			// se il valore di razza non è valido sollevo una eccezzione
			throw new IllegalArgumentException("la razza non deve essere vuoto");  // termina il costruttore senza andare avanti, però lancia l'eccezione
		}
		
		if (age < 0 ) {
			throw new IllegalArgumentException("l'età dovrebbe essere >= 0");
		}
		if( genere == null || (!genere.equalsIgnoreCase("maschio") && !genere.equalsIgnoreCase("femmina"))) {
			throw new IllegalArgumentException("Genere deve essere maschio o femmina");
		}
		
		if(nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome non deve essere vuoto");
		}
		this.razza = razza;
		this.age = age;
		this.genere = genere;
		this.nome = nome;
	}

	// metodo che icrementa l'età dell'oggetto
	void cresci(){ // gli metto void, perché fa quello che gli dico, non mi risponde, quindi è void o ritorna un valore? VOID. Non gli devo passare i valori 
		age++;
	}
	
	
	
	@Override
	public String toString() { // metodo che rappresenta come stringa i dati dell'oggetto
		return "Gatto [razza=" + razza + ", age=" + age + ", genere=" + genere + ", nome=" + nome + "]";
	}
	
	
	
	//metodo
	
	

}
