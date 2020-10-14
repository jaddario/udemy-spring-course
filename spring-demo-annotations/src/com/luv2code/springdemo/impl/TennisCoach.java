package com.luv2code.springdemo.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your Backhand for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@PostConstruct
	public void doMystartupStuff() {
		System.out.println(">>Tennis Coach: inside my doMyStartupStuff");
	}

	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">>Tennis Coach: inside my doMyCleanUpStuff");
	}

}
