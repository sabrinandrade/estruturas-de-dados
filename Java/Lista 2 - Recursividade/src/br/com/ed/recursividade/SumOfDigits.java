package br.com.ed.recursividade;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(123));
		System.out.println(sumOfDigits(9911));
		System.out.println(sumOfDigits(1));

	}
	
	public static int sumOfDigits(int n) {
		return (n < 10) ? n : sumOfDigits(n/10) + (n%10);
	}

}
