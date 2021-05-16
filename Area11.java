// The "Area11" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area11 extends Frame
{
    public Area11 ()
    {
	//Declares colour variables.
	Color sandGround = new Color (254, 220, 142);
	Color fieldGround = new Color (123, 236, 147);
	Color tree1 = new Color (42, 111, 55);
	Color tree2 = new Color (65, 169, 76);

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
	AndrewEdwardWaynePocketmans.c.fillRect (435, 60, 140, 520);

	//Draws the trees
	AndrewEdwardWaynePocketmans.c.setColor (tree1);
	AndrewEdwardWaynePocketmans.c.fillRect (60, 80, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (60, 245, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (60, 410, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (240, 80, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (240, 245, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (240, 410, 150, 150);

	AndrewEdwardWaynePocketmans.c.fillRect (620, 80, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (620, 245, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (620, 410, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (800, 80, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (800, 245, 150, 150);
	AndrewEdwardWaynePocketmans.c.fillRect (800, 410, 150, 150);

	AndrewEdwardWaynePocketmans.c.setColor (tree2);
	AndrewEdwardWaynePocketmans.c.fillRect (80, 100, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (80, 265, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (80, 430, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (260, 100, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (260, 265, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (260, 430, 110, 110);

	AndrewEdwardWaynePocketmans.c.fillRect (640, 100, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (640, 265, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (640, 430, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (820, 100, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (820, 265, 110, 110);
	AndrewEdwardWaynePocketmans.c.fillRect (820, 430, 110, 110);

	//Draws fire on the trees
	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.fillRect (315, 160, 5, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (320, 150, 10, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (330, 135, 5, 65);
	AndrewEdwardWaynePocketmans.c.fillRect (335, 115, 8, 85);
	AndrewEdwardWaynePocketmans.c.fillRect (343, 145, 10, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (353, 160, 5, 30);

	AndrewEdwardWaynePocketmans.c.fillRect (665, 290, 5, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (670, 280, 10, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (680, 265, 5, 65);
	AndrewEdwardWaynePocketmans.c.fillRect (685, 245, 8, 85);
	AndrewEdwardWaynePocketmans.c.fillRect (693, 275, 10, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (703, 290, 5, 30);

	AndrewEdwardWaynePocketmans.c.fillRect (135, 490, 5, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (140, 480, 10, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (150, 465, 5, 65);
	AndrewEdwardWaynePocketmans.c.fillRect (155, 445, 8, 85);
	AndrewEdwardWaynePocketmans.c.fillRect (163, 475, 10, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (173, 490, 5, 30);

	AndrewEdwardWaynePocketmans.c.fillRect (875, 450, 5, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (880, 440, 10, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (890, 425, 5, 65);
	AndrewEdwardWaynePocketmans.c.fillRect (895, 405, 8, 85);
	AndrewEdwardWaynePocketmans.c.fillRect (903, 435, 10, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (913, 450, 5, 30);

	AndrewEdwardWaynePocketmans.c.setColor (Color.yellow);
	AndrewEdwardWaynePocketmans.c.fillRect (325, 170, 8, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (333, 160, 5, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (338, 175, 8, 15);

	AndrewEdwardWaynePocketmans.c.fillRect (675, 300, 8, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (683, 290, 5, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (688, 305, 8, 15);

	AndrewEdwardWaynePocketmans.c.fillRect (145, 500, 8, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (153, 490, 5, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (158, 505, 8, 15);

	AndrewEdwardWaynePocketmans.c.fillRect (885, 460, 8, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (893, 450, 5, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (898, 465, 8, 15);

	//Draws Bronze-oh if still intact
	if (AndrewEdwardWaynePocketmans.r11encounter == 0)
	{
	    //Draws Bronze-oh (86x94)
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.bronzeblue);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox - 240, AndrewEdwardWaynePocketmans.bronzoy + 300, 70, 70);
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.aweBlue);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox + 10 - 240, AndrewEdwardWaynePocketmans.bronzoy + 10 + 300, 50, 50);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox - 8 - 240, AndrewEdwardWaynePocketmans.bronzoy + 8 + 300, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox - 8 - 240, AndrewEdwardWaynePocketmans.bronzoy + 42 + 300, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox + 25 - 240, AndrewEdwardWaynePocketmans.bronzoy - 12 + 300, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox + 25 - 240, AndrewEdwardWaynePocketmans.bronzoy + 62 + 300, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox + 58 - 240, AndrewEdwardWaynePocketmans.bronzoy + 8 + 300, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox + 58 - 240, AndrewEdwardWaynePocketmans.bronzoy + 42 + 300, 20, 20);
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.bronzeblue);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox + 25 - 240, AndrewEdwardWaynePocketmans.bronzoy + 25 + 300, 20, 20);
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.sodaSpots);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox + 12 - 240, AndrewEdwardWaynePocketmans.bronzoy + 26 + 300, 13, 18);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox + 45 - 240, AndrewEdwardWaynePocketmans.bronzoy + 26 + 300, 13, 18);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox + 16 - 240, AndrewEdwardWaynePocketmans.bronzoy + 30 + 300, 5, 10);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.bronzox + 49 - 240, AndrewEdwardWaynePocketmans.bronzoy + 30 + 300, 5, 10);
	}

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Viridian Forest", 30, 35);

    } // main method
} // Area11 class
