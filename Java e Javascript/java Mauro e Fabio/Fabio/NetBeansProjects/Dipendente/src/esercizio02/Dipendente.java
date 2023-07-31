package esercizio02;

public class Dipendente {
    private String nome;
    private int eta;
    private double stipendio;
    

    public Dipendente() {
        
    }

    public Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }
    
   public double aumento(double percentuale){
       if(eta > 50 ){
           stipendio += (stipendio * percentuale)/100;
           System.out.println("aumentato stipendio del "+percentuale+"%");
           
       }else{
           System.out.println("Stipendio non concesso");
       }
        return 0;
       
   }
   
   @Override
public String toString() {
        return "Dipendente{" + "nome=" + nome + ", eta=" + eta + ", stipendio=" + stipendio + '}';
    }
    
            
}
