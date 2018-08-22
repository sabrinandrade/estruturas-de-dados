package com.java.practice;

import java.util.Arrays;

public class FindTheNumbersOfTheSum {

	public static void main(String[] args) {
		int[] array = {1, 2, 4, 5};
		int desiredNumber = 3;
		System.out.println("The indexes are: " + Arrays.toString(returnIndexes(array, desiredNumber)));

	}
	
	public static int[] returnIndexes(int[] numbers, int desiredNumber) {
		int[] indexes = {-1, -1};
		
		for(int i = 0; i < numbers.length; i ++)
			for(int j = i + 1; j < numbers.length; j ++) {
				if(numbers[i] + numbers[j] == desiredNumber) {
					indexes[0] = i;
					indexes[1] = j;
					break;
				}
			}
		
		return indexes;		
	}

}
