package com.love2code.springdemo.services;

import com.love2code.springdemo.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
