package esercizi;

import java.util.Scanner;

public class Numeri {
	
	
	// Scrivi un programma Java che accetta 3 numeri come input da tastiera e stampare la media dei numeri
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero: ");
		int primoValore= scan.nextInt();
		
		System.out.println("Inserisci il secondo numero: ");
		int secondoValore= scan.nextInt();
		
		System.out.println("Inserisci il terzo numero: ");
		int terzoValore= scan.nextInt();
		
		
		int media = (primoValore + secondoValore + terzoValore) /3;
		System.out.println("la media e': " +media);
	}

	
	
}
