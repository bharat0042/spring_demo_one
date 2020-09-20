package com.bharat.springDemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		System.out.println("TrackCoach: Inside FortuneService arg constructor");
		fortuneService = theFortuneService;
	}
	
	public TrackCoach() {
		System.out.println("TrackCoach: Inside no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		System.out.println("TrackCoach: Inside method getDailyWorkout");
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it\n" + fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside method doMyStartupStuff");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: Inside method doMyCleanupStuff");
	}

}
