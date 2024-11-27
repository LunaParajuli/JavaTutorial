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
                account = new SBAccount(accountNumber, name, initialBalance);
                break;
            case 2:
                if (initialBalance < Account.min_balance_CA) {
                    System.out.println("Initial balance must be at least " + Account.min_balance_CA + " for a Current Account.");
                    return;
                }
                account = new CurrentAccount(accountNumber, name, initialBalance);
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
