package com.ron.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BasketballCoach() {
	}

/*
	//Example of method injection
	@Autowired
	public void doStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/
	@Override
	public String getDailyWorkout() {
		return "Practice 3-pointers for 20 minutes." ;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
