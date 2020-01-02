package com.ron.springdemo;

public class SoccerCoach implements Coach {
	//Define a private field for the dependency
		private FortuneService fortuneService;
		//Define a constructor for dependency injection
		public SoccerCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
		}
		

	@Override
	public String getDailyWorkout() {
		return "Practice corners for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
