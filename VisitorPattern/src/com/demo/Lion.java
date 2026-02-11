package com.demo;

public class Lion implements Animal{
	
	public void accept(AnimalVisitor visitor)
	{
		visitor.visitLion(this);
	}

}
