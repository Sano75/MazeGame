package main;

import java.awt.Color;
import java.awt.Rectangle;

public class Door extends GameObject {	
	boolean running;
	public  Door(boolean running,int x, int y) {
		this.running = running;
		this.x = x * 32;
		this.y = y * 32;
		this.type = 4;
		this.color = Color.green;
	}

	@Override
	public void tick() {
	}
	@Override
	public Rectangle getBounds() {
		return new Rectangle(this.x,this.y,32,32);
	}
}