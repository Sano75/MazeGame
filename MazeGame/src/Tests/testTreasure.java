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

class testTreasure {

	
	
	@Test
	public void confirmTreasureTest() {
		
		Player player = new Player(2,2);
		Treasure treasure = new Treasure(2,2);
		
		assertEquals(2,player.getX());
		assertEquals(2,player.getY());
	}
}
