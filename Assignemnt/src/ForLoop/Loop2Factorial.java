//Write a program to find factorial of a number.

package ForLoop;

import java.util.*;

public class Loop2Factorial {
  public static void main(String args[]) {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter any number: ");
	  int number = sc.nextInt();
	  
	  
	  int factorial =1;
	  for(int i=1;i<=number;i++) {
		factorial = factorial*i;
		
	  }
	  System.out.println("The factorial of "+ number + " is: "+factorial);
  }
}
