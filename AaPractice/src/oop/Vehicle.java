package oop;

public class Vehicle {
	
	final int gears=4;;
	
	
	public static void main(String args[]) {
		Vehicle v1 = new Vehicle( 2);
		//v1.gears=6;  ==> cannot assigned again to final variable... 
	}
	
	int wheelsCount;
	String model;
	String color;
	
	Vehicle(){
		System.out.println("Car is being created ");
	}
	Vehicle(int wheelsCount){
		this.wheelsCount = wheelsCount;
		System.out.println("Creating vehicle with wheels");
	}
	
	void start() {
		System.out.println("Vehicle is starting");
	}

}

