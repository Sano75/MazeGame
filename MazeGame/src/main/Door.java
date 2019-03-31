package main;

import java.awt.Color;
import java.awt.Rectangle;

public class Door extends GameObject{

    boolean visible = false;
    Game game;
    
    public  Door(Game game,int x, int y) {


        this.game = game;
        this.x = x * 32;
        this.y = y * 32;

        this.type = 4;
        this.color = Color.green;
    }
    
    // make a method in Door class when collides with player it closes.
    
    public void doorEnter() {
        
            if (visible)
            {
                game.stop();
            }
                
            
            }
    
    public void visible() {
        visible = true;
    }

    @Override
    public void tick() {
    }
    @Override
    public Rectangle getBounds() {
        return new Rectangle(this.x,this.y,32,32);
    }
    
}
