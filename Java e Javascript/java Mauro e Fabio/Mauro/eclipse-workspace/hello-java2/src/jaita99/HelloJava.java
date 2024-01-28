package jaita99;

import java.util.Iterator;
import java.util.Scanner;

public class HelloJava {
  public static void main(String[]args) {
	  
	  /*numeri divisibili per 3, per 5, poi per 3 e 5. Chiedere con lo scanner se il numero è pari o dispari. FATTO 
	  se volessi escludere lo 0, o un elemento dal risultato finale come faccio? */
	  
	  
	  //esempi con boolean, esempi boolean amazon
	  
	  
	  	for (int i = 0; i < 100; i++) {
		  if (i % 3 == 0 ) {
			System.out.print(" " + i + " ");
		}
	  }
		  
		  for (int t = 0; t < 100; t++) {
			  if (t % 5 == 0 ) {
				System.out.println(" " + t + " ");
			}
	}
		  
	for (int z = 0; z < 100; z++) {
		if(z % 3 == 0 && z % 5 ==0) {
		System.out.println(" " + z + " ");
	}
	}
	
	
	Scanner oddEven = new Scanner(System.in);
	System.out.print("inserisci il numero: ");
	 
	int numeroUtente = oddEven.nextInt();
		
			if(numeroUtente % 2 == 0) {
				System.out.println("il numero è pari");
			}
			else {
				System.out.println("il numero è dispari");
			}   
		
		
	oddEven.close(); 
	  
	
	
  }
  
  }
  
  
