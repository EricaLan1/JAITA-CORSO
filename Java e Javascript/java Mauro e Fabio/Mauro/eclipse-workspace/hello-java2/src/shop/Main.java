package shop;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Categoria prodottoFresco = new Categoria("prodotto fresco", "prdotto con data di scadenza, conservare in frigo");
		Prodotto prodotto =  new Prodotto("yogurt", "alla fragola", new BigDecimal("2.55"), new BigDecimal("0.22"), prodottoFresco); // il bigdecimal deve sapere quanto deve valere
		
		System.out.println(prodotto);
		//System.out.println(prodotto.getnomeCompleto() + ": " + prodotto.getPrezzoPieno() + "$"); // come prezzo mi da 4 decimali dopo la virgola e a noi non piace visto
		// che arriviamo solo al secondo, quindi andiamo ad approssimarla nel costruttore prezzo pieno con setscale

	}

}
