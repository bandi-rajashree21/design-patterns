package com.demo;

public class Manager extends Approver{
	@Override
	public void processRequest(int amount)
	{
		if(amount<=10000)
		{
			System.out.println("Manager approved request of ₹" + amount);
		}
		else if(nextApprover!=null)
		{
			nextApprover.processRequest(amount);
		}
	}

}
