package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Door;

public class testDoor {
	
	
	@Test
	public void openDoorTest(){	
			
		int playerScore = 8;		
		int doorAvailable = 1;		
		assertEquals(playerScore,doorAvailable);
		
	}

}
