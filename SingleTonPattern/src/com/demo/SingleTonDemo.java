package com.demo;

 class SingleTonDemo {
	 public static void main(String[] args)
	 {
     SingleTon object = SingleTon.getInstance();
     object.showMessage();
	 }

}
