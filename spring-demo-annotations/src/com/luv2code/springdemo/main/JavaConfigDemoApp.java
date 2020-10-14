package com.luv2code.springdemo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.config.SportConfig;
import com.luv2code.springdemo.interfaces.Coach;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SportConfig.class);
		
		Coach swimCoach = applicationContext.getBean("swimCoach", Coach.class);
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		applicationContext.close();

	}
}
