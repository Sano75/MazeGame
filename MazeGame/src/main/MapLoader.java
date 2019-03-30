package main;

public class MapLoader {
	ObjectHandler handler;
	int [][] map1;
	int [][] activeMap;
	public MapLoader(ObjectHandler handler) {
		this.handler = handler;
		int[][] map1 = { //22 wide, 17 high
						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
						{1,0,0,1,0,0,0,1,1,1,1,1,5,5,5,5,5,1,0,0,4,1},
						{1,2,0,1,5,1,0,0,0,1,5,0,0,0,1,0,0,0,0,1,1,1},
						{1,0,0,1,0,1,0,1,0,0,5,1,1,0,1,1,0,1,1,1,0,1},
						{1,0,0,0,0,1,0,1,1,1,5,0,1,0,1,1,5,1,0,0,3,1},
						{1,1,1,1,1,1,0,0,0,1,1,0,1,0,0,1,5,1,0,0,1,1},
						{1,0,0,1,3,1,0,0,0,1,0,0,0,1,0,0,0,1,1,0,1,1},
						{1,5,5,5,5,1,0,1,0,1,0,3,0,1,0,1,5,1,1,0,0,1},
						{1,0,1,1,1,1,0,1,0,0,1,1,1,1,0,1,0,0,0,1,0,1},
						{1,0,1,0,0,0,0,1,3,0,0,1,0,0,0,3,1,1,0,1,0,1},
						{1,0,0,0,3,0,0,1,1,1,5,1,0,0,0,0,0,1,0,1,0,1},
						{1,0,1,0,0,0,1,1,0,0,0,0,1,5,1,0,1,3,0,0,0,1},
						{1,0,1,1,1,1,1,0,0,0,0,0,1,5,1,0,0,1,1,1,0,1},
						{1,5,1,0,0,0,1,0,1,0,1,0,1,0,1,5,5,5,5,5,5,5},
						{1,0,1,0,1,5,1,0,1,5,1,0,0,0,1,0,0,1,1,1,5,1},
						{1,5,5,5,1,0,5,0,1,3,1,0,0,0,0,1,0,3,0,3,0,1},
						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
						
						};
		this.map1 = map1;
		
	}public void loadMap(int mapnum) {
		
		switch(mapnum) {
			case 1:
				activeMap = map1;
				break;
		}
		
		
		for(int i = 0; i < 22; i++) {
			for(int j = 0; j < 17; j++) {
				switch(activeMap[j][i]) {
				case 1:
					handler.addObject(new Wall(i * 32 + 32, j * 32 + 32));
					break;
				case 2:
					handler.addObject(new Player(handler,i * 32 + 32, j * 32 + 32));
					break;
				case 3:
					handler.addObject(new Treasure(i * 32 + 32, j * 32 + 32));
					break;
				case 4:
					handler.addObject(new Door(i * 32 + 32, j * 32 + 32));
					break;
				case 5: 
					handler.addObject(new Laser(i * 32 + 32, j * 32 +32));
					break;
			}
			}
		}
	}
		
	
}