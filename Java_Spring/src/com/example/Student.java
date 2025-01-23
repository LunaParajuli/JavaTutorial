
package com.example;

public class Student {

    private String name;
    private int age;
    
    public void setAge(int age) {
    	this.age=age;
    	
    }
    
    public int getAge() {
    	return age;
    }


    public String getName() {

            return name;

    }

    public void setName(String name) {

            this.name = name;
    }

    public void displayInfo() {

    System.out.println("Hello: " + name +" & You are "+age+" Year old");

    }
    
}