package com.java.practice;

public class AlternatingCases {

	public static void main(String[] args) {
		String sentence = "This is a test string";
		
		System.out.printf("Original string: %s", sentence);
		System.out.println("\nMutated string: " + toAlternativeString(sentence));

	}
	
	/*
	 * Define String.prototype.toAlternatingCase (or a similar function/method such as 
	 * to_alternating_case/toAlternatingCase/ToAlternatingCase) 
	 * such that each lowercase letter becomes uppercase and each 
	 * uppercase letter becomes lowercase
	 * 
	 * 
	 * You can't change the original string.
	 * 
	 * */	
	public static String toAlternativeString(String string) {
		String mutated = "";

		for(char c : string.toCharArray()) {
			if(Character.isLowerCase(c))
				mutated += Character.toUpperCase(c);
			else if(Character.isUpperCase(c))  
				mutated += Character.toLowerCase(c);
			else
				mutated += c;

		}

		return mutated;
	}

}
