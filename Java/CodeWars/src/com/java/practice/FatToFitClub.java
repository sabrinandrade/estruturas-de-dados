package com.java.practice;

public class FatToFitClub {

	// This solution doesn't use map functions because it 
	// was presented at the beginning of a Data Structures course.
	// The students had no knowledge about mapping.

	public static void main(String[] args) {
		String weights = "56 65 74 100 99 68 86 180 90";
		
		System.out.printf("Original weights: %s", weights);
		System.out.println("\nWeights in new order: " + orderWeight(weights));
	}
	
	
	public static String orderWeight(String strng) {
		String[] weights = strng.split("\\s+");
		String finalWeights = "";

		int[][] weightsTuples = new int[weights.length][2];

		for(int i = 0; i < weightsTuples.length; i ++) {
			weightsTuples[i][1] = Integer.parseInt(weights[i]);			
			weightsTuples[i][0] = sumOfDigits(weightsTuples[i][1]);			
		}

		weightsTuples = sort2DArray(weightsTuples);

		for(int i = 0; i < weightsTuples.length; i ++)
			finalWeights += weightsTuples[i][1] + " ";

		return finalWeights;

	}

	
	private static int sumOfDigits(int number) {
		int sum = 0;

		while(number > 0) {
			sum += number % 10;
			number /= 10;	
		}

		return sum;
	}

	
	// Bubble sort - Uses the first element of the array to sort the 2D array
	private static int[][] sort2DArray(int[][] array) {
		int[] temp = null;
		boolean swapped = true;
		
		do {
			swapped = false;
			
			for(int i = 0; i < array.length - 1; i ++) {
				if(array[i][0] > array[i + 1][0]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					
					swapped = true;
				}
			}
		} while (swapped);

		return array;
	}

}
