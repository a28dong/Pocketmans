// The "Area9" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area9 extends Frame
{
    public Area9 ()
    {
	//Declares colour variables.
	Color sign = new Color (212, 154, 44);
	Color buildingGround = new Color (106, 202, 157);
	Color path = new Color (120, 120, 120);
	Color pokeRoof = new Color (194, 81, 63);
	Color pokeRoof2 = new Color (222, 121, 101);
	Color window = new Color (93, 160, 229);
	Color tree1 = new Color (42, 111, 55);
	Color tree2 = new Color (65, 169, 76);
	Color wall = new Color (230, 239, 188);
	Color door = new Color (214, 74, 74);

	//Draws the background
	AndrewEdwardWaynePocketmans.c.setColor (buildingGround);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the path
	AndrewEdwardWaynePocketmans.c.setColor (path);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 250, 950, 150);

	//Draws the trees
	AndrewEdwardWaynePocketmans.c.setColor (tree1);
	AndrewEdwardWaynePocketmans.c.fillRect (60, 470, 80, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (160, 470, 80, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (260, 470, 80, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (360, 470, 80, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (460, 470, 80, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (560, 470, 80, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (660, 470, 80, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (760, 470, 80, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (860, 470, 80, 80);

	AndrewEdwardWaynePocketmans.c.setColor (tree2);
	AndrewEdwardWaynePocketmans.c.fillRect (75, 485, 50, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (175, 485, 50, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (275, 485, 50, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (375, 485, 50, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (475, 485, 50, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (575, 485, 50, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (675, 485, 50, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (775, 485, 50, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (875, 485, 50, 50);

	//Draws the pocketcenter
	AndrewEdwardWaynePocketmans.c.setColor (pokeRoof);
	AndrewEdwardWaynePocketmans.c.fillRect (125, 70, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (pokeRoof2);
	AndrewEdwardWaynePocketmans.c.fillRect (140, 85, 170, 70);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRect (130, 170, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (206, 180, 40, 50);

	//Drwas the aesthetics on the pocketcenter
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillOval (145, 175, 40, 40);
	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.fillArc (150, 180, 30, 30, 0, 180);
	AndrewEdwardWaynePocketmans.c.fillArc (150, 180, 30, 30, 180, 180);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRect (150, 193, 30, 4);
	AndrewEdwardWaynePocketmans.c.fillOval (161, 191, 8, 8);
	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.fillOval (162, 192, 6, 6);

	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillOval (265, 175, 40, 40);
	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.fillArc (270, 180, 30, 30, 0, 180);
	AndrewEdwardWaynePocketmans.c.fillArc (270, 180, 30, 30, 180, 180);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 193, 30, 4);
	AndrewEdwardWaynePocketmans.c.fillOval (281, 191, 8, 8);
	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.fillOval (282, 192, 6, 6);

	//Draws a house
	AndrewEdwardWaynePocketmans.c.setColor (Color.orange);
	AndrewEdwardWaynePocketmans.c.fillRect (625, 70, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (630, 170, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (706, 180, 40, 50);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (640, 180, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (770, 180, 40, 40);

	//Draws a Sign
	AndrewEdwardWaynePocketmans.c.setColor (sign);
	AndrewEdwardWaynePocketmans.c.fillRect (400, 160, 70, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (427, 210, 16, 30);
	AndrewEdwardWaynePocketmans.c.setColor (Color.DARK_GRAY);
	AndrewEdwardWaynePocketmans.c.drawLine (410, 170, 460, 170);
	AndrewEdwardWaynePocketmans.c.drawLine (410, 185, 460, 185);
	AndrewEdwardWaynePocketmans.c.drawLine (410, 200, 460, 200);


	//Draws Wobblefeet if still intact
	if (AndrewEdwardWaynePocketmans.r9encounter == 0 || AndrewEdwardWaynePocketmans.r9encounter == 1)
	{
	    //Draws Wobblefeet (90x90)
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.bronzeblue);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.wobblex, AndrewEdwardWaynePocketmans.wobbley - 10, 50, 90);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.wobblex - 20, AndrewEdwardWaynePocketmans.wobbley + 15, 30, 50);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.wobblex + 40, AndrewEdwardWaynePocketmans.wobbley + 15, 30, 50);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.wobblex - 5, AndrewEdwardWaynePocketmans.wobbley + 70, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.wobblex + 35, AndrewEdwardWaynePocketmans.wobbley + 70, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.wobblex, AndrewEdwardWaynePocketmans.wobbley + 70, 50, 15);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.pink);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.wobblex + 11, AndrewEdwardWaynePocketmans.wobbley + 2, 30, 30, 0, -180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.wobblex + 12, AndrewEdwardWaynePocketmans.wobbley + 5, AndrewEdwardWaynePocketmans.wobblex + 21, AndrewEdwardWaynePocketmans.wobbley + 7);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.wobblex + 12, AndrewEdwardWaynePocketmans.wobbley + 9, AndrewEdwardWaynePocketmans.wobblex + 21, AndrewEdwardWaynePocketmans.wobbley + 7);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.wobblex + 29, AndrewEdwardWaynePocketmans.wobbley + 7, AndrewEdwardWaynePocketmans.wobblex + 38, AndrewEdwardWaynePocketmans.wobbley + 9);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.wobblex + 29, AndrewEdwardWaynePocketmans.wobbley + 7, AndrewEdwardWaynePocketmans.wobblex + 38, AndrewEdwardWaynePocketmans.wobbley + 5);
	    AndrewEdwardWaynePocketmans.c.drawArc (AndrewEdwardWaynePocketmans.wobblex + 10, AndrewEdwardWaynePocketmans.wobbley + 15, 6, 6, 0, 180);
	    AndrewEdwardWaynePocketmans.c.drawArc (AndrewEdwardWaynePocketmans.wobblex + 16, AndrewEdwardWaynePocketmans.wobbley + 15, 6, 6, 180, 180);
	    AndrewEdwardWaynePocketmans.c.drawArc (AndrewEdwardWaynePocketmans.wobblex + 22, AndrewEdwardWaynePocketmans.wobbley + 15, 6, 6, 0, 180);
	    AndrewEdwardWaynePocketmans.c.drawArc (AndrewEdwardWaynePocketmans.wobblex + 28, AndrewEdwardWaynePocketmans.wobbley + 15, 6, 6, 180, 180);
	    AndrewEdwardWaynePocketmans.c.drawArc (AndrewEdwardWaynePocketmans.wobblex + 34, AndrewEdwardWaynePocketmans.wobbley + 15, 6, 6, 0, 180);
	}

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("191 Confederation Drive", 30, 35);

    } // main method
} // Area9 class
