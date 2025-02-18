/* 
 * this keyword is a reserved keyword in java i.e, we can't use 
 * it as an identifier.
 * It is used to refer current class's instance as well as static members.
 * It can be used in various contexts as given below:
 * 
 * .to refer instance variable of current class.
 * .to invoke or initiate current class constructor
 * .can be passed as an argument in the method call
 * .can be passed as argument in the constructor call
 * .can be used to return the current class instance
 * 
  */


package constructor;

public class RR {
	
		int a = 10;  //instance variable
		static int b = 20;  // static variable
				
	void GFG() {
		
		//referring current class(i.e, class RR)
		//instance variable(i.e, a)
		this.a = 100;
		
		System.out.println(a);
		
		
		//referring current class(i.e, class RR)
		//static  variable(i.e, b)
		this.b = 600;
		
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		//this.a = 700;--> this cannot be used inside static context...
		
		new RR().GFG();
		
	}

}
