package br.com.codewars.tests.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.codewars.exercises.SockMerchant;

class SockMerchantUnitTest {

	@Test
	void testSockPairs() {
		assertEquals(3, SockMerchant.sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));
		assertEquals(2, SockMerchant.sockMerchant(4, new int[] {10, 20, 20, 10}));
	}
	
	@Test
	void testNoSockPairs() {
		assertEquals(0, SockMerchant.sockMerchant(3, new int[] {10, 20, 30, }));
	}

}
