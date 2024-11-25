// Write a program to generate 10 Fibonacci numbers

package DoWhile;

public class DoWhile6 {
	
	public static void main(String args[]) {
		
		 
	        int a = 0;    
	        int b = 1;
	        int current;
	        int i=1;

	        System.out.println("The first 10 Fibonacci numbers are:");
	        
	        do {
	             current = a + b; 
	            System.out.print(" "+current); 
	            a = b;          
	            b = current;       
	            i++;        
	        } while (i <=10); 
	}

}
