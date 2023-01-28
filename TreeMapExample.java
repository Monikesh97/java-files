package com.training.app.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<String, Integer> frMap = new TreeMap<String, Integer>();
		
		frMap.put("apple", 10);
		frMap.put("banna", 4);
		frMap.put("mango", 20);
		frMap.put("mango", 30);
//		frMap.put(null, null);
		frMap.put("grapes", null);
		frMap.put("orange", null);
//		frMap.put(null, 40);
		
		System.out.println(frMap);
		
		

	}

}
