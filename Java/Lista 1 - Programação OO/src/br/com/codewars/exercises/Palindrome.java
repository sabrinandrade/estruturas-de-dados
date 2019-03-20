package br.com.codewars.exercises;

public class Palindrome {
	
	// Assume que as frases nao tem pontuacao ou acentuacao

	public static boolean palindromeVersion1(String word) {
		for(int i = 0, j = word.length() - 1; i < j; i++, j--) 
			if(word.charAt(i) != word.charAt(j))
				return false;
		
		return true;
	}
	
	public static boolean palindromeVersion2(String word) {
		StringBuffer newBuffer = new StringBuffer(word);
		String reverseWord = newBuffer.reverse().toString();
		
		return (reverseWord.equalsIgnoreCase(word)) ? true: false;
	}
	
}
