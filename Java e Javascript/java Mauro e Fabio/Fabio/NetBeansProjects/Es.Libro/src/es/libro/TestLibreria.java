        package es.libro;

import java.util.ArrayList;
import java.util.Scanner;

public class TestLibreria {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        // Aggiungiamo alcuni libri di esempio
        libreria.aggiungiLibro(new EsLibro("Libro pace", "Autore 1", 19.99));
        libreria.aggiungiLibro(new EsLibro("Libro giustizia", "Autore 2", 24.99));
        libreria.aggiungiLibro(new EsLibro("Libro lotta", "Autore 1", 14.99));
        libreria.aggiungiLibro(new EsLibro("Libro guerra", "Autore 3", 29.99));

        System.out.println("Libreria:");
        System.out.println(libreria.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nome dell'autore per trovare i libri: ");
        String autoreCercato = scanner.nextLine();

        ArrayList<String> titoli = libreria.trova(autoreCercato);
        if (titoli.isEmpty()) {
            System.out.println("Nessun libro trovato per l'autore " + autoreCercato);
        } else {
            System.out.println("Libri scritti da " + autoreCercato + ":");
          for (String titolo : titoli) {
                System.out.println(titolo);
            }
        }
     scanner.close();
    }
}