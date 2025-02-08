package oop;



public class learnInterface {

	//Animal a1 = new Animal();
	
	public static void main(String args[]) {
		Monkey monkey = new Monkey();
		monkey.eats();
		monkey.sings();
	}
	
}

interface Pet{
	void sings();
}

interface Animal{
	
	 void eats();
}

class Monkey implements Animal,Pet{

	@Override
	public void eats() {
		System.out.println("Monkey is eating");
	}

	@Override
	public void sings() {
		System.out.println("Monkey is singing");
		
	}
	
}