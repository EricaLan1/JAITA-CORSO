
package testprodotto;


public class Prodotto {
    private String codice;
      private String descrizione;
      private double prezzo;

    public Prodotto(String codice, String descrizione, double prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
    
    public void applicaSconto(int sconto){
        prezzo -= (prezzo*sconto)/100;
    }
    
    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "TestProdotto{" + "codice=" + codice + ", descrizione=" + descrizione + ", prezzo=" + prezzo + '}';
    }
}
