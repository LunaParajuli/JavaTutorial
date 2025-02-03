package com.spring.tutorial;

public class ConstructorExample {

	private int id;
	private String name;
	
	
	public ConstructorExample(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	void showValues() {
		System.out.println("Name is "+name+" id is "+id);
	}
	
	public static void main(String args[]) {
		
		ConstructorExample cExample = new ConstructorExample(10,"Mike");
		cExample.showValues();
	}
	
}
