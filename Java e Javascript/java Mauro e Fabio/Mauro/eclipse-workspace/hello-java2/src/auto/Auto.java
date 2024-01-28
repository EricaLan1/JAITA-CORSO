package auto;

public class Auto {
//definiremo ATTRIBUTI che caratteristiche ha parte 1
String colore;
int numeridiAirbags;
boolean Ibrida;


/*COSTRUTTORE*/
Auto(){ //anche i costruttori possono avere dei parametri
	System.out.println("Ciao sono il costruttore"); /*non ha un metodo di ritorno percé il ritorno è sempre car 
	nel costruttore inizializzo gli attributi dell'oggetto inrealtà*/
	colore = "bianco";
	numeridiAirbags = 2;
	Ibrida = false; /* se ritorno nel main il newCar l'ho sovrascritto essendo più specifica nel costruttore. Le descrizioni più specifiche sovrascrivono quelle generiche */
}

/* COSTRUTTORE CON PARAMETRI, quando creo l'oggetto car ti dò la possibilità di dirmi subito il colore, il numero di airbag e se è ibrido*/

Auto(String coloreIn, int numeridiAirbagsIn, boolean IbridaIn){
	colore = coloreIn;
	numeridiAirbags = numeridiAirbagsIn;
	Ibrida = IbridaIn; /* quindi anziché creare tutto vuoto e usare un metodo per definirli, posso in un unico colpo costruire l'oggetto auto e farmi dare tutti i valori */
}




/*METODI cosa sa fare, -- aggiunti in un secondo momento, fagli vedere prima gli attributi 
 * se voglio cambiare tutti e 3 questi paramentri in un colpo solo come devo fare? Li passo all'interno del void in quanto la classe non li conosce PARTE 3*/

	void definireleOpzioni(String coloreOpzioni, int numeridiAirbagsOpzioni, boolean IbridaOpzioni) {
	/* a questo punto ho la firma del metodo ovvero quella struttura che mi dice che cosa faccio il nome, che cosa ti restituisco void, che cosa ho bisogno per funzionare i parametri. 
	 * Ed' questo quello che serve al main come ad altre classi, per progettare la classe devo metterci del codice. Quindi io ti ho promesso che gli cambio gli optional e gli passo quello che mi passi tu.
	 * Qui prendo i valori dei parametri e li assegno agli attributi dell'oggetto*/
		
		colore = coloreOpzioni; /* me lo colora in modo diverso perché sono dei caratteri speciali, è un parametro del metodo che muore e vive dentro questo scope. mentre color rimane, 
		finché vive l'oggetto, il suo colore continua ad esistere */
		numeridiAirbags = numeridiAirbagsOpzioni;
		Ibrida = IbridaOpzioni;
	}
		/*potremmo inserire altre cose più complesse, ma partiamo da una semplice assegnazione, ritorna al main*/
		
		/*siccome è molto scomodo stampare manualmente tutti i risultati, per ricevere le informazioni utili per la mia auto andiamo a creare un nuovo metodo*/
		
		String getInfo() { /*deve rappresentarmi una stringa con tutte le informazioni della mia auto */	
			String info = "Color: " + colore + ", numero di Airbags: " + numeridiAirbags;
			String IbridaInfo = Ibrida ? " è Ibrida" : "Non è ibrida"; /* operatore ternario */
				
			return info + ", " + IbridaInfo; /* se metto qualsiasi cosa dopo un return, tipo un syso, non ci arriverò mai a stamparlo perché il return chiude tutto come se fosse un break */
		
		
	}




}
