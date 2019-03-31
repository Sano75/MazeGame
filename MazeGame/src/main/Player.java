package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends GameObject {
	ObjectHandler handler;
	public int score = 0;
	int priorY;
	int priorX;
	boolean doorAdded;
	public boolean win;
	int minimumTreasures;
	public Door hiddenDoor;
	public Player(ObjectHandler handler, int x, int y) {
		this.x = x * dimx;
		this.y = y * dimy;
		this.type = 2;
		this.color = Color.cyan;
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
	public void render(Graphics g) {
		if(visible) {
		g.setColor(color);
		g.fillRect(x + xoffset , y + yoffset, dimx, dimy);
		g.setColor(Color.yellow);
		g.setFont(new Font("TimesRoman",Font.BOLD, 20));
		g.drawString("T:" + score, x, y - 10);
		}
	}
	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y,32,32);
	}
	public void collision() {
		for(int i = 0; i < handler.objects.size(); i++) {
			GameObject temp = handler.objects.get(i);
			if(temp.getType() == 4) {
				hiddenDoor = (Door) temp;
			}
			if(temp.getType() != 2) {
				if(getBounds().intersects(temp.getBounds())) {
					switch(temp.getType()) { 
						case 4: //Door
							win = true;
							Door door = (Door) temp;
							door.doorEnter();
							break;
						case 1: //Wall
							this.y = priorY;
							this.x = priorX;
							System.out.println("Collided with the wall");
							break;
						case 3:
							//Treasure treasure = (Treasure) temp;
							//treasure.treasureMethods
							handler.objects.remove(i);
							score++;
							if(score >= minimumTreasures) {
								hiddenDoor.setVisible();
							}
							break;
						case 5:
							Laser laser = (Laser) temp;
							if(laser.activeLaser()) {
								handler.objects.remove(this);
							}
							break;
							
					}
				}
			}
		}
	}
	/*public boolean collisionLaser(Laser laser) {
		if (true) {
			return "Game over" != null;
		}
		
		return false;
	}*/
	public void setMinimumTreasures(int treasureCount) {
		minimumTreasures = treasureCount;
	}
}

