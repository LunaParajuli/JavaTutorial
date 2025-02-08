//Write a Java program to sort a numeric array and a string array. ==>
// 1789 2035 1899 1456 2013

package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array1 {
 
	public static void main(String args[]) {
		
    int sortArray[] = {1789 , 2035, 1899, 1456, 2013};
	
	Arrays.sort(sortArray);
	System.out.println("The sorted numbers are: "+Arrays.toString(sortArray));
	
	
	}
	
}
