package StudentObject;

public class StudentInfo   {
 
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