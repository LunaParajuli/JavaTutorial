//Write a program to generate 10 Fibonacci numbers.

package ForLoop;

import java.util.*;

public class Loop5fibonacci {
public static void main(String args[]) {
	int a=0,b=1,current;
	int num=10;
	System.out.println("The 10 fibonacci sequence are: ");
	
	for(int i=1;i<=num;i++) {
		current=a+b;
		a=b;
		b=current;
		System.out.print(" "+ current);
	}
	
}
}
