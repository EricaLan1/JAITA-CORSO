package universita;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentiCRUD {
	
	ArrayList<Studente> studenti;
	
	public StudentiCRUD() {
		super();
	
		this.studenti = new ArrayList<>();
	}

	public Studente create (int id, String nome) { 
		Studente nuovoStudente = new Studente(id, nome);
		studenti.add(nuovoStudente);
		return nuovoStudente;
		
	}
	
	public Studente read (int id) { // ci arriva id, ciclare la lista studenti e trovare lo studente con l id uguale a quello dato, e ritornarlo
		for (int i = 0; i < studenti.size(); i++) {
			Studente studente = studenti.get(i); //prendiamo lo studente nella posizione dell'ArrayList
			if (studente.getId() == id) {
				return studente; 
			}
				
		}
		return null;
	}
	
	public Studente update(int id, String nome) { //trovare lo studenti con l'id, ma invece di ritornarlo gli cambi il nome
		for (int i = 0; i < studenti.size(); i++) {
			Studente studente = studenti.get(i);
			if (studente.getId() == id) {
				studente.setNome(nome);
				return studente;
			}
		}
		
		
		return null;
	}
	
	public Studente delete (int id) {
		return null;
	}
	
}
