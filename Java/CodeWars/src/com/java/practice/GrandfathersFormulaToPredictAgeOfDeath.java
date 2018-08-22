package com.java.practice;

public class GrandfathersFormulaToPredictAgeOfDeath {

	public static void main(String[] args) {
		System.out.printf("You will die with %d years of age", predictAge(90, 86, 78, 89, 73, 64, 89, 62));

	}

	public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
		int[] ages = {age1, age2, age3, age4, age5, age6, age7, age8};
		int result = 0;

		for(int i = 0; i < ages.length; i ++) 
			result += (ages[i] * ages[i]);

		return (int)Math.sqrt(result)/2;

	}


}
