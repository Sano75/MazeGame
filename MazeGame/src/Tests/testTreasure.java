package Tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import main.Player;
import main.Treasure;
import main.treasureMethods;
import static org.hamcrest.CoreMatchers.*;

class testTreasure {

	
	
	@Test
	public void confirmTreasureTest() {
		
		Player player = new Player(null, 2,2);
		Treasure treasure = new Treasure(2,2);
		
		assertEquals(treasure.getX(),player.getX()); //The game is on a 32 * 32 grid
		assertEquals(treasure.getY(),player.getY());
	}
	
	@Test
	public void increaseScoreTest() {
		
		int playerCurrentScore = 0;
		int playerNewScore = treasureMethods.incrementScore(1,1,1,1);
		
		assertThat(playerCurrentScore, is(not(playerNewScore)));
		
	}
	
	@Test
	public void openDoorTest() {
		int score = 1;
		int currentPlayerScore = treasureMethods.incrementScore(1, 1, 1, 1);
		boolean door = treasureMethods.openDoor(currentPlayerScore, score);
		
		assertEquals(true, door);
	}
}
