/*
  Write a Java program to create a class called Vehicle with a method called drive(). 
  Create a subclass called Car that overrides the drive() method to print "Repairing a car".
 */


package Inheritance_;


class Vehicles{
	public void drive() {
		System.out.println("Drive the car");
	}
}

class Car extends Vehicles{
	@Override
	public void drive() {
		System.out.println("Repairing a car");	
	}
}


public class Vehicle {
   public static void main(String args[]) {
	   
	   Vehicles vech = new Vehicles();
	   vech.drive();
	   
	   Car car = new Car();
	   car.drive();
   }
}
