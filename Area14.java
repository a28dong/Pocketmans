// The "Area14" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area14 extends Frame
{
    public Area14 ()
    {
	//Declares colour variables.
	Color path = new Color (235, 213, 137);
	Color grass = new Color (117, 207, 172);
	Color grass2 = new Color (42, 165, 110);

	//Draws the background
	AndrewEdwardWaynePocketmans.c.setColor (grass);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the path
	AndrewEdwardWaynePocketmans.c.setColor (path);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 250, 140, 140); //Left exit
	AndrewEdwardWaynePocketmans.c.fillRect (430, 60, 140, 140); //Top exit
	AndrewEdwardWaynePocketmans.c.fillRect (130, 250, 290, 140); //Left
	AndrewEdwardWaynePocketmans.c.fillRect (280, 350, 540, 140); //Middle-Bottom
	AndrewEdwardWaynePocketmans.c.fillRect (670, 180, 150, 180); //Right
	AndrewEdwardWaynePocketmans.c.fillRect (540, 70, 280, 130); //Top exit Right

	//Draws the grass walls
	AndrewEdwardWaynePocketmans.c.setColor (grass2);
	AndrewEdwardWaynePocketmans.c.fillRect (40, 70, 380, 170); //Top Left
	AndrewEdwardWaynePocketmans.c.fillRect (410, 210, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (430, 210, 230, 130); //Middle
	AndrewEdwardWaynePocketmans.c.fillRect (830, 70, 140, 500); //Right
	AndrewEdwardWaynePocketmans.c.fillRect (40, 400, 230, 170); //Bottom Left
	AndrewEdwardWaynePocketmans.c.fillRect (270, 500, 600, 70); //Bottom

	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Mysterious Walkway", 30, 35);
    } // main method
} // Area14 class
