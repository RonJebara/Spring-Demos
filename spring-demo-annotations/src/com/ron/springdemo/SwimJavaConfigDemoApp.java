package com.ron.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Read the config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Get the bean
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmail());
		
		//Close the context
		context.close();
		
	}

}
