package com.bharat.springDemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;

	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Try some penalty kicks";
	}

	@Override
	public String getDailyFortune() {
		return "Football fortune here" + fortuneService.getFortune();
	}

}
