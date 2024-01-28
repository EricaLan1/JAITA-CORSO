package eccezioni;

import java.util.Scanner;

public class EccezioniEsempi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		try {
			int numero = scanner.nextInt();
			System.out.println("Il tuo numero è " + numero);
		} catch(Exception e) {
			System.out.println("This is not a number");
			System.out.println(e.getMessage());
		} finally { // si usa raramente, ci permette di scrivere del codice che viene eseguito sempre
			System.out.println("CIAO");
			scanner.close();	
		}
		
		

	}

}
