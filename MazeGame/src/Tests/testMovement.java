package Tests;

import org.junit.Test;

import main.Player;

import static org.junit.Assert.*;

public class testMovement {
	
	@Test
	public void Movement_test() {
		//A
		Player player = new Player(1,2);
		//
		player.move(1);// 0 = up, 1 = right, 2 = down, 3 = left;
		//A
		assertEquals(2,player.getY());
		assertEquals(2,player.getX());
	}
}
