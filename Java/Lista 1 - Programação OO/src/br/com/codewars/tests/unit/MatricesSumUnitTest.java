package br.com.codewars.tests.unit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.codewars.exercises.MatricesSum;

class MatricesSumUnitTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@BeforeEach
	void setUp() throws Exception {
		 System.setOut(new PrintStream(outContent));
	}

	@Test
	void testMatricesWithDifferentSize() {
		int[][] a = {{1, 2}};
		int[][] b = {{1}};
		
		MatricesSum.sumOfMatrices(a, b); 
		assertEquals("Matrizes de tamanhos diferentes\n", outContent.toString());
	}
	
	@Test
	void testSumOfMatrices() {
		int[][] a = {{1, 2}};
		int[][] b = {{1, 2}};
		// int[][] result = {{2, 4}};
		
		MatricesSum.sumOfMatrices(a, b); 
		assertEquals("Sum:\n2\t4\t\n", outContent.toString());
	}

}
