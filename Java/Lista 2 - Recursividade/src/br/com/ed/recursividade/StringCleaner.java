package br.com.ed.recursividade;

public class StringCleaner {

	public static void main(String[] args) {
		System.out.println(stringCleaner("zzzaaa"));
		System.out.println(stringCleaner("abab"));
		System.out.println(stringCleaner("aaaaaaeeeeeeeiiiiiiooooouuuuuuuk"));

	}
	
	public static String stringCleaner(String str) {
		if (str.length() < 2) return str;
		
		if(str.charAt(0) == str.charAt(1))
			return stringCleaner(str.substring(1));
		else
			return str.charAt(0) + stringCleaner(str.substring(1));
			
	}

}
