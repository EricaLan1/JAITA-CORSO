package inpututente;

import java.util.Scanner;//stiamo dicendo a java di andare a prendere lo scanner


public class InputUtente {

    public static void main(String[] args) {
        
Scanner s=new Scanner(System.in); 
System.out.println("Come ti chiami?");
String nome=s.nextLine();
System.out.println("hai scritto "+nome);
 System.out.println("quanti anni hai?");
int anni=s.nextInt();
 System.out.println("hai "+anni+" anni");
s.nextLine();//ha lo scopo di raccogliere il carattere di invio. In quanto nella riga sopra anni il numero in int non raccoglie l'invio e lo sposta in colore impedendoci di scrivere. con nextline inseriamo l'invio lì
       System.out.println("colore preferito");
      String colore=s.nextLine();
       //System.out.println("il tuo colore è "+colore);
        ///////////////////////////////////////////////
// System.out.println("inserisci l'eta");
// int eta=s.nextInt();
// 
// if (eta>=18){ //booleana
//    System.out.println("Sei maggiorenne puoi entrare");//ramo vero 
// }
// else{
//     System.out.println("non sei maggiore non puoi entrare");//ramo falso. I rami devono essere separati altrimenti se il falso e nel ramo del vero, nel running escono entrambe le condizioni
// }
// 
// int num=5;
// if (num>5){
//     System.out.println("il numero è maggiore di 5");
//  }else if (num==5){ // nel caso abbiamo più condizioni else if
//      System.out.println("il numero è proprio 5");
//  }else{ 
//      System.out.println("il numero minore è di 5");
//      }
// 
//int temperatura= 19;
//if (temperatura>30){
//    System.out.println("accendi condizionatore");
//}else if (temperatura<15){
//    System.out.println("accendi i riscaldamenti");
//}else{
//    System.out.println("si sta bene, non fare niente");
//}
/////////////////////////////////////////////////
//programmino che prende in input dall'utente 2 numeri e li divide.
//fare attenzione se l'utente inserisce 0 come secondo numero
//se l'utente inserisce 0 come secondo numero, comunicare che non si può dividere per 0
//System.out.println("primonum");
//int primo=s.nextInt();
//System.out.println("Secondonum");
//int secondo=s.nextInt();
//
//if (secondo==0){
//    
//    System.out.println("non puoi eseguire ");
//}else{
//    int risultato=primo/secondo;
//    System.out.println("il risultato della divisione è:" +risultato);
//}
/////// chiedere all'utente 4 numeri e ne calcola la somma. Stampare il risultato, dovete usare solo 2 variabili in tutto il programma.
        //scanner ti permettere di ricevere quello che l'utente scrive nella tastiera(che sarebbe System.in)Questo è un costruttore.
        
// int tot= 0;
// System.out.println("inserisci il primo numero");
// tot+=s.nextInt();
// System.out.println("inserisci il secondo numero");
// tot+=s.nextInt();
// System.out.println("inserisci il terzo numero");
// tot+=s.nextInt();
// System.out.println("inserisci il quattro numero");
// tot+=s.nextInt();
// 
// System.out.println("il totale è"+tot);

 //////////////////////
 //OPERATORI LOGICI
 //AND && ritorna vera se TUTTE E 2 SONO VERE NELLO STESSO MOMENTO
 //OR ||
 
// boolean sole=true;
// int temp=25;
// 
// boolean test=(10>8&&7<6);//falso
// boolean test2=(10>8||7<6);//vero
// System.out.println(test);
//
// if(sole==true && temp>20){
//     System.out.println("esco");
// }else{
// System.out.println("sto a casa");
//  }
 
 ////////////////////////////////////////
 
// int voto1=6;
// int voto2=5;
// int voto3=10;
// 
// //la && ha la priorità sulla or
// 
// //posso cambiare l'ordine di esecuzione con le parentesi
// //per bocciare il tizio
// 
// if((voto1>=6||voto3>=6)&&voto2>=6){ //vera
// System.out.println("promosso");
//}else{
//     System.out.println("bocciato");
// }

 //la && detta and, unisce due condizione cosi il risultato di tutto diventa vero
 //la || detta or, tra le due condizione ne basta solo una vera 
 
 //////////////////////
 
//CARTA FORBICE SASSO
 
 
 
 
}
}
