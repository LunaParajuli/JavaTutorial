//Write a program to print 10 even numbers and 10 odd numbers.


package WhileLoop;

public class WhileLoop1 {
 public static void main(String args[]) {
	 int number=1;
	 int evenCount=0;
	 int oddCount=0;
	 System.out.println("First 10 even numbers are: ");
	 while(evenCount < 10) {
		if(number%2==0) {
			System.out.print(number + " ");
			evenCount++;
		}
		number++;
	 }
	 
	 
	 
	 System.out.println("\nFirst 10 odd numbers are: ");
	 number=1;
	 while(oddCount < 10) {
		if(number%2!=0) {
			System.out.print(number + " ");
			oddCount++;
		}
		number++;
	 }
 }
}
