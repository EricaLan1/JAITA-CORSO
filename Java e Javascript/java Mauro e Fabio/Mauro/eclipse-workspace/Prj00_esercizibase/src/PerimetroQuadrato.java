import java.util.Scanner;

public class PerimetroQuadrato {
	public static void main(String[] Args) {
	
		System.out.println("Numero Altezza: ");
		Scanner s=new Scanner(System. in);
		String altezza=s.nextLine();
		double altezzanum= Double.valueOf(altezza);
		
		System.out.println("Numero Base: ");
		String base=s.nextLine();
		double basenum= Double.valueOf(base);
		
		double operazione= altezzanum*basenum;
		
		System.out.println("Risultato: "+operazione);
		s.close();	
		
	}
	
	
}
