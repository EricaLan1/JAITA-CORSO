package es.libro;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<EsLibro> libri;

    public Libreria() {
        libri = new ArrayList<>();  // Inizializza la lista dei libri come un nuovo oggetto ArrayList
    }

    public ArrayList<EsLibro> getLibri() {
        return libri;  // Restituisce l'intera lista dei libri presenti nella libreria
    }

    public void aggiungiLibro(EsLibro libro) {
        libri.add(libro);  // Aggiunge un libro alla lista dei libri della libreria
    }

    public void rimuoviLibro(EsLibro libro) {
        libri.remove(libro);  // Rimuove un libro dalla lista dei libri della libreria
    }

    public ArrayList<String> trova(String autore) {
        ArrayList<String> titoli = new ArrayList<>();  // Crea un nuovo ArrayList per contenere i titoli dei libri trovati
        for (EsLibro libro : libri) {
            if (libro.getAutore().equals(autore)) {
                titoli.add(libro.getTitolo());  // Se l'autore del libro corrisponde al parametro, aggiunge il titolo all'ArrayList dei titoli
            }
        }
        return titoli;  // Restituisce l'ArrayList contenente i titoli dei libri trovati
    }

    public String toString() {
        for (EsLibro libro : libri) {
            System.out.println(libro.toString());  // Stampa la rappresentazione testuale di ciascun libro
        }
        return "";  // Restituisce una stringa vuota poiché il metodo richiede un valore di ritorno di tipo String
    }
}

