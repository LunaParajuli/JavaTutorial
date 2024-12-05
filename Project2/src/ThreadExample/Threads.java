package ThreadExample;

public class Threads extends Thread {
	
	 Threads(){
		start();
	}
	 
	 
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
		
		new Threads();
		
			try {
				
				Thread.sleep(3000);
				
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
	

