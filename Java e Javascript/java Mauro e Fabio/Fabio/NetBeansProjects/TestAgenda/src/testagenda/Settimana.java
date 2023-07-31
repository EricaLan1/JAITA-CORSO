
package testagenda;

public class Settimana {
    // questa e' una serie di giorni
    Pagina[] pagine; //array di pagine, a sua volta e' un array di impegni

    public Settimana() {// l'ingresso non deve ricevere nulla perche' ha 7 pagine vuote che prende in input
        this.pagine = new Pagina[7]; //nel costruttore, giorni della settimana. Definizione di un array new Pagina in cui dichiariamo il numero della settimana
    }

    public Pagina[] getPagine() {
        return pagine;
    }
    
    
    
}
