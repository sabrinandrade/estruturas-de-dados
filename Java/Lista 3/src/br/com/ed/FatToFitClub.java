package br.com.ed;

public class FatToFitClub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String orderWeight(String strng) {
		String[] weights = strng.split("\\s+");
		String finalWeights = "";
		int[][] tuples = new int[weights.length][2];

		for(int i = 0; i < tuples.length; i ++) {
			tuples[i][1] = Integer.parseInt(weights[i]); 
			tuples[i][0] = sumOfDigits(tuples[i][1]);
		}

		tuples = sort2DArray(tuples);

		for(int i = 0; i < tuples.length; i ++) 
			finalWeights += tuples[i][1] + " ";

		return finalWeights;
	}

	private int sumOfDigits(int number) { 
		int sum = 0;

		while(number > 0) {
			sum += number % 10;
			number /= 10; }

		return sum; 

	}

	private int[][] sort2DArray(int[][] array) { 
		int[] temp = null;

		boolean swapped = true;

		do {
			swapped = false;
			
			for(int i = 0; i < array.length - 1; i ++) { 
				if(array[i][0] > array[i + 1][0]) {
					temp = array[i]; array[i] = array[i + 1]; array[i + 1] = temp;
					swapped = true; 
				}
			}
		} while (swapped);

		return array; 
	}

}
