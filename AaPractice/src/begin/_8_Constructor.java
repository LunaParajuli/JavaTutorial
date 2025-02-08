package begin;

public class _8_Constructor {
	
	public static void main(String args[]) {
		Complex num1 = new Complex(5);
		Complex num2 = new Complex(4, 1);
		num1.print();
		num2.print();
		
	}

}

class Complex{
	int a,b;
	
	
//	public Complex() {  //default constructor 
//		a=5;
//		b=9;
//		System.out.println("Creating a new object");
//	}
	
	
	public Complex(int real) {
		a=real;
		b=12;
	}
	
	
	public Complex(int real , int imaginary) {
		a=real;
		b= imaginary;
	}
	
	
	void print() {
		System.out.println(a+" + "+b+"i");
	}
}