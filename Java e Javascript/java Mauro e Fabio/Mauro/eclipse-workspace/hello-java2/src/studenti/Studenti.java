package studenti;

import java.time.LocalDate;

public class Studenti {
	/* ogni studente è caratterizzato da nome, cognome, email e data di nascita 
	 * dello studente mostro il nome completo e l'età*/
	
	//ATTRIBUTI
	private String nome;
	private String cognome;
	private String email;
	private LocalDate datadiNascita; /*qui useremo la classe localDate*/
	private Indirizzo indirizzo; // informazione opzionale, aggiungiamo dopo il get e set
	
	
	//COSTRUTTORE
	
	public Studenti(String nome, String cognome, String email, LocalDate datadiNascita) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.datadiNascita = datadiNascita;
	}

	//GETTER E SETTER
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getDatadiNascita() {
		return datadiNascita;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDatadiNascita(LocalDate datadiNascita) {
		this.datadiNascita = datadiNascita;
	}
	
	
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	//METODI
	/* metodo che restituisce nome completo */
	

	public String nomeCompleto() {
		return nome + " " + cognome;
	}
	
	/*metodo che calcola l'età facendo la differenza tra l'anno corrente e l'anno di nascita*/
	
	public int getEta(int annoCorrente) { /*anno corrente ci arriva dall'esterno*/
		return annoCorrente - datadiNascita.getYear();
	}
	
	
	
}
