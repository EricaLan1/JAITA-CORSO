package array;

import java.util.Iterator;

public class giornidellaSettimana {

	public static void main(String[] args) {
		
		/* Scrivi i giorni della settimana in maiuscolo e stampali in minuscoli, in seguito stampali al contrario. */ 
		String[] giornidellasettimana = {"LUNEDI", "Martedì","Mercoledì","Giovedì","Venerdì","Sabato","Domenica"};
		System.out.println(giornidellasettimana); /* mi stampa l'array Ljava ma non mi trova il contenuto, devo selezionarlo*/
		System.out.println(giornidellasettimana[0]); /*in questo modo*/
		System.out.println(giornidellasettimana[1]); /*in questo modo*/
		System.out.println(giornidellasettimana[2]); /*in questo modo*/
		System.out.println(giornidellasettimana[3]); /*in questo modo*/
		System.out.println(giornidellasettimana[4]); /*in questo modo*/
		System.out.println(giornidellasettimana[5]); /*in questo modo*/
		System.out.println(giornidellasettimana[6]); /*in questo modo*/
		
		/* se non voglio ripetere tanto codice, faccio un ciclo for */
		
		
		System.out.println("Lunghezza dell'Array: "+giornidellasettimana.length);
		
		for (int i = 0; i < giornidellasettimana.length; i++) {
			System.out.println(giornidellasettimana[i].toLowerCase()); /* se voglio aggiungere un metodo tipo lower case, lo si aggiunge dopo l'indice */
		}
		
		
		System.out.println("******DECREMENTO********");
		
		for (int i = giornidellasettimana.length -1; i >= 0; i--) {
			System.out.println(giornidellasettimana[i]);
		}
		
		giornidellasettimana.clone();
	}

}
