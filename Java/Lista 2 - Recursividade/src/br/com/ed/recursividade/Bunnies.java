package br.com.ed.recursividade;

public class Bunnies {

	public static void main(String[] args) {
		System.out.println(countBunniesEars(10));
		System.out.println(countMutantBunniesEars(10));

	}
	
	public static int countBunniesEars(int n) {
		if(n == 0)
			return 0;
		
		return 2 + countBunniesEars(n - 1);
	}
	
	public static int countMutantBunniesEars(int n) {
		if(n == 0) return 0;
		
		if(n % 2 == 0) return 3 + countMutantBunniesEars(n - 1);
		else return 2 + countMutantBunniesEars(n - 1);
	}

}
