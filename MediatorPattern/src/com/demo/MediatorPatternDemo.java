package com.demo;

public class MediatorPatternDemo {
	public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoomMediator();

        User rajashree = new ChatUser(chatMediator, "Rajashree");
        User bandi = new ChatUser(chatMediator, "Bandi");
        User ramya = new ChatUser(chatMediator, "Ramya");
        User ramesh = new ChatUser(chatMediator, "Ramesh");

        chatMediator.addUser(rajashree);
        chatMediator.addUser(bandi);
        chatMediator.addUser(ramya);
        chatMediator.addUser(ramesh);

        rajashree.send("Hi everyone!");
        ramya.send("Hello Rajashree!");
    }

}
