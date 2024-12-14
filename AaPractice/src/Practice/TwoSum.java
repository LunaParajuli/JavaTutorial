//Two Sum Using Array

package Practice;

import java.io.*;

public class TwoSum {
public static void main(String args[]) throws IOException {
	
	 InputStreamReader isr = new InputStreamReader(System.in);
	 BufferedReader br = new BufferedReader(isr);
	 
	 System.out.print("Enter the arrays number: ");
	 int n =Integer.parseInt(br.readLine());
	
	  int num[] = new int[n];
	  
	  System.out.println("Enter the "+n+ " elements: ");
	  
	  for(int i=0;i<n;i++) {
		  num[i] = Integer.parseInt(br.readLine()); 
	  }
	  
	  int Sum = 0;
	  for(int i=0;i<n;i++) {
		  Sum += num[i];
	  }
	  System.out.println("The sum is: "+Sum);
		  
}
}
