package Project2;

public class SwitchCase {

	public static void main(String args[]) {
		String outcome = "Tail";
		
		switch(outcome) {
		case "Head":
				System.out.println("Tom wins");
		        break;
		
		case "Tail":
		        System.out.println("Adam wins");
		        break;
		
		default:
		        System.out.println("Invalid input");
		}
	}
}
