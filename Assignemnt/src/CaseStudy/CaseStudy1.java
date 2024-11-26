/* 
 Case Study1:
An Amusement park company wants one application for their billing
counter to enable ticket sale. Assume the Amusement park authorities
approached Max to get this application developed.

This application should have ticket prize as Rs 400 per person and if a
person buys more than 10 tickets then person is eligible for 10 percent
discount. Calculate the total bill or amount according to the number of
tickets that are sold.
 */


package CaseStudy;

public class CaseStudy1 {
	
	public static void main(String args[]) {
		 
		int ticket_price = 400;
		int person = 11;
		
if(person>10) {
	int discount = 400/10;
	int final_price = (ticket_price-discount)*person;
	System.out.println("The total price is: "+final_price);
}
else {
	int final_price = 400*person;
	System.out.println("The total price is: "+final_price);
}	
	}
}
