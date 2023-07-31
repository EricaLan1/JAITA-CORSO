package ess_Array03;

public class EsArray14 {

	public static void main(String[] args) {
		int[] Array= {3,2,7,9,4,6,5,8,1};
		
		for (int i = 0; i < Array.length -1; i++) {
			
			for(int j=0; j<Array.length -i-1 ; j++) {
			if (Array[j]> Array[j+1]);{
				int var=Array[j];
				Array[j]=Array[j+1];
				Array [j+1]= var;
			}
		}
	}
			for(int valore : Array) {
			System.out.println(valore);
			}
		}
}

	


