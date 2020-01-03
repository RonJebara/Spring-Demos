package com.ron.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//Check if they are the same
		
		boolean result = (theCoach == alphaCoach);
		
		//Print out the results
		System.out.println("\nPointing to the same object: "  + result);
		
		//Close the context
		context.close();
	}

}
