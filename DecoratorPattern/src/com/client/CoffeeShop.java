package com.client;

import com.raj.Coffee;

import concreteComponent.SimpleCoffee;
import decorator.MilkDecorator;
import decorator.SugarDecorator;

public class CoffeeShop {
    public static void main(String[] args)
    {
    	Coffee coffee= new SimpleCoffee();
    	System.out.println(coffee.getDescription()+" $"+coffee.getCost());
    	
    	coffee=new MilkDecorator(coffee);
    	System.out.println(coffee.getDescription()+" $"+coffee.getCost());
    	
    	coffee=new SugarDecorator(coffee);
    	System.out.println(coffee.getDescription()+" $"+coffee.getCost());
    	
    	
    }
}
