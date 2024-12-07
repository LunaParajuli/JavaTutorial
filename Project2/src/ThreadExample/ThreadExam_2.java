package ThreadExample;

public class ThreadExam_2 {
	
	public static void main(String args[]) {
		
          Thread th = new Thread(new RunnableDemo());
           th.start();

	
	}

}
 class RunnableDemo implements Runnable{
	 
	 @Override 
	 
	 public void run() {
		 
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	 }
 }



	 



