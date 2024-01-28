package jaita99;

import java.util.Scanner;

public class RegistroSoftware {

	public static void main(String[] args) {
		
		/* registrp quanti utenti usano Mac o Win o Linux, mostro a video le percentuali di utenti Mac,Win e Linux, dopo chiediamo all'utente di darci i valori.
	    calcolo delle percentuali. valore*100/totale, casting*/
		Scanner usersSoftware = new Scanner(System.in);
		
		int macUsers;
		int windowsUsers;
		int linuxUsers;
		
		System.out.print("Numero utenti Mac: ");
		macUsers = usersSoftware.nextInt();
		System.out.print("Numero utenti Windows: ");
		windowsUsers = usersSoftware.nextInt();
		System.out.print("Numero utenti Linux: ");
		linuxUsers = usersSoftware.nextInt();
		
		System.out.println("Utenti Mac: " +macUsers);
		System.out.println("Utenti Windows: "+windowsUsers);
		System.out.println("Utenti Linux: "+ linuxUsers);
		
		
		int totalUsers = macUsers + windowsUsers + linuxUsers;
		System.out.println("Utenti totali: " + totalUsers);
		
		double macPercentuale = (double) macUsers/totalUsers * 100;
		double windowsPercentuale = (double) windowsUsers/totalUsers * 100;
		double linuxPercentuale = (double) linuxUsers/totalUsers * 100;
		
		String formattazioneMac = String.format("%.2f", macPercentuale);
		String formattazioneWindows = String.format("%.2f", windowsPercentuale);
		String formattazioneLinux = String.format("%.2f", linuxPercentuale);
		
		System.out.println("Percentuale % Mac: " + formattazioneMac);
		System.out.println("Percentuale % Windows: "+ formattazioneWindows);
		System.out.println("Percentuale % Linux: "+ formattazioneLinux);
		
		usersSoftware.close();
	}

}
