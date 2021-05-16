// The "Area15" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area15 extends Frame
{
    public Area15 ()
    {
	//Declares colour variables.
	Color aweBlue = new Color (65, 100, 165);
	Color path = new Color (235, 213, 137);
	Color grass = new Color (117, 207, 172);
	Color tree1 = new Color (42, 111, 55);
	Color tree2 = new Color (65, 169, 76);

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
	AndrewEdwardWaynePocketmans.c.fillRect (30, 250, 950, 140);

	//Top Trees
	AndrewEdwardWaynePocketmans.c.setColor (tree1);
	AndrewEdwardWaynePocketmans.c.fillRect (50, 75, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (250, 85, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (430, 80, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (610, 80, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (810, 85, 150, 150);

	AndrewEdwardWaynePocketmans.c.setColor (tree2);
	AndrewEdwardWaynePocketmans.c.fillRect (70, 95, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 105, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (450, 100, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (630, 100, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (830, 105, 110, 110);

	//Bottom Trees
	AndrewEdwardWaynePocketmans.c.setColor (tree1);
	AndrewEdwardWaynePocketmans.c.fillRect (50, 410, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (210, 430, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (380, 420, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (530, 410, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (680, 430, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (830, 420, 100, 100);

	AndrewEdwardWaynePocketmans.c.setColor (tree2);
	AndrewEdwardWaynePocketmans.c.fillRect (65, 425, 70, 70);
	AndrewEdwardWaynePocketmans.c.fillRect (225, 445, 70, 70);
	AndrewEdwardWaynePocketmans.c.fillRect (395, 435, 70, 70);
	AndrewEdwardWaynePocketmans.c.fillRect (545, 425, 70, 70);
	AndrewEdwardWaynePocketmans.c.fillRect (695, 445, 70, 70);
	AndrewEdwardWaynePocketmans.c.fillRect (845, 435, 70, 70);

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Champion's Pathway", 30, 35);
    } // main method
} // Area15 class
