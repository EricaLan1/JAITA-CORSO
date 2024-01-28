
package geometria;

public class Rettangolo {
	private int base;
	private int altezza;
	 
	 
	public Rettangolo(int base, int altezza) {
		/*perché siano validi, base e altezza, devono essere maggiore di 0*/
		/*if (base > 0) {
			this.base = base;
		}else {
			// se base non è valida assegno il valore di default è 1
			this.base= 1;
		}
		
		if (altezza > 0 ) {
			this.altezza = altezza;
		}else {
			this.altezza = 1; 
		}
		Questa parte si commenta perché abbiamo creato il void e si inserisce una diversa*/
		
		this.base = valorediDefault(base);
		this.altezza = valorediDefault(altezza);
	}
	
	/*Possiamo permettere all'utente di leggere base e altezza in quel momento perché magari gli erve per fare dei confronti 1 Attributi, 2 costruttore, 3 get e set, 4 altri metodi */
	
	public int getBase() {
		return base;
	}

	public int getAltezza() {
		return altezza;
	}
	
	
	public void setBase(int base) {
		this.base = valorediDefault(base);
	}

	public void setAltezza(int altezza) {
		this.altezza = valorediDefault(altezza);
	}

	/*---------------- getter personalizzati*/
	public int getArea() {
		return base*altezza;
		
	}
	
	public int getParametri() {
		return 2*base + 2*altezza;
	} 
	
	
	
	/* questo private è per la lezione. questo metodo  dovrebbe prendere un valore dall'esterno e restituire o quel valore o il default
	 * questo è un metodo di servizio che prende un valore e restituisce quel valore se è maggiore di 0 altrimenti il default E SONO PRIVATE
	 * 
	 * Questo metodo non serve chiamarlo da fuori, serve a me per non ripetere 2 volte lo stesso ragionamento*/
	private int valorediDefault(int value) {
		if (value >0) 
			return value;
		else return 1;
		
	}



	void disegna() {
		for (int i = 0; i < altezza; i++) {
			String linea = "";
			if ((i == 0) || (i==altezza -1)){
				for (int j = 0; j < base; j++) {
					linea += "0";
				}
				System.out.println(linea);
			}else {
				linea = "0";
				for (int j = 1; j < base -1; j++) {
					linea += " ";
				}
				linea += "0";
				System.out.println(linea);
			}
		}
	}
	 
	 
}
