package com.java.practice;

import java.util.Arrays;

public class LongToReverseArrayOfStrings {

	public static void main(String[] args) {
		long number = 1234567;
		System.out.printf("Original number: %d", number);
		System.out.println("\nArray: " + Arrays.toString(digitize(number)));

	}
	
	public static int[] digitize(long n) {
		StringBuilder reverse = new StringBuilder(String.valueOf(n));
		String[] numbers = reverse.reverse().toString().split("");     
		int[] result = new int[numbers.length];
	    
		for(int i = 0; i < result.length; i++)
	      		result[i] = Integer.parseInt(numbers[i]);

	        return result;
	  }


}
