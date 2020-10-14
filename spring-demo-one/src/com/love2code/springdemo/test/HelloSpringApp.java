package com.love2code.springdemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.love2code.springdemo.interfaces.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		Coach coach = applicationContext.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println();
		applicationContext.close();

	}

}
