package oop;


public class Car extends Vehicle{

	void start() {
		super.start();
		System.out.println("Car is strting");
	}
	
	Car(){
		super(3);
		System.out.println("Car is being created");
	}
	
	public static void main(String args[]) {
		
		Car obj = new Car();
		obj.wheelsCount=4;
		obj.model = "I10";
		obj.color ="Red";
		obj.start();
		System.out.println(obj.wheelsCount);
		
	}
	
}
