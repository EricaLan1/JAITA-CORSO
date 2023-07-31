package Array;

public class ArrayDemo {

	public static void main(String[] args) {
int[] voti= new int[5];
voti[0]=24;
voti[1]=26;
voti[2]=25;
voti[3]=28;
voti[4]=28;

//            0 1  2  3  4
int[]voti2= {24,26,25,28,28};

double totale= 0;

for(int i=0; i<voti2.length; i++) {
System.out.println("il valore di i è " +i);
totale += voti2[i];
System.out.println("il voto è "+voti2[i]);
}
double media= totale/ voti2.length;
System.out.println("La media aritmetica dei voti è: "+media);
	}

}
