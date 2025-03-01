//Write a Java program to insert an element into the array list at the first position.

package collection;

import java.util.ArrayList;

public class InsertFirst {
	
	static void IF1() {
		
ArrayList <String> color = new ArrayList <>();
		
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		
		System.out.println(color);
		
		color.add(0,"White");
		System.out.println(color);
		
		
		
	}
	
	public static void main(String args[]) {
		IF1();
	}

}
