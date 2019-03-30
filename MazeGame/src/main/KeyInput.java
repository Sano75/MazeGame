package main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	private ObjectHandler handler;
	
	public KeyInput(ObjectHandler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		
		for(int i = 0; i < handler.objects.size(); i++) {
			GameObject temp = handler.objects.get(i);
			if(temp.getType() == 2) {
				Player player = (Player) temp;
				switch (e.getKeyCode()) {
				
				case KeyEvent.VK_UP:
					player.move(0);
					break;
				case KeyEvent.VK_RIGHT:
					player.move(1);
					break;
				case KeyEvent.VK_DOWN:
					player.move(2);
					break;
				case KeyEvent.VK_LEFT:
					player.move(3);
					break;
				}
			}
		}
	}
}
