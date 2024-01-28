package Collezioni;

import java.util.ArrayList;
import java.util.Scanner;

public class DinamicoFerragnez {
	
	public static void main(String[] args) {
		// creo la lista di invitati chiedendo all'utente di aggiungere un nome alla volta
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> ospiti = new ArrayList<String>();
		System.out.println(ospiti.size()); // la dimensione di una lista non è lenght ma size
		
		boolean stop = false;
		while (!stop) {
			// quando non è vero che devo fermarmi, ti chiedo se vuole inserire un nuovo nome
			System.out.println("Vuoi aggiungere un nuovo ospite? (s/n)");
			String risposta = scanner.nextLine();
			
			switch(risposta) {
			case "s":
				//inserisco nuovo nome
				System.out.println("Inserisci nome: ");
				//prendo il nome
				String nome = scanner.nextLine();
				//aggiungo alla lista
				ospiti.add(nome);
				break;
			case "n":
				//esce
				System.out.println("OK");
				
				stop = true;
				break;
			default:
				System.out.println("Risposta non valida");
				break;  // ti riporta alla domanda per rinserirti la risposta corretta
			}
			
		}
		// quando esco dal while stampo la lista
		System.out.println(ospiti);
		
		for (int i = 0; i < ospiti.size(); i++) { // nell'array sarebbe ospiti.lenght
			String elementoCorrente = ospiti.get(i); // siccome stiamo parlando di list e non array andiamo a prendere gli indici con i get. Array sarebbe ospiti[i]
			System.out.println(elementoCorrente);
		}
		
		
		// ora che la lista è pronta chiedo all'utente come si chiama
		System.out.println("Qual'è il suo nome?");
		String risposta = scanner.nextLine();
		
		boolean trova = ospiti.contains(risposta);
		if (trova) {
			System.out.println("Benvenuto alla festa!");
			
		}else {
			System.out.println("Mi dispiace non sei nella lista");
		}
		
		
		scanner.close();
		
		
	}
	
	
	
}
