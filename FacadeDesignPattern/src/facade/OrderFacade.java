package facade;

import services.InventoryService;
import services.PaymentService;
import services.ShippingService;

public class OrderFacade {
	private PaymentService paymentService;
	private InventoryService inventoryService;
	private ShippingService shippingService;
	
	 public OrderFacade() {
	        this.paymentService = new PaymentService();
	        this.inventoryService = new InventoryService();
	        this.shippingService = new ShippingService();
	    }
	
	public void placeOrder(String productId,String paymentType)
	{
		 System.out.println("Starting order placement...");
	        inventoryService.checkInventory(productId);
	        paymentService.processPayment(paymentType);
	        shippingService.arrangeShipping(productId);
	        System.out.println("Order placed successfully!");
	}
	
	

}
