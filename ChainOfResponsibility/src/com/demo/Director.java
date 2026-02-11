package com.demo;

public class Director extends Approver{
	 @Override
	    public void processRequest(int amount) {
	        if (amount <= 50000) {
	            System.out.println("Director approved request of ₹" + amount);
	        } else if (nextApprover != null) {
	            nextApprover.processRequest(amount);
	        }
}
}
