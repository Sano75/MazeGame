package main;

import java.awt.Color;
import java.awt.Graphics;

public abstract class GameObject {
	protected int x,y;
	protected int type; // 1 = wall, 2 = player, 3 = treasure, 4 = door, 5 = Laser
	int score; //Shouldn't only the player have a score?
	protected Color color;
	boolean visible = true;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getScore() {
		return y;
	}
	public abstract void tick();
	public void render(Graphics g) {
		if(visible) {
		g.setColor(color);
		g.fillRect(x * 32,y * 32,32,32);
		}
	}
}
