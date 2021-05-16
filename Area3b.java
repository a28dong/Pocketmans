// The "Area3b" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area3b extends Frame
{
    public Area3b ()
    {
	//Declares colour variables.
	Color grassGround = new Color (126, 213, 155);
	Color buildingGround = new Color (106, 202, 157);
	Color sign = new Color (212, 154, 44);

	//Draws the background.
	AndrewEdwardWaynePocketmans.c.setColor (buildingGround);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 240, 950, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (870, 70, 110, 180);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the path
	AndrewEdwardWaynePocketmans.c.setColor (grassGround);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 250, 950, 140);
	AndrewEdwardWaynePocketmans.c.fillRect (430, 60, 140, 520);

	//Draws the sign
	AndrewEdwardWaynePocketmans.c.setColor (sign);
	AndrewEdwardWaynePocketmans.c.fillRect (700, 370, 70, 50);
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.drawLine (710, 380, 760, 380);
	AndrewEdwardWaynePocketmans.c.drawLine (710, 395, 760, 395);
	AndrewEdwardWaynePocketmans.c.drawLine (710, 410, 760, 410);

	//Draws a character if still intact
	if (AndrewEdwardWaynePocketmans.r3encounter == 0)
	    new DrawsDweeb ();

	//Draws No-pass (left) (106x90)
	if (AndrewEdwardWaynePocketmans.a3nopass == 1)
	{
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.aweBlue);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.nopassx, AndrewEdwardWaynePocketmans.nopassy, 50, 80);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.nopassx - 20, AndrewEdwardWaynePocketmans.nopassy + 55, 20, 15);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.nopassx, AndrewEdwardWaynePocketmans.nopassy + 10, 30, 20);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.nopassx + 10, AndrewEdwardWaynePocketmans.nopassy + 55, AndrewEdwardWaynePocketmans.nopassx + 30, AndrewEdwardWaynePocketmans.nopassy + 55);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.nopassx + 10, AndrewEdwardWaynePocketmans.nopassy + 70, AndrewEdwardWaynePocketmans.nopassx + 30, AndrewEdwardWaynePocketmans.nopassy + 70);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.nopassx + 10, AndrewEdwardWaynePocketmans.nopassy + 55, AndrewEdwardWaynePocketmans.nopassx + 10, AndrewEdwardWaynePocketmans.nopassy + 70);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.nopassx - 20, AndrewEdwardWaynePocketmans.nopassy + 55, AndrewEdwardWaynePocketmans.nopassx, AndrewEdwardWaynePocketmans.nopassy + 55);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.nopassx - 20, AndrewEdwardWaynePocketmans.nopassy + 70, AndrewEdwardWaynePocketmans.nopassx, AndrewEdwardWaynePocketmans.nopassy + 70);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.nopassx - 20, AndrewEdwardWaynePocketmans.nopassy + 55, AndrewEdwardWaynePocketmans.nopassx - 20, AndrewEdwardWaynePocketmans.nopassy + 70);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.nopassx - 26, AndrewEdwardWaynePocketmans.nopassy + 30, 50, 20);
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.aweBlue);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.nopassx + 6, AndrewEdwardWaynePocketmans.nopassy + 20, AndrewEdwardWaynePocketmans.nopassx + 24, AndrewEdwardWaynePocketmans.nopassy + 20);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.nopassx + 5, AndrewEdwardWaynePocketmans.nopassy + 80, 15, 10);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.nopassx + 30, AndrewEdwardWaynePocketmans.nopassy + 80, 15, 10);
	}

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Packllet Town", 30, 35);
    } // main method
} // Area3b class
