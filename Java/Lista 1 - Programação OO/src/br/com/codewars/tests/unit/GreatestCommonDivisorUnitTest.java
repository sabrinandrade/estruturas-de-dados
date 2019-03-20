package br.com.codewars.tests.unit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import br.com.codewars.exercises.GreatestCommonDivisor;

class GreatestCommonDivisorUnitTest {

	@Test
	void testValidIntegers() {
		assertEquals(4, GreatestCommonDivisor.gcd(8, 12));
	}

}
