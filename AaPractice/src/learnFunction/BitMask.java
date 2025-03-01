//Bit Operation

package learnFunction;


public class BitMask {
	
	static void BitOperation()  {
		 
		//bitwise AND operator &
		
		int a = 5;  //  0101
		int b = 3 ; //  0011
		
		int addBitwise = a & b;
		System.out.println(a+ " & "+b+" : "+addBitwise);
		System.out.println("Binary representation is: "+addBitwise);
		
		int OrBitwise = a | b;
		System.out.println(a+ " | "+b+" : "+OrBitwise);
		System.out.println("Binary representation is: "+OrBitwise);
		
	}
	

	public static void main(String[] args) {
		BitOperation();
	
	}

}
