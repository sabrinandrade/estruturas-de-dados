package br.com.codewars.exercises;

public class YearsOfInvestment {
	
	public static int yearsOfInvestment(double principal, double rate, double tax, double desired) {
		int years = 0;		
		
		while(principal < desired) {
			principal += (rate * principal) * (1 - tax);
			years++;
		}
		
		return years;
		
	}

}
