package testgarage;

import java.util.ArrayList;
import java.util.Scanner;

public class TestGarage {

   
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.println("quanti posti ha il parcheggio?");
        
        int posti = s.nextInt();
        s.nextLine(); // per pulire il carattere di invio
        
        Garage garage1 = new Garage("Garage1");
        
        
        //parcheggiamo un veicolo alla volta
//        for (int i = 0; i < posti; i++) {
//            System.out.println("inserisci la macchina da parcheggiare");
//            garage1.parcheggia(new Macchina(s.nextLine(), s.nextLine()));
//        }
        
        //L'arrayList di veicoli da parcheggiare
        ArrayList<Macchina> veicoli = new ArrayList();
            for (int i = 0; i < posti; i++) {
            System.out.println("inserisci la macchina da parcheggiare");
            veicoli.add(new Macchina(s.nextLine(), s.nextLine()));
            
         }
        
        garage1.parcheggiaTutti(veicoli);
            
            
        System.err.println("il garage"+garage1.getNome()+"adesso ha i seguenti veicoli: ");
        garage1.elenco();
        
    }
    
}
