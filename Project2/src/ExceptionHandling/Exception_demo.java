package ExceptionHandling;

import java.io.*;

public class Exception_demo {
	
	public static void main(String args[]) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int a,b,c;
		
		try {
			
			System.out.println("Enter Number of a");
			a=Integer.parseInt(br.readLine());
			
			System.out.println("Enter Number of b");
			b=Integer.parseInt(br.readLine());
			
			c=a/b;
			
			System.out.println("The Result is: "+c);
				
		}
		
		catch(ArithmeticException ex) {
//			ex.printStackTrace();
			System.out.println("Exception is: "+ex);
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
		finally {
			System.out.println("Ended");
		}
		
	}

}



/* 
 
 Exception Handling:  Handling abnormal Error
 
 Error:
 1.Syntax Error
 2.Logical Error
 3.Run Time Error 
 
 Exception:Run Time Error
 
 Types:
 1.Using try...catch...finally
     Code BLock
 
 2.using throws:
    Method
    
 3.using throw
   user defined exception(Custom Exception)
   
      
 Types of Exceptions:
 a). Arithmetic Exception
 b). IOException
 c). NumberFormatException
 d). ArrayIndexOutOfBoundException
 e). SQLException
 f). RemoteException
  
 */
