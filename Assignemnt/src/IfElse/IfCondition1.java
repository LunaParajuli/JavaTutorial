//Write a program to check if the candidate is eligible for voting or not. (Hint: Check age)
  
package IfElse;

import java.util.Scanner;

public class IfCondition1 {
public static void main(String args[]) {
	int age;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age:");
	
	 age = sc.nextInt(); 
	 
	 if(age>= 18) {
		 System.out.println("You are eligible for voting.");
	 }
	 else {
		 System.out.println("You must be 18 years to be eligible for voting...");
	 }
	}
	
}	
	
	 

