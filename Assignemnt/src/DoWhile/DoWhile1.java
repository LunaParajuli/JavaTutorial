//Write a program to print 10 even numbers and 10 odd numbers.

package DoWhile;

public class DoWhile1 {
	public static void main(String args[]) {
		
		int even=0;
		int odd=0;
		int num=1;
		
		System.out.println("The first 10 even numbers are: ");
		do {
			if(num%2 == 0) {
				System.out.print(" "+num);
				even++;
			}
			num++;
		}
		while(even<10); 
		
		
		num=1;
		System.out.println("\nThe first 10 odd numbers are: ");
		do {
			if(num%2 != 0) {
				System.out.print(" "+num);
				odd++;
			}
			num++;
		}
		while(odd<10); 
		
	}
}
