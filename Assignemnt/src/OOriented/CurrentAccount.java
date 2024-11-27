package OOriented;

public class CurrentAccount extends Account {
	
	final double min_balance_CA = 100;
	
	public CurrentAccount(int account_number, String account_name, int balance_amount,double withdraw, double deposit, double total_balance) {
		 super(account_number,account_name,balance_amount,withdraw,deposit, total_balance);
	 }
	
	
	//amount deposit
		 public void depositAmount() {
		  
			 if(deposit>100) {
				 double new_balance= deposit+total_balance;
				 System.out.println("The new balance  is: "+new_balance);
			 }
			 else {
				 System.out.println("Deposit amount is not enough...... ");
			 }
		 }
		 
		 
		 //amount withdraw
		 public void withdrawAmount() {
			 if(balance_amount>min_balance_CA) {
				 double new_balance =  balance_amount - withdraw;
				 System.out.println("The new balance after withdrawn  is: "+new_balance);
			 }
			 else {
				 System.out.println("Not enough balance to be withdrawn...... ");
			 } 
		 }		 	
}
