
package random;
import java.util.Random;

public class Dado {
    private String nome;
    private int punteggio;
    Random r;

    public Dado(String nome) {
        this.nome = nome;
        this.punteggio = 30;
        r =new Random();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio -= punteggio;
    }
  

    public int lancia() {
        return r.nextInt(1,7); //estremi superiori non compresi

    }
    
    public boolean perso(){
        return punteggio<=0;
    }
}

//---------------VERSIONE MARIO------------
//import java.util.Random;
//
//public class Dado{
//    private Random random;
//    private int giocatore1;
//    private int giocatore2;
//
//    public Dado(){
//        random = new Random();
//        giocatore1 = 30;
//        giocatore2 = 30;
//    }
//
//    public void lancia(){
//        int dadoGiocatore1 = random.nextInt(6)+1;
//        int dadoGiocatore2 = random.nextInt(6)+1;
//        System.out.println("Dado giocatore1 = " + dadoGiocatore1);
//        System.out.println("Dado giocatore2 = " + dadoGiocatore2);
//        if(dadoGiocatore1<dadoGiocatore2){
//            giocatore1-=dadoGiocatore2;
//        }else if(dadoGiocatore1>dadoGiocatore2){
//            giocatore2-=dadoGiocatore1;
//        }
//
//
//    }
//
//    public boolean perso(int punteggio){
//        return punteggio<=0;
//    }
//
//    public void visualizzaPunteggi(){
//        System.out.println("Punteggio giocatore1: "+giocatore1);
//         System.out.println("Punteggio giocatore2: "+giocatore2);
//    }
//
//    public static void main(String[] args) {
//        Dado gioco = new Dado();
//        boolean partita = true;
//        while (partita){
//            gioco.lancia();
//            gioco.visualizzaPunteggi();
//            if(gioco.perso(gioco.giocatore1)){
//                System.out.println("Giocatore1 ha perso!");
//                System.out.println("Giocatore2 ha vinto!");
//                partita = false;
//            }else if (gioco.perso(gioco.giocatore2)){
//                System.out.println("Giocatore2 ha perso!");
//                System.out.println("Giocatore1 ha vinto!");
//                partita = false;
//            }
//        }
//    }
//
//}