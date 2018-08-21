package com.java.practice;

public class SpinWords {

	public static void main(String[] args) {
		System.out.println(spinWords("This sentence will have some words changed"));

	}
	
	/* 
	 * Write a function that takes in a string of one or more words, and returns the same string, 
	 * but with all five or more letter words reversed. 
	 * Strings passed in will consist of only letters and spaces. 
	 * Spaces will be included only when more than one word is present.
	 * 
	 * */
	public static String spinWords(String sentence) {
		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i++) 
			if (words[i].length() >= 5) 
				words[i] = new StringBuilder(words[i]).reverse().toString();

		return String.join(" ", words);

		//	    return Arrays.stream(sentence.split(" "))
		//                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
		//                .collect(Collectors.joining(" "));
	}

}
