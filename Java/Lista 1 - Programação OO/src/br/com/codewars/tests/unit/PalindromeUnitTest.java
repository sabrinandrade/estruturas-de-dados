package br.com.codewars.tests.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.codewars.exercises.Palindrome;

class PalindromeUnitTest {

	@Test
	void testPalindromeVersion1_validInput() {
		assertEquals(true, Palindrome.palindromeVersion1("arara"));
		assertEquals(true, Palindrome.palindromeVersion1("sator arepo tenet opera rotas"));
	}
	
	@Test
	void testPalindromeVersion2_validInput() {
		assertEquals(true, Palindrome.palindromeVersion1("arara"));
		assertEquals(true, Palindrome.palindromeVersion1("sator arepo tenet opera rotas"));
	}
	
	@Test
	void testPalindromeVersion1_invalidInput() {
		assertEquals(false, Palindrome.palindromeVersion1("random meaningless sentence"));
		assertEquals(false, Palindrome.palindromeVersion1("random"));
	}
	
	@Test
	void testPalindromeVersion2_invalidInput() {
		assertEquals(false, Palindrome.palindromeVersion1("random meaningless sentence"));
		assertEquals(false, Palindrome.palindromeVersion1("random"));
	}

}
