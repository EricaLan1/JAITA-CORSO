package testfrigorifero;

import java.util.ArrayList;
import java.util.Arrays;

public class TestFrigorifero {

    
    public static void main(String[] args) {
       //il nostro frigo contiene  un Array di cibi
       
       Cibo[] arrCibi= new Cibo[3];
       
       Cibo cibo1 = new Cibo("formaggio",2);
       Cibo cibo2 = new Cibo("insalata",3);
       Cibo cibo3 = new Cibo("uova",2);
        
       
      arrCibi[0] = cibo1;
      arrCibi[1] = cibo2;
      arrCibi[2] = cibo3;
      
        System.out.println("nel frigorifero ci sono i seguenti cibi");
        
        ////////////////
        for (Cibo cibo: arrCibi) {
            System.out.println(cibo);//to string()
            
        }
        ///////////////////////////////
        
        
        //hio trasformato un arrray in un arrayList
        Cibo[]frigorifero={cibo1,cibo2,cibo3};
        
        for (Cibo cibo: frigorifero) {
            System.out.println(cibo);//to string()
            
        }
      ArrayList<Cibo> lista = new ArrayList(Arrays.asList(frigorifero));
      lista.add(new Cibo("pasta",2));
      
      for (Cibo cibo: lista){
          System.out.println(cibo);
          
      }
    }
    
}
