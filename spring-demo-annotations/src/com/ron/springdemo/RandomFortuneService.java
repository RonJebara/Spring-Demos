package com.ron.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of Strings
	private String[] data = {"The journey is the reward.", "Beware the wolf in the sheep's clothing.", "Diligence is the mother of good luck."};

	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//Pick a random string from the array
		int index = myRandom.nextInt(data.length);	
		String theFortune = data[index];
		return theFortune;
	
	}

}
