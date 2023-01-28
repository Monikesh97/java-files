package com.training.app.strings;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "ravi";
		String s2 ="ravi";
		String s3 = new String("ravi");
		String s4 = new String("ravi");
		
		
		
		
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s3));
		
		System.out.println("--------------\n\n\n");
		
		System.out.println(s1==s2);//true
		System.out.println(s2.equals(s4));//True
		System.out.println(s3==s4);//False
		System.out.println(s3.equals(s4));//t
		
		

	}

}
