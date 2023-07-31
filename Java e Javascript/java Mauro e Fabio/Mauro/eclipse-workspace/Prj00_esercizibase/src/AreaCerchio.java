import java.util.Scanner;

public class AreaCerchio {

	public static void main(String[] args) {
		System.out.println("Raggio: ");
		Scanner s= new Scanner(System.in);
		double raggionum= Double.valueOf(s.nextLine());
		
		final double PIgreco= 3.14d; //con d specifico che e' un double
		double areaCerchio= PIgreco*raggionum*raggionum;
		
		System.out.println("Risultato: "+ areaCerchio);
		
		s.close();

	}

}
