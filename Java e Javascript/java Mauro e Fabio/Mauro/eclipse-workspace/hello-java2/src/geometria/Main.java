package geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Crea un rettangolo");
		System.out.println("Base: ");
		int base = Integer.parseInt(scanner.nextLine());
		System.out.println("Altezza: ");
		int altezza = Integer.parseInt(scanner.nextLine());
		Rettangolo userRettangolo = new Rettangolo(base, altezza);
		
		
		System.out.println("Perimetro: "+ userRettangolo.getParametri());
		System.out.println("Area: "+ userRettangolo.getArea());
		System.out.println("Base: " + userRettangolo.getBase());
		System.out.println("Altezza: " + userRettangolo.getArea());
		
		userRettangolo.disegna();
		
		
		scanner.close();
	}

}
