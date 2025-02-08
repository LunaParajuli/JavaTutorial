package begin;

public class _7_LearnMath {
	public static void main(String args[]) {
		int a=4;
		int b=7;
		
		System.out.println(Math.min(a, b));
		System.out.println(Math.max(a, b));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.pow(a, b));
		
		//Math.abs(x) ==> make positive no negative
		//Math.random()==> value is 0 to 1
		//Math.round()
		
		System.out.println(getRandom());
	}
	
	public static int getRandom() {
		return (int) (Math.random()*6);
		
	}

}
