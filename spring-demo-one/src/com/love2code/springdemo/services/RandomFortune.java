package com.love2code.springdemo.services;

import java.util.Random;

import com.love2code.springdemo.interfaces.FortuneService;

public class RandomFortune implements FortuneService {
	private String[] fortunes = { "Today isn't your lucky day", "Today, you will win!!!",
			"Don't leave without an umbrella" };

	@Override
	public String getFortune() {
		int index = getWhatFortuneFromArray();
		return fortunes[index];
	}

	private int getWhatFortuneFromArray() {
		return new Random().nextInt(fortunes.length);
	}

}
