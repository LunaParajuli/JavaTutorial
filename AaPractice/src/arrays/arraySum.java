//Create an array of 5 floats and calculate their sum...

package arrays;

import java.util.*;

public class arraySum {

	public static void main(String args[]) {
		
//	int a[] = {10, 5, 6, 1, 4, 7};
//	
//	System.out.println(Arrays.toString(a));
//	int sumFirst = a[0]+a[1];
//	System.out.println(sumFirst);
//	
//Arrays.sort(a);
//System.out.println("The sorted array is: "+Arrays.toString(a));
//	
//int sum = a[0]+a[1];
//System.out.println(sum);
		
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = scanner.nextInt();
		
		int a[]= new int[n];
		
		System.out.print("Enter the numbers:"+" ");
		
		for(int i=0; i<n;i++) {
			  a[i] = scanner.nextInt();
		}
		System.out.println("The given array is: "+ Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("The sorted array is: "+Arrays.toString(a));
			
		int sum = a[0]+a[1];
		System.out.println(sum);
		
	
	}
	
}
