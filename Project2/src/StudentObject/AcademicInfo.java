package StudentObject;

public class AcademicInfo  {

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


