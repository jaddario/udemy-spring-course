package com.luv2code.springdemo.impl;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class HappyFortuneService implements FortuneService{

	
	@Override
	public String getFortune() {
		return "Today is your luck day";
	}


}
