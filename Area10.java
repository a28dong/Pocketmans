// The "Area10" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area10 extends Frame
{
    public Area10 ()
    {
	//Declares colour variables.
	Color sandGround = new Color (254, 220, 142);
	Color fieldGround = new Color (123, 236, 147);
	Color water2 = new Color (03, 120, 169);

	//Draws the background
	AndrewEdwardWaynePocketmans.c.setColor (fieldGround);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the path
	AndrewEdwardWaynePocketmans.c.setColor (sandGround);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 230, 700, 140);
	AndrewEdwardWaynePocketmans.c.fillRect (590, 370, 140, 210);

	//Draws flowers
	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.fillRect (60, 90, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (240, 140, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (570, 190, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (430, 110, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (800, 170, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (850, 470, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (910, 330, 20, 20);

	//Draws a pond
	AndrewEdwardWaynePocketmans.c.setColor (water2);
	AndrewEdwardWaynePocketmans.c.fillOval (40, 380, 530, 190);

	//Draws Deglitt if still intact
	if (AndrewEdwardWaynePocketmans.r10encounter == 0)
	{
	    //Draws Deglitt (105x100)
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.sodaSpots);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.diglettx - 15 - 100, AndrewEdwardWaynePocketmans.digletty + 70 + 100, 90, 30);
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.digBrown);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.diglettx - 100, AndrewEdwardWaynePocketmans.digletty + 100, 60, 50);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.diglettx - 100, AndrewEdwardWaynePocketmans.digletty + 25 + 100, 60, 60);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.diglettx + 15 - 100, AndrewEdwardWaynePocketmans.digletty + 20 + 100, 10, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.diglettx + 35 - 100, AndrewEdwardWaynePocketmans.digletty + 20 + 100, 10, 20);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.pink);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.diglettx + 10 - 100, AndrewEdwardWaynePocketmans.digletty + 45 + 100, 40, 20);
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.sodaSpots);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.diglettx - 10 - 100, AndrewEdwardWaynePocketmans.digletty + 75 + 100, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.diglettx + 10 - 100, AndrewEdwardWaynePocketmans.digletty + 75 + 100, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.diglettx + 30 - 100, AndrewEdwardWaynePocketmans.digletty + 75 + 100, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.diglettx + 50 - 100, AndrewEdwardWaynePocketmans.digletty + 75 + 100, 20, 20);
	}
	
	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Entrance to Viridian Forest", 30, 35);
	
    } // main method
} // Area10 class
