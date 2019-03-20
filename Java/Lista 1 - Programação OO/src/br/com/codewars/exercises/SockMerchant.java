package br.com.codewars.exercises;

import java.util.Arrays;

public class SockMerchant {
	
	public static int sockMerchant(int n, int[] ar) {
        int pairOfSocks = 0;
        Arrays.sort(ar);

        for(int i = 0; i < n-1; i ++) {
            if(ar[i] == ar[i+1]) {
                pairOfSocks++;
                i++;
            }
        }
        
        return pairOfSocks;
    }

}
