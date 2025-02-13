package arrays;

import java.util.Scanner;

public class hourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[6][6];
        
        // Reading 6x6 array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int maxSum = Integer.MIN_VALUE;

        // Loop through the matrix to form hourglass shapes
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calculate the sum of the hourglass
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                                + arr[i+1][j+1]
                          + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                
                // Update maxSum if this hourglass sum is greater
                maxSum = Math.max(maxSum, sum);
            }
        }
        
        System.out.println(maxSum);
        sc.close();
    }
}
