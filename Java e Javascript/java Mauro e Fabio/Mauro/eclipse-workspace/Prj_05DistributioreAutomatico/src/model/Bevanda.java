package model;

public class Bevanda {
	public String nome; // realmente saranno sempre private
	public double prezzo; // il metodo costruttore inizializza dal metodo inziale a quello dell'oggetto
	
	public String getMessaggio() {
		String s ="";
		s += "Scontrino \n";
		s += "Nome \n";
		s += nome + " \n";
		s += "Prezzo \n";
		s += prezzo +" \n";
		
		return s;
	}
	
	
	
	
	
	
}
