package controlflow;

public class parte2 {
	public static void main(String[] args) {
	int[] valori= {1,2,3,4,5,6,7,8,9,10};
	int[] valori2= new int[10]; //array vuoto
	
	for (int i = 0; i < 10; i++) {
		valori2[i]=valori[i];
	}
	for (int j = 0; j < 10; j++) {
		System.out.println("I valori dell'Array sono: "+valori[j]+" "+valori2[j]);
		}
	
	}
}