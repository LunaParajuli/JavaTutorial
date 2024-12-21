//Write a program to write 5 employee records using HashMap and display them.

package Collection;

import java.util.*;
import java.io.*;

public class Hashmap_ {
	
	public static void main(String args[]) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the 5 employee records:-");
		
		int emp_id;
		String emp_name;
		
//		emp_id = Integer.parseInt(br.readLine());
//		emp_name = br.readLine();
//		
	}

}

class Employee{
	int emp_id;
	String emp_name;
	
	public Employee(int emp_id, String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	public void  display() {
		System.out.println("Employee_id: "+emp_id);
		System.out.println("Employee_name: "+emp_name);
	}
}