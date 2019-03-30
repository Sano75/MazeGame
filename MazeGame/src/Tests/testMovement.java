package Tests;

import org.junit.Test;

import main.ObjectHandler;
import main.Player;

import static org.junit.Assert.*;

public class testMovement {
	
	@Test
	public void Movement_test_Right() {
		//A
		Player player = new Player(new ObjectHandler(),2,2);
		//
		player.move(1);// 0 = up, 1 = right, 2 = down, 3 = left;
		//A
		assertEquals(3,player.getX());
		assertEquals(2,player.getY());
		
	}
	@Test
	public void Movement_test_Up() {
		//A
		Player player = new Player(new ObjectHandler(),4,5);
		//
		player.move(0);// 0 = up, 1 = right, 2 = down, 3 = left;
		//A
		assertEquals(4,player.getX());
		assertEquals(4,player.getY());
		
	}
	@Test
	public void Movement_test_Down() {
		//A
		Player player = new Player(new ObjectHandler(),2,1);
		//
		player.move(2);// 0 = up, 1 = right, 2 = down, 3 = left;
		//A
		assertEquals(2,player.getX());
		assertEquals(2,player.getY());
		
	}
	@Test
	public void Movement_test_Left() {
		//A
		Player player = new Player(new ObjectHandler(),7,3);
		//
		player.move(3);// 0 = up, 1 = right, 2 = down, 3 = left;
		//A
		assertEquals(6,player.getX());
		assertEquals(3,player.getY());
		
	}
}
