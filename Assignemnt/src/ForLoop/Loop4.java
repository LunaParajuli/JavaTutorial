// Write a program to add the digits of a number.

package ForLoop;

import java.util.*;

public class Loop4 {
   public static void main(String args[]) {
	   int sum=0, digit;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number: ");
	    digit = sc.nextInt();
	  
	   
	   for(;digit!=0; digit/=10) {
		  sum += digit%10;
		  
	   }
	   System.out.println("The sum of digit of a given number is : "+sum);
	   
	   
   }
}
