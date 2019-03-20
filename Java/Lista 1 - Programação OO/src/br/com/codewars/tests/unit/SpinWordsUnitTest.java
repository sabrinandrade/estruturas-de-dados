package br.com.codewars.tests.unit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import br.com.codewars.exercises.SpinWords;

class SpinWordsUnitTest {
	@Test
	void testValidInputs() {
		assertEquals("Esta arvalap será adacifidom", SpinWords.spinWords("Esta palavra será modificada"));
	}

}
