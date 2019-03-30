package main;

import java.awt.Color;
import java.awt.Rectangle;

public class Wall extends GameObject{
	
	public Wall(int x, int y) {
		this.x = x;
		this.y = y;
		this.type = 1;
		this.color = Color.BLACK;
	}
	@Override
	public void tick() {
		
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x,y,32,32);
	}

}
