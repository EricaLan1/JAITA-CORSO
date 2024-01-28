package shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
	//ATTRIBUTI
	private int codice;
	private String nome; // non deve essere vuoto
	private String descrizione;
	private BigDecimal prezzo; /* è una libreriaa da importante è più potente di double e funziona principalmente con i soldi, in quanto double ha problemi di 
	* approssimazione, il prezzo non deve essere negativo*/
	private BigDecimal iva; // non deve essere negativo
	private Categoria categoria;
	

	//COSTRUTTORI
	//all'interno del costruttore calcoliamo un numero random 
	public Prodotto() {
		this.codice = numeroRandom();
	}

	//se il codice devo calcolarlo con un numero rundom calcolo un secondo costruttore senza
	public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, Categoria categoria) throws IllegalArgumentException {
		//prima faccio tutte le validazione, poi gli attributi
		this.codice = numeroRandom();
		validazioneNome(nome);
		validazionePrezzo(prezzo);
		validazioneIva(iva);
		// se le validazioni sono passate allora assegno il valore ai campi
		this.codice = numeroRandom();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
		this.categoria = categoria;
		
	}
	
	
	
	//GET E SETTER
	
	public int getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public String getDescrizione() {
		return descrizione;
	}


	public BigDecimal getIva() {
		return iva;
	}

	public void setNome(String nome) throws IllegalArgumentException{
		validazioneNome(nome); // prima testo il valore che viene da fuori: se non valido si interrompe con eccezione
		this.nome = nome;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) throws IllegalArgumentException {
		validazionePrezzo(prezzo);
		this.prezzo = prezzo;
	}

	public void setIva(BigDecimal iva) throws IllegalArgumentException{
		validazioneIva(iva);
		this.iva = iva;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	//ALTRI METODI 
	// metodo che calcola il prezzo con l'iva 1) livello di accesso, 2) tipo di dado di ritorno, 3) nom del metodo, 4) parametri
	public BigDecimal getPrezzoPieno() {
		// prezzo ivA SI CALCOLA PrezzoPiano = prezzo + price * iva;
		BigDecimal ivasulPrezzo = prezzo.multiply(iva); // faccio l'operazione price * iva con multiply
		return getPrezzo().add(ivasulPrezzo).setScale(2, RoundingMode.HALF_EVEN); // per sommare invece il tutto usiamo add
	}
	
	//metoto che restituisce il nome completo codice + nome
	public String getnomeCompleto() {
		return codice + " " + nome;
	}
	
	 // metodo che genera un numero random che serve ad assegnare al codice, lo richiameremo nel costruttore
	private int numeroRandom() {
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(0,10000);
	}
	
	//metodi di validazione
	private void validazioneNome(String nome) throws IllegalArgumentException{
		if(nome == null || nome.isEmpty()) {
			//nome non valido. Il fredo di emergenza è tirare l'eccezione, 
			throw new IllegalArgumentException("nome vuoto");
		} // occhio alla colorazione dell'assegnazione, a noi serve di modificare come parametro di costruttore non di attributo
	}
	
	private void validazionePrezzo(BigDecimal prezzo) throws IllegalArgumentException{
		if ( prezzo == null || prezzo.compareTo(new BigDecimal(0)) < 0) {// con i bigdecimal si utilizzano i metodi al posto dei simboli
			throw new IllegalArgumentException("prezzo negativo" + prezzo);
		}
	}
	
	private void validazioneIva(BigDecimal iva) throws IllegalArgumentException {
		if ( iva == null || iva.compareTo(new BigDecimal(0)) <0) {
			throw new IllegalArgumentException("iva negativa" + iva);
		}
	}
	// facciamo toostring che restituisce nome completo + prezzo in euro + categoria
	
	@Override
	public String toString(){
		return getnomeCompleto() + "; " + getPrezzoPieno() + "$ (" + categoria.getNome()+")";
	}
	
	
	
	

}
