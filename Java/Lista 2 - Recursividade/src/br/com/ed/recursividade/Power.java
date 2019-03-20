package br.com.ed.recursividade;

public class Power {

	public static void main(String[] args) {
		System.out.println(power(2, 0));
		System.out.println(power(2, 1));
		System.out.println(power(2, 2));
		System.out.println(power(2, 10));

	}
	
	public static int power(int n, int p) {
		return (p == 0) ? 1 : n * power(n, p-1);
	}

}
