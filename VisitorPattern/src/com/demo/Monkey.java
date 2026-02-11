package com.demo;

public class Monkey implements Animal{
	public void accept(AnimalVisitor visitor)
	{
		visitor.visitMonkey(this);
	}
}
