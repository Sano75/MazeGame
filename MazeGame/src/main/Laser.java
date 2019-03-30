package main;

import java.awt.Color;
import java.awt.Rectangle;

public class Laser extends GameObject {
	int activationTimer;
	public Laser(int x, int y) {
		this.x = x;
		this.y = y;
		this.type = 5;
		this.color = Color.red;
		this.dimx = 30;
		this.dimy = 30;
		activationTimer = 0;
	}
	@Override
	public void tick() {
		activationTimer += 1;
		if(activationTimer == 40) {
			if(color != Color.red) {
				this.color = Color.red;
				activationTimer = 0;
			}else {
				this.color = Color.pink;
				activationTimer = 0;
			}
		}
		
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x,y,32,32);
	}
	
}

