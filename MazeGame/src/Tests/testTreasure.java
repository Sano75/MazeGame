package Tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import main.Door;
import main.ObjectHandler;
import main.Player;
import main.Treasure;

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
		//A
		ObjectHandler handler = new ObjectHandler();
		handler.addObject(new Player(handler, 2,2));// 0
		handler.addObject(new Treasure(2,2)); //1
		Player player = (Player) handler.objects.get(0);
		player.setMinimumTreasures(5);
		//A
		assertEquals(0,player.score);
		player.collision();
		assertEquals(1,player.score);
		
		
		
		
	}
	
	@Test
	public void openDoorTest() {
		//A
		ObjectHandler handler = new ObjectHandler();
		handler.addObject(new Player(handler, 5,2));// 0
		handler.addObject(new Treasure(5,2)); //1
		handler.addObject(new Door(null,6,7));//2
		Player player = (Player) handler.objects.get(0);
		Door door = (Door) handler.objects.get(2);
		player.setMinimumTreasures(1);
		player.hiddenDoor = door;
		//A
		assertFalse(door.visible);
		player.collision(); //Collides with Treasure and score becomes 1 which is minimum for doorOpening
		assertTrue(door.visible);
		
	}
}
