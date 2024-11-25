package StudentObject;

public class StudentInfo extends PhysicalInfo  {
 
	int reg_no;
	String studentName;
	String address;


public StudentInfo(int reg_no, String studentName, String address) {
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