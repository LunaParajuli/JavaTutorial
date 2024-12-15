package Collection;

import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<Student> std = new ArrayList<Student>();
		std.add(new Student("Alex",21));
		std.add(new Student("Roman",22));
		std.add(new Student("Peter",23));
		
		for(Student std1:std) {
			System.out.println(std1.name);
			System.out.println(std1.age);
		}	
	}
}

class Student{
	String name;
	int age;

	public Student(String name, int age) {
		this.name =name;
		this.age = age;
	}
}
