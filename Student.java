package com.training.app.collections;


public class Student {

	
	private String fName;
	private String lName;
	public Student(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + "]";
	}
	
	
}
