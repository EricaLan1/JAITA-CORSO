package esercizio02;

public class esercizio02 {

    
    public static void main(String[] args) {
        
        Dipendente d= new Dipendente("ugo",2000);
        d.setEta(48);
        d.aumento(10);
        
        Dipendente d1= new Dipendente("Gino",3000);
        d1.setEta(55);
        d1.aumento(10);
        
        Dipendente d2= new Dipendente("Marco",4000);
        d2.setEta(60);
        d2.aumento(10);
        
        Dipendente[] arrDip={d,d1,d2};
        
        int tot= 0;
        for (Dipendente dipendente: arrDip) {
            System.out.println(dipendente);
            tot+= dipendente.getStipendio();
        }
        System.out.println("il totale e' "+tot);
    }
    
}
