
package testpersona;

import java.util.ArrayList;
import java.util.List;

public class Testpersona {

    public static void main(String[] args) {
        
        
    //la classe è un tipo di dato astratto che ci siamo fatti noi
        Persona p = new Persona();
        
        p.setNome("Erica");
        p.setCognome("Landolfo");
        p.setEta(24);
        p.setAltezza(1.64);
        
        System.out.println(p.getNome());//Fabiola
        System.out.println(p.getCognome());//Riccardi
        
//        System.out.println(p.NUMERO_OCCHI);
        
        p.mangia("pizza");
        p.dorme();
        p.dorme(8);
        p.mangia("insalata", "pizza");
        System.out.println("è maggiorenne? " +p.isMaggiorenne());
        
        System.out.println(p);
        
        
        
        Persona p2= new Persona();
//        p2.nome="Giuseppe";
//        p2.cognome="Verdi";
//        p2.eta=10;
//        p2.altezza=1.65;
        p2.mangia("dolce");
        p2.dorme();
        p2.dorme(5);
        p2.mangia("pollo", "pasta");
        System.out.println("è maggiorenne? "+p2.isMaggiorenne());
        System.out.println(p2);
//        System.out.println(p2.toString(10));
        
        Persona p3= new Persona();//metodo costruttore serve per creare l'oggetto
        
//        p3.nome="pinco";
//        p3.cognome="pallo";
//        p3.eta=20;
//        p3.altezza=1.70;
        
        System.out.println(p3);//toString()
        
        //Il costruttore è un metodo che si chiama come la classe ma non ritorna nessun valore
        //quando devo creare un oggetto devo chiamare il costruttore
        
        
        Persona p4 = new Persona();//chiamo il costruttore
        
        //chiamo il costruttore come i parametri
        Persona p5 = new Persona("laura", "bianchi", 20, 1.80);
        System.out.println(p5);//toString()
        
        Persona p6 = new Persona("Aldo", "Baglio");
//        p6.altezza=1.70;
//        p6.eta=30;
        System.out.println(p6);
        
        Persona p7= new Persona("Fabiola", "Riccardi", 24, 1.64);
        p7.mangia("pasta", "carne");
        System.out.println(p7.isMaggiorenne());
        System.out.println(p7);    
        
        
        
        
        
        
// // le classi come oggetto teorico non e' nient'altro che un progetto
// //dell'entita' che vogliamo realizzare. Tutte le macchine che creo' avranno le stesse caratteristiche. 
//    
//    int x= 10;
//        System.out.println(x); //stampo 10
//    //la classe e' un tipo di dato astratto che ci siamo fatti noi.
//    Persona p= new Persona(); //vado a riprendeere la classe persona che abbiamo aperto altrove.
//    p.nome= "mario";
//    p.cognome= "rossi";
//    p.eta= 30;
//    p.altezza= 1.70;
//            System.err.println(p.NUMERO_OCCHI);
//            
//    p.mangia("pasta");
//    p.dorme();
//    p.dorme(8);
//    
//    p.mangia("insalata", "pizza");
//        System.out.println("e' maggiorenne?"+p.isMaggiorenne());
//        System.out.println(p);
//    
//    Persona p2= new Persona();
//    p2.nome= "giuseppe";
//    p2.cognome= "verdi";
//    p2.eta= 80;
//    p2.altezza= 1.65;
//    p2.mangia("carne");
//    p2.dorme();
//    p.dorme(5);
//    
//    p2.mangia("pollo ","pasta");
//    
//        System.out.println("e' maggiorenne?"+p2.isMaggiorenne());
//        System.out.println(p2);
//        
////        System.out.println(p2.toString
////        (10));
//
//    Persona p3= new Persona();// con le parentesi tonde e' un costruttore serve per creare l'oggetto
//    p3.nome="pinco";
//    p3.cognome="pallo ";
//    p3.eta= 20;
//    p3.altezza= 1.70;
//        System.out.println(p3);
//        
//    // il costruttore e' un metodpoche si chiama come la classe ma non ritorna nessun valore. Quando devo creare un oggetto devo chiamare il costruttore.
//    
//    Persona p4= new Persona();//chiamo il costruttore
//    Persona p5= new Persona("laura", "bianchi", 20, 1.80);
//        System.out.println(p5); //toString()
//        
//        Persona p6= new Persona("aldo", "baglio");
//        p6.altezza=1.70;
//        p6.eta=30;
//        System.out.println(p6);
//
//    
//        Persona p7= new Persona("Fabio", "Pilegg", 48, 1.71);
//        p7.mangia("pasta", "carne");
//            System.out.println(p7.isMaggiorenne());
//            System.out.println(p7);
//        
        
        
        
       
    }
    
}
