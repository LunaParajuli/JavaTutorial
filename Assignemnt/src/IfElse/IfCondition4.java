
// Write a program to check given number is even or odd.
  
package IfElse;

import java.util.*;

public class IfCondition4 {
public static void main(String args[]) {
	int num;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any number:");
	num = sc.nextInt();
	
	if(num%2 == 0) {
		System.out.println("The given number "+ num +" is even.");
	}
	else {
		System.out.println("The given number "+ num +" is odd.");
	}	
}
}
