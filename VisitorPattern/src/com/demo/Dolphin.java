package com.demo;

public class Dolphin implements Animal{

	public void accept(AnimalVisitor visitor)
	{
		visitor.visitDolphin(this);
	}
}
