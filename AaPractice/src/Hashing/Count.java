package Hashing;

import java.util.*;

public class Count {
	
	public static void main(String args[]) {
		 
		int arr[] = {5,10,5,4,5,10};
		
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			boolean isDistinct = true;
			
			for(int j=0;j<i;j++) {
				
				if(arr[i]==arr[j]) {
					isDistinct = false;
					break;
				}
			}
			if(isDistinct) {
				count++;
			}
		}
		System.out.println("Count Distinct Elements:"+count);
	}

}
