package factory;

import java.util.HashMap;
import java.util.Map;

import flyweight.TreeType;

public class TreeFactory {
       private static final Map<String,TreeType>treeTypes=new HashMap<>();
       public static TreeType getTreeType(String name, String color, String texture) {
           String key = name + "-" + color + "-" + texture;
           TreeType type = treeTypes.get(key);

           if (type == null) {
               type = new TreeType(name, color, texture);
               treeTypes.put(key, type);
               System.out.println("Created new TreeType: " + key);
           }
           return type;
       }
       }
