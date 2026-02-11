package com.demo;

public class SingleTon {
	//create an object of SingleObject
	   private static SingleTon instance = new SingleTon();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleTon(){}

	   //Get the only object available
	   public static SingleTon getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   } 
}