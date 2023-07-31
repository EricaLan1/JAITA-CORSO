package testprodotti;

public class TestProdotti {

    public static void main(String[] args) {
      
        Prodotti p = new Prodotti("latte", 01, 3);
        p.applicaSconto(10);
        
        Prodotti p1 = new Prodotti("uova", 02, 2.50);
         p1.applicaSconto(15);
         
        Prodotti p2 = new Prodotti("acqua", 03, 4);
        
        System.out.println(p.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
