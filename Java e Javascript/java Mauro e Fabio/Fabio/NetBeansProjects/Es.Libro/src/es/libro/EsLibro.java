package es.libro;


public class EsLibro {
    private String titolo;
    private String autore;
    private double prezzo;

    public EsLibro(String titolo, String autore, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo + ", Autore: " + autore + ", Prezzo: " + prezzo;
    }
}
       
        
        
        
    
  

