package com.ron.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retreive the bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach otherCoach = context.getBean("myCoach", Coach.class);
		
		//Check if they reference the same bean and print out their memory address
		boolean result = (theCoach == otherCoach);
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for otherCoach: " + otherCoach);
		
		//Close the context
		context.close();
	}

}