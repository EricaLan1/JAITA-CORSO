package jaita99;

import java.util.Scanner;

public class ConfrontaStringaeta {

	public static void main(String[] args) {
		 /*  2 con lo scanner inserisci l'età di due utenti: la tua e del collega. se è più grande,
		 *   se è più piccolo, avete la stessa età. Controllo sull'età che non deve essere più piccolo di 0
		 */
		
			Scanner utenteEta = new Scanner(System.in);
			
			System.out.println("Inserisci la tua età");
			int utentePrincipale = utenteEta.nextInt();
			System.out.println("Inserisci l'età del tuo collega");
			int utenteSecondario = utenteEta.nextInt();
			
			if (utentePrincipale < 0 || utenteSecondario < 0) {
			
				if (utentePrincipale > utenteSecondario) {
					System.out.println("Sei più grande del tuo collega");
					System.out.println(utentePrincipale);
				} else if (utentePrincipale < utenteSecondario) {
					System.out.println("Il tuo collega è più grande di te");
					System.out.println(utenteSecondario);
				}else {
					System.out.println("Avete la stessa età");
				}
			
			}else {
				System.out.println("è impossibile calcolare in quanto utente è 0");
			}
			
			utenteEta.close();

			}
		
	
	}


