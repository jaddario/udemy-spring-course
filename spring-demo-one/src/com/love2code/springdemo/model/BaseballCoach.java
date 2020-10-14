package com.love2code.springdemo.model;

import com.love2code.springdemo.interfaces.Coach;
import com.love2code.springdemo.interfaces.FortuneService;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 minuts on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
