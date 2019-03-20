package br.com.ed.recursividade;

public class Triangle {

	public static void main(String[] args) {
		System.out.println(triangle(7));

	}
	
	public static int triangle(int n) {
		return (n == 0) ? 0 : n + triangle(n-1);
	}

}
