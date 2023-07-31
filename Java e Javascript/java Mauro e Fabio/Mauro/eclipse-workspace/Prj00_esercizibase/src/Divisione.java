import java.util.Scanner;

public class Divisione {
	public static void main(String[]Args) {
		System.out.println("Primo numero:");
		Scanner s=new Scanner(System.in);
		double primoNum= Double.valueOf(s.nextLine());
		
		
		
		System.out.println("Secondo numero:");
		double secondoNum= Double.valueOf(s.nextLine());
		s.close();
		
		double divisione= primoNum/secondoNum;
		System.out.println("Risultao Divisione: "+divisione);
		System.out.println("Resto: " +11%3);
	}
}
