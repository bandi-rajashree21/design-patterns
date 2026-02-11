package com.demo;

public class FactoryMethodDemo {
	
	public static void main(String[] args)
	{
		ShapeFactory f1=new CircleFactory();
		Shape s1=f1.createShape();
		s1.draw();
		
		ShapeFactory f2=new RectangleFactory();
		Shape s2=f2.createShape();
		s2.draw();
		
		
	}

}
