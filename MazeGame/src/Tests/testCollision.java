package Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Door;
import main.ObjectHandler;
import main.Player;

public class testCollision {
	@Test
	public void testCollision1() {
		//A
		ObjectHandler handler = new ObjectHandler();
		handler.addObject(new Player(handler,3,4)); // index 0
		handler.addObject(new Door(3*32, 4)); // index 1
		
		//Rectangle is 32 wide and high
		//A
		boolean collided = handler.objects.get(0).getBounds().intersects(handler.objects.get(1).getBounds());
		//A
		assertFalse(collided);
	}
	@Test
	public  void testCollision2() {
		//A
		ObjectHandler handler = new ObjectHandler();
		handler.addObject(new Player(handler,5 * 32,6)); // 0
		handler.addObject(new Door(5*32, 6)); //1
		
		//Rectangle is 32 wide and high
		
		//A
		boolean collided = handler.objects.get(0).getBounds().intersects(handler.objects.get(1).getBounds());
		//A
		assertTrue(collided);
	}
	@Test 
	public void testCollision3_Effect() {
		//A
		ObjectHandler handler = new ObjectHandler();
		handler.addObject(new Player(handler,7 * 32, 8)); // 0
		handler.addObject(new Door(7 * 32, 8)); //1
		//A
		Player player = (Player) handler.objects.get(0);
		player.collision(); 
		//A
		assertTrue(player.win);//When Player collides with door, the game is won, so collision must have happened for this to be true
	
	}
}
