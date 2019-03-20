package br.com.ed.recursividade;

public class Count8 {

	public static void main(String[] args) {
		System.out.println(countEights(888));
		System.out.println(countEights(18));
		System.out.println(countEights(8181));

	}
	
	public static int countEights(int n) {
		if(n < 8) return 0;
		
		if(n % 10 == 8) {
			if((n/10) % 10 == 8) return 2 + countEights(n/10);
			return 1 + countEights(n/10);
		}
		
		return countEights(n/10);
	}

}
