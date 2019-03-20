package Tests;

import org.junit.Test;

public class testMovement {
    @Test
    public void movement_Test(){
        //A
        Player player = new Player(1,2); //Player Object
        //A
        player.move(1); // 0 = up, 1 = right, 2 = down, 3 = left;
        //A
        assertEquals(player.x, 2);
        assertEquals(player.y, 2);

    }
}
