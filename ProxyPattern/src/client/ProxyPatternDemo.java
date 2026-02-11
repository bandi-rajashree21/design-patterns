package client;

import proxy.ProxyImage;
import subject.Image;

public class ProxyPatternDemo {
	public static void main(String[] args)
	{
	Image image=new ProxyImage("pic-1.png");
	Image image2=new ProxyImage("pic-2.png");
	
	image.display();
	image.display();
	image2.display();
	}
}
