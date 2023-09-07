package view;

import java.util.Scanner;

public class DistributoreView {
	
	private Scanner scanner = new Scanner(System.in);
	
	final String MSG_SCELTA = "Scegli bevanda";// final e' una costante
	final String MSG_DENARO = "Inserisci credito";// final e' una costante
	
	public String showMenu() {
		String s = "";
		s += "A1 caffe': 0.50 \n" ; // \n manda a capo
		s += "A2 caffe' lungo: 0.55 \n" ; // \n manda a capo
		s += "A3 cappiccino: 1.30 \n" ; // \n manda a capo
		s += "A4 cioccolata: 1.50 \n" ; // \n manda a capo
		s += "A5 the': 1.10 \n" ; // \n manda a capo
		return s;
	}
	public String sceltaBevanda() {
		String s="";
		System.out.println(MSG_SCELTA);
		s=scanner.nextLine();
		
		return s;
		
	}
	public double chiediSoldi() {
		double d=0;
		// SCRIVERE UNA LOGICA PER CARICARE IL CREDITO
		return d;
	}
	
	
}