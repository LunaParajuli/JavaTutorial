package Inheritance;


public class Inheritance1 extends Test {
   public static void main(String args[]) {
	   Inheritance1 inherit = new Inheritance1();
	   inherit.displayX();
   }
}


class Test{
	int x =100;
	
	public void displayX() {
		System.out.println(x);
	}
}