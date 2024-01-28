package gatto;

import java.util.Scanner;

public class CreaGatto {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner (System.in);
		try {
		System.out.println("Razza: ");
		String razza = scanner.nextLine();
		System.out.println("Età: ");
		int age = Integer.parseInt(scanner.nextLine());
		System.out.println("Genere (maschio/femmina): ");
		String genere = scanner.nextLine();
		System.out.println("Nome: ");
		String nome =  scanner.nextLine();
		
		
		// coi dati presi dallo scanner creo un Gatto
		Gatto userGatto = new Gatto(razza, age, genere, nome);
		
		// stampo il gatto
		System.out.println(userGatto);
		} catch (IllegalArgumentException e) {
			System.out.println("Data invalida: " + e.getMessage());
		}
		
		scanner.close();

	}

}
