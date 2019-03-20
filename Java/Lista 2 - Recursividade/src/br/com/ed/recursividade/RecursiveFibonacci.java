package br.com.ed.recursividade;

public class RecursiveFibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(10));

	}
	
	public static int fibonacci(int n) {
		return (n == 1 || n == 2) ? 1 : fibonacci(n - 1) + fibonacci(n - 2); 
	}
}
