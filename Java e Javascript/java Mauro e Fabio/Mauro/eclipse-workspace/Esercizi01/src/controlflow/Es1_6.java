package controlflow;

public class Es1_6 {

	public static void main(String[] args) {
	
		int maxNum=7; 
		
		int i=1; //indice per il ciclo che parte da 1
		while(i<maxNum) { //il while andra' avanti fin quando i e' minore di maxNum
			String total= ""; //la stringa vuota
			
			for(int j=1; j<i+1; j++) { // 3 argomenti: il primo e' il suo punto d partenza le mie dichiarazioni, il secondo la condizione di uscita, il terzo e' l'eseguzione ad ogni ciclo.
				total +=j;
			}
			total += "\t";
			String toReverse="";
			for (int j = 1; j < maxNum; j++) {
				if(j<(maxNum-i)+1) {
					toReverse+=j;	
				}else {
					toReverse += ' ';
				}
				
			}
			
			total += reverseString(toReverse);
			
			
			System.out.println(total);
			i++;
		}
		System.out.println("Stop");
		
	}//main

	private static String reverseString(String toReverse) {
		String reversed= "";
		
		int i=toReverse.length()-1;
		while(i>=0){
			reversed += toReverse.charAt(i)	;
			i--;
		}
		
		return reversed;
	}

}
