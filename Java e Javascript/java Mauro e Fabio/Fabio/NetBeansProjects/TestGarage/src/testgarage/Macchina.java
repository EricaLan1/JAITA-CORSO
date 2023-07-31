package testgarage;

public class Macchina {
    
    private String marca;
    private String modello;

    public Macchina(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }
    // encapsulate fields che ci siamo dimenticati di mettere privato nel costruttore
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Macchina{" + "marca=" + marca + ", modello=" + modello + '}';
    }
    
    
    
    
    
    
}
