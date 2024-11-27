package Array_;

public class ArrayExample2 {
	
	public static void main(String args[]) {
		
		int i,j;
		int c [][] = new int[3][2];
		
		int a[][] = new int[][] {
			{10,20},
			{60,70},
			{80,90}
		};
		
		
		int b[][] = new int[][] {
			{11,21},
			{61,71},
			{81,91}
		};
		
		
		for( i=0;i<3;i++) {
			for( j=0;j<2;j++) {
//				System.out.println(a[i][j]);
				
				 c[i][j] = a[i][j]+ b[i][j];
				 System.out.println(c[i][j]);
			}
		}
	}

}
