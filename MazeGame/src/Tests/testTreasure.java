package Tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

class testTreasure {

	 Map<Integer, Integer> player = new HashMap<>();
	 Map<Integer, Integer> treasure = new HashMap<>();
	 Integer playerScore = 0;
	
	
	@Test
	public void confirmTreasure() {
		player.put(5, 5);
		treasure.put(5, 5);
		assertThat(treasure, is(player));
		
	}
	@Test
	public void incremetScore() {
		player.put(5, 5);
		treasure.put(5, 5);
		Integer result = 1;
		if(treasure.equals(player)) {
			playerScore ++;
		}
		assertEquals(playerScore, result);		
	}

}
