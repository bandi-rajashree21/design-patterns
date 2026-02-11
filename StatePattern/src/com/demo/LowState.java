package com.demo;

public class LowState implements State{
	
	@Override
	public void pressButton(FanContext context)
	{
		System.out.println("Fan turned to HIGH speed.");
        context.setState(new HighState());
	}

}
