package universita;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
		public class GestoreEsami {
			public static void main(String[] args) { // main e' un metodo publico statico che ritorna void e'prende come argomento un array di stringhe di nome args 
				ArrayList<Studente> studenti = new ArrayList<>();
				ArrayList<Materia> materie = new ArrayList<>();
				ArrayList<Esame> esami = new ArrayList<>();
//per leggere il file, puoi anche usare la classe Scanner
//in ogni caso occorre gestire una IOException
				try { // codice che puo' tirare un' eccezione. Se questo codice tira l'eccezione, il programma viene interrotto e il catch, cattura questa eccezione. Viene eseguita la parte di codice del catch
					//asseconda dell'eccezione tirata ed il programma esegue normalmente. Dopo questi due, c'e il finaly in cui c'e' un pezzo di codice che viene eseguito a prescindere dopo il try catch, se 
					//sono state tirate eccezioni o meno
					BufferedReader reader = new BufferedReader(new FileReader("studenti.txt"));
						String line;
				while ((line = reader.readLine()) != null) {
						String[] parts = line.split(",");
						int studenteId = Integer.parseInt(parts[0]);
						String studenteNome = parts[1];
						Studente studente = new Studente(studenteId, studenteNome);
						studenti.add(studente);
				}
					reader.close();
				} catch (IOException e) {
					System.out.println("Errore nella lettura del file: " + e.getMessage());
					}
				// in java abbiamo i design pattern, schemi di programmazioni che ci aiutano a definire le classi. crud, acronmo: create read update and delete. 
// Ora puoi fare operazioni con gli studenti, materie ed esami
//letti dal file
//usa preferibilmente metodi ausiliari
		}
			
}