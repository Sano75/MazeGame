package main;

import java.awt.Color;
import java.awt.Rectangle;

public class Player extends GameObject {
	ObjectHandler handler;
	int score;
	boolean doorAdded;
	public boolean win;
	public Player(Object object, int i, int j) {
		this.x = x;
		this.y = y;
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
			this.y --;
			break;
		case 1:
			this.x++;
			break;
		case 2:
			this.y++;
			break;
		case 3:
			this.x--;
			break;
		}
	}
	@Override
	public void tick() {
		x+= 1;
		if(score == 5 && !doorAdded) {
			handler.addObject(new Door(10,5));
			doorAdded = true;
		}
		collision();
	}
	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y,32,32);
	}
	public void collision() {
		for(int i = 0; i < handler.objects.size(); i++) {
			GameObject temp = handler.objects.get(i);
			
			if(this.getBounds().intersects(temp.getBounds())) {
				switch(temp.getType()) {
					case 4:
						System.out.println("YOU MADE IT OUT");
						win = true;
						break;
					case 2:
						break;
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
