package array;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ArrayNumeriRandom {

	public static void main(String[] args) {
		
		/*creo un array di 10 numeri random, dopo chiedilo con lo scanner*/
		
		Scanner randomGene = new Scanner(System.in);
		System.out.println("Quanti numeri?: ");
		int dimensione = randomGene.nextInt();
		
		Random randomGenerator = new Random();
		int[] numeriRandom /* arry di numeri interi vuoto, quindi dichiarata ma non inizializzata */ =  new int [dimensione];/* new int [ 10 ];  creami un nuovo array di interi di quante posizioni */
		
		for (int i = 0; i < numeriRandom.length; i++) {
			System.out.println(numeriRandom[i]); /*da default escono 0, strin null, boolean false */
		}
		
		/*ad ogni interazione del ciclo for genero un numero casuale e lo inserisco nell'array */
		for (int i = 0; i < numeriRandom.length; i++) {
			numeriRandom[i] = randomGenerator.nextInt();
		}
		
		for (int i = 0; i < numeriRandom.length; i++) {
			System.out.println(numeriRandom[i]);
		}
		
		randomGene.close();
	}

}
