package constructor;

import java.io.*;

class GetSet{
	
	private String name; //Member variable of this class
	
	//Method 1 - Getter 
	public String getName() {
		return name;
	}
	
	//Method 2 - Setter
	
	public void setName(String N) {
		
		 // This keyword refers to current instance itself
		this.name = N;
	}
}


public class GFG {

	public static void main(String[] args) {
		
		// Creating an object of class 1 in main() method
		GetSet obj = new GetSet();
		
		// Setting the name by calling setter method
		obj.setName("Try Try Try");
		
		 // Getting the name by calling getter method
		System.out.println(obj.getName());
		
	}
}
