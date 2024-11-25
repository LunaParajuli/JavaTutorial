//Write a program to reverse the digits of a number.

package ForLoop;

import java.util.*;

public class Loop6Reverse {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int num = sc.nextInt();
	 
	 int reverse= 0;
	 
	 for(; num !=0;num/=10) {
		 int digit = num%10;
		  reverse = reverse*10 + digit;
		
	 }
	 System.out.println("The reversed number is: "+reverse);
 }
}
