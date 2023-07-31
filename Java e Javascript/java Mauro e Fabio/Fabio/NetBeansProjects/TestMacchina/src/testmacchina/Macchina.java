
package testmacchina;

public class Macchina {
    
      //Attributi che definiscono le caratteristiche della mia classe
    private String marca;
    private String modello;
    private int prezzo;
    
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public void setModello(String modello){
        this.modello=modello;
    }
    
    public void setPrezzo(int prezzo){
        this.prezzo=prezzo;
    }
    
    
    
    
    Macchina(String marca, String modello, int prezzo){
        this.marca=marca;
        this.modello=modello;
        this.prezzo=prezzo;
    }
    
    //Metodi rappresentano cosa la classe può fare
    
    public void guida(){
        System.out.println("sto guidando");
    }
    
    public void frena(){
        System.out.println("sto frenando");
    }
    
    @Override
    public String toString(){
        return marca+" "+modello+" "+prezzo;
    }
    
    
}
