package testgarage;

import java.util.ArrayList;

public class Garage {
    
   private String nome;
   //Un Arraylist di macchine nel garage
   private ArrayList<Macchina> macchine = new ArrayList();
   
    //costruttore
    public Garage(String nome){
        this.nome = nome;
       
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * metodo che parcheggia un veicolo alla volta
     * @param veicolo la macchina che devo parcheggiare
     */
    public void parcheggia(Macchina veicolo){
        macchine.add(veicolo);
    }
    
    
    /**
     * metodo che parcheggia un insieme di veicoli alla volta
     * @param veicoli l'ArrayLIst di macchine da parcheggiare
     */
    // ciclo for per parcheggiare tutti
    public void parcheggiaTutti(ArrayList<Macchina> veicoli){
        for (int i = 0; i < veicoli.size(); i++) {
            macchine.add(veicoli.get(i));// qui prendo il simbolo veicolo
        }
    }
       
        /*
        metodo che elenca i veicolo presenti nell'ArrayList garage
        */
        public void elenco(){
            for (Macchina macchina: macchine){
                System.out.println(macchina.getMarca()+" "+macchina.getModello());
            }
        }
        
        
    }
    
    

