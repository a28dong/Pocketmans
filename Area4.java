// The "Area4" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area4 extends Frame
{
    public Area4 ()
    {
	//Declares colour variables.
	Color grassGround2 = new Color (77, 114, 60);
	Color swampGround = new Color (43, 83, 56);
	Color tree3 = new Color (29, 41, 21);
	Color tree4 = new Color (61, 72, 54);
	Color sign = new Color (212, 154, 44);
	Color shrub = new Color (195, 233, 94);
	Color water = new Color (2, 103, 116);

	//Draws the background.
	AndrewEdwardWaynePocketmans.c.setColor (swampGround);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the path
	AndrewEdwardWaynePocketmans.c.setColor (grassGround2);
	AndrewEdwardWaynePocketmans.c.fillRect (255, 250, 725, 140);
	AndrewEdwardWaynePocketmans.c.fillRect (430, 300, 140, 280);
	AndrewEdwardWaynePocketmans.c.fillRect (255, 70, 140, 180);

	//Draws trees 
	AndrewEdwardWaynePocketmans.c.setColor (tree3);
	AndrewEdwardWaynePocketmans.c.fillRect (38, 90, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (38, 215, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (38, 340, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (38, 455, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (145, 90, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (145, 215, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (145, 340, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (145, 455, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (260, 410, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (830, 80, 120, 120);
	AndrewEdwardWaynePocketmans.c.fillRect (630, 420, 130, 130);


	AndrewEdwardWaynePocketmans.c.setColor (tree4);
	AndrewEdwardWaynePocketmans.c.fillRect (58, 110, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (58, 235, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (58, 360, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (58, 475, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (165, 110, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (165, 235, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (165, 360, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (165, 475, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (285, 435, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (855, 105, 70, 70);
	AndrewEdwardWaynePocketmans.c.fillRect (650, 440, 90, 90);

	//Draws a pond
	AndrewEdwardWaynePocketmans.c.setColor (water);
	AndrewEdwardWaynePocketmans.c.fillRect (420, 90, 360, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (490, 150, 250, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (460, 150, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (500, 70, 240, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (730, 150, 80, 40);

	//Draws a pocketball if not taken
	if (AndrewEdwardWaynePocketmans.a4ball == 1)
	{
	    AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	    AndrewEdwardWaynePocketmans.c.fillArc (850, 490, 30, 30, 0, 180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillArc (850, 490, 30, 30, 180, 180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.fillRect (850, 503, 30, 4);
	    AndrewEdwardWaynePocketmans.c.fillOval (861, 501, 8, 8);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillOval (862, 502, 6, 6);
	}

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("The Swamp", 30, 35);
	
    } // main method
} // Area4 class
