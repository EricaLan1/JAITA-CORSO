package esercizixcasa;

import java.time.LocalDate;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner generatorePassword = new Scanner(System.in);
		
		/*String nome;
		String cognome;
		String colorePreferito;
		int giornoNascita;
		int meseNascita;
		int annoNascita;
		
		System.out.print("Nome: ");
		nome = generatorePassword.nextLine();
		System.out.print("Cognome: ");
		cognome= generatorePassword.nextLine();
		System.out.print("Colore Preferito: ");
		colorePreferito = generatorePassword.nextLine();
		
		System.out.print("Giorno di nascita: ");
		giornoNascita = generatorePassword.nextInt();
		System.out.print("Mese di nascita: ");
		meseNascita = generatorePassword.nextInt();
		System.out.print("Anno di nascita: ");
		annoNascita = generatorePassword.nextInt();
		
		System.out.println(nome + " " + cognome + " " + "colore preferito" + " " + colorePreferito + " " + "Nato il: " + giornoNascita + "/"+meseNascita+"/"+annoNascita);
		
		String password = nome + "-" + cognome + "-" + colorePreferito + "-" +  giornoNascita + "-" + meseNascita + "-" + annoNascita;
		System.out.print("Password Generata: " + password);*/
		
		
		/*--------CON SPLIT ARRAY------*/
		/*System.out.print("Nome: ");
		String nomeSplit = generatorePassword.nextLine();
		
		System.out.print("Cognome: ");
		String cognomeSplit= generatorePassword.nextLine();
		
		System.out.print("Colore Preferito: ");
		String colorePreferitoSplit = generatorePassword.nextLine();
		
		System.out.println("Inserisci la tua data di nascita nel seguente formato gg/mm/aa : ");
		
		String dataNascita;
		dataNascita = generatorePassword.nextLine();
		
		String[] dataNascitaCompleta = dataNascita.split("/");
		
		int giornoNascitaSplit = Integer.parseInt(dataNascitaCompleta[0]);
		int meseNascitaSplit = Integer.parseInt(dataNascitaCompleta[1]);
		int annoNascitaSplit = Integer.parseInt(dataNascitaCompleta[2]);
		
		int sommadataSplit = giornoNascitaSplit + meseNascitaSplit + annoNascitaSplit;
		
		System.out.println("utente: "+ nomeSplit + " " + cognomeSplit + " " +"colore preferito"+" "+ colorePreferitoSplit + " " +"data di nascita: "+giornoNascitaSplit+ "/"+ meseNascitaSplit+ "/" +annoNascitaSplit);
		
		String passwordSplit = nomeSplit + " " + cognomeSplit + " " + colorePreferitoSplit + " " + sommadataSplit;
		System.out.println("Password: " +passwordSplit);
		*/
		
		
		/*----SOLUZIONE OTTIMALE CON LOCALDATE--*/
		
		LocalDate oggi = LocalDate.now();
		System.out.println(oggi);
		
		System.out.print("Data di nascita nel seguente formato (aaaa-mm-gg) ");
		String data = generatorePassword.nextLine();
		
		LocalDate datadiNascita = LocalDate.parse(data);
		System.out.println(datadiNascita);
		int giorno = datadiNascita.getDayOfMonth();
		int mese = datadiNascita.getMonthValue();
		int anno = datadiNascita.getYear();
		
		int somma = giorno + mese + anno;
		System.out.println("anno italiano: " + giorno + "-"+ mese+ "-" + anno);
		System.out.println(somma);                                         
		
		generatorePassword.close();
	}

}
