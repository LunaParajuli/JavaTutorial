// Write a Java program to create an array list, add some colors (strings) and print out the collection.

package collection;

import java.util.*;

public class ArrayList1 {
	
	static void AL1(){
		
		ArrayList <String> color = new ArrayList <>();
		
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		
		System.out.println(color);
		
		for(String colors:color) {
			System.out.println(colors);
		}
		
	}
	
	public static void main(String args[]) {
		AL1();
	}
	
}