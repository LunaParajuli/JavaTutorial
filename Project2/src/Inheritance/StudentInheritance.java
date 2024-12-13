package Inheritance;

import java.io.*;

public class StudentInheritance  {
	
	public static void main(String args[]) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int reg_no;
		String studentName;
		String address;
		
		String stream;
		String level;
		int semester;
		
		int height;
		int weight;
		String skin_type;
		
		
		System.out.println("Enter the Student's Details:\n ");
		
		System.out.print("Enter the Registration No:");
		reg_no= Integer.parseInt(br.readLine());
		
		System.out.print("Enter the Student Name:");
		studentName= br.readLine();
		
		System.out.print("Enter the Address:");
		address= br.readLine();
		
		System.out.print("Enter the Stream:");
		stream= br.readLine();
		
		System.out.print("Enter the Level:");
		level= br.readLine();
		
		System.out.print("Enter the Semester:");
		semester=Integer.parseInt(br.readLine());
		
		System.out.print("Enter the Height:");
		height=Integer.parseInt(br.readLine());
		
		System.out.print("Enter the Weight:");
		weight=Integer.parseInt(br.readLine());
		
		System.out.print("Enter the Skin_Type:");
		skin_type=br.readLine();
		
		StudentDetail stds = new StudentDetail();
		
		stds.assignStudentInfo(reg_no,studentName,address);
		stds.assignAcademicInfo(stream,level,semester);
		stds.assignPhysicalInfo(height,weight,skin_type);
		
		
		stds.displayStudentDetail();	
	}	
}

class StudentInfo{
	int reg_no;
	String studentName;
	String address;


public void assignStudentInfo(int reg_no, String studentName, String address) {
	this.reg_no = reg_no;
	this.studentName = studentName;
	this.address = address;
}

public void displayStudentInfo() {
	System.out.println("Reg No is : "+reg_no);
	System.out.println("Name is: "+studentName);
	System.out.println("Address is : "+address);
}
}

class AcademicInfo extends StudentInfo  {
	String stream;
	String level;
	int semester;
	
	
	public void assignAcademicInfo(String stream, String level, int semester) {
	
		this.stream = stream;
		this.level = level;
		this.semester = semester;
	}
	
	public void displayAcademicInfo() {
		System.out.println("Stream is: "+stream);
		System.out.println("Level is: "+level);
		System.out.println("Semester is: "+semester);
	}
}


class PhysicalInfo extends AcademicInfo{
	
	int height;
	int weight;
	String skin_type;
	
	
	public void assignPhysicalInfo(int height, int weight, String skin_type) {
		this.height = height;
		this.weight = weight;
		this.skin_type = skin_type;	
	}
	
	public void displayPhysicalInfo() {
		System.out.println("The height(in inch) is: "+height);
		System.out.println("The weight(in kg) is: "+weight);
		System.out.println("The skin type is: "+skin_type);
	}
	
}

class StudentDetail extends PhysicalInfo{
	
	public void displayStudentDetail() {
		System.out.println("\nStudent Informations \n ");
		displayStudentInfo();
		displayAcademicInfo();
		displayPhysicalInfo();
	}
}

