package testagenda;

public class Impegno {
    
    String descrizione;

    public Impegno(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Impegno{" + "descrizione=" + descrizione + '}';
    }
    
    
}
