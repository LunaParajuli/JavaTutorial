package StudentObject;

public class StudentDetail {
	
	public static void main(String args[]) {
		
		StudentInfo info1 = new StudentInfo();	
		info1.assign(100,"Joe","jamal");
		info1.display();
		
		AcademicInfo info2 = new AcademicInfo();
		info2.assign("CSIT","Fourth Year",8);
		info2.display();
		
		PhysicalInfo info3 = new PhysicalInfo();
		info3.assign(20,60,"Brown");
		info3.display();
		
	}
}
