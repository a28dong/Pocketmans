// The "Area1" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area1 extends Frame
{
    public Area1 ()
    {
	//Declares colour variables.
	Color floor = new Color (251, 216, 152);
	Color wall = new Color (5, 117, 155);
	Color mat = new Color (136, 198, 162);
	Color door = new Color (214, 74, 74);
	Color window = new Color (82, 219, 255);
	Color table1 = new Color (239, 214, 95);
	Color feet1 = new Color (192, 170, 112);
	Color table2 = new Color (165, 113, 78);
	Color feet2 = new Color (133, 87, 35);

	//Draws the floor.
	AndrewEdwardWaynePocketmans.c.setColor (floor);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);
	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the door.
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (470, 560, 70, 30);
	//Draws an additional wall.
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 60, 950, 60);

	//Draws the mat
	AndrewEdwardWaynePocketmans.c.setColor (mat);
	AndrewEdwardWaynePocketmans.c.fillRect (210, 300, 600, 200);
	//Draws a table
	AndrewEdwardWaynePocketmans.c.setColor (table1);
	AndrewEdwardWaynePocketmans.c.fillRect (600, 320, 150, 100);
	AndrewEdwardWaynePocketmans.c.setColor (feet1);
	AndrewEdwardWaynePocketmans.c.fillRect (600, 420, 150, 12);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (600, 425, 15, 18, 5, 5);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (735, 425, 15, 18, 5, 5);

	//Draws the pokeballs if not taken
	if (AndrewEdwardWaynePocketmans.a1ball1 == 1)
	{
	    AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	    AndrewEdwardWaynePocketmans.c.fillArc (610, 360, 30, 30, 0, 180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillArc (610, 360, 30, 30, 180, 180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.fillRect (610, 373, 30, 4);
	    AndrewEdwardWaynePocketmans.c.fillOval (621, 371, 8, 8);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillOval (622, 372, 6, 6);
	}
	if (AndrewEdwardWaynePocketmans.a1ball2 == 1)
	{
	    AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	    AndrewEdwardWaynePocketmans.c.fillArc (660, 360, 30, 30, 0, 180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillArc (660, 360, 30, 30, 180, 180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.fillRect (660, 373, 30, 4);
	    AndrewEdwardWaynePocketmans.c.fillOval (671, 371, 8, 8);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillOval (672, 372, 6, 6);
	}
	if (AndrewEdwardWaynePocketmans.a1ball3 == 1)
	{
	    AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	    AndrewEdwardWaynePocketmans.c.fillArc (710, 360, 30, 30, 0, 180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillArc (710, 360, 30, 30, 180, 180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.fillRect (710, 373, 30, 4);
	    AndrewEdwardWaynePocketmans.c.fillOval (721, 371, 8, 8);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillOval (722, 372, 6, 6);
	}

	//Draws the second table
	AndrewEdwardWaynePocketmans.c.setColor (table2);
	AndrewEdwardWaynePocketmans.c.fillRect (400, 140, 300, 60);
	AndrewEdwardWaynePocketmans.c.setColor (Color.gray);
	AndrewEdwardWaynePocketmans.c.setColor (feet2);
	AndrewEdwardWaynePocketmans.c.fillRect (400, 200, 300, 15);
	AndrewEdwardWaynePocketmans.c.fillRect (550, 215, 150, 45);
	AndrewEdwardWaynePocketmans.c.fillRect (400, 215, 30, 45);

	//Draws a chair
	AndrewEdwardWaynePocketmans.c.setColor (feet1);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (460, 268, 10, 15, 3, 3);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (510, 268, 10, 15, 3, 3);
	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (460, 230, 60, 40, 5, 5);

	//Draws the four machines
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.drawRect (39, 199, 121, 151);
	AndrewEdwardWaynePocketmans.c.drawRect (39, 369, 121, 151);
	AndrewEdwardWaynePocketmans.c.drawRect (849, 199, 121, 151);
	AndrewEdwardWaynePocketmans.c.drawRect (849, 369, 121, 151);

	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRect (40, 200, 120, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (40, 370, 120, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (850, 200, 120, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (850, 370, 120, 50);

	AndrewEdwardWaynePocketmans.c.setColor (Color.LIGHT_GRAY);
	AndrewEdwardWaynePocketmans.c.fillRect (40, 250, 120, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (40, 420, 120, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (850, 250, 120, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (850, 420, 120, 100);

	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (55, 265, 90, 70);
	AndrewEdwardWaynePocketmans.c.fillRect (55, 435, 90, 70);
	AndrewEdwardWaynePocketmans.c.fillRect (865, 265, 90, 70);
	AndrewEdwardWaynePocketmans.c.fillRect (865, 435, 90, 70);

	//Draws a character if still intact
	if (AndrewEdwardWaynePocketmans.tutorial == 0)
	{
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.sodaBrown);
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (AndrewEdwardWaynePocketmans.sodawodax, AndrewEdwardWaynePocketmans.sodawoday, 40, 80, 20, 50);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.sodawodax - 25, AndrewEdwardWaynePocketmans.sodawoday + 30, 90, 10);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.sodawodax - 25, AndrewEdwardWaynePocketmans.sodawoday + 15, 10, 20);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.sodawodax + 55, AndrewEdwardWaynePocketmans.sodawoday + 15, 10, 20);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.sodawodax + 17, AndrewEdwardWaynePocketmans.sodawoday - 10, 6, 10);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.sodawodax + 8, AndrewEdwardWaynePocketmans.sodawoday - 12, 24, 6);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax - 5, AndrewEdwardWaynePocketmans.sodawoday + 65, 15, 30);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax + 30, AndrewEdwardWaynePocketmans.sodawoday + 65, 15, 30);
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.leafGreen);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax - 37, AndrewEdwardWaynePocketmans.sodawoday + 8, 15, 15);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax - 18, AndrewEdwardWaynePocketmans.sodawoday + 8, 15, 15);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax - 27, AndrewEdwardWaynePocketmans.sodawoday, 15, 16);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax + 43, AndrewEdwardWaynePocketmans.sodawoday + 8, 15, 15);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax + 62, AndrewEdwardWaynePocketmans.sodawoday + 8, 15, 15);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax + 53, AndrewEdwardWaynePocketmans.sodawoday, 15, 16);
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.sodaSpots);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax + 10, AndrewEdwardWaynePocketmans.sodawoday + 39, 8, 15);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax + 26, AndrewEdwardWaynePocketmans.sodawoday + 51, 7, 12);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.sodawodax + 15, AndrewEdwardWaynePocketmans.sodawoday + 60, 7, 13);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (AndrewEdwardWaynePocketmans.sodawodax + 8, AndrewEdwardWaynePocketmans.sodawoday + 10, 7, 12, 3, 7);
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (AndrewEdwardWaynePocketmans.sodawodax + 25, AndrewEdwardWaynePocketmans.sodawoday + 10, 7, 12, 3, 7);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.pink);
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (AndrewEdwardWaynePocketmans.sodawodax + 11, AndrewEdwardWaynePocketmans.sodawoday + 27, 18, 5, 11, 3);
	}
	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Professor Spruce's Lab", 30, 35);
    } // main method
} // Area1 class
