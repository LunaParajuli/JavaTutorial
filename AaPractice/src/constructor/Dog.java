/*
 * Write a Java program to create a class called Dog with instance variables name and color. 
 * Implement a parameterized constructor that takes name and color as parameters and initializes the 
 * instance variables. Print the values of the variables.

 * 
 * */

package constructor;

public class Dog {
	
	String name;
	String color;
	
	public Dog(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog("Bull", "Black");
		System.out.println("The name of dog is "+ dog.name +" and it's color is "+ dog.color);
		
	}

}
