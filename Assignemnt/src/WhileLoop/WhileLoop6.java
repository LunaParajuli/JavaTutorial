// Write a program to generate 10 Fibonacci numbers.

package WhileLoop;



public class WhileLoop6 {
  public static void main(String args[]) {
	  
	  int a=0;
	  int b=1 ;
	  int current;
	  int i=1;
	  
	  System.out.println("The  first 10 fibonacci numbers are:");
	  while(i <= 10) {
		  current = a+b;
		  
		  a=b;
		  b=current;
		  System.out.print(" "+current);
		  i++;
		 
	  }
	  
  }
}
