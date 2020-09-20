package com.bharat.springDemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	String[] fortunes = new String[] {"Today is your lucky day", "Well the cookies arent done yet", "Here, have a random fortune"};
	private Random rand = new Random();

	@Override
	public String getFortune() {
		
		return fortunes[rand.nextInt(fortunes.length)];
	}

}
