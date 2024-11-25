//Write a program to reverse the digits of a number.

package DoWhile;

import java.util.*;

public class DoWhile5 {
	
	public static void main(String args[]) {
	
	 Scanner scanner = new Scanner(System.in);

     System.out.print("Enter a number to reverse: ");
     int number = scanner.nextInt();

     int reverse = 0; // Variable to store the reversed number

     // Process: Reverse the digits using a do-while loop
     do {
         int digit = number % 10;       // Extract the last digit
         reverse = reverse * 10 + digit; // Add the digit to the reversed number
         number /= 10;                 // Remove the last digit
     } while (number != 0);            // Continue until the number becomes 0

     
     System.out.println("The reversed number is: " + reverse);
}
}
