// The "Area8" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area8 extends Frame
{
    public Area8 ()
    {
	//Declares colour variables.
	Color sign = new Color (212, 154, 44);
	Color path = new Color (120, 120, 120);
	Color background = new Color (181, 181, 181);
	Color tree = new Color (78, 139, 113);
	Color pub = new Color (64, 145, 200);

	//Draws the background
	AndrewEdwardWaynePocketmans.c.setColor (background);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the path
	AndrewEdwardWaynePocketmans.c.setColor (path);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 300, 950, 150);

	//Draws the shrubs/mini-trees
	AndrewEdwardWaynePocketmans.c.setColor (tree);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 60, 950, 30);

	//Draws Coughing if still intact
	if (AndrewEdwardWaynePocketmans.r8encounter == 0)
	{
	    //Draws Coughing
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.koffpurple);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.koffingx, AndrewEdwardWaynePocketmans.koffingy + 200, 75, 75);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.koffingx + 15, AndrewEdwardWaynePocketmans.koffingy - 7 + 200, 25, 25);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.koffingx + 50, AndrewEdwardWaynePocketmans.koffingy + 5 + 200, 23, 23);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.koffingx + 25, AndrewEdwardWaynePocketmans.koffingy + 50 + 200, 30, 30);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.koffingx, AndrewEdwardWaynePocketmans.koffingy + 42 + 200, 33, 33);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.koffingx + 50, AndrewEdwardWaynePocketmans.koffingy + 40 + 200, 30, 30);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.koffingx - 5, AndrewEdwardWaynePocketmans.koffingy + 10 + 200, 30, 30);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.koffingx + 16, AndrewEdwardWaynePocketmans.koffingy + 16 + 200, 20, 20, 0, 180);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.koffingx + 44, AndrewEdwardWaynePocketmans.koffingy + 16 + 200, 20, 20, 0, 180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.koffingx + 23, AndrewEdwardWaynePocketmans.koffingy + 19 + 200, 6, 6);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.koffingx + 51, AndrewEdwardWaynePocketmans.koffingy + 19 + 200, 6, 6);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.pink);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.koffingx + 26, AndrewEdwardWaynePocketmans.koffingy + 26 + 200, 20, 20, 0, -180);
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.sodaBrown);
	    AndrewEdwardWaynePocketmans.c.drawOval (AndrewEdwardWaynePocketmans.koffingx + 28, AndrewEdwardWaynePocketmans.koffingy + 48 + 200, 17, 13);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.koffingx + 21, AndrewEdwardWaynePocketmans.koffingy + 57 + 200, AndrewEdwardWaynePocketmans.koffingx + 51, AndrewEdwardWaynePocketmans.koffingy + 66 + 200);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.koffingx + 21, AndrewEdwardWaynePocketmans.koffingy + 66 + 200, AndrewEdwardWaynePocketmans.koffingx + 51, AndrewEdwardWaynePocketmans.koffingy + 57 + 200);
	}

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Kerning City", 30, 35);
    } // main method
} // Area8 class
