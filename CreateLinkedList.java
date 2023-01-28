package com.training.app.collections;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class CreateLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add(null);
		for(int i=0;i<fruits.size();i++) {
			
		}
		
		ListIterator<String> iListIterator = fruits.listIterator();
		iListIterator.add("mango");
		
		while (iListIterator.hasNext()) {
//			iListIterator.add("mango");
			iListIterator.remove();
			String string = (String) iListIterator.next();
			System.out.println(string);
		}
		
		
		AbstractList<String> fruiList = new LinkedList<>();
		Collection<String> fruCollection = new LinkedList<>();
		List<String> frList = new LinkedList<>();
		AbstractCollection<String> frAbstractCollection = new LinkedList<>();
		Queue<String> linkQueue = new LinkedList<>();
		Deque<String> deque = new LinkedList<>();
		
		//		System.out.println(fruCollection.);
//		System.out.println(fruiList.);
		
		
		
	}

}
