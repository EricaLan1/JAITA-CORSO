package studenti;

public class Indirizzo {
	
	private String via;
	private int numero;
	private String citta;
	
	public Indirizzo(String via, int numero, String citta) {
		super();
		this.via = via;
		this.numero = numero;
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	@Override
	public String toString() {
		return "Indirizzo: Via " + via + ", n " + numero + " " + citta;
	}
	
	
	
}
