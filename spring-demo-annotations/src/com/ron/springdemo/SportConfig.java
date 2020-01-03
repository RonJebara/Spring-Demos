package com.ron.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.ron.springdemo") This line is not needed if you manually define the beans
public class SportConfig {

	//Define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
			return new SadFortuneService();
	}
	
	//Define bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
			return new SwimCoach(sadFortuneService());
	}
	
	@Bean
	public Coach sittingCoach() {
			return new SittingCoach(sadFortuneService());
	}
}
