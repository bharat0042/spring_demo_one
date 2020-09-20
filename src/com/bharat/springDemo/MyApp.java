package com.bharat.springDemo;

public class MyApp {

	public static void main(String[] args) {
		
		//Create and use the BaseballCoach object
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
	}

}
