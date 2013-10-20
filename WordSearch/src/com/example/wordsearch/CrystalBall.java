package com.example.wordsearch;

import java.util.Random;

public class CrystalBall {
	
	String[] mAnswers = {
			"You're playing agianst the computers mind."
			
			
			
	};
	public String getAnAnswer(){
	
	
	String answer = "";
	
	
	
	Random randomGenerator = new Random();
	
	int randomNumer = randomGenerator.nextInt(mAnswers.length);
	
	answer = mAnswers[randomNumer];
	
	return answer;
	}
	
	
	
	
}
