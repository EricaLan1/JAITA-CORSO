package shop;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.management.RuntimeErrorException;


public class MainconEccezioni {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		// categoria di default
		Categoria prodottoFresco = new Categoria("prodotto fresco", "prdotto con data di scadenza, conservare in frigo");
		System.out.println("Crea un prodotto fresco");
		// chiedo all'utente tutti i dati del prodotto 
		
		System.out.println("Nome:" );
		String nomeInput = scanner.nextLine();
		System.out.println("Descrizione: ");
		String descrizioneInput = scanner.nextLine();
		
		BigDecimal prezzo = null;
		while(prezzo == null) {
			System.out.println("Prezzo: ");
			String prezzoInput = scanner.nextLine();
		try {
			prezzo = new BigDecimal(prezzoInput);
		}catch (Exception e) {
			System.out.println("numero non valido");
			}
		}
		
		System.out.println("Iva: ");
		String ivaInput = scanner.nextLine();
		
		
		// se ho bisogno del prodotto anche all'infuori dello scope del try allora devo dichiararlo fuori e dimostrarlo
		try {
			BigDecimal iva = new BigDecimal(ivaInput);
			Prodotto prodotto = new Prodotto(nomeInput, descrizioneInput, prezzo, iva, prodottoFresco);
			System.out.println(prodotto);
		}catch (NumberFormatException numberFormatException) {
			System.out.println("il prezzo o iva non è un numero");
		}catch (IllegalArgumentException e) {
			System.out.println("Parametri invalidi: " + e.getMessage());
		}
		
		
		 
		
		
		
		
		scanner.close();

	}

}
