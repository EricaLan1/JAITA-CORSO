
package wile.ciclo;
import java.util.Random;
import java.util.Scanner;
public class WileCiclo {

    public static void main(String[] args) {
       
         for (int i=0;i<10;i++){//genero 10 numeri da 0 a 9
             System.out.println(i);
             
            }
         for(int i=0;i>=0;i--){
         System.out.println(i);
            }
         
         for(int i=0;i<10;  i+=2){
         System.out.println(i);
            }
        
         int contatore=0;
         for (; contatore<10;){
             System.out.println(contatore);
             contatore++;
             
         }
         
      /////////////////////////////////////////////////
      //CICLO FOR DESTRUTTURATO
      int contatore1=0;
      for (;contatore<10;){
          System.out.println(contatore);
          contatore++;
      }
     /////////////////////////////////////////
        for(int i=0, j=10; i<10; i++,j--){
        System.out.println("i= "+i+"j="+j);
        }// for con 2 indici. La prima variabile aumenta, la seconda si diminuisce.
        
 ////////////////////////////////////////////////////
        for(int i=0; i<256; i++){
            System.out.println(i+": "+(char)i);
        }
         
 /////////////////////////////////////
              //0  1 2 3 4
    int[]numeri={1,2,3,4,5}; //abbreviata
    System.out.println(numeri[0]);
    System.out.println(numeri[1]);
    System.out.println(numeri[2]);
    System.out.println(numeri[3]);
    System.out.println(numeri[4]);
    
    System.out.println(numeri.length);
    
    for(int i=0;i<numeri.length;i++){
        System.out.println();
    }
    
//    
//     for(int i=0; i<numeri.length; i++){
//         System.out.println(numeri[i]);
//    }
//     
//     for( int valore:numeri){// for migliorato. Per iogni valore nell'aray numeri mettilo nella variabile valore
//         System.out.println(valore);
//     }
//
////////////////////////////
    String frase="ciao a tutti oggi e' una bella giornata";
    int numerSpazi=0;
    for(int i=0; i<frase.length(); i++){
    if (frase.charAt(i)==' '){
            numerSpazi++;
         }
    }   
    System.out.println("numero spazi= "+numerSpazi);
    ////////////////////////////////
    boolean trovato=false;
    Random r= new Random();
    int casuale=r.nextInt(1,21);//numero casuale da 1 a 20
    System.out.println("il numero casuale e' "+casuale);
    for(int i= 1; i<=10; i++){
        if(casuale==1){//cerco un avalore casuale tra i valori del ciclo for
            trovato= true;//se l'ho trovato
            break;//esco
            
        }
    }
    if (trovato){
        System.out.println("il numero e' stato trovato");
    }else{ 
        System.out.println("il numero non e' stato trovato");
    } 
    //////////////////////////////////
// ciclo while
    int contatore2=0;
    while(contatore2<10){// fatto in cima
        System.out.println(contatore2);
        contatore2++; // inserire solo la condizione, non si mette il ;
    }
 ////////// DO WHILE////////
 //Se la condizione' e' falsa il ciclo almeno 1 volta si ripete
    int contatore3=0;
    do{
        System.out.println(contatore3);
        contatore3++;
    }while (contatore3<10);//il test e' fattoi in coda. Si usa quando non coosco il numero di ripetizioni. Quanti record ha un database prima di esporli, casi frequenti. 
        
 /////////////////////////////
 // continuo a chiedere valori fiche' l'utente non mette 0
    Scanner s= new Scanner(System.in);  
    do{ System.out.println("inserisci un numero, 0 per uscire");
    
    }while(s.nextInt()>0);
    
   //////////////////////
   //switch serve per semplificare delle if
        int i=3;
        if (i==0){ //case
            System.out.println("I =0");
        }else if (i==1){
        System.out.println("i==1");
         }else if(i==2){
             
         }else{
             System.out.println("i e' diverso da 0,1,2");
         }
        
        
        ///////////////////////////
        
        switch(i){ // puo' essere char, string, numerico int short,NNON puo' essere con la virgola. NO DOUBLE NO FLOAT NO BOOLEAN
            case 0:
                System.out.println("i==0");
                break;
            case 1:
                System.out.println("i==1");
                break;
            case 2:
                    System.out.println("i==2");
                    break;
            default:
                    System.out.println("i e' diverso da 0,1,2");
        }
        
      ////////////////////
      String lettera="i";
      switch(lettera){
          case "a"://else if,come se
          case "e":
          case "i":
          case "o":
          case "u":
           System.out.println(lettera+" e' una vocale");
           break;
             default://else, come se
             System.out.println(lettera+" e' una consonante");
      }
        
        
        
        
        
        
        
        
    }
    
}
