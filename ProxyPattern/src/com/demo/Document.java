package com.demo;

public class Document implements Prototype{
	
	private String title;
	private String content;
	
	public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public Prototype clone() {
        return new Document(title, content);
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }

    // Setters for demonstration
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
	

}
