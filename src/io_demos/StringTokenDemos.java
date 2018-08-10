package io_demos;

import java.util.Calendar;
import java.util.Random;
import java.util.StringTokenizer;

public class StringTokenDemos {
	public static void main(String[] args) {
		
		String value = "Sachit some times you see this side also";
		StringTokenizer tokenizer = new StringTokenizer(value,"d");
		//
		System.out.println(tokenizer.countTokens());
		
		Random random = new Random();
		/*System.out.println(random.nextInt());*/
		
		//generating a random number between two numbers
		int min = 50;
		int max =100;
		int n = (max - min) + random.nextInt(min);
		System.out.println(n);
		
		Calendar cal = Calendar.getInstance();
		
		
		
	}

}
