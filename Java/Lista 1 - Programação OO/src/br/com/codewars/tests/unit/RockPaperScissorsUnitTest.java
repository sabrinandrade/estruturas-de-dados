package br.com.codewars.tests.unit;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import br.com.codewars.exercises.*;

class RockPaperScissorsUnitTest {

	@Test
	void testInvalidString() {
		assertEquals("Player 2 won", RockPaperScissors.rockPaperScissors("something different", "ROCK"));
		assertEquals("Player 2 won", RockPaperScissors.rockPaperScissors("ROCK", "something different"));
	}
	
	@Test
	void testPlayer1Won() {
		assertEquals("Player 1 won", RockPaperScissors.rockPaperScissors("paper", "ROCK"));
		assertEquals("Player 1 won", RockPaperScissors.rockPaperScissors("ROCK", "Scissors"));
		assertEquals("Player 1 won", RockPaperScissors.rockPaperScissors("scissors", "pAPER"));
	}
	
	@Test
	void testPlayer2Won() {
		assertEquals("Player 2 won", RockPaperScissors.rockPaperScissors("ROCK", "paper"));
		assertEquals("Player 2 won", RockPaperScissors.rockPaperScissors("Scissors", "rock"));
		assertEquals("Player 2 won", RockPaperScissors.rockPaperScissors("pAPER", "scissors"));
	}
	
	@Test
	void testDrawBetweenPlayers() {
		assertEquals("Draw", RockPaperScissors.rockPaperScissors("ROCK", "rock"));
		assertEquals("Draw", RockPaperScissors.rockPaperScissors("Scissors", "scissors"));
		assertEquals("Draw", RockPaperScissors.rockPaperScissors("pAPER", "paper"));
	}
	
	@Test
	void testComputerOptionReturn() {
		assertNotNull(RockPaperScissors.computerOption());
		assertNotEquals("", RockPaperScissors.computerOption());
	}

}
