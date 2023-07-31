package controlflow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class studenti2 {

	public static void main(String[] args) {
		File f=  new File("documenti/Studenti.txt");
		File studentiList= new File("documenti/studenti.html");
			
			try {
				Scanner input= new Scanner(f);
				PrintWriter pennarello= new PrintWriter(studentiList);
				
				pennarello.println("<ul>");
				while(input.hasNextLine()) {
					
				String studente = input.nextLine();
				pennarello.println("<li>"+studente+"</li>");
				}
				
				pennarello.println("<lu>");
				pennarello.close();
				System.out.println("programma terminato");
				}catch (FileNotFoundException e) {
					
		        e.printStackTrace();
		    }
			
		    
	}

}
