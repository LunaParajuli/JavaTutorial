package begin;

public class _2break {

	public static void main(String args[]) {
		for(int i=0; i<=20;i+=1) {
		if(i==2 || i==8)continue;
			if(i>=15)break;
			System.out.println("Gave toffee to "+i);
		}
	}
}
