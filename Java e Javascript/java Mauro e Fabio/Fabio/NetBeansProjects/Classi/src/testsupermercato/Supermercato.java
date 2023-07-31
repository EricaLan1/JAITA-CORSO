
package testsupermercato;

import java.time.LocalDate;
import java.util.ArrayList;

public class Supermercato {
    private String codice_a_Barre;
    private String descrizione;
    private double prezzo;

    public Supermercato(String codice_a_Barre, String descrizione, double prezzo) {
        this.codice_a_Barre = codice_a_Barre;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        
    }
    
    public String getcodice_a_Barre(){
        return codice_a_Barre;
    }
    
    public void setcodice_a_Barre(String codice){ 
        this.codice_a_Barre = codice;
    }
    
    public String getdescrizione(){
    return descrizione;
    }
    
    public void setdescrizione(String descrizione){
        this.descrizione= descrizione;
    }
    
    public double getprezzo(){
        return prezzo;
    }
    
    public void setprezzo(double prezzo){
        this.prezzo = prezzo;
        }
    
    
        
    
    }

   class Cassa {
       ArrayList<Supermercato> spesa = new ArrayList<>();
        private LocalDate dataSpesa; //riprende la data di oggi
        
        public Cassa (){
            dataSpesa = LocalDate.now();
        }
        
        public void leggiProdotto(Supermercato supermercato){
            spesa.add(supermercato);
            
        }
        
        public void stampaScontrino(){
            System.out.println("Data della spesa"+dataSpesa);
            
            for (Supermercato supermercato : spesa) {
                System.out.println("Codice a barre: "+supermercato.getcodice_a_Barre());
                System.out.println("Descrizione: "+supermercato.getdescrizione());
                System.out.println("Prezzo: "+supermercato.getprezzo());
            }
        
            System.out.println("Totale: "+calcolaTotale());    
            
        
        }
        
        private double calcolaTotale(){
            double totale = 0;
            for (Supermercato supermercato : spesa) {
                totale += supermercato.getprezzo();
                
            }
            return totale;
        }
        
        
   }
