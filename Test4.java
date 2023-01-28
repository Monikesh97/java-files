package com.training.app.strings;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abc";//reverse cba
		
		String s2="";
		char[] chararray2 = new char[3];
		
		char[] charArray = s1.toCharArray();
		
		int j=0;
		
		for(int i=charArray.length-1;i>=0;i--) {
			chararray2[j] = charArray[i];
			j++;
		}
		
		
		
		for(int i=0;i<chararray2.length;i++) {
			System.out.println(chararray2[i]);
		}
	}

}
