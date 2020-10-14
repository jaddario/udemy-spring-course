package com.love2code.springdemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.love2code.springdemo.interfaces.Coach;

public class FootballCoachDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach footballCoach = context.getBean("myFootballCoach", Coach.class);
		
		System.out.println(footballCoach.getDailyFortune());
	}
}
