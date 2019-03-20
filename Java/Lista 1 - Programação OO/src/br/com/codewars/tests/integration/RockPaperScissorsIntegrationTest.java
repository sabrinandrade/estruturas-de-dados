package br.com.codewars.tests.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import br.com.codewars.exercises.RockPaperScissors;

class RockPaperScissorsIntegrationTest {

	@Test
	void testPlayAgainstComputer() {
		assertNotNull(RockPaperScissors.playAgainstComputer("rock"));
		assertNotNull(RockPaperScissors.playAgainstComputer("paper"));
		assertNotNull(RockPaperScissors.playAgainstComputer("scissors"));
	}
	
	@Test
	void testPlayAgainstComputerWithInvalidString() {
		assertEquals("Player 2 won", RockPaperScissors.playAgainstComputer("something different"));
	}


}
