package br.com.codewars.tests.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.codewars.exercises.AlternativeString;

class AlternativeStringUnitTest {

	@Test
	void testValidInputs() {
		assertEquals("UMA STRING QUALQUER", AlternativeString.toAlternativeString("uma string qualquer"));
		assertEquals("tESTE", AlternativeString.toAlternativeString("Teste"));
		assertEquals("UmA StRing", AlternativeString.toAlternativeString("uMa sTrING"));
	}

}
