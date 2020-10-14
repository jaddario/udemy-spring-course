package com.luv2code.springdemo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.config.SportConfig;
import com.luv2code.springdemo.impl.SwimCoach;

public class SwimJavaConfigDemoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SportConfig.class);
		
		SwimCoach swimCoach = applicationContext.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());
		applicationContext.close();

	}
}
