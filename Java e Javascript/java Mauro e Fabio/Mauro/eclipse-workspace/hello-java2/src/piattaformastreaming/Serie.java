package piattaformastreaming;

public class Serie extends Contenuto{ // contenuto diventa la superclasse di Serie
	// serie eredita tutti gli attributi e i metodi pubblic del contenuto 
	// ha delle caratteristiche sue però
	
	private int stagione;
	private int numerodiEpisodi;
	
	
	public Serie(String titolo, int stagione, int numerodiEpisodi) {
		// prendo il parametro titolo e lo passo al costruttore della superclasse
		super(titolo);
		this.stagione = stagione;
		this.numerodiEpisodi = numerodiEpisodi;
		
	}
	
	
	public int getStagione() {
		return stagione;
	}
	
	public int getNumerodiEpisodi() {
		return numerodiEpisodi;
	}
	public void setStagione(int stagione) {
		this.stagione = stagione;
	}
	public void setNumerodiEpisodi(int numerodiEpisodi) {
		this.numerodiEpisodi = numerodiEpisodi;
	}
	
	
	
	@Override  // vuol dire che questo metodo scritto nella mia super classe l'ho ereditato e voglio riscriverlo nella mia serie
	public void play() {
		System.out.println("Serie: " + getTitolo() + " (stagione " + stagione + ")");
		for (int i = 0; i < numerodiEpisodi; i++) {
			System.out.println("Stai guardando l'episodio " + (i+1));
		}
	}
	
	
}
