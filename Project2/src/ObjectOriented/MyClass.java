package ObjectOriented;

public class MyClass  {
  public static void main(String args)   {
	  
	  Student std = new Student();
	  std.assign();
	  std.display();
  }
}

class Student{
	String name;
	int age;
	
	
	public void assign() {
		
//		name="Alex";
//		age=21;
	}
	
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
}