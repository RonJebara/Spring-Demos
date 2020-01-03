package com.ron.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFromFileFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("Inside the tennis coach constructor.");
	}
	
/*	
	//Example of setter injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
	}
*/	
	@Override
	public String getDailyWorkout() {
		return "Run 5 suicides." ;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//Define init method
	@PostConstruct
	public void atStart() {
		System.out.println("Doing start up stuff.");
	}
	
	//Define destroy method
	@PreDestroy
	public void atEnd() {
		System.out.println("Doing my destroy stuff.");
	}
	
}
