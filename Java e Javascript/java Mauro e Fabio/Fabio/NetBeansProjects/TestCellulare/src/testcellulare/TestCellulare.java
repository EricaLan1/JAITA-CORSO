
package testcellulare;

import java.util.HashSet;
import java.util.Set;

public class TestCellulare {

    public static void main(String[] args) {
       
       Cellulare nokia = new Cellulare("nokia","3310",20.0); //costruttore si riferisce a pubblic Cellulare in  
            System.out.println(nokia);// toString()
        
        nokia.Chiamata(20.0);
        
            System.out.println(nokia);
            
            System.out.println("ho finito i soldi?"+nokia.creditoEsaurito());//possiamo vedere se il credito e' esaurito
            System.out.println(nokia.getNumeroChiamate());
            nokia.Chiamata(10);
            System.out.println(nokia);
            nokia.setCredito(0);// qui azzeriamo il credito
            nokia.Chiamata(10);
            nokia.ricarica(20);//ricarico per 20
            nokia.Chiamata(10);//chiamo per 10 minuti
        
        
    }
    
}
