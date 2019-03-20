package br.com.codewars.tests.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.codewars.exercises.YearsOfInvestment;

class YearsOfInvestmentUnitTest {

	@Test
	void testSameAmountOfMoney() {
		assertEquals(0, YearsOfInvestment.yearsOfInvestment(1000, 0.1, 0.03, 1000));
	}
	
	@Test
	void testExpectedBiggerThanInitial() {
		assertEquals(18, YearsOfInvestment.yearsOfInvestment(1000, 0.10, 0.03, 5000));
	}
	
	@Test
	void testInvalidValues() {
		assertEquals(0, YearsOfInvestment.yearsOfInvestment(1000, 0.1, 0.03, -1000));
	}

}
