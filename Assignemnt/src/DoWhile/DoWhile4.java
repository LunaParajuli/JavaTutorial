// Write a program to add the digits of a number.
 
package DoWhile;

import java.util.*;

public class DoWhile4 {
   public static void main(String args[]) {
	   
	   Scanner scanner = new Scanner(System.in);

       
       System.out.print("Enter a number: ");
       int number = scanner.nextInt();

       int sum = 0; // Variable to store the sum of digits

       // Process: Add the digits using a do-while loop
       do {
           sum += number % 10; // Add the last digit to the sum
           number /= 10;       // Remove the last digit
       } while (number != 0);  // Continue until the number becomes 0

      
       System.out.println("The sum of the digits is: " + sum);
	   
   }
}
