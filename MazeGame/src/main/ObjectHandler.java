package main;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectHandler {
	ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	public void tick() {
		for(int i = 0; i < objects.size(); i++) {
			objects.get(i).tick();
		}
	}
	public void render(Graphics g) {
		for(int i = 0; i < objects.size(); i++) {
			objects.get(i).render(g);
		}
	}
	public void addObject(GameObject object) {
		objects.add(object);
	}
}
