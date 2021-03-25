package application;

import services.DeliverService;
import services.PayService;
import services.TaxService;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Inversion of Control
		 */
		TaxService taxService = new TaxService();
		DeliverService deliverService = new DeliverService();
		
		/*
		 * Dependency Injection with Constructor Injection
		 */
		PayService payService = new PayService(taxService, deliverService);
		
		System.out.println("Resultado = " + payService.finalPrice(300, "SP"));
	}

}
