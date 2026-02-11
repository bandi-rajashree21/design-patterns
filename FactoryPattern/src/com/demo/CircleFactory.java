package com.demo;

public class CircleFactory extends ShapeFactory{
	public Shape createShape()
	{
		return new Circle();
	}

}
