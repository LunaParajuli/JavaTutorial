//Write a program to generate tables of 10.

package DoWhile;

public class DoWhile3 {
 public static void main(String args[]) {
	 int table;
	 int i=1;
	 
	 System.out.println("The table of 10:");
	 
	 do {
		 table = i*10;
		 System.out.println("10 * "+i+" = "+table);
		 i++;
		 
	 }while(i<=10);
	 
	 
 }
}
