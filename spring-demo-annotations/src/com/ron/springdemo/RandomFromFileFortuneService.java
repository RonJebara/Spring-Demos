package com.ron.springdemo;

import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class RandomFromFileFortuneService implements FortuneService {
	
	private String fileName = "C:/Users/jebar/eclipse-workspace/spring-demo-annotations/src/fortunes";
	private List<String> theFortunes;

	// create a random number generator
	private Random myRandom = new Random();

	@PostConstruct
	public void readAtStart() {
		System.out.println("Reading from file in post construct.");

		File theFile = new File(fileName);
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;
	}


}