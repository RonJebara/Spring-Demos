package com.ron.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {"Watch out!", "Today is your lucky day!", "Today will be an okay day."};
		Random rand = new Random();
		int randomnum = rand.nextInt((2 - 0) + 1);
		return fortunes[randomnum];
	}
}
