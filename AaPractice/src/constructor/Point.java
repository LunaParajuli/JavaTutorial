/*
  Overloading Constructors with Different Data Types
Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:

One constructor takes int parameters.
Another constructor takes double parameters.
Print the values of the variables for each constructor.
 
 */

package constructor;

public class Point {
	
	//Instance variables
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	public Point(double x, double y) {
		this.x = (int) x;
		this.y = (int) y;	
	}
	
	 // Method to print the values of x and y
    public void printPoint() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }
	
	public static void main(String[] args) {
		
		Point p1 = new Point(10,20);
		p1.printPoint();
		
		Point p2 = new Point(30.6,40.7);
		p2.printPoint();
		
	}

}
