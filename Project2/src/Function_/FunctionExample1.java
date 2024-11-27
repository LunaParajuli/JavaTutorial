package Function_;

public class FunctionExample1 {

	public static void main(String args[]) {
		String msg;
		FunctionDemo fe = new FunctionDemo();
		
		//calling void method
		fe.displayMessage();
		
		//calling return type method
		
		msg = fe.displayMessage("Welcome to return type method");
		//System.out.println(msg);
		
		
		int total = fe.sum(10, 20);
		System.out.println("The sum is: "+total);
		
	}
}

class FunctionDemo{
	String message;
	public void displayMessage() {
		message= "Welcome to Function";
		System.out.println(message);
	}
	
	public String displayMessage(String message) {
		return message;
}
	
	
	public int sum(int a, int b) {
		return a+b;
	}
}
