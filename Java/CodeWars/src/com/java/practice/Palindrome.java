package com.java.practice;

public class Palindrome {

	public static void main(String[] args) {
		String word = "arara";
		System.out.printf("The word %s is a palindrome? ", word);
		System.out.println(palindrome("arara"));

	}

	public static boolean palindrome(String word) {
		for(int i = 0, j = word.length() - 1; i < j; i++, j--) 
			if(word.charAt(i) != word.charAt(j))
				return false;

		return true;
	}
	
}
