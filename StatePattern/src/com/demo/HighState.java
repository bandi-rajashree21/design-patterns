package com.demo;

public class HighState implements State{
	@Override
    public void pressButton(FanContext context) {
        System.out.println("Fan turned OFF.");
        context.setState(new OffState());
	}

}
