//Write a program to find largest of two numbers.
 
package IfElse;

import java.util.*;

public class IfCondition3 {
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int  a , b;
	
	System.out.print("Enter the value of a: ");
   a = sc.nextInt();
  
	
   System.out.print("Enter the value of b:");
   b= sc.nextInt();
 
	
   if(a>b) {
	   System.out.println("The largest value is "+a);
   }
   else {
	   System.out.println("The largest value is "+b);
   }
   
}
}
