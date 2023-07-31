
package random;

public class TestDado {
    public static void main(String[]args){
        
    Dado giocatore1= new Dado("mario ");
    Dado giocatore2= new Dado("gino ");
    
    System.out.println(giocatore1.getPunteggio());
    System.out.println(giocatore2.getPunteggio());
    
    
    // se ce n'e uno falso la && ritorna falso e il ciclo si iterrompe
    while((!giocatore1.perso()) && (!giocatore2.perso())){
        int lancioG1= giocatore1.lancia();
        int lancioG2= giocatore2.lancia();
                
        
        System.out.println("mario " +lancioG1+ " gino "+lancioG2);
        
        if(lancioG1>lancioG2){
            giocatore2.setPunteggio(lancioG1);
            System.out.println("gino perde "+lancioG1+" punti. Ne rimangono "+giocatore2.getPunteggio());
            
        }else if(lancioG2>lancioG1){
            giocatore1.setPunteggio(lancioG2);
            System.out.println("mario perde "+lancioG2+" punti.Ne rimangono "+giocatore1.getPunteggio());
        }else{
            System.out.println("pareggio ");
        }
        
         }
    }
}