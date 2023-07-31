
package testprodotto;

import java.util.ArrayList;

public class TestProdotto {

    public static void main(String[] args) {
      
     Prodotto p= new Prodotto ("ab123", "mouse",10);
     
        System.out.println(p);
        p.applicaSconto(10);
        System.out.println(p);
        
        System.out.println("**************************");
    
        ArrayList<Prodotto> arrProdotti = new ArrayList();
        Prodotto p2= new Prodotto("ab124", "penna",2);
        Prodotto p3= new Prodotto ("ab125", "tavolo",40);
        
        arrProdotti.add(p);
        arrProdotti.add(new Prodotto("ab124","penna",2));
        arrProdotti.add(p3);
        
        for (Prodotto prodotto : arrProdotti) {
            System.out.println(prodotto);
            prodotto.applicaSconto(10);
            System.out.println(prodotto);
        }
        
        
        
        }
    }
    

