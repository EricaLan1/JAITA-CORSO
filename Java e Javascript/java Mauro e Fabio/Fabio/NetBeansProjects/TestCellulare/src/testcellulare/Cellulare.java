package testcellulare;

public class Cellulare {
    private String marca; // Costruttore. il privato serve a rendere gli attributi nascosti al di fuori della classe
    private String modello;
    private int numeroChiamate;
    private double credito;
    
    private final double PREZZO_AL_MINUTO =0.20; //le costanti maiuscole e final
    
    /**
     * Costruttore della classe Cellulare
     * @param marca String
     * @param modello String
     * @param credito double
     */
    public Cellulare(String marca,String modello, double credito){
        this.marca = marca;
        this.credito = credito;
        this.modello = modello;
    
    }
    
    /**
     * Questo metodo serve per ricaricare il cellulare
     * @param soldi importo della ricarica
     */
    public void ricarica(double soldi){
        credito += soldi;
    }
    
    
    
    /**
     * effettua una chiamata, scala i crediti e incrementa il numero delle chiamate
     * @param minutiDurata quanto dura una chiamata
     */
    public void Chiamata(double minutiDurata){
        
        if(creditoEsaurito()){
        System.out.println("hai finito i soldi non puoi piu' telefonare");
        }else{
        credito -= (PREZZO_AL_MINUTO * minutiDurata);
        numeroChiamate ++; // quando dichiariamo voi non ritorno niente altrimenti si potrebbe fare con il boolean o il String
        
        System.out.println("adesso hai "+getCredito()+" euro");
                }
    }
    
    
    
    
    public boolean creditoEsaurito(){
        return credito <=0;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }

    
    // tasto destro insert code e ti selezioni costruttore, getter ed altro automaticamente
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumeroChiamate() {
        return numeroChiamate;
    }

    public void setNumeroChiamate(int numeroChiamate) {
        this.numeroChiamate = numeroChiamate;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    
    
    
    
    //insert code, toString 
    @Override
    public String toString() {
        return "Cellulare{" + "marca=" + marca + ", modello=" + modello + ", numeroChiamate=" + numeroChiamate + ", credito=" + credito + ", PREZZO_AL_MINUTO=" + PREZZO_AL_MINUTO + '}';
    }
    
    
    
}
