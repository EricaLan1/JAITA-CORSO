package testpersona;

public class Persona {
    
    //INCAPSULAMENTO: rendere privati gli attributi e creare i metodi get e set per leggere e modificare gli attributi
    private String nome;
    private String cognome;
    private int eta;
    private double altezza;
    private final int NUMERO_OCCHI = 2;
    
    //METODI che rappresentano cosa l'oggetto può fare
    
    //i metodi get servono per leggere i valori degli attributi
    public String getNome(){
        return nome;
    }
    
    
    public String getCognome(){
        return cognome;
    }
    
    public int getEta(){
        return eta;
    }
    
    public double getAltezza(){
        return altezza;
    }
    
    public int getNumeroOcchi(){
        return NUMERO_OCCHI;
    }
           
    
    
    
    //i metodi set assegnano i valori agli attributi
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    
    public void setEta(int eta){
        this.eta=eta;
    }
    
    public void setAltezza(double altezza){
        this.altezza=altezza;
    }
    //Il costruttore è un metodo che ha lo stesso nome della classe ma non ritorna niente, neanche void
    //E' sempre presente perchè deriva da Object come toString()
    Persona(){
        System.out.println("Hai creato l'oggetto");
    }
    
    
    //Overload del costruttore
    /**
     * Costruttore con tutti i parametri
     * @param nome Stringa
     * @param cognome Stringa
     * @param eta intero
     * @param altezza double
     */
    public Persona(String nome, String cognome, int eta, double altezza){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.altezza=altezza;
    }
    
    //overload del costruttore con 2 parametri
    /**
     * Costruttore che utilizza due parametri
     * @param nome di tipo stringa
     * @param cognome di tipo stringa
     */
    public Persona(String nome, String cognome){
        this.nome=nome;
        this.cognome=cognome;
    }
    
    //OVERLOAD
    /**
     * Questo metodo serve per far mangiare la persona
     * @param cibo di tipo stringa
     */
    public void mangia(String cibo){
        System.out.println("Sto mangiando "+ cibo);
}
    
    /**
     * Questo metodo serve per far mangiare a pranzo e a cena
     * @param pranzo String
     * @param cena String
     */
    public void mangia(String pranzo, String cena){
        System.out.println("A pranzo mangio "+pranzo+" a cena mangio "+cena);
    }
            
            
    //I metodi che hanno lo stesso nome ma diversi parametri si chiamano OVERLOAD
    //nome + parametri = FIMRA DEL METODO
    public void dorme(){
        System.out.println("zzzzzzzzzzzz");
    }
    
    public void dorme(int numero_ore){
        System.out.println("dormo "+numero_ore+" ore");
    }
    /**
     * Metodo che controlla se una persona è maggiorenne
     * @return ritorna vero se l'età è >= 18
     */
    public boolean isMaggiorenne(){
        return eta>=18;
    }
    
    //Appartiene alla classe Object
    //La classe Object è la classe principale di Java
    //tutte le classi che facciamo noi derivano dalla classe Object
    
    @Override //sovrascrive il metodo toString di Object
    public String toString(){
        return "la persona si chiama "+ nome+" "+cognome+
                "ha "+eta+"anni "+
                " è alto"+altezza+" cm"+
                " ha come tutti "+NUMERO_OCCHI+" occhi";
                
    }
    
//    public String toString(int x){
//        return "la persona si chiama "+ nome+" "+cognome+
//                "ha "+eta+"anni "+
//                " è alto"+altezza+" cm"+
//                " ha come tutti "+NUMERO_OCCHI+" occhi"+
//                "x= "+x;
    
    
    
    
    
    
    
    //Attributi della classe persona
//    public String nome;
//    public String cognome;
//    public int eta;
//    public double altezza;
//    public final int NUMERO_OCCHI= 2; //costante in java FINAL
//    
//    //METODI che rappresentano cosa l'oggetto puo' fare
//    
//    public void mangia(String cibo){
//        System.err.println("Sto mangiando "+ cibo);
//    }
//    // il costruttore e' un metodo che ha lo stesso nome della classe ma non ritorna nulla.E' sempre presente perche' deriva da Object come ToString()
//    Persona(){
//        System.out.println("hai creato l'oggetto");
//    }
//    Persona(String nome,String cognome,int eta, double altezzA){
//        this.nome=nome;
//        this.cognome=cognome;
//        this.eta=eta;
//        this.altezza=altezza;
//    }
//    
//    public void mangia(String pranzo,String cena){
//        System.out.println("A pranzo mangio "+pranzo+"A cena mangio "+cena);
//    }
//    /**
//     * Queto metodo serve per far mangiare a prazo e a cena
//     * @param nome String
//     * @param cognome String
//     */
//    
//    Persona(String nome, String cognome){
//        this.nome=nome;
//        this.cognome=cognome;
//        //OVERLOAD costruttore con 2 parametri
//    }
//    
//    
//    
//    // i metodi che hanno lo stesso nome ma diversi parametri si chiamano OVERLOAD. nel primo non c'e ne sono, nel secondo si.
//    // nome + parametri = FIRMA DEL METODO
//    public void dorme(){
//        System.err.println("zzzzzzzzzzzzz");
//    }
//    
//    public void dorme(int numero_ore){
//        System.out.println("dormo " +numero_ore+" ore");
//    }
//    /**
//     * Metodo che cotrolla se una persona e' maggiorente
//     * @return ritorna vero se l'eta e' >=18
//     */
//    public boolean isMaggiorenne(){
//        return eta>=18;
//    }
//
//   
//    public String toString(){ //nome con parametro
//        return "la persona si chiama "+nome+" "+cognome+"ha "+eta+ "anni "+"e' alto "+altezza+ " cm"+" ha come tutti "+NUMERO_OCCHI+" occhi";
//    
//    
//public String toString(int x){ //nome con parametro
//        return "la persona si chiama "+nome+" "+cognome+"ha "+eta+ "anni "+"e' alto "+altezza+ " cm"+" ha come tutti "+NUMERO_OCCHI+" occhi"+"x= "+x;
     //SERVE per evitare di stampar il servizio in memoria ma l'informazione riportata sopra. Appartiene alla classe OBject, la classe principale di Java. Tutte le clasi facciamo derivano dalla classe object.   
    }
    
