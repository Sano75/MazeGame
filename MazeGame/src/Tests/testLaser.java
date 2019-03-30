package Tests;
import static org.junit.Assert.assertEquals;


import org.junit.*;

import main.Laser;
import main.Player;



public class testLaser {
	
	@Test
	public void LaserOnAndOff() {
		//code to be added
		
	}
	
	@Test
	public void GoThroughLaser() {
		Player player = new Player(null, 2,2);
		
		Laser laser = new Laser(2,2);
		
		assertEquals(player.collisionLaser(laser), true);
		
		
	}

}
