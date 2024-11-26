/*  Case Study2:
 John and Paul went to watch a movie in theatre where they need to
buy two tickets. There are two types of tickets, one Golden category
and other as silver category. If they buy tickets for silver category,
then per person a ticket should cost Rs.150 and for golden category
ticket should cost them Rs.200 each.
Considering this scenario, write a program for theatre ticket booking
application scenario.

 */

package CaseStudy;

public class CaseStudy2 {

	public static void main(String args[]) {
		
	String category = "Golden";
	int person =2;
	
		if(category.equals("Golden")) {
			
			int total = 200 * person;
			System.out.println("The total ticket price of 2 person is: "+total);	
			}
		
		else {
			
			int total = 150 * person;
			System.out.println("The total ticket price of 2 person is: "+total);
			
		}
		
	}
	
}
