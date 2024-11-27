package OOriented;


 final class SBAccount extends Account {
	 
	private static final double interest_rate = 0.04;

    private static final double min_balance_SB = 1000;
	
	
	
    
	 public SBAccount(int account_number, String account_name, double balance_amount,double withdraw, double deposit,double total_balance) {
		 super(account_number, account_name, balance_amount, withdraw, deposit, total_balance);
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
		 if(balance_amount>min_balance_SB) {
			 double new_balance =  balance_amount - withdraw;
			 System.out.println("The new balance after withdrawn  is: "+new_balance);
		 }
		 else {
			 System.out.println("Not enough balance to be withdrawn...... ");
		 }
		 
	 }
	 
	 public void addInterest() {
		  total_balance = interest_rate*balance_amount;
		 System.out.println("The total balance per month is: "+total_balance);
		 
	 }
	 
	 
}
