package mezzi;

public class Automobile {

	public String marca;
	public String modello;
	public int anno;
	public double prezzo;

	public Automobile (String _marca, String _modello, int anno, double prezzo) {
		
	this.marca= _marca;	
	this.modello= _modello;
	this.anno= anno;
	this.prezzo= prezzo;
	System.out.println ("Oggetto costruito");
	}
	
	public String stampaLibretto() {
		return "Librettro:" 
	+"\n"
    +"marca: " +marca
    +"\n"
    +"modelo: "+modello
    +"\n"
    +"anno: "+anno
    +"\n"
	
	+"prezzo:"+prezzo;
	}
}
