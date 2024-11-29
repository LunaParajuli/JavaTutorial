
package OOriented;

abstract class Account {
    
	protected int account_number;
	protected String account_name;
	protected double balance_amount;
	
	double deposit;
	double withdraw;

	double total_balance;
	
	
	public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
	
	
	public Account(int account_number, String account_name, double balance_amount,double withdraw,double deposit, double total_balance ){
		 this.account_number = account_number;
		 this.account_name = account_name;
		 this.balance_amount = balance_amount;	 
		 this.withdraw = withdraw;
		 this.deposit = deposit;
		 this.total_balance = total_balance;
	}
	
	public void displayAccount(){
		System.out.println("The account number is : "+account_number);
		System.out.println("The account name is : "+account_name);
		System.out.println("The amount is: "+balance_amount);	
	}
		
}



