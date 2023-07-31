package canzoni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class canzoniPlaylist {
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
				
				//System.out.println(c);
			
					}
				
				}catch (FileNotFoundException e) {
						System.err.println("file non trovato, verifica il nome del file"+e.getMessage());
				}
			
				Scanner playList=new Scanner(System.in);
				ArrayList<Canzone> playList1= new ArrayList<Canzone>();
			
				for(Canzone c: hitlist) {
					System.out.println(c);
					System.out.println("Vuoi salvare questa canzone nella playlist?");
					String risposta=  playList.nextLine();
					
					if(risposta.equals("s")){
					playList1.add(c);
					}
					//System.out.println("nella mia playlist ci sono"+ playList1);
					File miaPlayList= new File("canzoni/miaPlayList.txt");
					try {
						PrintWriter download= new PrintWriter(miaPlayList);
						for(Canzone canzone: playList1) {
							download.println(canzone);
						}
						download.close();
					}catch(FileNotFoundException e) {
						e.printStackTrace();
					}
					
				}
			
	}
}
