//Find the Largest and Smallest Element in an Array
//Input: {3, 5, 7, 2, 8}
//Output: Smallest = 2, Largest = 8

package arrays;

import java.awt.DisplayMode;

public class largestSmallest {
	
	public static void maxmin(int [] arr){
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
		      if (arr[i] < min) {
		          min = arr[i]; // Update min
		      }
		      if (arr[i] > max) {
		          max = arr[i]; // Update max
		      }
		  }

		  // Print results
		  System.out.println("Smallest = " + min);
		  System.out.println("Largest = " + max);
		}
		
		
	public static void main(String[] args) {
		
		int [] arr = {3,5,7,2,8};
	    maxmin(arr);
		
	}

}
