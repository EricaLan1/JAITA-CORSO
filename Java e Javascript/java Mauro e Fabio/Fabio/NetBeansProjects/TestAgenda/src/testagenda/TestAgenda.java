package testagenda;

public class TestAgenda {

    public static void main(String[] args) {
        //creare una serie di impegni
       Impegno i1 = new Impegno("Java");
       Impegno i2 = new Impegno("Database");
       Impegno i3 = new Impegno("Html");
       Impegno i4 = new Impegno("Javascript");
       Impegno i5 = new Impegno("CSS");
       
       Pagina p1= new Pagina("lunedi", new Impegno[]{i1,i2}); //creare un array d impegni, scegliendo il posizionamento delle materie
       Pagina p2= new Pagina("martedi", new Impegno[]{i3,i4});
       Pagina p3= new Pagina("mercoledi", new Impegno[]{i1,i3});
       Pagina p4= new Pagina("giovedi", new Impegno[]{i5,i3});
       Pagina p5= new Pagina("venerdi", new Impegno[]{i1,i2});
       
      //Mi manca definire la settimana, un insieme di pagine
       Settimana s= new Settimana();
       s.pagine[0] = p1;
       s.pagine[1] = p2;
       s.pagine[2] = p3;
       s.pagine[3] = p4;
       s.pagine[4] = p5;
       
       //andiamo a stampare il nostro array con il for
        for (int i = 0; i < 5; i++) {
            System.out.println(s.pagine[i]);
            System.out.println("------------------------------------------");
        }
       
    }
    //control shift e freccia in basso per copiare. 
}
