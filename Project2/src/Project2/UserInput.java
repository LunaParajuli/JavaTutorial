package Project2;

import java.io.*;

public class UserInput  {
	
	public static void main(String args[]) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		
		
		String name;
		int age;
		char gender;
		
		//Integer Input
		System.out.print("Enter age to verify that you are eligible to cast vote or not:");
		age= Integer.parseInt(br.readLine());
		
		//String Input
		System.out.print("Enter Name:");
		name= br.readLine();
		
		//Character Input
		System.out.print("Enter Gender:");
		gender= (char)br.read();
		
		
		System.out.println("Your Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
		
		
		if(age>=18) {
			System.out.println("You are eligible");
			
		}
		else {
			System.out.println("You are not eligible");
		}
	}

}
