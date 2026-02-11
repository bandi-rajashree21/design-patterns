package com.demo;

public class PrototypeDemo {
	public static void main(String[] args) {
        Document original = new Document("Original Doc", "This is the original content.");
        Document copy = (Document) original.clone();

        // Modify the cloned object
        copy.setTitle("Cloned Doc");
        copy.setContent("This is the cloned content.");

        System.out.println("Original Document:");
        original.show();

        System.out.println("\nCloned Document:");
        copy.show();
	}
	

}
