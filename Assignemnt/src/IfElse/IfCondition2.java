//Write a program to check if the number is positive or negative.

package IfElse;

import java.util.*;

public class IfCondition2 {

public static void main(String args[]) {
	int num;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any integer number: ");
	
	num= sc.nextInt();
	
	if(num<0) {
		System.out.println("The given number is -ve.");
	}
	else if(num == 0 ) {
		System.out.println("The given number is zero(0).");
	}
	else {
		System.out.println("The given number is +ve.");
	}
}
}
