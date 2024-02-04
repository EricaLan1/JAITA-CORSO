package piattaformastreaming;

public class Film extends Contenuto{
	private long lunghezza;
	
	public Film(String titolo, long lunghezza) {
		super(titolo);
		this.lunghezza = lunghezza;
	}

	public long getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(long lunghezza) {
		this.lunghezza = lunghezza;
	}

	@Override
	public void play() {
		
		super.play();
		System.out.println("Lunghezza: " + lunghezza);
	}
	
	
	
}
