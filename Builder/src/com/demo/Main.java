package com.demo;

public class Main {
    public static void main(String[] args) {
        // Building a full computer
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                                .setStorage("2TB SSD")
                                .setGraphicsCard("NVIDIA RTX 4090")
                                .build();

        System.out.println(gamingPC);

        // Building a basic computer with only required parts
        Computer officePC = new Computer.Builder("Intel i5", "8GB")
                                .build();

        System.out.println(officePC);
    }
}
