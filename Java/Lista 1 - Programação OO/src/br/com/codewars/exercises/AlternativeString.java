package br.com.codewars.exercises;

public class AlternativeString {
	
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
