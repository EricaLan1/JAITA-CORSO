package controlflow;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ListaSpesa {

	public static void main(String[] args) {
		//File f;
		//Scanner input;
		File f= new File("documenti/listaSpesa.txt");
		try {
			Scanner input =new Scanner(f);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
		} catch(FileNotFoundException e) {
			System.err.println("File non trovato, verifica il nome file");
		}
	// il ciclo while lo useremo per leggere i file o prendere i dati da un database	
		
	}

}
