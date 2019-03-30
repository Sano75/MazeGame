package main;

import java.awt.Rectangle;

public class Treasure extends GameObject {	
	public  Treasure(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void tick() {
		
	}
	@Override
	public Rectangle getBounds() {
		return new Rectangle(x,y,32,32);
		
	}

}
