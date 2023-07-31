package ess_Array03;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class due {
	public static void main(String[] args) {
		
	
	int[] array= {1,2,2,4,5,5,5,8,9,9};
		int[] array2= new int[array.length];
		for(int i=0; i<array.length; i++) {
		int elemental= array[i]; // 1 valore
		array2[elemental]++;
	
			
			
		}
		for (int i = 0; i < array.length; i++) {
			if (array2[i]>0) {
				System.out.println(i+array2[i]);
				
			}
		}
	
	
	
	
	
	
	
	

	}
}