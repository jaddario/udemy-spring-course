package com.love2code.springdemo.model;

import com.love2code.springdemo.interfaces.Coach;
import com.love2code.springdemo.interfaces.FortuneService;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowlling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
