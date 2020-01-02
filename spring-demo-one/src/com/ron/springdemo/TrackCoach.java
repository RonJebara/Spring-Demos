package com.ron.springdemo;

public class TrackCoach implements Coach {
	//Define a private field for the dependency
		private FortuneService fortuneService;
		//Define a constructor for dependency injection
		public TrackCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
		}
		

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	//add an init method
	public void atStartup() {
			System.out.println("Doing my startup stuff!");
	}
	
	//add a destroy method
	public void atEnd() {
			System.out.println("Doing my destroy stuff!");
	}
}
