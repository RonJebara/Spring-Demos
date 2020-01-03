package com.ron.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today will be a sad day :( ";
	}

}
