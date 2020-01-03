package com.ron.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SquashCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Example of constructor injection with annotation
/*
	@Autowired
	public SquashCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
	}
*/
	@Override
	public String getDailyWorkout() {
		return "Get squashin rookie!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
