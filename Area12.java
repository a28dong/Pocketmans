// The "Area12" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area12 extends Frame
{
    public Area12 ()
    {
	//Declares colour variables.
	Color path = new Color (235, 213, 137);
	Color grass = new Color (117, 207, 172);
	Color roof7 = new Color (68, 142, 69);
	Color roof8 = new Color (94, 45, 168);
	Color roof9 = new Color (216, 221, 46);
	Color roof10 = new Color (89, 54, 8);
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
	AndrewEdwardWaynePocketmans.c.fillRect (430, 250, 550, 140);
	AndrewEdwardWaynePocketmans.c.fillRect (430, 60, 140, 190);

	//Top Left House
	AndrewEdwardWaynePocketmans.c.setColor (roof7);
	AndrewEdwardWaynePocketmans.c.fillRect (125, 70, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (130, 170, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (206, 180, 40, 50);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (140, 180, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 180, 40, 40);

	//Bottom Left House
	AndrewEdwardWaynePocketmans.c.setColor (roof8);
	AndrewEdwardWaynePocketmans.c.fillRect (125, 410, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (130, 510, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (206, 520, 40, 50);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (140, 520, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 520, 40, 40);

	//Top Right House
	AndrewEdwardWaynePocketmans.c.setColor (roof9);
	AndrewEdwardWaynePocketmans.c.fillRect (680, 70, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (685, 170, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (761, 180, 40, 50);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (695, 180, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (825, 180, 40, 40);

	//Bottom Right House
	AndrewEdwardWaynePocketmans.c.setColor (roof10);
	AndrewEdwardWaynePocketmans.c.fillRect (680, 410, 200, 100);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (685, 510, 190, 60);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (761, 520, 40, 50);
	AndrewEdwardWaynePocketmans.c.setColor (window);
	AndrewEdwardWaynePocketmans.c.fillRect (695, 520, 40, 40);
	AndrewEdwardWaynePocketmans.c.fillRect (825, 520, 40, 40);

	//Draws the GYM
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (402, 420, 190, 150);
	AndrewEdwardWaynePocketmans.c.setColor (wall);
	AndrewEdwardWaynePocketmans.c.fillRect (412, 430, 170, 130);
	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.cutscene);
	AndrewEdwardWaynePocketmans.c.drawString ("G Y M", 433, 530);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (464, 420, 72, 25);

	//Draws a log blocking the path is the gym is not defeated
	if (AndrewEdwardWaynePocketmans.r12gym == 0)
	{
	    AndrewEdwardWaynePocketmans.c.setColor (roof10);
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (922, 50, 60, 540, 20, 50);
	    if (AndrewEdwardWaynePocketmans.x > 862)
	    {
		AndrewEdwardWaynePocketmans.x = 862;
		AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
		AndrewEdwardWaynePocketmans.c.fillRoundRect (300, 150, 400, 300, 100, 150);
		AndrewEdwardWaynePocketmans.c.setColor (Color.white);
		AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
		AndrewEdwardWaynePocketmans.c.drawString ("Oh no, looks like theres", 400, 230);
		AndrewEdwardWaynePocketmans.c.drawString ("a log blocking the way!", 400, 290);
		AndrewEdwardWaynePocketmans.c.drawString ("Maybe it'll disappear if", 392, 350);
		AndrewEdwardWaynePocketmans.c.drawString ("you beat that gym.", 400, 410);
		AndrewEdwardWaynePocketmans.c.getChar ();
	    }
	}

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Obese City", 30, 35);
    } // main method
} // Area12 class


