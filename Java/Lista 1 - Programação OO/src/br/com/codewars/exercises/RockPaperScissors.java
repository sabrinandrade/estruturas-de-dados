package br.com.codewars.exercises;

import java.util.Random;

public class RockPaperScissors {

	public static String rockPaperScissors(String player1, String player2) {
		if(player1.equalsIgnoreCase(player2)) return "Draw";
		
		int p = (player1 + player2).equalsIgnoreCase("scissorspaper") 
				|| (player1 + player2).equalsIgnoreCase("rockscissors") 
				|| (player1 + player2).equalsIgnoreCase("paperrock") ? 1 : 2;

		return "Player " + p + " won";
	}

	
	public static String computerOption() {
		Random rnd = new Random();
		int option = rnd.nextInt(3);
		String result = "paper";

		if (option == 1)
			result = "scissors";
		else if (option == 2)
			result = "rock";

		return result;

	}
	
	public static String playAgainstComputer(String player) {
		// System.out.println(rockPaperScissors(player, computerOption()));
		return rockPaperScissors(player, computerOption());
	}

}
