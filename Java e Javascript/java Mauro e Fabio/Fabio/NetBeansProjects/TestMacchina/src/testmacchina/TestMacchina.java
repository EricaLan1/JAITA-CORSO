
package testmacchina;

public class TestMacchina {

    public static void main(String[] args) {
       
        Macchina m= new Macchina("Fiat", "Panda", 12000);//costruttore
        m.guida();
        m.frena();
        
        m.setPrezzo(13000);//ho cambiato il valore dell'attributo prezzo
        System.out.println(m);//toString() 
        
        
        
        
    }
    
}
