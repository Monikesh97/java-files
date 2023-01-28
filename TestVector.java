package com.training.app.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> vector = new Vector<>();
		
		for(int i=10; i>0;i--) {
			vector.add(i);
		}

		
		Collections.sort(vector);
		
		ListIterator<Integer> liiterator = vector.listIterator();
		while (liiterator.hasNext()) {
			Integer integer = (Integer) liiterator.next();
			System.out.println(integer);
		}
		
//		Enumeration<Integer> enumeration  = vector.elements();
//		
//		while (enumeration.hasMoreElements()) {
//			Integer integer = (Integer) enumeration.nextElement();
//			System.out.println(integer);
//		}
		
		
		
	}

}
