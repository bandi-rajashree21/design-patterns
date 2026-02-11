package com.demo;

public class Subscriber implements Observer {
	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void update()
	{
		System.out.println("Hi " + name+ "!! Video Uploaded: "+ channel.title);
	}
	
	@Override
	public void subscribeChannel(Channel ch)
	{
		channel=ch;
	}

}
