package gestione;
import mezzi.Automobile;
public class Vendita{
public static void main(String[] args) {
		
Automobile a1 = new Automobile ("Fiat","Panda", 2012, 1500);
Automobile a2= new Automobile ("Renault","Twingo", 2020, 10500);


Automobile[]garage= new Automobile[10];

garage[0]= a1;
garage[1]=a2;
garage[2]=new Automobile ("Fiat","Punto", 2016, 45500);
garage[3]=new Automobile ("Peugeot","s300", 2017, 5500);
garage[4]=new Automobile ("Ferrari","GT500", 2020, 45500);
garage[5]=new Automobile ("Mercedes","Classe C", 2018, 145500);
garage[6]=new Automobile ("Fiat","Paar", 2018, 65500);
garage[7]=new Automobile ("Fiat","500", 2012, 1500);
garage[8]=new Automobile ("Toyota","Yaris", 2019, 12550);
garage[9]=new Automobile ("BMW","Serie 5", 2018, 24550);

double totale =0;
for(int i=0; i<garage.length; i++) {//for loop
	
totale += garage[i].prezzo;
System.out.println(garage[i].stampaLibretto());

System.out.println("valore totale del prezzo: " +totale);

}

		
//System.out.println(a1.stampaLibretto());
//System.out.println(a2.stampaLibretto());
		
//Automobile a3 = a2;
//System.out.println(a3);
	}
}
