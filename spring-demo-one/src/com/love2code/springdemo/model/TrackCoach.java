package com.love2code.springdemo.model;

import com.love2code.springdemo.interfaces.Coach;
import com.love2code.springdemo.interfaces.FortuneService;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	private void initMethod() {
		System.out.println("init method");
	}
	
	private void destroyMethod() {
		System.out.println("destroy method");
	}

}
