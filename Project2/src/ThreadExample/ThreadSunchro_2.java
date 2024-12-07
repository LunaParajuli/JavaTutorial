package ThreadExample;


class Demo{
	
	public void printCounter() {
		try{
			for(int i=5;i>0;i--) {
				System.out.println("Count- "+i);
			}
		}
		catch(Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}	
}


class ThreadDemos extends Thread{
	  private Thread t;
	   private String threadName;
	   Demo  DS;

	   ThreadDemos( String name,  Demo ds){
	       threadName = name;
	       DS = ds;
	   }
	   
	   
	   public void run() {
	     synchronized(DS) 
		   {
	        DS.printCounter();
	     }
	     System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	
}


public class ThreadSunchro_2 {
	
	public static void main(String args[]) {
		
		 Demo DS = new Demo();

	      ThreadDemos TD1 = new ThreadDemos( "Thread - 1 ", DS );
	      ThreadDemos TD2 = new ThreadDemos( "Thread - 2 ", DS );

	      TD1.start();
	      TD2.start();

	      
	      try {
	         TD1.join();
	    
	      } catch( Exception e) {
	         System.out.println("Interrupted");
	      }
		
	}
	

}
