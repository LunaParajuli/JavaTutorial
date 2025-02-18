//Write a Java program to create a class called "Book" with instance variables title, author, and price. 
//Implement a default constructor and two parameterized constructors:
//One constructor takes title and author as parameters.
//The other constructor takes title, author, and price as parameters.
//Print the values of the variables for each constructor.


package constructor;

public class Book {
	
	String title;
	String author;
	int price;
	
	public Book() {
		
	}
	
	public Book(String title ,String author ) {
		this.title  = title;
		this.author = author;
		
	}
	
public Book(String title ,String author, int price ) {
		this.title  = title;
		this.author= author;
		this.price = price;
		
	}
	
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		System.out.println("The book1 title: "+book1.title);
		System.out.println("The book1 title: "+book1.author);
		System.out.println("The book1 price: Rs"+book1.price);
		
		
		Book book2 = new Book("ABC","Joe");
		
		System.out.println("The book2 title: "+book2.title);
		System.out.println("The book2 title: "+book2.author);
		System.out.println("The book2 price: Rs"+book2.price);
		
		
Book book3 = new Book("ABCDEF","John",1000);
		
		System.out.println("The book3 title: "+book3.title);
		System.out.println("The book3 title: "+book3.author);
		System.out.println("The book3 price: Rs"+book3.price);
	}

}
