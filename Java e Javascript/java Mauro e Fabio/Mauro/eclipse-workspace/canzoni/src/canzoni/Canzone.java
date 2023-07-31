package canzoni;

public class Canzone {
		String cantante;
		String titolo;
		
		
		//alt +shift +s ---> generate constructor using fields
		//click destro -> source 
	public Canzone(String cantante, String titolo) {
		super();
		this.cantante = cantante;
		this.titolo = titolo;
		
	}
		// il metodo toString rappresenta un oggetto, come la canzone, in formato di string
	
	
		public String toString() {
		return "Canzone[cantante=" +cantante+", titolo="+titolo+"]";
		}
	
	
	
	
}
