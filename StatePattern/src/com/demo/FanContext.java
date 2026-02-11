package com.demo;

public class FanContext {
	private State currentState;
	public FanContext()
	{
		currentState=new OffState();
	}
	
	public void setState(State state)
	{
		this.currentState=state;
	}
	
	public void pressButton()
	{
		currentState.pressButton(this);
	}

}
