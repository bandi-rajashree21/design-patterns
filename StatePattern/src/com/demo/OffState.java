package com.demo;

public class OffState implements State{
	@Override
	public void pressButton(FanContext context)
	{
		System.out.println("Fan turned to LOW Speed");
		context.setState(new LowState());
	}
	

}
