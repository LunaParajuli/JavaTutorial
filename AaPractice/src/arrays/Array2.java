//Write a Java program to sum values of an array.

package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array2 {

	public static void main(String args[])   {
		try {
			
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		System.out.println("Enter the size of array: ");
        int size = Integer.parseInt(br.readLine());
		int array_sum[] = new int[size];
		
		//input
		
		System.out.println("Enter the array of numbers:");
		for(int i=0; i<size;i++) {
			array_sum[i] = Integer.parseInt(br.readLine());
		}
		//System.out.print("The given arrays are:"+array_sum[i]+" ");
		
		
		//output
		int summedValue = 0;
		for(int num:array_sum) {
			summedValue += num;
		}
		System.out.print("The sum of array is: "+summedValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




/*
 *
 * import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int a[] = new int [n];
        
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
 * 
 * */
