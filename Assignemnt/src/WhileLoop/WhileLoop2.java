//Write a program to find factorial of a number.

package WhileLoop;

import java.util.*;

public class WhileLoop2 {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int num = sc.nextInt();
     int i=1;
     int fact=1;
     
     
     while(i<=num) {
       fact = fact*i;
       i++;
     }
     
     System.out.println("The factorial of " +num+ " is : "+fact);
}
}
