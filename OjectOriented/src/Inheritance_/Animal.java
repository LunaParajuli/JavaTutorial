/*
 Write a Java program to create a class called Animal with a method called makeSound(). 
 Create a subclass called Cat that overrides the makeSound() method to bark.
 */

package Inheritance_;

class Animals{
	
	public void makeSound() {
		System.out.println("All the animals have their own unique sound.");
	}
}

class Cat extends Animals{
	
	@Override
	public void makeSound() {
		System.out.println("The cat quarrels");
	}
	
}


public class Animal {
	public static void main(String args[]) {
		 Animals animal = new Animals();
		 Cat cat = new Cat();
		 
		 
		 animal.makeSound();
		 cat.makeSound();
	}

}
