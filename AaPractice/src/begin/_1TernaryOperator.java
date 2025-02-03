package begin;

public class _1TernaryOperator {
	
	public static void main(String args[]) {
		
		int a =26;
		int b=23;
		int c= 12;
		int max =0;
		
//		if(a>b) {
//			max=a;
//		}
//		else {
//			max=b;
//		}
		
//		max = a>b ? a:b;
		 max = a>b ? a>c ? a:c:b>c?b:c;
		
		
		
		
		System.out.println("Value of max: "+max);
		
	}

}
