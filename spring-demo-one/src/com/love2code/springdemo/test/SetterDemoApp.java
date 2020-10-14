package com.love2code.springdemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.love2code.springdemo.model.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		context.close();

	}

}
