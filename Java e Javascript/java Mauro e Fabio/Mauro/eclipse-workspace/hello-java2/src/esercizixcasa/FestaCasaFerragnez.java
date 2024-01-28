package esercizixcasa;

import java.util.Scanner;

public class FestaCasaFerragnez {

	public static void main(String[] args) {
		
		Scanner festa = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		String nomeInvitato = festa.nextLine();
		
		
		String[] listaInvitati = {"Luca", "Maria", "Matt","Lucia","Kaleb","Susan","Patrick", "Helen","Spongebob", "Elf", "BabboNatale","Spongebob","Sunny"};
		
		boolean trovato = false;
		/*for (int i = 0; i < listaInvitati.length; i++) {
			if (listaInvitati[i].equals(nomeInvitato)) {
				trovato = true;
			}
		}
		
			if (!trovato) {
				System.out.println("vattene a fanculo");
			}else {
				System.out.println("Puoi entrare accomodati");
			}*/
		
		
		/*noi abbiamo 2 condizioni per continuare a ciclare in questo caso: 1 non ho finito la lista, non ti ho trovato*/
		int i = 0; /*valore di partenza */
		while (i < listaInvitati.length && !trovato) {
			if (listaInvitati[i].equals(nomeInvitato)) {
				trovato = true;
				/*break; esci dal ciclo oppure posso, dire che non matcha alla lunghezza*/
			}
			i++;
		}
			if (!trovato) {
				System.out.println(nomeInvitato +" "+ "vattene a fanculo");
			}else {
				System.out.println("Puoi entrare, accomodati");
			}
		
			
		festa.close();
		
		
		
		
	}

}
