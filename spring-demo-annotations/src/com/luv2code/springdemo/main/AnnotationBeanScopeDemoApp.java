package com.luv2code.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach", Coach.class);
	
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(theCoach == alphaCoach);
		System.out.println("memory location " + theCoach);
		System.out.println("memory location " + alphaCoach);

		context.close();

	}
}
