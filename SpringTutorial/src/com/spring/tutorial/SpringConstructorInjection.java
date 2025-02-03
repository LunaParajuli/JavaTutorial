package com.spring.tutorial;

public class SpringConstructorInjection {
   private int id;
   private String name;
   
   
   public SpringConstructorInjection(int id , String name) {
	   
	   this.name = name;
	   this.id = id;
   }
   
   public void showInjectedValues() {
	   System.out.println("Id is "+id+" and name is "+name);
   }
}
