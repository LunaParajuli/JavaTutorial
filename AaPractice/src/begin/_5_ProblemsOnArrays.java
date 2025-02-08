package begin;

public class _5_ProblemsOnArrays {
	
	public static void main(String[] args) {
		
		int numbers[] = {23, 12, 6, 7, 15, 3, 2, 56};
		
//		int sum =0;
//		 
//		for(int number:numbers) {
//			sum+= number;
//		}
//		System.out.println("Sum is: "+sum);
		
		System.out.println(Integer.MAX_VALUE);
		int min =Integer.MAX_VALUE;
		
		for(int number:numbers) {
			if(number<min) {
				min=number;
			}
		}
		System.out.println("minimun is: "+min);
		
	
	}

}
