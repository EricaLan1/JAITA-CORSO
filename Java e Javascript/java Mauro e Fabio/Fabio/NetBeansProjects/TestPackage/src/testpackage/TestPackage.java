package testpackage;

import package2.Classe2; // importiamo classe 2 dal package 2

public class TestPackage {

    public static void main(String[] args) {
        
       Classe1 c = new Classe1(10, 20);
        System.out.println(c);
        
        //ora voglio stampare la classe 2 che si trova in un'altro package, dobbiamo importarla.
        
        Classe2 c2 = new Classe2("a", "b");
        System.out.println(c2);
        
        System.out.println(c2.getA());
        c2.c = "ciao"; // c lo vedo perche' definito pubblico dentro la classe c2
        
        
        
    }
    
}
