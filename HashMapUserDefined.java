package com.training.app.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		
		studentMap.put(1, new Student("ravi", "kumar"));
		studentMap.put(2, new Student("mounikesh", "n"));
		studentMap.put(3, new Student("chandra", "mouli"));
		studentMap.put(1, new Student("charan","kumar"));
		
		System.out.println(studentMap);
	}

}
