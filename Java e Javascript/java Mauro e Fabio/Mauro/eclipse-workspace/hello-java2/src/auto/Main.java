package auto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Auto miaAuto; // se voglio crearla, e quindi assegnarle un valore dico 
		//miaAuto = new Auto();
		
		//posso creare un'altra macchina
		Auto superAuto = new Auto();
		System.out.println(superAuto.getInfo()); /* se io chiamo di default il costruttore,mi da vuoto tutti gli attributi, se invece noi vogliamo dargli dei valori di 
		di default nostri, allora creiamo un costruttore in cui inseriamo noi dei valori */
		 
		superAuto.colore = "oro";
		superAuto.numeridiAirbags = 10;
		superAuto.Ibrida = false;
		superAuto.definireleOpzioni("oro", 10, false);
		
		/*ora mi aspetto che una volta che stampo si sia salvato le opzioni visto che l'ho fatto nella classe auto
		 * ora il definireopzioni posso richiamarlo tutte le volte che voglio, e magari quando farò interagire l'utente con lo scanner
		 * cambiarà lo stato interno della mia superAuto. ---- ora commenta l'auto normale e chiediamo all'utente di modificare PARTE 4*/
		
		/* i due stati non interferiscono l'uno con l'altro, hanno semplicemente le due caratteristiche */
	
		/*System.out.println("Colore: "+superAuto.colore);
		System.out.println("Numero di Airbags: "+superAuto.numeridiAirbags);
		System.out.println("E' ibrida:  "+superAuto.Ibrida); */
		System.out.println(superAuto.getInfo());/* --- PER I COSTRUTTORI, ESCE NULL, DOPO TORNA AD AUTO INSERISCI I LCOSTRUTTORE*/
		
		/*DOPO AVER RESTITUITO UNA STRINA NELLA CLASSE AUTO PRENDERE GETINFO E STAMPARE IN UNA SOLA RIGA PER TUTTI E 3*/
		
		
		System.out.println("Ridefinire le Opzioni");
		System.out.println("Color: ");
		String nuovoColore = scanner.nextLine();
		System.out.println("Numero di Airbags: ");
		int nuovoAirbags = Integer.parseInt(scanner.nextLine());
		System.out.println("E' ibrida?(s,n): ");
		String nuovaScelta = scanner.nextLine();
		
		boolean nuovaIbrida;
		if (nuovaScelta.equalsIgnoreCase("s")) {
			nuovaIbrida = true;
		}else {
			nuovaIbrida = false;
		}
		
		/* chiamo di nuovo il metodo definire opzioni con i valori presi dallo scanner */ 
		superAuto.definireleOpzioni(nuovoColore, nuovoAirbags, nuovaIbrida);
		/*System.out.println("Colore: "+superAuto.colore);
		System.out.println("Numero di Airbags: "+superAuto.numeridiAirbags);
		System.out.println("E' ibrida:  "+superAuto.Ibrida);*/
		System.out.println(superAuto.getInfo());
		
		
		
	
		/*quindi ora è completa dei suoi attributi anche se non li ho valorizzato, come fa a saperlo?
		lo stampiamo prima per farlo vedeere  PARTE 2*/
		
		/*miaAuto.colore = "bianco";
		miaAuto.numeridiAirbags = 2;
		miaAuto.Ibrida = true;
		 * System.out.println("Colore: "+miaAuto.colore);
		System.out.println("Numero di Airbags: "+miaAuto.numeridiAirbags);
		System.out.println("E' ibrida:  "+miaAuto.Ibrida);*/
		
		/* ha già questi attributi ma con il loro valore vuoto quindi quando vado a stampare mi esce vuoto
		. in questo modo non abbiamo errore, per assegnargli dei valori gli mttiamo il punto 
		Ora andiamo nella nostra Auto e gli diamo un po' di funzionalità, segui parte 3*/
		
		scanner.close();

	}

}
