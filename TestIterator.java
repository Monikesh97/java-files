package com.training.app.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;



public class TestIterator {
public static void main(String[] args) {
	

	
	
	ArrayList<String> aList = new ArrayList<String>();
    aList.add("Apple");
    aList.add("Mango");
    aList.add("Guava");
    aList.add("Orange");
    aList.add("Peach");
    System.out.println("The ArrayList elements are: ");
    for (String s: aList) {
       System.out.println(s);
    }
    ListIterator<String> i = aList.listIterator();
    String str = "";
    while (i.hasNext()) {
       str = (String) i.next();
       if (str.equals("Orange")) {
          i.remove();
//          i.add("Orage");
          System.out.println("The element Orange is removed");
          break;
       }
    }
    System.out.println("The ArrayList elements are: ");
    for (String s: aList) {
       System.out.println(s);
    }
    
   
    
 
}
}
