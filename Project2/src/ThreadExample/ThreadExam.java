package ThreadExample;

public class ThreadExam  {

	public static void main(String args[]) {
		
		NewThread nt = new NewThread();
		Thread t1= new Thread(nt);
		t1.start();
		Thread t2= new Thread(nt);
		t2.start();
	}
}

class NewThread extends Thread{
	
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println(i);
		}
	}
}
 