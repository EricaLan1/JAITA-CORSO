package Collezioni;

import java.util.HashMap;

public class EsameGraduazione {

	public static void main(String[] args) {
		// mappa con i risultati dell'esame degli studenti di un corso
		// la chiave è il nome dello studente, il valore è il voto, max: 25, Dustin: 40, Will: 18
		
		HashMap<String, Double> voti = new HashMap<>(); // dobbiamo dire che tipo di dato sono chiave e valore nell'ordine corretto, per convenzione
		System.out.println(voti);  // le mappe si differenziano nella stampa perché sono con le graffe anziché le quadre
		
		// aggiungo delle coppie studente - voto
		
		voti.put("Max", 25.25);
		voti.put("Will", 18.00);
		voti.put("Susy", 19.50);
	
		System.out.println(voti);
		
		System.out.println(voti.size());
		voti.put("Will", 22.00); // la mappa lavora per sostituzione, ritrova will ma sostituisce il valore
		System.out.println(voti);
	}

}
