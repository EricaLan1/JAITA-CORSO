/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova.fabio;
public class ProvaFabio {
    
    public static void main(String[] args) {
      // TODO code application logic here
        
        System.out.println("ciao!");
        int eta=23;// variabile eta con numero intero senza virgole.
        double temperatura= 27.5;//variabile con la virgola, double che contiene decimali
        //i caratteri vanno tra apici singoli
     char lettera= 'c';          
     String parole= "ciao"; 
//Un insieme di lettere. Una stringa va tra doppi apici. String maiuscolo è ua classe
     boolean veroFalso=true; 
//false, ovviamente falso 
byte b;//-128 +127 in tutto sono 65000 2^8=256 1byte 8bit
//-128 +127 in tutto sono 65000 2^8=256 1byte 8bit
short sh; //-32768 +32767 in tutto sono 65000 2^16
//-32768 +32767 in tutto sono 65000 2^16
int i;// -2 miliardi + 2miliardi tipo di dato predefinito
// -2 miliardi + 2miliardi tipo di dato predefinito
long lunga= 10L;//aggiungo una L dopo il valore per forzare il tipo a long, altrimenti java tente a portare tutto a int
//Un insieme di lettere. Una stringa va tra doppi apici. String maiuscolo è ua classe
 
boolean verofalso= true; //false, ovviamente falso 
 
 long num=10L;//aggiungo una L dopo il valore per forzare il tipo a long, altrimenti java tente a portare tutto a int

int primoNumero=10;
int secondoNumero=20;

int somma= primoNumero+secondoNumero;

System.out.println("il risultato e"+ somma);

int sottrazione= primoNumero-secondoNumero;
System.out.println("la sottrazione vale "+sottrazione);


double num1=10;
double num2=20;

int moltiplicazione=primoNumero*secondoNumero;
int divisione=primoNumero/secondoNumero;
System.out.println("la moltiplicazione vale "+moltiplicazione);
System.out.println("la divisione vale "+divisione);


//Primitivi con la virgola

float f= 1.5F; //forzo il tipo di dato con la F
double d=3.14;

//Tipi primitivi di carattere
char a= 'a'; //i caratteri con apice singolo
char b2= 'b';
//tabella ascii che codifica ciascun carattere con un codice numerico
 
char c=++b2; // ++ vuol dire che aumento di 1, attenzione all'ordine di operatore 
// il ++ davanti si chiama operatore di pre incremento esce in questo caso b
//il ++dietro si chiama operatore di post incremento esce in questo caso c
System.out.println (c);

char aMaiuscola=65;
System.out.println(aMaiuscola); //A
++aMaiuscola;

System.out.println(aMaiuscola); // deve uscire B

boolean vero= true;
boolean falso=false;

int anni=10;
boolean maggiorenne=anni>18;
System.out.println(maggiorenne); //con il ! nego la condizione seguente

//COSTANTE
final double PIGRECO=3.14;

//pigreco=15.5;Non posso modificare il valore di una costante

int i1=56;
long I1=i1;

int a1=10;
double d2=a1;

long I2= 56L;
int i2 = (int)12;//cast esplicito

double d3=3.999999999; //mi da errore quindi si usa int per farlo lo stesso e perdere dei dati
int i3= (int)d3;
System.out.println (i3);

int i4=10;
short valore= (byte) (short) i4;

char carattere='a';

int codice= (int)carattere;
System.out.println(codice);

codice=codice+1; //aumento di 1, metodo base ridondante 
codice++; //aumento di 1, metodo semplificato
codice+=5; // aumento di 1, metodo semplificato. Posso inserire l'operatore che voglio in questo caso 5, diviso, moltiplicazione, sottrazione, addizione
System.out.println(codice);  

//posso fare il contrario dal codice posso risalire al carattere

char car=(char)codice;
System.out.println(car); 

/////////////////////////////////
int x=10;
System.out.println(x++); // 10 post incremento, prima stampo e poi incremento
System.out.println(x); //11 

System.out.println(++x); //11 pre icnremento
////////////////////////////////
int var1=3;
int var2=8;
System.out.println(var1+" "+var2);  //3 8

int var3=var2; //var3 è una variabile temporale
var2=var1;
var1=var3; //questo è lo scambio tra due variabili
System.out.println(var1+" "+var2);  //8 3

/////////////////////////////////////////
//esercizio. Programma che calcola l'area del cerchio pi*r*r con raggio a piacere. Definire una costante pi, dichiarere una variabile raggio a piacere con valore a piacere. Dichiarare la variabile area, e infine stampare a video tutte le variabili

    }
    
}
