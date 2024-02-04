package piattaformastreaming;

public class Contenuto {

	private String titolo;
	

	public Contenuto(String titolo) {
		this.titolo = titolo;
	}

	
	
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
	public void play() { 
		System.out.println("Stai guardando " + titolo);
	}
	
	
	
}
