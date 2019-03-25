package main;

public class Player extends GameObject {
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
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
	public void update() {
		
	}
}
