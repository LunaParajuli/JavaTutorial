package StudentObject;

public class StudentDetail {
	
	public static void main(String args[]) {
		
//		StudentInfo info1 = new StudentInfo(100,"Joe","jamal");	
//		info1.display();
//		
//		AcademicInfo info2 = new AcademicInfo("CSIT","Fourth Year",8);
//		info2.display();
		
		PhysicalInfo info3 = new PhysicalInfo(20,60,"Brown");
		info3.display();
		info3.StudentInfo(100,"Joe","jamal");
		info3.AcademicInfo("CSIT","Fourth Year",8);
		
	}

}
