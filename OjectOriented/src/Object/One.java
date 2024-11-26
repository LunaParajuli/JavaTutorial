package Object;

abstract class demo1{
	abstract void test();
}


public class One extends demo1 {
	void test() {
		System.out.println("in the test...");
	}
	
     public static void main(String args[]) {
    	One a1 = new One();
    	a1.test();
     }
}
