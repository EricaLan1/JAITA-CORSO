package testagenda;

public class Pagina {
    String giorno;
    Impegno[] impegni; //array

    public Pagina(String giorno, Impegno[] impegni) {
        this.giorno = giorno;
        this.impegni = impegni;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public Impegno[] getImpegni() {
        return impegni;
    }

    public void setImpegni(Impegno[] impegni) {
        this.impegni = impegni;
    }

    @Override
    public String toString() {
        String pagina= "Pagina del giorno "+giorno; // to string modificato per definire una variabile pagina
        for (int i = 0; i < impegni.length; i++) {
            pagina +="\n" +impegni[i].descrizione;
        }
        return pagina; // tutta la descrizione degli impegni di quel giorno. Definito impegno, pagina della agenda che rappresenta un giorno ed una serie di impegni
    }
    
    
}
