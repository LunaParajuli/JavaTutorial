package Project2;

public class ForLoop1 {
public static void main(String args[]) {
	int i,j;
	for(i=1;i<=10;i++) {
		for(j=1;j<=10;j++) {
			int k=i*j;
			System.out.println(i+" * "+j+" = "+k);
			System.out.println("");
		}
	}
}
}
