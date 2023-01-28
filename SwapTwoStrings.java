package com.training.app.strings;


public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 16;
		int y= 20;
		
		x=x+y;//30
		y=x-y;//10
		x=x-y;  //20
		
		System.out.println(x+"   "+y);
		
		
		
		String a = "Hello";
		String b = "world!!";
		
		System.out.println("before swapping "+"a="+a +"and b="+b);
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("After swapping "+"a="+a +"and b="+b);
		

	}

}
