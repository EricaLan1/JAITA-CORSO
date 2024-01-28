package esercizi;

public class Divisibili {

	public static void main(String[] args) {
		
		System.out.println("Divisibile per 5");
		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0 ) { // divisibile per 5
				System.out.println( i + ",");
			}
		}
		
		System.out.println("Divisibile per 3");
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 ) { // divisibile per 3
				System.out.println( i + ",");
			}
		}
		
		System.out.println("Divisibile per 3 e 5");
		for (int i = 0; i <= 100; i++) {
			boolean divTre = false;
			if (i % 3 == 0 ) { // divisibile per 3 e 5
				divTre = true;
			}
			
			boolean divCinque = false;
			if (i % 5 == 0 ) { // divisibile per 3 e 5
				divCinque = true;
			}
			
			if ( divTre && divCinque) {
				System.out.print(i + ",");
			}
		}
		
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0 && i % 5 ==0) {
				System.out.println(i);
			}
		}

	}

}
