package Inheritance;

public class StudentInheritance {
	
	public static void main(String args[]) {
		StudentInheritance std = new StudentInheritance();
		
	}
	
}

class StudentInfo{
	int reg_no;
	String studentName;
	String address;


public void assign(int reg_no, String studentName, String address) {
	this.reg_no = reg_no;
	this.studentName = studentName;
	this.address = address;
}

public void display() {
	System.out.println("Reg No is : "+reg_no);
	System.out.println("Name is: "+studentName);
	System.out.println("Address is : "+address);
}
}

class AcademicInfo {
	String stream;
	String level;
	int semester;
	
	
	public void assign(String stream, String level, int semester) {
	
		this.stream = stream;
		this.level = level;
		this.semester = semester;
	}
	
	public void display() {
		System.out.println("Stream is: "+stream);
		System.out.println("Level is: "+level);
		System.out.println("Semester is: "+semester);
	}
}


class PhysicalInfo{
	
	int height;
	int weight;
	String skin_type;
	
	
	public void assign(int height, int weight, String skin_type) {
		this.height = height;
		this.weight = weight;
		this.skin_type = skin_type;	
	}
	
	public void display() {
		System.out.println("The height(in inch) is: "+height);
		System.out.println("The weight(in kg) is: "+weight);
		System.out.println("The skin type is: "+skin_type);
	}
	
}

