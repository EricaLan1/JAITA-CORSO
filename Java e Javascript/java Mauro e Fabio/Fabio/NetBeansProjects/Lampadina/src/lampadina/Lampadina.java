
package lampadina;

public class Lampadina {
    
    private boolean acceso;
    private int nAccensioni=0;

    public Lampadina(boolean acceso){
        this.acceso = acceso;
    }
    
    public void click(){
        this.acceso=!acceso;//sto invertendo lo stato del booleano
        nAccensioni++;//incremento io numero di accensioni
    }
    
    //dopo 3 accensioni la lampadina si rompe
    public boolean isRotta(){
        return nAccensioni>=3;
    }
    
    
    public String stato(){
        
        if (isRotta()){
            return "lampadina rotta!";
        }
        
        return acceso?"Accesa":"spenta"; //operatore ternario, serve a semplificare un if else semplice come nell'esempio, complicato no
        
//        if (acceso){
//            return "accesa";
//        }
//        else{
//            return "spenta";
//        }
        
    }
    
    public class TestLampadina {
    

    public static void main(String[] args) {
    
       Lampadina l= new Lampadina(true);//accesa
        System.out.println(l.stato());
        l.click();//spenta
        System.out.println(l.stato());

        l.click();//accesa
        System.out.println(l.stato());
        
        l.click();//rotta
        System.out.println(l.stato());
        
        l.click();//rotta
        System.out.println(l.stato());
   
    }
    
    }
}




