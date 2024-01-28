package Collezioni;

import java.util.ArrayList;
import java.util.Random;

public class NumeroLista {

	public static void main(String[] args) {
		//aggiungere numeri random ad una lista (0-100) fino a quando non esce un numero compreso tra 10 e 20
		
		ArrayList<Integer> numeri = new ArrayList<>();  /* int nell'array lista non piace perché non può mai essere un tipo di dato primitivo, utilizziamo la classe wrapper
		*quindi utiliziamo Integer*/
		Random random = new Random();
		
		boolean uscita = false;
		//vai avanti fino a quando non devi uscire
		while(!uscita) {
			//ad ogni iterazione genero un numero random
			int numero = random.nextInt(0, 100);
			System.out.println("Numero: " + numero);
			// verifico se è compreso tra 10 e 20
			if (numero >= 10 && numero <=20) {
				//esco
				System.out.println("Numero tra 10 e 20. Uscita");
				uscita = true;
			}else {
				System.out.println("Aggiunto numero alla lista");
				numeri.add(numero);
			}
		}

		// stampo la lista
		System.out.println(numeri);
	}

}
