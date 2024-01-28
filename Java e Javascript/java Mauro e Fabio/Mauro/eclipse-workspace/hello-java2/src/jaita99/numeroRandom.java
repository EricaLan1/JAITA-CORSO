package jaita99;

import java.util.Scanner;

public class numeroRandom {

	public static void main(String[] args) {
		/*genero un numero random tra 0 e 10, chiedo all'utente di darmi un numero compreso tra 0 e 10, mostro a video 
		  se è maggiore o minore del numero random.*/ 
		
		
		 int numeroCasuale = (int) (Math.random() * 11);
		  
		  Scanner lottery = new Scanner(System.in);
		  System.out.println("Inserisci numero lotteria: ");

		  int numeroUtente = lottery.nextInt(); 
		  
		  
		  if (numeroUtente >= 1 && numeroUtente <=10) {
			
		
		   if ( numeroCasuale == numeroUtente) {
			System.out.println("hai vinto!");
		}
		  else if (numeroCasuale < numeroUtente) {
			System.out.println("il tuo numero è troppo grande!");
		}else {
			System.out.println("il tuo numero è troppo piccolo!");
		}
		
		   System.out.println("numero lotteria: " + numeroCasuale);
		  }else {
			  System.out.println("non è valido");
		  }
		  
		lottery.close();

	}

}
