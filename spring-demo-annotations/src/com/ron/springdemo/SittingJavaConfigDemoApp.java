package com.ron.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SittingJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Read the config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Get the bean
		Coach theCoach = context.getBean("sittingCoach", Coach.class);
		
		//Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();
		
	}

}
