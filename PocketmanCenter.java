// The "PocketmanCenter" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class PocketmanCenter extends Frame
{ 
    public PocketmanCenter ()
    {
    //Declares colour variables.
	Color pokeWall= new Color (239,170,93);
	Color pokeFloor= new Color (250,236,186);
	Color door = new Color (214, 74, 74);
	Color pub = new Color (64, 145, 200);
	
	 //Draws the background.
	AndrewEdwardWaynePocketmans.c.setColor (pokeFloor);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);
	
	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);
	
	//Draws the back wall
	AndrewEdwardWaynePocketmans.c.setColor (pokeWall);
	AndrewEdwardWaynePocketmans.c.fillRect (30,60,950,100);
	
	//Draws the table counter
	AndrewEdwardWaynePocketmans.c.setColor (pub);
	AndrewEdwardWaynePocketmans.c.fillRect (170,160,60,180);
	AndrewEdwardWaynePocketmans.c.fillRect (770,160,60,180);
	AndrewEdwardWaynePocketmans.c.fillRect (170,280,660,60);
	AndrewEdwardWaynePocketmans.c.setColor (Color.LIGHT_GRAY);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (650,290,60,40,20,20);
	
	//Draws the healing machine
	AndrewEdwardWaynePocketmans.c.setColor (Color.DARK_GRAY);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (240,170,80,100,30,30);
	AndrewEdwardWaynePocketmans.c.setColor (Color.green);
	AndrewEdwardWaynePocketmans.c.fillRect (250,180,60,80);
	
	//Manager
	AndrewEdwardWaynePocketmans.c.setColor (Color.pink);
	AndrewEdwardWaynePocketmans.c.fillRect (645,200,70,70);
	
	//Draws the door
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (470, 560, 70, 30);

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Pocketcenter", 30, 35);
    } // main method
} // PocketmanCenter class
