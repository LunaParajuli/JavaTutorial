//Iteration in HashMap

package Collection;

import java.util.*;

public class IterationInHashMap {
	
 public static void main(String args[]) {
	
	 int arr[] = {12,15,18};
	 for(int i=0;i<3;i++) {
		 System.out.println(arr[i]+"");
	 }
	 System.out.println();
 
 for(int val:arr) {
	 System.out.println(val+"");
 }
 System.out.println();
 
}
}
