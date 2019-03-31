package Tests;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import main.Laser;
import main.ObjectHandler;
import main.Player;



public class testLaser {
	
	@Test
	public void LaserOff() {
		//A
		Laser laser = new Laser(4,7);
		//A
		laser.ToggleLaser();
		//A
		assertFalse(laser.active);
		
	}
	@Test
	public void LaserOn() {
		//A
		Laser laser = new Laser(8,7);
		//A
		laser.ToggleLaser();
		//A
		assertFalse(laser.active);
		
		laser.ToggleLaser();
		
		assertTrue(laser.active);
		
	}
	
	@Test
	public void GoThroughLaser() {
		//A
		ObjectHandler handler = new ObjectHandler();
		handler.addObject(new Player(handler,8,9)); //0
		handler.addObject(new Laser(8,9)); //1
		Player player = (Player)handler.objects.get(0);
		Laser laser = (Laser)handler.objects.get(1);
		laser.active = true;
		//A
		assertTrue(handler.objects.contains(player));
		player.collision();
		assertFalse(handler.objects.contains(player));
		
		
		
	}

}
