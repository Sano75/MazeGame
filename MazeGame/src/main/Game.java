package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable{
	
	private static final long serialVersionUID = -1997325596863821774L;
	private boolean running;
	private Thread t;
	private static final int width = 1920, height = 1080;
	ObjectHandler handler;
	
	Game(){
		new Window(this,width,height,"Maze Game");
		handler = new ObjectHandler();
		handler.addObject(new Player(4,5));
	}public void start(){
		running = true;
		t = new Thread(this);
		t.start();
	}public void stop() {
		try {
			t.join();
			running = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void run() { //GAME LOOP NEEDS REVISION, THREAD.SLEEP WITHOUT INTERPOLATION AND VIRTUAL SYNC IS NOT PREFFERED!
		while(running) {
			try {
				update(); 
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		stop();
		
	}
	public void update() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.gray);
		g.fillRect(0,0,width,height);
		handler.Update(g);
		g.dispose();
		bs.show();
	}
	public static void main(String[] args) {
		new Game();
		
	}

	

}
