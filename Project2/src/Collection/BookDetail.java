package Collection;

import java.util.*;

public class BookDetail {

	public static void main(String args[]) {
		
		ArrayList<Publisher> pb = new ArrayList<Publisher>();
		pb.add(new Publisher("ABC"));
		
		
		for(Publisher pb1:pb) {
			System.out.println("Publisher name: "+pb1.pub_name);
			
		}
		
		
		ArrayList<Author> au = new ArrayList<Author>();
		au.add(new Author("DEF"));
		
		for(Author au1:au) {
			System.out.println("Author name: "+au1.author_name);
			
		}
		
		
		ArrayList<Book> bo = new ArrayList<Book>();
		bo.add(new Book("GHI",500));
		
		
		for(Book bo1:bo) {
			System.out.println("Book name: "+bo1.book_name);
			System.out.println("Price of Book: "+bo1.price);
			
		}
		
		
	}
}

class Publisher{
	String pub_name;
	
	public Publisher(String pub_name) {
		this.pub_name = pub_name;
	}
}

class Author  {
	
	String author_name;
	
	public Author(String author_name) {
		this.author_name = author_name;
	}
}

class Book {
	String book_name;
	int price;
	
	
	public Book(String book_name, int price) {
		this.book_name = book_name;
		this.price = price;
	}
}
