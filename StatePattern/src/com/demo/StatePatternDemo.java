package com.demo;

public class StatePatternDemo {
	
	public static void main(String[] args)
	{
		FanContext fan=new FanContext();
		 fan.pressButton(); // Off → Low
	        fan.pressButton(); // Low → High
	        fan.pressButton(); // High → Off
	        fan.pressButton(); // Off → Low again
	}

}
