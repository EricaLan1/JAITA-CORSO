package canzoni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class canzoni {
	public static void main(String[] args) {
		File f=  new File("canzoni/hit-estate-2022.txt");
		ArrayList<Canzone> hitlist= new ArrayList<Canzone>();//array di dimensione variabile
			
			try {
				Scanner input= new Scanner(f);
				
				
				while(input.hasNextLine()) {
					
				String canzoni = input.nextLine();
				String [] canzoniSplit= canzoni.split("\\|");
				
				String cantante = canzoniSplit[0];
				String titolo = canzoniSplit[1];
				Canzone c= new Canzone(cantante, titolo);
				hitlist.add(c);//  ho aggiunto la canzone c alla mia lista di canzoni con add
				
				System.out.println(c);
			
					}
					
				}catch (FileNotFoundException e) {
						System.err.println("file non trovato, verifica il nome del file"+e.getMessage());
				}
				for(Canzone c: hitlist) {
					System.out.println(c);
				}
		
	}
}
