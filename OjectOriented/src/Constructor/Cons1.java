/* Write a Java program to create a class called "Cat" with instance variables name and age. 
   Implement a default constructor that initializes the name to "Unknown" and the age to 0. 
   Print the values of the variables.
 */

package Constructor;

//Default Constructor

class Cat{
	String name;
	int age;
	
	public Cat(){
		this.name= "Unknown";
		this.age= 0;
	}
	
	public void print() {
		System.out.println("The name of cat is:"+name);
		System.out.println("The age of cat is:"+age);
	}
}

public class Cons1 {

	public static void main(String args[]) {
		Cat cat = new Cat();
		cat.print();
	}
	
	
	
}
