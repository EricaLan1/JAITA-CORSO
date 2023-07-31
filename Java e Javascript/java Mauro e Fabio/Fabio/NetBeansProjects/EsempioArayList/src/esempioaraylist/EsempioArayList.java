
package esempioaraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EsempioArayList {

    public static void main(String[] args) {
        int[]numeri={1,2,3,4,5};
        int[]valori=new int[5];
        valori[0]=1;
        valori[1]=2;
        
        ////////////////////////
        //Ho creato un arrayList di tipo Character. nelle parentesi angolari si mettono solo classi, non tipi primitivi. importArrayList
        ArrayList<Character>lettere= new ArrayList();
        lettere.add('a');
        lettere.add('b');
        lettere.add('c');
        System.err.println(lettere);
        //lettere e' un array dinamico che contiene degli elementi alll'interno
        
        lettere.add('d'); // quete cose con gli arrayprimitivi non la possiamo fare
        System.out.println(lettere);
        
        lettere.add(0,'e');// posso inserire anche il punto in cui voglio l'elemento. Aggiunge in posizione 0
        System.out.println(lettere);
        System.out.println("elemento alla posizione 2" +lettere.get(2));
        System.out.println("dimensione "+lettere.size()); //voglio vedere la dimensione
        for (int i = 0; i < lettere.size(); i++) {
        System.out.println(lettere.get(i));   
        }
        System.out.println("-----------------------");
        for (Character caratteri : lettere) {
            System.out.println(caratteri);
        }
        
        System.out.println("-----------------------");
        lettere.forEach(caratteri->System.out.println(caratteri));//gestione degli eventi, per ciascun elemento dell array,la parentesi accoglie un metodo
// ua funzione come perametro di un'altra funzione, la funzione e detta di callBack
        lettere.forEach(System.out::println); //una volta preso l'array per ciascun elemento, lo si stampa
/////////////////////////////////////////////
//contains ritorna true se l'elemento e' presente altrimenti false
    System.out.println(lettere.contains('e'));
    System.out.println("e' vuoto?"+lettere.isEmpty());
////////////////////////////////////////////
    Character[] c={'x','y','z'};
    ArrayList<Character>lettere2= new ArrayList(Arrays.asList(c));
        for (Character car : lettere2) {
            System.out.println(car);
        }
        lettere2.add('w');
        System.out.println(lettere2);
        
        lettere2.set(0,'r');//modifica un elemento alla posizione 0
        System.out.println(lettere2); //set modifica il valore dell'oggetto
///////////////////////////////
//ritorno da un arrayList ad un array normale
    Character[] x=new Character[lettere2.size()];//un array che conterra' i valori dell'array x
    lettere2.toArray(x);//converte l'arrayList in un array  
        for (Character elementi : x) {
            System.out.println(elementi);
        }
        
        System.out.println(Arrays.toString(x));//stampo i valori dell'array
////////////////////////////////////////////
//riepilogo metodi dell'arrayList
/*add(e) aggiungere un elemento alla lista
add(i.e)aggiunge l'elemento in posizione i
.size() ritorna la dimensione dell'arrayList
.remove(i) rimuove l'elemento all'indice i
.get(i) ritorna l'elemento alla posizioe i
-set(i) modifica l'elemento alla posizione i
.contains(e) cerca se l'elemento e' presente nell'arrayList
.isEmpty() ritorna verso se la lista e' vuota

*/

///////////////////////////////////////////
    ArrayList misto= new ArrayList();
    misto.add(1);
    misto.add("Ciao");
    misto.add(true);
    misto.add(3.14);
        System.out.println(misto);
        for (Object o: misto){
            System.out.println(o);
        }
    // object e' il padre, tutti i valori derivano dal padre    
        misto.forEach(o->System.out.println(o));//metodo semplificato di for
        
        
        ArrayList lista=new ArrayList();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        stampa(lista);
        stampa(misto);
        dimmiCiao();
        salutaQualcuno("Erica");
        
          }//main
   static void stampa (ArrayList parole){ //static appartiene alla classe e non dobbiamo creare new
//questo metodo deve prendere  in input un arrayList e ciclarlo
       for (Object valore : parole) {
           System.out.println(valore);
           
       }
   
   }
   static void dimmiCiao(){
       System.out.println("Ciao");
   
   }
   static void salutaQualcuno(String persona){
       System.out.println("ciao a "+persona);
   }
}
