package ExceptionHandling;


public class ArrayException_demo {

	public static void main(String args[]) {
	
		
		int a[] = new int [] {10,20,40,50,60} ;
		
		try {
			
			for(int i=0;i<6;i++) {
			System.out.println(a[i]);
			}
		}
			
			catch(Exception e) {
//				e.printStackTrace();
			System.out.println("Exception is: "+e);
			}
		
	}
}