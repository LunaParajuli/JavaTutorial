package Inheritance_;

public class superclass{
	int a =7;
	public void add(int a, int b) {
		return a+b;
	}
}



public class SubClass {
	
	public static void main(String args[]) {
		SubClass s = new SubClass();
		System.out.println("Programmer salary is: "+s.a);
		System.out.println("Bonus of Programmer is: "s.add);
	}

}
