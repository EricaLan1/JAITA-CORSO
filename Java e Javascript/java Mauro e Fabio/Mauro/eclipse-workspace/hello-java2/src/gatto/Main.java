package gatto;

public class Main {

	public static void main(String[] args) {
		Gatto pako = new Gatto("Siamese", 3, "femmina", "Pako");
		System.out.println(pako);
		
		pako.cresci();
		System.out.println(pako);
		
		
	}

}
