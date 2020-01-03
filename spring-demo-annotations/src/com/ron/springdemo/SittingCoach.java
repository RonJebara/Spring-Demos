package com.ron.springdemo;

public class SittingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public SittingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
}

	@Override
	public String getDailyWorkout() {
		return "Sit down until you get bored.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
