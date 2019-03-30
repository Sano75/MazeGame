package main;

import main.Treasure;

import java.util.Map;

public class treasureMethods {

	static int playerScore = 0;

	public static Integer incrementScore(int playerY, int playerX, int treasureY, int treasureX) {

		Player player = new Player(playerX, playerY);
		Treasure treasure = new Treasure(treasureX, treasureY);

		if (player.getX() == treasure.getX() && player.getY() == treasure.getY()) {
			playerScore++;
		}

		return playerScore;

	}

	public static boolean openDoor(int currentPlayerScore, int score) {

		if (currentPlayerScore == score) {
			return true;
		} else {
			return false;
		}

	}

}
