package com.demo;

public class CEO extends Approver{
	 @Override
	    public void processRequest(int amount) {
	        System.out.println("CEO approved request of ₹" + amount);
	    }

}
