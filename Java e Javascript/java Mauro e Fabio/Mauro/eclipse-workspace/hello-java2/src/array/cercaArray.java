package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class cercaArray {

	public static void main(String[] args) {
		// genero un array di 10 numeri random compresi tra 1 e 10, chiedo all'utente di dirmi il numero compreso tra 1 e 10 e gli dico se ha indovinato o no
		
		Scanner cercaArray = new Scanner(System.in);
		Random cercaNumero = new Random();
		
		System.out.println("Quanti numeri?");
		int dimensioneArray = Integer.parseInt(cercaArray.nextLine());
		/* cerco l'array di quella dimensione */		
		int [] numeri = new int[dimensioneArray];
		/* ora devo rempire l'array vuoto di numeri con tot numeri random */
		
		for (int i = 0; i < numeri.length; i++) {
			/*alla posizione i dell'array, restituisco un numero casuaele */
			numeri[i] = cercaNumero.nextInt(1,11);
		}
		
		/* chiedo all'utente il numero da cercare */
		
		/*trucchetto per stampare l'array senza che si veda il defautlt di java */
		System.out.println(Arrays.toString(numeri)); /* ci rappresenta in array una stringa, metodo  serve per debbaggare*/
		
		System.out.println("Numero da cercare: ");
		int numerodaCercare = Integer.parseInt(cercaArray.nextLine());
		//ora facciamo la ricerca
		
		
		boolean found = false;
		for (int i = 0; i < numeri.length; i++) {
			/* confronto il numero da cercare con l'elemento corrente, i cambia sempre */
			if (numerodaCercare == numeri[i]) {
				/* come un semaforo, serve perché ho bisogno di qualcosa che mi dice che si l'ho trovato e no non l'ho trovato tramite una variabile d'appoggio */
				found = true; /* quando mi dice che l'ho trovato cambia anche il valore di found*/
			}
		}
		
		/* alla fine del ciclo for guardo  il valore della variabile found */
		if ( !found) { /* found == false, !found cambia i valori lo si usa per semplificare ma va bene lo stesso*/
			System.out.println("Numero non trovato");
		}else {
			System.out.println("Numero trovato");
		}
		
		
		
		
		cercaArray.close();
		
	}

}
