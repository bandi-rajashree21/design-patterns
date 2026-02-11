package client;

import facade.OrderFacade;

public class FacadePatternDemo {
	public static void main(String[] args)
	{
		OrderFacade of=new OrderFacade();
		of.placeOrder("P123","UPI");
		
	}

}
