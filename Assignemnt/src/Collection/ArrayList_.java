//Write a program to insert 1 to 10 numbers in ArrayList and display them.

package Collection;
import java.util.*;

public class ArrayList_ {
	public static void main(String args[]) {
		
		 // Create an ArrayList to store integers
         ArrayList<Integer> num = new ArrayList<Integer>();
         
         //Insert 1 to 10 numbers into ArrayList
         for(int i=1;i<=10;i++) {
        	 num.add(i);
         }
         
        //Display 
         System.out.println("The numbers from 1 to 10 are: ");
         for(int number:num) {
        	 System.out.println(number);
         }
        
         
         
}
}

