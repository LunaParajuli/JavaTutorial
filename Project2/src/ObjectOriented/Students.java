package ObjectOriented;

public class Students {

	int reg_no;
	String studentName;
	String stream;
	
	
	//Constructor Initializing
	//No argument constructor
	public Students() {
		System.out.println("Initializing...");
	}
	
	public Students(int reg_no, String studentName, String stream) {
		this.reg_no = reg_no;
		this.studentName = studentName;
		this.stream = stream;
	}
	
	
//	String Math;
//	String Science;
//	String English;
//	
//	int math,science,english;
//	
//	
//	//By implementing methods and method overloading
//	public void assign() {
//		reg_no=101;
//		studentName ="Alex";
//	    stream="Science and Technology";
//	}
//	
//	public void assign(int reg_no, String studentName, String stream) {
//		this.reg_no = reg_no;
//		this.studentName = studentName;
//		this.stream = stream;
//	}
//	
//	public void assign(int math, int science, int english) {
//		this.math = math;
//		this.science = science;
//		this.english = english;
//	}
//	
//	public void calculate() {
//		int total = math+science+english;
//		System.out.println("The total marks is: "+total);
//	}
	
	
	public void display() {
		System.out.println("Reg No is : "+reg_no);
		System.out.println("Name is: "+studentName);
		System.out.println("Stream is : "+stream);
//		System.out.println("Math : "+math);
//		System.out.println("Science: "+science);
//		System.out.println("English: "+english);
		
			
	}
	
	
}
