package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {
	protected int x,y; // This is position on a 32 grid so each integer here is multiplied with 32 in the gameobject itself
	protected int dimx = 32;
	protected int dimy = 32;
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
	public int getType() {
		return type;
	}
	public abstract void tick();
	
	public void render(Graphics g) {
		if(visible) {
		g.setColor(color);
		g.fillRect(x, y, dimx, dimy);
		}
	}
	public abstract Rectangle getBounds();
}
