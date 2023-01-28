package com.training.app.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> frMap = new LinkedHashMap<>();
		
		frMap.put("apple", 10);
		frMap.put("banna", 4);
		frMap.put("mango", 20);
		frMap.put("mango", 30);
		frMap.put(null, null);
		frMap.put("grapes", null);
		frMap.put("orange", null);
		frMap.put(null, 40);
	
		
		System.out.println(frMap);
	}

}
