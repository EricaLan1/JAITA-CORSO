package jaita99;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ConfrontaStringa {
	
	public static void main(String[] args) {
	
	/*  1 metti a confronto le due stringhe di due utenti, una volta inserite ti dirà quale parola è più lunga o se sono uguali, 
	 * stampa entrambe le parole ma mostra quella più lunga come prima,
	 *  nel caso di uguali non le stampare */

		Scanner confrontaStringa = new Scanner(System.in);
		
		System.out.println("Scrivi la prima parola");
		String primaParola = confrontaStringa.next();
		System.out.println("Scrivi la seconda parola");
		String secondaParola = confrontaStringa.next();
		
		if (primaParola.length() > secondaParola.length()) {
			System.out.println("La prima parola è più lunga");
			System.out.println(primaParola);
		} if (primaParola.length() < secondaParola.length()) {
			System.out.println("la seconda Parola è più lunga");
			System.out.println(secondaParola);
		} else {
			System.out.println("le due parole hanno la stessa lunghezza");
		}
		
		confrontaStringa.close();
	
	}
}
