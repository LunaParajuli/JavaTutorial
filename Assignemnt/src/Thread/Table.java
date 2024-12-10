/*  
 Write a program to print tables of 5 by creating a new thread and display 20 even numbers  
as a task of main thread

 */

package Thread;


public class Table extends Thread  {
	
	 public void run() {
		 try {
				for(int i=1;i<10;i++) {
					int table = 5*i;
					System.out.println("5 " + "* "+ i + " = " +table);
				}
			}
			catch(Exception e)
		 {
			e.printStackTrace();
			}
	 }	 
	
	
	
	public static void main(String args[]) {
		
		NewThread nt = new NewThread();
		
		Thread t1 = new Thread(nt);
		t1.start();
		
		
		Thread t2= new Thread(nt);
		t2.start();
		
		try {
			
			Thread.sleep(1000);
			System.out.println("The 20 even numbers are: ");
			for(int i=1;i<42;i++) {
				if(i%2==0) {
					System.out.println(i);
				}	
			}
		}
		catch(Exception e) {
		e.printStackTrace();
		}
		
	}

}
