package Practice;

public class NextSum {
	
public static void main(String args[]) {
	int nums[] = new int[] {2,7,11,5};
	int target =9;
	int sum=0;
	
	for(int i=0; i<nums.length;i++) {
		sum = nums[i]+nums[i+1];
	}
	if(sum==target) {
		System.out.println("The output is: "+ sum);
	}
	
}
}
