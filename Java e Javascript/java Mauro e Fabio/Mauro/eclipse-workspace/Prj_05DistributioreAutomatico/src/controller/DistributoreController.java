package controller;

import model.*;


public class DistributoreController {
	public Bevanda bevanda;
	
	
	public Bevanda dammiBevanda(String nomeBevanda) {
		switch (nomeBevanda) {
		case "A1":
			bevanda = new caffe();
			break;
		case "A2":
			bevanda = new CaffeLungo();
			break;
		case "A3":
			bevanda = new Cappuccino();
			break;
		case "A4":
			bevanda = new Cioccolata();
			break;
		case "A5":
			bevanda = new The();
			break;

		default:
			break;
		}
		
		
		
		return bevanda;
		
	}

}
