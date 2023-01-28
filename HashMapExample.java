package com.training.app.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> frMap = new HashMap<>();
		
		frMap.put("apple", 10);
		frMap.put("banna", 4);
		frMap.put("mango", 20);
		frMap.put("mango", 30);
		frMap.put(null, null);
		frMap.put("grapes", null);
		frMap.put("orange", null);
		frMap.put(null, 40);
		System.out.println(frMap);
		
//		frMap.put("kiwi", null);
//		frMap.put(null, 30);-
//		frMap.put(null, null);-
//		frMap.put("kiwi", null);
//		frMap.put(null, 30);
		
//		System.out.println(frMap);
		Set<String> keys = frMap.keySet();
//		System.out.println(keys);
		
		Collection<Integer> values = frMap.values();
//		System.out.println(values);
		
		List<Integer> nuList = Arrays.asList(1,2,3,4);
		
		for(Integer i: nuList) {
//			System.out.println(i);
		}
		
			
		
		
		for(Map.Entry<String, Integer> entry: frMap.entrySet()){
//			System.out.println("key is "+ entry.getKey()+"  "+"value is "+entry.getValue());
		}
		
		
		Set<Map.Entry<String, Integer>> entries = frMap.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator
					.next();
			
		}
		
	}

}

//allows only one null key
// and any number of null values
//if key is duplicate the value will be replaced
//"apple" : 10
//"banana" : 4
//"mango"	: 20
