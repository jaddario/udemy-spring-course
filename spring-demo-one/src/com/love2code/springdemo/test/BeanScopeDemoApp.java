package com.love2code.springdemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.love2code.springdemo.interfaces.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-scope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		System.out.println("\nIs pointing to the same object? " + (theCoach == alphaCoach));

		System.out.println("\nMemory location of theCoach " + theCoach);
		System.out.println("\nMemory location of alphaCoach " + alphaCoach);

		context.close();
	}

}
