package com.training.app.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5}; 
		Collection<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("guava");
		
		System.out.println(fruits);
		
		
		fruits.forEach(element->System.out.println(element));	
	}

}
