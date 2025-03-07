//Write a program to find factorial of a number.

package DoWhile;

import java.util.*;

public class DoWhile2 {
	public static void main(String args[]) {
		
		int num;
		int fact=1;
		int i=1;
		
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a number to find its factorial: ");
	   num = sc.nextInt();
	   
	   if (num < 0) {
           System.out.println("Factorial is not defined for negative numbers.");
           return;
       }
	   
	   do {
		   fact= fact*i;
		   i++;
	   }while(i<=num);
	   System.out.println("The factorial of " + num + " is: " + fact);
}
}