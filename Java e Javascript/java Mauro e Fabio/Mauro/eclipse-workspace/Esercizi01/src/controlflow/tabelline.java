
package controlflow;
import java.util.Scanner;
public class tabelline {

	public static void main(String[] args) {
		System.out.println("Inserisci numero tabellina: " );
		Scanner s= new Scanner(System.in);
		int tabellina= s.nextInt();	
		
		int risultato= 0;
		for (int i = 0; i < 11; i++) {
			risultato= tabellina * i;
			
			System.out.println("Risultato: " + risultato);
			
			
			
		}
		s.close();
		}

		
		
}


