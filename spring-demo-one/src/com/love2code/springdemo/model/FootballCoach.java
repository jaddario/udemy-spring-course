package com.love2code.springdemo.model;

import com.love2code.springdemo.interfaces.Coach;
import com.love2code.springdemo.services.RandomFortune;

public class FootballCoach implements Coach {
	private RandomFortune randomFortune;

	public FootballCoach(RandomFortune randomFortune) {
		this.randomFortune = randomFortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for 5 meters dreebling and then kick to goal";
	}

	@Override
	public String getDailyFortune() {
		return randomFortune.getFortune();
	}

}
