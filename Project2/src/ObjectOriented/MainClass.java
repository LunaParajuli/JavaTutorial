package ObjectOriented;

import java.io.*;

public class MainClass {
 public static void main(String args[])throws IOException {
	 
	 
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	 
	int reg_no;
	String studentName;
	String stream;
	
	reg_no= Integer.parseInt(br.readLine());
	studentName= br.readLine();
	stream= br.readLine();
	
	System.out.print("Enter register number:");
	System.out.print("Enter Student Name:");
	System.out.print("Enter stream:");
	
	 
	 //Here we create a new object called alex.
//	 Students student = new Students();s
//	 student.assign(101,"John","Engineering");
//	 student.display();
//	 
//	 
//	 student.assign(90, 80, 70);
//	 student.calculate();
//	 

	 
	 Students std1 = new Students();
	 Students std2 = new Students(reg_no,studentName,stream);
	 std2.display();
	
 }
}
