package client;

import java.util.ArrayList;
import java.util.List;

import factory.TreeFactory;
import flyweight.TreeType;
import model.Tree;

public class Forest {
		private final List<Tree>trees=new ArrayList<>();
		public void plantTree(int x,int y,String name,String color,String texture)
		{
			 TreeType type = TreeFactory.getTreeType(name, color, texture);
		        Tree tree = new Tree(x, y, type);
		        trees.add(tree);
		}
		
		public void draw()
		{
			for(Tree tree:trees)
				tree.draw();
		}
		
		public static void main(String[] args)
		{
			Forest forest=new Forest();
			forest.plantTree(10, 20, "Oak", "Green", "Rough");
	        forest.plantTree(30, 40, "Oak", "Green", "Rough");
	        forest.plantTree(50, 60, "Pine", "Dark Green", "Smooth");
	        forest.draw();
		}
		
}
