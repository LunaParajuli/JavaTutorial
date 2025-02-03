package com.example.mainproject;
import com.example.entity.Account;
import com.example.entity.Library;
import com.example.entity.Student;
import com.example.util.HibernateUtil;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {

    	public static void main( String[] args ) {
        	//Create the student object.
        	Student user = new Student();
        	
        	//Setting the object properties.
        	user.setName("Vivek");
        	user.setEmail("vivek@gmail.com");
        	
        	
        	Account account = new Account();
        	
        	account.setUsername("John");
        	account.setPassword("password");
        	account.setStudent(user);
        	
        	
        	Library library = new Library();
        	
        	library.setBookname("CS");
        	library.setIssueDate(LocalDate.now());
        	library.setReturnDate(LocalDate.now().plusDays(14));
            library.setFine(0.0);
        	library.setStudent(user);
        	
        	
        	Transaction tx = null;
        	//Get the session object.
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	try{
                  //Start hibernate session.
        	      tx = session.beginTransaction();
     
                  //Insert a new student record in the database.
        	      session.save(user); 
        	      session.save(account); 
        	      session.save(library);
     
                  //Commit hibernate transaction if no exception occurs.
        	      tx.commit();
        	      System.out.println("Saved Successfully.");
        	  }catch (HibernateException e) {
        	     if(tx!=null){
                     //Roll back if any exception occurs. 
        	         tx.rollback();
        	     }
        	     e.printStackTrace(); 
        	  }finally {
                 //Close hibernate session.
        	     session.close(); 
        	  }
        }
}