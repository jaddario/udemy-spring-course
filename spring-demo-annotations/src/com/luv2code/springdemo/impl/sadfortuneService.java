package com.luv2code.springdemo.impl;

import com.luv2code.springdemo.interfaces.FortuneService;

public class sadfortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Today is a sad day!";
	}
}
