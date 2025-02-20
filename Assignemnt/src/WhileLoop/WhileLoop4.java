//Write a program to add the digits of a number.

package WhileLoop;

import java.util.*;

public class WhileLoop4 {
  public static void main(String args[]) {
	 
	  int digit;
	  int sum=0;
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number: ");
      digit = sc.nextInt();
      
      while (digit != 0) {
          sum += digit % 10; // Add the last digit to sum
          digit /= 10;       // Remove the last digit
      }
      
      System.out.println("The sum of digits of the given number is: " + sum);
  }
  }

