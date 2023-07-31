package test;

import model.ContoCorrente;
import model.Cliente;

public class Contocorrentetest {

	public static void main(String[] args) {
		Cliente c1=new Cliente("Erica");
		ContoCorrente cc1= new ContoCorrente(c1);
		ContoCorrente cc2= new ContoCorrente(c1);
		
		cc1.versamento(1000);
		cc2.versamento(2000);
		cc1.prelievo(500);
		cc2.prelievo(500);
		cc1.prelievo(250);
	
		System.out.println(cc1.report());
		System.out.println(cc2.report());

	}

}
