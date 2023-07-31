import java.util.Scanner;
public class RadiceQuadrata {

	public static void main(String[] args) {
		
		System.out.println("Inserisci numero");
		Scanner s=new Scanner(System.in); //control shift o fixa tutti gli import
		String numeri=s.nextLine();
		double risultato= Math.sqrt(Double.valueOf(numeri)); //converte la stringa in un double. Math e' la classe, sqrt metodo della classe, double e' il suo argomento
		System.out.println(risultato);
		s.close(); // chiudi la stampante, e' importante per i programmi grandi per non causare un memory leack
	}

}
// se si inserisce qualsiasi cosa in lettere che non sia un numero, il programma non riconosce il formato java.lang.NumberFormatException: "il motivo dell'errore"