package com.training.app.strings;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =12345;
		
		String s1= String.valueOf(num1);
//		System.out.println(s1);
		String s2 = new Integer(num1).toString();
//		System.out.println(s2);
		
		String s3 = "my name is ravi";
		
		String[] arrOfString = s3.split("m", 5);
		
		for(String a: arrOfString)
			System.out.println(a);

	}

}
