package universita;

import java.util.ArrayList;
import java.util.Scanner;

public class GestoreEsami {
    public static void main(String[] args) {
        ArrayList<Studente> studenti = new ArrayList<>();
        ArrayList<Materia> materie = new ArrayList<>();
        ArrayList<Esame> esami = new ArrayList<>();

        while(true) {
        	System.out.println("Inserisci ID studente:");
        	Scanner s = new Scanner(System.in);
        	int scelta =  s.nextInt();
        	
        	if (scelta >0 && scelta < studenti.size()) {
				System.out.println(studenti.get(scelta-1));
			}
        	

        	try {
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
        		System.out.println("Errore nella lettura del file: " +
        				e.getMessage());
        	}
        	// Ora puoi fare operazioni con gli studenti, materie ed esami
        	letti dal file
        	//usa preferibilmente metodi ausiliari
}
}
}
        
    }
}