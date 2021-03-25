package services;

public class PayService {

	/*
	 * Declaring dependencies
	 * It is a composition of objects
	 */
	private TaxService taxService;
	private DeliverService deliverService;
	
	public PayService(TaxService taxService, DeliverService deliverService) {
		this.taxService = taxService;
		this.deliverService = deliverService;
	}

	public double finalPrice(double cost, String state) {
		return cost + taxService.tax(cost) + deliverService.fee(state);
	}
}
