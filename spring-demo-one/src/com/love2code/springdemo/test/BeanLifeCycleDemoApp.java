package com.love2code.springdemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.love2code.springdemo.interfaces.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
