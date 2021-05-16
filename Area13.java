// The "Area13" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area13 extends Frame
{
    public Area13 ()
    {
	//Declares colour variables.
	Color path = new Color (235, 213, 137);
	Color grass = new Color (117, 207, 172);
	Color roof3 = new Color (0, 146, 230, 100);
	Color roof4 = new Color (145, 229, 99);
	Color pokeRoof = new Color (194, 81, 63);
	Color pokeRoof2 = new Color (222, 121, 101);
	Color wall = new Color (230, 239, 188);
	Color door = new Color (214, 74, 74);
	Color window = new Color (93, 160, 229);

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
	AndrewEdwardWaynePocketmans.c.fillRect (30, 250, 475, 140);
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

	//Pokeball Left
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
	//Pokeball Right
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

	//Bottom Left House
	AndrewEdwardWaynePocketmans.c.setColor (roof4);
	AndrewEdwardWaynePocketmans.c.fillRect (125, 410, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (130, 510, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (206, 520, 40, 50);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (140, 520, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 520, 40, 40);

	//Top Right House
	AndrewEdwardWaynePocketmans.c.setColor (roof3);
	AndrewEdwardWaynePocketmans.c.fillRect (680, 70, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (685, 170, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (761, 180, 40, 50);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (695, 180, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (825, 180, 40, 40);

	//Bottom Right House
	AndrewEdwardWaynePocketmans.c.setColor (Color.pink);
	AndrewEdwardWaynePocketmans.c.fillRect (680, 410, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (685, 510, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (761, 520, 40, 50);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (695, 520, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (825, 520, 40, 40);

	//Draws Snoozelax (140x140) if still intact
	if (AndrewEdwardWaynePocketmans.r13encounter == 0)
	{
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.aweBlue);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.snorlaxx, AndrewEdwardWaynePocketmans.snorlaxy, 100, 100);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.snorlaxx + 25, AndrewEdwardWaynePocketmans.snorlaxy - 30, 50, 50);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.snorlaxx + 30, AndrewEdwardWaynePocketmans.snorlaxy - 35, 20, 30);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.snorlaxx + 50, AndrewEdwardWaynePocketmans.snorlaxy - 35, 20, 30);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.snorlaxx - 20, AndrewEdwardWaynePocketmans.snorlaxy + 25, 35, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.snorlaxx + 85, AndrewEdwardWaynePocketmans.snorlaxy + 25, 35, 20);
	    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.snorbody);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.snorlaxx + 10, AndrewEdwardWaynePocketmans.snorlaxy + 10, 80, 80);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.snorlaxx + 32, AndrewEdwardWaynePocketmans.snorlaxy - 20, 36, 36);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.snorlaxx + 10, AndrewEdwardWaynePocketmans.snorlaxy + 75, 30, 30);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.snorlaxx + 60, AndrewEdwardWaynePocketmans.snorlaxy + 75, 30, 30);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.snorlaxx + 38, AndrewEdwardWaynePocketmans.snorlaxy - 10, AndrewEdwardWaynePocketmans.snorlaxx + 46, AndrewEdwardWaynePocketmans.snorlaxy - 10);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.snorlaxx + 54, AndrewEdwardWaynePocketmans.snorlaxy - 10, AndrewEdwardWaynePocketmans.snorlaxx + 62, AndrewEdwardWaynePocketmans.snorlaxy - 10);
	    AndrewEdwardWaynePocketmans.c.drawArc (AndrewEdwardWaynePocketmans.snorlaxx + 42, AndrewEdwardWaynePocketmans.snorlaxy - 5, 16, 10, -25, -130);
	}

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Obese City - 2", 30, 35);
    } // main method
} // Area13 class
