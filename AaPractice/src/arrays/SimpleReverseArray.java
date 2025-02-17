package arrays;
import java.util.Scanner;

public class SimpleReverseArray {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt(); // Number of integers
	        int[] A = new int[N];
	        
	        // Reading array elements
	        for (int i = 0; i < N; i++) {
	            A[i] = sc.nextInt();
	        }
	        
	        // Printing array in reverse order
	        for (int i = N - 1; i >= 0; i--) {
	            System.out.print(A[i] + " ");
	        }
	        
	        sc.close();
	    }
	}

	


