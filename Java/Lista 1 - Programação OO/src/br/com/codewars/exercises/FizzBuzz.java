package br.com.codewars.exercises;

public class FizzBuzz {

	public static void fizzBuzz(int n) {
		String result = "";
		
		for(int i = 1; i <= n; i++) {
			
			result += (i % 3 == 0) ? "fizz" : "";
			result += (i % 5 == 0) ? "buzz" : "";
			
			System.out.print((result.isEmpty() ? i : result) + " ");
			
			result = "";
		}
	}
	
}
