package ThreadExample;

public class Threads extends Thread {
	
	 
	 public void run() {
		
		 try {
			 int i;
			 for(i=1;i<=10;i++) {
				 System.out.println(i);
			 }
			 
		 }
		 catch(Exception e) {
			 System.out.print("Thread  interrupted "+e);
		 }
		 
	 }
	
	public static void main(String args[]) {
		
		NewThread nt = new NewThread();
		Thread t1= new Thread(nt);
		t1.start();
		Thread t2= new Thread(nt);
		t2.start();
		
			try {
				
				Thread.sleep(1000);
				
				int i;
				 for(i=10;i>=1;i--) {
					 System.out.println("    "+i);
				 }
				 
			 }
			 catch(Exception e) {
				 System.out.print("Thread  interrupted "+e);
			 }
			 
				
			}
		
	}
	

