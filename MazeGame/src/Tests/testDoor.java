package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Door;

public class testDoor {
	
	
	@Test
	public void doorTest(){	
			
		//arrange
		Door door = new Door (null,2,2);
		//act
		int actual = door.getX();
		//assert
			assertEquals (2 * 32, actual);
	}
	@Test
	public void doorTest2() {
		// arrange
		Door door = new Door (null,3,3);
		// act
		int actual = door.getY();
		
		// assert
		assertEquals (3* 32, actual);
		
		
	}

}
