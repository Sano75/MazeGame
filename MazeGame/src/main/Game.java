package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable{
	
	private static final long serialVersionUID = -1997325596863821774L;
	public boolean running;
	private Thread t;
	private static final int width = 1920, height = 1080;
	ObjectHandler handler;
	
	Game(){
		handler = new ObjectHandler();
		MapLoader mLoader = new MapLoader(this,handler);
		mLoader.loadMap(1);
		this.addKeyListener(new KeyInput(handler));
		new Window(this,width,height,"Maze Game");
		
		
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
			long lastTime = System.nanoTime();
	        double amountOfTicks = 60.0;
	        double ns = 1000000000 / amountOfTicks;
	        double delta = 0;
	        long timer = System.currentTimeMillis();
	        while(running)
	        {
	                    long now = System.nanoTime();
	                    delta += (now - lastTime) / ns;
	                    lastTime = now;
	                    while(delta >=1)
	                            {
	                                tick();
	                                delta--;
	                            }
	                            if(running)
	                                render();
	                            if(System.currentTimeMillis() - timer > 1000)
	                            {
	                                timer += 1000;
	                            }
	        }
	       stop();
		
		
	}
	public void tick() {
		handler.tick();
	}
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.gray);
		g.fillRect(0,0,width,height);
		handler.render(g);
		g.dispose();
		bs.show();
	}
	public static void main(String[] args) {
		new Game();
		
	}

	

}
