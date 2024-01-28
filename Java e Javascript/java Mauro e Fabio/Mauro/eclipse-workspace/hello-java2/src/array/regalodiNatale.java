package array;

import java.util.Scanner;

public class regalodiNatale {

	public static void main(String[] args) {

		/*  tramite lo Scanner scrivere quanti regali si vuole avere, e per la quantità richiesta, chiedere quale regalo si voglia avere. Infine, stampalo*/
		
		
		Scanner quantiRegali = new Scanner(System.in);
		System.out.println("Quanti Regali?");
		int dimensione = Integer.parseInt(quantiRegali.nextLine()); /*invece che usare nextInt, prendiamo nextLine che prende la stringa e 
		la porta nel buffer mentre con int rimane appeso in coda al buffer e ti salta un turno. Fatto ciò nextline la mettiamo dentro un istruzione integerParseint, 
		che risolve i nostri prblemi con lo scaner quando abbiamo bisogno di un intero*/
		
		String[] listadeiRegali = new String[dimensione];
		
		for (int i = 0; i < listadeiRegali.length; i++) {
			System.out.println("quale regalo vuoi?");
			String regalo = quantiRegali.nextLine();
			listadeiRegali[i] = regalo;
		}
		
		for (int i = 0; i < listadeiRegali.length; i++) {
			System.out.println(listadeiRegali[i]);
		}
		
		quantiRegali.close();
		
	}

}
