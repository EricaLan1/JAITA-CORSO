package universita;

//public static void main(String[] args) { // main e' un metodo publico statico che ritorna void e'prende come argomento un array di stringhe di nome args

//try { // codice che puo' tirare un' eccezione. Se questo codice tira l'eccezione, il programma viene interrotto e il catch, cattura questa eccezione. Viene eseguita la parte di codice del catch
//asseconda dell'eccezione tirata ed il programma esegue normalmente. Dopo questi due, c'e il finaly in cui c'e' un pezzo di codice che viene eseguito a prescindere dopo il try catch, se 
//sono state tirate eccezioni o meno
// in java abbiamo i design pattern, schemi di programmazioni che ci aiutano a definire le classi. crud, acronmo: create read update and delete. 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GestoreEsami {
	public static void main(String[] args) {
		ArrayList<Studente> studenti = new ArrayList<>();
		ArrayList<Materia> materie = new ArrayList<>();
		ArrayList<Esame> esami = new ArrayList<>();
		
		ArrayList<String> voti = new ArrayList<>();
		
		
//		ArrayList<Integer> voti = new ArrayList<>();
//		ordinaId(voti);

		File out = new File("files/esami.txt");

		try {
			BufferedReader reader = new BufferedReader(new FileReader("files/studenti.txt"));
			BufferedReader reader2 = new BufferedReader(new FileReader("files/materie.txt"));
			String line;
			String line2;

			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				int studenteId = Integer.parseInt(parts[0]);
				String studenteNome = parts[1];
				Studente studente = new Studente(studenteNome);
				studenti.add(studente);
			}
			reader.close();

			while ((line2 = reader2.readLine()) != null) {
				String[] parts = line2.split(",");
				int materiaCodice = Integer.parseInt(parts[0]);
				String materiaNome = parts[1];
				Materia materia = new Materia(materiaNome);
				materie.add(materia);
			}
			reader2.close();

			Scanner s = new Scanner(System.in);

			boolean condizione = true;
			
			while(condizione) {
				System.out.println("1 --> Visualizza studenti\n2 --> Visualizza materie\n3 --> Visualizza esami\n4 --> Inserisci nuovo studente\n5 --> Inserisci nuova materia\n6 --> Inserisci voto agli studenti\n7 --> Calcola media voti di tutti gli studenti\n8 --> Calcola media di tutti gli studenti per materia\n9 --> Visualizza voti studenti per materia\n0 --> Esci");
				int scelta = s.nextInt();
				switch(scelta) {
					case 1:
						System.out.println("Studenti:");
						for (Studente studente : studenti) {
							System.out.println(studente);
						}
						break;
					case 2:
						System.out.println("Materie:");
						for (Materia materia : materie) {
							System.out.println(materia);
						}
						break;
					case 3:
						System.out.println("Esami:");
						for (Esame esame : esami) {
							System.out.println(esame);
						}
						break;
					case 4:
						System.out.println("Inserisci nome studente -->");
						s.nextLine();
						String nomeStudente = s.nextLine();
						Studente studenteInput = new Studente(nomeStudente);
						studenti.add(studenteInput);
						PrintWriter pwStudenti = new PrintWriter(new File("files/studenti.txt"));
						for (Studente studente : studenti) {
							pwStudenti.println(studente);
						}
						pwStudenti.close();
						System.out.println("Studente aggiunto.");
						break;
					case 5:
						System.out.println("Inserisci nome materia -->");
						String nomeMateria = s.next();
						Materia materiaInput = new Materia(nomeMateria);
						materie.add(materiaInput);		
						PrintWriter pwMaterie = new PrintWriter(new File("files/materie.txt"));
						for (Materia materia : materie) {
							pwMaterie.println(materia);
						}
						pwMaterie.close();
						System.out.println("Materia aggiunta.");
						break;
					case 6:
						System.out.println("Studenti:");
						for (Studente studente : studenti) {
							System.out.println(studente);
						}

						System.out.println("Seleziona ID studente -->");
						int sceltaStudente = s.nextInt();
						System.out.println(studenti.get(sceltaStudente - 1));
						System.out.println("Materie:");
						for (Materia materia : materie) {
							System.out.println(materia);
						}

						System.out.println("Seleziona ID materia -->");
						int sceltaMateria = s.nextInt();
						System.out.println(materie.get(sceltaMateria - 101));

						System.out.println("Inserisci voto per " + materie.get(sceltaMateria - 101).getNome() + " allo studente " + studenti.get(sceltaStudente - 1) + " -->");
						int voto = s.nextInt();
						System.out.println("Vuoi registrare questo esame sostenuto da " + studenti.get(sceltaStudente - 1) + " in " + materie.get(sceltaMateria - 101).getNome() + "? y/n");
						String sceltaEsame = s.next();
						switch(sceltaEsame) {
							case "y":
								Esame esame = new Esame(studenti.get(sceltaStudente - 1), materie.get(sceltaMateria - 101), voto);
								esami.add(esame);
								System.out.println("Esame per " + esame.getStudente().getNome() + " in " + esame.getMateria().getNome() + " superato con un voto di " + esame.getVoto() + ": aggiunto con successo.");
								break;
							case "n":
								break;
						}
						break;
					case 7:
						System.out.println("La media voti di tutti gli studenti è: " + calcolaMediaStudenti(esami));
						break;
					case 8:
						for (Materia materia : materie) {
							System.out.println(materia);
						}
						System.out.println("Inserisci l'ID della materia -->");
						int materiaScelta = s.nextInt();
						System.out.println(materie.get(materiaScelta - 101));
						System.out.println("La media degli studenti in " + materie.get(materiaScelta - 101) + " è: " + calcolaMediaStudentiMateria(esami, materiaScelta));
						break;
					case 9:
						for (Studente studente : studenti) {
							System.out.println(studente);
						}

						System.out.println("Seleziona ID studente di cui visualizzare i voti -->");
						int sceltaStudente2 = s.nextInt();

						voti.clear();
						mostraVotiStudente(esami, sceltaStudente2, voti);
					
//						Comparator<String> comparatorePerNome = new Comparator<String>() {      //per ordinare (in ordine crescente) in base alla materia
//					        
//					        @Override
//					        public int compare(String materia1, String materia2) {
//					             String nome1 = materia1.split(":")[1]; // Ottieni il nome dalla stringa
//					             String nome2 = materia2.split(":")[1]; // Ottieni il nome dalla stringa
//					             return nome1.compareTo(nome2);
//					         }
//					     };
//
//					        
//					    Collections.sort(voti, comparatorePerNome);
						
						Comparator<String> comparatorePerVoto = new Comparator<String>() {            //ordine descrescente per voto
						    @Override
						    public int compare(String materia1, String materia2) {
						       
						        int voto1 = Integer.parseInt(materia1.split(": ")[2]);       // dove ci sono ": " divide in sottostringhe
						        int voto2 = Integer.parseInt(materia2.split(": ")[2]);

						        // Confronta i voti in modo decrescente
						        return Integer.compare(voto2, voto1);    //se il risultato è negativo, il primo numero viene inserito prima del secondo, altrimenti viene inserito dopo
						    }
						};

						Collections.sort(voti, comparatorePerVoto);        //Collectios.sort(voti) ordinerebbe secondo l'ordine di default, con il secondo parametro andiamo a dire secondo quale logica ordina
					    
						for (String voto3 : voti) {
							System.out.println(voto3);
						}
						break;
					case 0:
						s.close();
						System.out.println("Programma terminato.");
						System.exit(0);
				}
			}


		} catch (IOException e) {
			System.out.println("Errore nella lettura del file: " + e.getMessage());
		}
	
}


	public static double calcolaMediaStudenti(ArrayList<Esame> esami) {
		double totale = 0;
		int numEsami = 0;

		for (Esame esame : esami) {
			totale += esame.getVoto();
			numEsami++;
		}

		return totale / numEsami;
	}

	public static double calcolaMediaStudentiMateria(ArrayList<Esame> esami, int codiceMateria) {
		double totale = 0;
		int numMaterie = 0;

		for (Esame esame : esami) {
			if(codiceMateria == (esame.getMateria().getCodice())) {  //se il codice che inserisce l'utente corrisponde al codice della materia
				totale += esame.getVoto();  //tutti i voti della materia corrispondente all'input utente
				numMaterie++;
			}else{
				System.out.println("Lo studente non ha tenuto nessun esame.");
			}
		}
		
		return totale / numMaterie;		
	}
	
	public static ArrayList<String> mostraVotiStudente(ArrayList<Esame> esami, int idStudente, ArrayList<String> voti) {
		String voto = "";

		for (Esame esame : esami) {
			if(idStudente == esame.getStudente().getId()) {
				voto = esame.getMateria() + ", voto: " + esame.getVoto();
				voti.add(voto);
			}
			
		}
		return voti;
	} 
}

