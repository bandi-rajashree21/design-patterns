package com.demo;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
        // Decide factory based on OS type
        GUIFactory factory;

        String osType = "Mac"; // could come from config/env

        if (osType.equalsIgnoreCase("Windows")) {
            factory = new Windowsfactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
