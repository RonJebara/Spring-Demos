package com.ron.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the bean from the container
		CrickerCoach theCoach = context.getBean("myCricketCoach", CrickerCoach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//Call our new methods to get the literal values
		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();
	}

}