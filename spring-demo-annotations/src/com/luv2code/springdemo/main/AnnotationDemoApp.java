package com.luv2code.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		Coach swimCoach =  applicationContext.getBean("tennisCoach", Coach.class);

		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());

		applicationContext.close();

	}
}
