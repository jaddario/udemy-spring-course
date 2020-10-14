package com.luv2code.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.springdemo.impl.SwimCoach;
import com.luv2code.springdemo.impl.sadfortuneService;
import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new sadfortuneService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
	}

}
