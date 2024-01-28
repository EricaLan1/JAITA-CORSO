package Collezioni;

import java.util.HashSet;
import java.util.Scanner;

public class SetEsempio {

	public static void main(String[] args) {
		// se non abbiamo una lista ash set non tiene l'ordinamento e i duplicati
		Scanner scanner = new Scanner(System.in);
		// cre o un insieme di nomi ma senza duplicati 
		HashSet<String> ospiti = new HashSet<>();
		
		boolean stop = false;
		while(!stop) {
			System.out.println("Inserisci nuovo ospite? (s/n)");
			String risposta = scanner.nextLine();
		
			switch (risposta) {
			case "s": {
				// aggiungo nome
				System.out.println("Nome: ");
				String nome =  scanner.nextLine();
				boolean aggiungi = ospiti.add(nome); //testiamo questo ad per dire all'utente
				if (!aggiungi) {
					System.out.println("Il nome è già stato aggiunto");
				}
				break;
			}
			case "n":{
				// esco camb8iavo valore
				stop = true;
				break;
			}
			default:
				System.out.println("Risposta non valida");
				break;
			}
			
		
		}
		
		System.out.println(ospiti);
		for (String elemento : ospiti) {
			System.out.println(elemento.toUpperCase()); // sul set la posizione dell'indice non c'è quindi possiamo utilizzare il for in questo modo
		}
		
		scanner.close();

	}

}
