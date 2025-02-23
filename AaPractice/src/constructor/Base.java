/* 
 super keyword
 
 super is a reserved keyword in java i.e, we can't use it as an identifier.
 super is used to refer super-class's instance as well as static members.
 super is also used to invoke super-class's method or constructor.
 super keyword in java programming language refers to the superclass 
 of the class where the super keyword is currently being used.
 
The most common use of super keyword is that it 
eliminates the confusion between the superclasses and 
subclasses that have methods with same name.

super can be used in various contexts as given below:

it can be used to refer immediate parent class instance variable
it can be used to refer immediate parent class method
it can be used to refer immediate parent class constructor.

 * */


package constructor;

class Parent{
	int a =10; //instance variable
	
	static int b = 20; //static variable
}

public class Base extends Parent {
	void rr() {
		
		System.out.println(super.a);
		
		System.out.println(super.b);
	}
	
	public static void main(String[] args) {
		new Base().rr();
		
	}

}
