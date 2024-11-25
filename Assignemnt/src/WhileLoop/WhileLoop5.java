//Write a program to reverse the digits of a number.

package WhileLoop;

import java.util.*;

public class WhileLoop5 {
   public static void main(String args[]) {
	   
	   
	   int num;
	   int reverse=0;
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number: ");
	   
	   num =sc.nextInt();
	   
	   while(num!=0) {
		   int digit = num % 10;             // Extract the last digit
           reverse = reverse * 10 + digit;  // Add digit to reverse
           num /= 10;                      // Remove the last digit
		 
	   }
	   
	   System.out.println("The reverse of digits of the given number is: " + reverse);
   }
}
