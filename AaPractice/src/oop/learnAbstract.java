package oop;

public class learnAbstract {

	public static void main(String args[]) {
		
		//Vehicles v1 = new Vehicles(); ==>abstract cannot be instantiated..
		Cars c1 = new Cars();
		c1.accelerate();
		c1.brakes(4);
	}
	
	
}

abstract class Vehicles{  // ==> abstract can not have body
	
	abstract void accelerate();
	
	abstract int brakes(int wheels);
}

class  Cars extends Vehicles{

	@Override
	void accelerate() {
		System.out.println("Car is accelerated");
		
	}

	@Override
	int brakes(int wheels) {
		System.out.println("Caar breaks are pushed");
		return wheels;
		
	}
	
}