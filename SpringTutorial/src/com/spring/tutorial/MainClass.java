package com.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*
		 * HelloSpring helloSpring = (HelloSpring)context.getBean("helloSpring");
		 * System.out.println(helloSpring.getMessage());
		 */
		
		SpringConstructorInjection constructorInjection = (SpringConstructorInjection) context.getBean("constructorInjection");
		constructorInjection.showInjectedValues();
	}
}
