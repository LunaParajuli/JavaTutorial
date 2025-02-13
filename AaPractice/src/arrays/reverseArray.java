//Reverse an Array
//
//Input: {10, 20, 30, 40, 50}
//Output: {50, 40, 30, 20, 10}


package arrays;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class reverseArray {
	
public static void main(String args[]) {
	int arr[] = {10, 20, 30, 40, 50};
	
	System.out.println("The given array is: "+Arrays.toString(arr));
	
	result(arr);
	System.out.println("The reversed array is : "+Arrays.toString(arr));
	
}

public static void result(int arr[]){
	
	  int left = 0, right = arr.length - 1;
      while (left < right) {
    	  
          // Swap elements
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left++;
          right--;
		 
	}
	
}



}
