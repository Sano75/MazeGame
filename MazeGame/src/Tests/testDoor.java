package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Door;

public class testDoor {
	
	
	@Test
	public void doorTest(){	
			
		//arrange
		Door door = new Door (2,2);
		//act
		int actual = door.getX();
		//assert
			assertEquals (actual, 2);
	}
	@Test
	public void doorTest2() {
		// arrange
		Door door = new Door (3,3);
		// act
		int actual = door.getY();
		
		// assert
		assertEquals (actual, 3);
		
		
	}

}
