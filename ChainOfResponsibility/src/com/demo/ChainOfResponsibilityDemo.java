package com.demo;

public class ChainOfResponsibilityDemo {
	public static void main(String[] args)
	{
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        manager.processRequest(5000);
        manager.processRequest(20000);
        manager.processRequest(100000);
	}

}
