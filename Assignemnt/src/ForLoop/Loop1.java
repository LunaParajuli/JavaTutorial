//Write a program to print 10 even numbers and 10 odd numbers.

package ForLoop;

import java.util.*;

public class Loop1 {
	public static void main(String args[]) {
		int i , even , odd;
		System.out.println("The even numbers are: ");
		for( i=1; i<=10; i++) {
		  even = i*2;
		  System.out.print(" "+even);
		}
			
		System.out.println("\nThe odd numbers are: ");
		for( i=0; i<10; i++) {
			  odd = i*2+1;
			  System.out.print(" "+odd);
			}
	}

}
