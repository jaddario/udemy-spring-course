package com.love2code.springdemo.test;

import com.love2code.springdemo.interfaces.Coach;
import com.love2code.springdemo.model.TrackCoach;

public class MyApp {

	public static void main(String[] args) {
		Coach baseballCoach = new TrackCoach();
		System.out.println(baseballCoach.getDailyWorkout());
	}

}
