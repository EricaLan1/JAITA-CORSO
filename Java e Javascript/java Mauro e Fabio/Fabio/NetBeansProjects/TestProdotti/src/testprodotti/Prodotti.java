package testprodotti;

public class Prodotti {
    
     
    private String descrizione;
    private int codice;
    private double prezzo;
    
    public Prodotti(String descrizione,int codice, double prezzo){
        this.descrizione = descrizione;
        this.codice = codice;
        this.prezzo=prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    public void applicaSconto(double percentuale){
       
         prezzo -= (prezzo*percentuale)/100;
         System.out.println("Sconto "+ percentuale + "%");
        
     }
    

    @Override
    public String toString() {
        return "Prodotti{" + "descrizione=" + descrizione + ", codice=" + codice + ", prezzo=" + prezzo + '}';
    }
    
}
