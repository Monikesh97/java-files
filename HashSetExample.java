package com.training.app.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> fruiHashSet = new LinkedHashSet<>();

		fruiHashSet.add("apple");
		fruiHashSet.add("mango");
		fruiHashSet.add("bananna");
		fruiHashSet.add("apple");
		fruiHashSet.add(null);
		fruiHashSet.add(null);
		
		System.out.println(fruiHashSet);


		Set<String> fruiLinkedHashSet = new LinkedHashSet<>();

		fruiLinkedHashSet.add("apple");
		fruiLinkedHashSet.add("mango");
		fruiLinkedHashSet.add("bananna");
		fruiLinkedHashSet.add("apple");
		fruiLinkedHashSet.add(null);
		fruiLinkedHashSet.add(null);

		System.out.println(fruiLinkedHashSet);

		SortedSet<String> sortedSet = new TreeSet<>();
		sortedSet.add("apple");
		sortedSet.add("mango");
		sortedSet.add("bananna");
		sortedSet.add("apple");
//		sortedSet.add(null);
//		sortedSet.add(null);
		System.out.println(sortedSet);

	}

}
