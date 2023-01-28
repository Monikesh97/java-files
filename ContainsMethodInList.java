package com.training.app.collections;
import java.util.Arrays;
import java.util.List;


public class ContainsMethodInList {
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> fruits = Arrays.asList("apple","banana","mango");
	List<String> seasonalFruit = Arrays.asList("mango","Kiwi");
//	LinkedList<String> linkedList = (LinkedList<String>) Arrays.asList("apple","banana","mango");
	
		System.out.println(fruits.contains("apple"));
		System.out.println(fruits.contains(seasonalFruit));
	System.out.println(seasonalFruit.get(2));
	
	}

}
