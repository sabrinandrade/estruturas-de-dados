package br.com.codewars.tests.unit;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.codewars.exercises.FizzBuzz;

class FizzBuzzUnitTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@BeforeEach
	void setUp() throws Exception {
		 System.setOut(new PrintStream(outContent));
	}

	@Test
	void testValidInput() {
		FizzBuzz.fizzBuzz(15);
		assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz ", outContent.toString());
	}

}
