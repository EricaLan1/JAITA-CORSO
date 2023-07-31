package testfrigorifero;

public class Cibo {
    private String nome;
    private double prezzo;

    //costruttore
    public Cibo(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //to string
    @Override
    public String toString() {
        return "Cibo{" + "nome=" + nome + ", prezzo=" + prezzo + '}';
    }

    
    
    
}
