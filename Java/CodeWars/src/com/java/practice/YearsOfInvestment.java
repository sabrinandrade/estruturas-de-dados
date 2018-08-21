package com.java.practice;

public class YearsOfInvestment {

	public static void main(String[] args) {
		System.out.println("Principal: 1000, Desired: 1000, Rate: 10%, Tax: 3%\nYears: " + yearsOfInvestment(1000, 0.10, 0.03, 1100));
		System.out.println("Principal: 1000, Desired: 1000, Rate: 10%, Tax: 3%\nYears: " + yearsOfInvestment(1000, 0.10, 0.03, 5000));
			
	}
	
	public static int yearsOfInvestment(double principal, double rate, double tax, double desired) {
		int years = 0;

		while(principal < desired) {
			principal += (rate * principal) * (1 - tax);
			years++;
		}

		return years;

	}

}
