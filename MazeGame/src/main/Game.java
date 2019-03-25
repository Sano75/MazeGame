package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable{
	
	private static final long serialVersionUID = -1997325596863821774L;
	private boolean running;
	private static final int width = 1920, height = 1080;
	
	Game(){
		new Window(this,width,height,"Maze Game");
	}public void start(){
		running = true;
		Thread t = new Thread(this);
		t.start();
	}
	public void run() {
		while(running) {
			update();
		}
		
	}
	public void update() {
		//Update
		
		
		//Render
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.gray);
		g.fillRect(0,0,width,height);
		g.dispose();
		bs.show();
	}
	public static void main(String[] args) {
		new Game();
		
	}

	

}
