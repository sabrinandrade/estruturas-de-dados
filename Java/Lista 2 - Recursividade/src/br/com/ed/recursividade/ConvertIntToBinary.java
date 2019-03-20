package br.com.ed.recursividade;

public class ConvertIntToBinary {

	public static void main(String[] args) {
		System.out.println(convertNumber(10));
		System.out.println(convertNumber(2));
		System.out.println(convertNumber(1));
		System.out.println(convertNumber(0));
		System.out.println(convertNumber(123));

	}
	
	public static String convertNumber(int n) {
		return (n == 0) ? "0" : convertNumber(n/2) + "" + (n % 2) ; 
	}

}
