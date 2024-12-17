/*
 
1. Write classes to hold Account, SB-Account and Current-Account details. [Here implement 
the concept of inheritance.]  
The common properties of the account are Account number, name and amount.  
Specifics of SB account is 4% interest to be paid per month.  
=> Implement the run-time polymorphism by creating base class variable and derived class 
object.    
=> Ask the user for which type of account to be created then create the corresponding 
account (Note: Use scanner class).  
=> Implement function overriding by having deposit and withdraw functions and perform the 
required action accordingly.  
Ensure base class can’t be instantiated. (Note: Abstract keyword can be used).  

2. Define the minimum balance for the both the type of accounts. Use final keyword to 
create constants.    
Ensure sb account class and current account class will cannot be used as base classes (Note: 
You can use final classes). 

*/


package OOriented;

import java.util.*;

public class Bank {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Bank");
        System.out.println("Select Account Type:");
        System.out.println("1. Savings Bank Account");
        System.out.println("2. Current Account");
        
        
        int choice = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        Account account;

        // Create account based on user choice
        switch (choice) {
            case 1:
                if (initialBalance < Account.min_balance_SB) {
                    System.out.println("Initial balance must be at least " + Account.min_balance_SB + " for a Savings Account.");
                    return;
                }
                account = new SBAccount(account_number, account_name, initialBalance);
                break;
            case 2:
                if (initialBalance < Account.min_balance_CA) {
                    System.out.println("Initial balance must be at least " + Account.min_balance_CA + " for a Current Account.");
                    return;
                }
                account = new CurrentAccount(account_number, account_name, initialBalance);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Account operations
        account.displayAccount();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        if (account instanceof SBAccount) {
            System.out.println("3. Add Interest");
        }
        System.out.println("4. Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    if (account instanceof SBAccount) {
                        ((SBAccount) account).addInterest();
                    } else {
                        System.out.println("Invalid operation for Current Account.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting. Thank you for using the bank!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid operation. Try again.");
            }
        }

        
	}

}
