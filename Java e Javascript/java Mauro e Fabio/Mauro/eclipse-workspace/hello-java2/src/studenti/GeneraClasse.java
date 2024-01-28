package studenti;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class GeneraClasse {
	public static void main(String[] args) {
	/*creare in un secondo momento*/
	Scanner scanner = new Scanner (System.in);
	System.out.println("Quanti studenti ci in classe?: ");
	int dimensioneClasse = Integer.parseInt(scanner.nextLine()) ;
	
	//a partire dalla dimensione della classe creo l'array vuoto
	
	Studenti[] listaStudenti = new Studenti[dimensioneClasse];
	System.out.println(Arrays.toString(listaStudenti));
	
	// per ogni posizione dell'array
	
	for (int i = 0; i < listaStudenti.length; i++) {
		// chiedo i dati dello studente
		System.out.println("Studente " + (i + 1));
		System.out.println("Nome: ");
		String nome = scanner.nextLine();
		System.out.println("Cognome: ");
		String cognome = scanner.nextLine();
		System.out.println("Email: ");
		String email = scanner.nextLine();
		System.out.println("Data di nascita: (AAAA-MM-GG"); // devo passare da una stringa ad un local date
		String dataDiNascita = scanner.nextLine();
		LocalDate dataNascita = LocalDate.parse(dataDiNascita);
		// creo lo studente
		
		Studenti nuovoStudente = new Studenti(nome,cognome,email,dataNascita);
		
		// aggiungo lo studente alla posizione i dell'array
		// in un secondo momento chiedo i campi dell'indirizzo
		System.out.println("Indirizzo");
		System.out.println("Via: ");
		String via = scanner.nextLine();
		System.out.println("Numero: ");
		int numero = Integer.parseInt(scanner.nextLine() );
		System.out.println("Città: ");
		String citta = scanner.nextLine();
		Indirizzo indirizzo = new Indirizzo(via, numero, citta);
		nuovoStudente.setIndirizzo(indirizzo);

		
		listaStudenti[i] = nuovoStudente;
	}
	
	int annoCorrente = LocalDate.now().getYear();
	System.out.println("Lista della Classe");
	for (int i = 0; i < listaStudenti.length; i++) {
		// stampo nome completo ed età dello studente corrente
		System.out.println(listaStudenti[i].nomeCompleto() + " " + listaStudenti[i].getEta(annoCorrente) +" " + listaStudenti[i].getIndirizzo().toString());
	}
	
	
	scanner.close();
	}
}
