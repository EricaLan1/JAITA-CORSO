package wishList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class WishList {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		//HashSet<String> wishList = new HashSet<>(); // hashset non è primitivo ne una classe, è un contenitore. Utilizzandolo non avremo duplicati ma i nostri risultati saranno un po' alla rinfusa
		// il while lo faccio girare fino a quando non cambia il valore della variabile come ad esempio fino a quando da falsa non diventa vera
		
		ArrayList<String> wishList = new ArrayList<>();  //ora proviamo con l'array list, potrei inserire 2 volte lo stesso regalo, ma abbiamo un ordine di inserimento
		
		boolean stop = false;
		while(!stop) {
			//continuo a chiedere se vuole aggiungere un regalo 
			System.out.println("Aggiungi un nuovo regalo? (1-yes 2-no)");
			String scelta = scanner.nextLine();
			switch (scelta) {
			case "1": {
				// INSERISCE REGALO
				System.out.println("Regalo: ");
				String regalo = scanner.nextLine();
				
				//VERSIONE WISHLIST COMPLESSA
				/*boolean aggiungi = false;
				for (int i = 0; i < wishList.size(); i++) {
					if (wishList.get(i).equalsIgnoreCase(regalo)) {
						aggiungi = true;
						break;
					}
				} */
				//boolean aggiungi = wishList.contains(regalo);  // con un unica riga di codice possiamo fare tutto
				regalo = regalo.toLowerCase();
				if (wishList.contains(regalo)) {
					System.out.println("Il regalo è stato già aggiunto");
				}else {
					wishList.add(regalo);
				}
				
				
				//QUESTA PARTE VALEVA SOLO PER HASHSET
				//aggiungo il regalo al set
				//boolean aggiunto = wishList.add(regalo);
				//verifico se il regalo c'era già
				
				//if(!aggiunto) {
				//	System.out.println("Hai già inserito questo regalo");
				//}else {
					//mostro la lunghezza della lista
					//System.out.println("Ora hai: " + wishList.size() + " regali nella wishList");
				//}
				
				break; // salto la fine dello switch, quindi anche del while se l'ho aggiunto ti dico quanti tot regali hai nella lista
			}
			case "2":
				stop = true;
				break;
			default : 
				System.out.println("Scelta non valida");
			}
		}
		
		// prima di stampare ordino la lista in ordine alfabetico tramite una libreria collection
		Collections.sort(wishList);
		// stampo tutti i regali della lista con un ciclo for, e non con il set perché non ha gli indici
		for (String regali : wishList) {
			System.out.println("- " + regali);
		}
		System.out.println();
		
		scanner.close();
	}
}
