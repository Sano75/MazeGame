package main;

import java.awt.Color;
import java.awt.Rectangle;

public class Player extends GameObject {
	ObjectHandler handler;
	int score;
	int priorY;
	int priorX;
	boolean doorAdded;
	public boolean win;
	public Player(ObjectHandler handler, int x, int y) {
		this.x = x * 32;
		this.y = y * 32;
		this.type = 2;
		this.color = Color.cyan;
		score = 5;
		this.handler = handler;
		doorAdded = false;
		win = false;
		
	}
	public void move(int direction) { // 0 = up, 1 = right, 2 = down, 3 = left;
		switch(direction) {
		case 0:
			priorY = this.y;
			priorX = this.x;
			this.y -= 32;
			break;
		case 1:
			priorY = this.y;
			priorX = this.x;
			this.x += 32;
			break;
		case 2:
			priorY = this.y;
			priorX = this.x;
			this.y += 32;
			break;
		case 3:
			priorY = this.y;
			priorX = this.x;
			this.x -= 32;
			break;
		}
	}
	@Override
	public void tick() {
		collision();
	}
	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y,32,32);
	}
	public void collision() {
		for(int i = 0; i < handler.objects.size(); i++) {
			GameObject temp = handler.objects.get(i);
			
			if(temp.getType() != 2) {
				if(getBounds().intersects(temp.getBounds())) {
					switch(temp.getType()) { 
						case 4:
							System.out.println("YOU MADE IT OUT");
							win = true;
							break;
						case 1:
							this.y = priorY;
							this.x = priorX;
							System.out.println("Collided with the wall");
							break;
					}
				}
			}
		}
	}
	public boolean collisionLaser(Laser laser) {
		if (true) {
			return "Game over" != null;
		}
		
		return false ;
	}
}

