// The "Area3" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area3 extends Frame
{
    public Area3 ()
    {
	//Declares colour variables.
	Color grassGround = new Color (126, 213, 155);
	Color buildingGround = new Color (106, 202, 157);
	Color tree1 = new Color (42, 111, 55);
	Color tree2 = new Color (65, 169, 76);
	Color roof3 = new Color (0, 146, 230, 100);
	Color roof4 = new Color (145, 229, 99);
	Color pokeRoof = new Color (194, 81, 63);
	Color pokeRoof2 = new Color (222, 121, 101);
	Color wall = new Color (230, 239, 188);
	Color door = new Color (214, 74, 74);
	Color sign = new Color (212, 154, 44);
	Color shrub = new Color (195, 233, 94);
	Color window = new Color (93, 160, 229);
	Color dweebGray = new Color (142, 131, 129);
	Color orange = new Color (232, 149, 83);

	//Draws the background.
	AndrewEdwardWaynePocketmans.c.setColor (buildingGround);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 60, 400, 190);
	AndrewEdwardWaynePocketmans.c.fillRect (570, 60, 410, 190);
	AndrewEdwardWaynePocketmans.c.fillRect (570, 390, 410, 190);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 390, 400, 190);

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

	//Draws the pocketcenter
	AndrewEdwardWaynePocketmans.c.setColor (pokeRoof);
	AndrewEdwardWaynePocketmans.c.fillRect (125, 70, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (pokeRoof2);
	AndrewEdwardWaynePocketmans.c.fillRect (140, 85, 170, 70);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRect (130, 170, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (206, 180, 40, 50);

	//Draws aesthetics on the pocketcenter
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

	//Draws house #1
	AndrewEdwardWaynePocketmans.c.setColor (roof3);
	AndrewEdwardWaynePocketmans.c.fillRect (125, 410, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (130, 510, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (206, 520, 40, 50);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (140, 520, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 520, 40, 40);

	//Draws house #2
	AndrewEdwardWaynePocketmans.c.setColor (roof4);
	AndrewEdwardWaynePocketmans.c.fillRect (625, 70, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (630, 170, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (706, 180, 40, 50);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (640, 180, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (770, 180, 40, 40);

	//Draws the sign
	AndrewEdwardWaynePocketmans.c.setColor (sign);
	AndrewEdwardWaynePocketmans.c.fillRect (700, 370, 70, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (727, 420, 16, 30);
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.drawLine (710, 380, 760, 380);
	AndrewEdwardWaynePocketmans.c.drawLine (710, 395, 760, 395);
	AndrewEdwardWaynePocketmans.c.drawLine (710, 410, 760, 410);

	//Draws Dweebble if still intact
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
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Packllet Town", 30, 35);
    } // main method
} // Area3 class
