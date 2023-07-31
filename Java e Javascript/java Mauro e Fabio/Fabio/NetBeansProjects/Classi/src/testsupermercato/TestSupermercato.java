
package testsupermercato;

import java.util.Scanner;

public class TestSupermercato {

    public static void main(String[] args) {
         
       // sei ricco paga
       
       Cassa cassa = new Cassa();
       Scanner s= new Scanner(System.in);
       
       boolean continua = true;
        while (continua) {            
            System.out.println("Inserisce il codice a barre del prodotto: ");
            String codice = s.nextLine();
            
            if (codice.equalsIgnoreCase("fine")) {
                continua = false;
                continue; // ricomincia il while
            }
            
            System.out.println("Inserisce la descrizione: ");
            String descrizione = s.nextLine();
            System.out.println("Inserisce il prezzo prodotto: ");
            double prezzo = s.nextDouble();
            
            s.nextLine();
            
            Supermercato prodotto = new Supermercato(codice, descrizione, prezzo);
                cassa.leggiProdotto(prodotto); // crearsi l'oggetto supermercato, per richiamarsi il prodotto e scansionarlo
                
        }
            cassa.stampaScontrino();
            s.close();
        
        
    }
    
}
