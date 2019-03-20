package br.com.codewars.exercises;

public class MatricesSum {

	public static void sumOfMatrices(int[][] a, int[][] b) {
		// a.length = quantidade de linhas
		// a[0].length = quantidade de colunas
		
		if(a.length == b.length && a[0].length == b[0].length) {
			int[][] sum = new int[a.length][a[0].length];

			for ( int c = 0 ; c < a.length; c++ )
				for (int d = 0 ; d < a[0].length; d++ )
					sum[c][d] = a[c][d] + b[c][d]; 

			System.out.println("Sum:");

			for ( int c = 0 ; c < a.length; c++ ) {
				for (int d = 0 ; d < a[0].length; d++ )
					System.out.print(sum[c][d]+"\t");

				System.out.println();
			}
		} else {
			System.out.println("Matrizes de tamanhos diferentes");
		}
	}
}
