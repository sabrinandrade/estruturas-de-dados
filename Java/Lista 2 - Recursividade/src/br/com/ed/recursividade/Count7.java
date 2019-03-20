package br.com.ed.recursividade;

public class Count7 {

	public static void main(String[] args) {
		System.out.println(countSevens(777));
		System.out.println(countSevens(111));
		System.out.println(countSevens(7171));

	}
	
	public static int countSevens(int n) {
		if(n < 7) return 0;
		return (n % 10 == 7) ? 1 + countSevens(n/10) : countSevens(n/10);
	}

}
