package OOriented;

import java.io.*;

public class Account  {
	
	
	
	//Class Variables
	
	int balance;
	int previousTransactions;
	String customerName;
	String customerID;
	
	//class constructor
	Account(String cname, String cid){
		customerName = cname;
		customerID = cid;
	}
	
	//function for depositing money
	void deposit(int amount) {
		if(amount!=0) {
			balance = balance+amount;
			previousTransactions = amount;
		}
	}
	
	//function for withdrawing money
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransactions = -amount;
		}
	}
	
	//function showing the previous transaction
	void getPreviousTransaction() {
		if(previousTransactions >0) {
			System.out.println("Deposited: "+ previousTransactions);
			
		}else if(previousTransactions <0) {
			System.out.println("Withdrawn: "+ Math.abs(previousTransactions));
			
		}else {
			System.out.println("No transaction occured.");
		}
	}

	
	//function calculating interest of current funds after a number of years
	void calculateInterest(int years) {
		double interestRate = .0185;
		double newBalance = (balance * interestRate * years)+balance;
		System.out.println("The current interest rate is: "+(100 * interestRate)+ "%");
		System.out.println("After "+years+" years, your balance wil be: "+newBalance);
	}
	
	//function showing the main menu
	void showMenu() throws IOException{
		char option = '\0';
		

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Welcome, "+ customerName + "!");
		System.out.println("Your ID is: "+ customerID );
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit");
		
		do {
			System.out.println();
			System.out.println("Enter an option:");
			char option1= (char)br.read();
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			
			//Case 'A' allows the user to check their account balance
			case 'A':
				System.out.println("**************");
				System.out.println("Balance = $"+ balance);
				System.out.println("***********************");
				System.out.println();
				break;
				
				//Case 'B' allows the user to deposit money into their account using 
			case 'B':
				System.out.println("Enter an amount to deposit: ");
				int amount = Integer.parseInt(br.readLine());
				deposit(amount);
				System.out.println();
				break;	
				
				//Case 'C' allows the user to withdraw money into their account using 
			case 'C':
				System.out.println("Enter an amount to withdraw: ");
				int amount2 = Integer.parseInt(br.readLine());
				withdraw(amount2);
				System.out.println();
				break;	
				
				//Case 'D' allows the user to withdraw money into their account using 
			case 'D':
				System.out.println("***********************");
				getPreviousTransaction();
				System.out.println("***********************");
				System.out.println();
				break;	
				
				//Case 'E' calculates the accrued interest on the account after a number
			case 'E':
				System.out.println("Enter how many years of accured interest: ");
				int years = Integer.parseInt(br.readLine());
				calculateInterest(years);
				break;	
				
				//Case 'F' exists the user from their account
			case 'F':
				System.out.println("***********************");
				break;
				
				//The default case let's the user know that they entered an invalid character
				default:
					System.out.println("Error: invalid option. Please enter A,B,C,D,E,F");
					break;
			}
			
		}while(option !='F');
		System.out.println("Thank you for banking with us!");
		
	}
	
	
	
}
