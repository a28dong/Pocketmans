// The "Area5" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area5 extends Frame
{
    public Area5 ()
    {
	//Declares colour variables.
	Color grassGround2 = new Color (77, 114, 60);
	Color swampGround = new Color (43, 83, 56);
	Color tree3 = new Color (29, 41, 21);
	Color tree4 = new Color (61, 72, 54);
	Color sign = new Color (212, 154, 44);
	Color shrub = new Color (195, 233, 94);
	Color water = new Color (2, 103, 116);
	Color castle1 = new Color (244, 233, 169);
	Color castle2 = new Color (212, 203, 155);
	Color door = new Color (214, 74, 74);

	//Draws the background.
	AndrewEdwardWaynePocketmans.c.setColor (swampGround);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the path
	AndrewEdwardWaynePocketmans.c.setColor (grassGround2);
	AndrewEdwardWaynePocketmans.c.fillRect (430, 240, 140, 340);

	//Draws the castle and the entrance
	AndrewEdwardWaynePocketmans.c.setColor (castle1);
	AndrewEdwardWaynePocketmans.c.fillRect (200, 60, 600, 180);
	AndrewEdwardWaynePocketmans.c.setColor (castle2);
	AndrewEdwardWaynePocketmans.c.fillRect (230, 60, 540, 150);
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (465, 240, 70, 30);

	//Draws the sign
	AndrewEdwardWaynePocketmans.c.setColor (sign);
	AndrewEdwardWaynePocketmans.c.fillRect (590, 370, 70, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (617, 420, 16, 30);
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.drawLine (600, 380, 650, 380);
	AndrewEdwardWaynePocketmans.c.drawLine (600, 395, 650, 395);
	AndrewEdwardWaynePocketmans.c.drawLine (600, 410, 650, 410);

	//Draws a tree
	AndrewEdwardWaynePocketmans.c.setColor (tree3);
	AndrewEdwardWaynePocketmans.c.fillRect (90, 420, 140, 140);
	AndrewEdwardWaynePocketmans.c.setColor (tree4);
	AndrewEdwardWaynePocketmans.c.fillRect (120, 450, 80, 80);

	//Draws the body of the frogs
	AndrewEdwardWaynePocketmans.c.setColor (grassGround2);
	AndrewEdwardWaynePocketmans.c.fillRect (80, 150, 30, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (70, 150, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (110, 150, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (70, 140, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (110, 140, 10, 10);

	AndrewEdwardWaynePocketmans.c.fillRect (70, 190, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (110, 190, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (70, 200, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (110, 200, 10, 10);

	AndrewEdwardWaynePocketmans.c.fillRect (280, 350, 30, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 350, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (310, 350, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 340, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (310, 340, 10, 10);

	AndrewEdwardWaynePocketmans.c.fillRect (270, 390, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (310, 390, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 400, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (310, 400, 10, 10);

	AndrewEdwardWaynePocketmans.c.fillRect (830, 320, 30, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (820, 320, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (860, 320, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (820, 310, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (860, 310, 10, 10);

	AndrewEdwardWaynePocketmans.c.fillRect (820, 360, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (860, 360, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (820, 370, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (860, 370, 10, 10);


	AndrewEdwardWaynePocketmans.c.fillRect (470, 80, 60, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (450, 80, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (530, 80, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (450, 70, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (530, 70, 20, 20);

	AndrewEdwardWaynePocketmans.c.fillRect (450, 160, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (530, 160, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (450, 170, 20, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (530, 170, 20, 20);

	//Draws the eyes of the frogs
	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.fillRect (85, 180, 5, 5);
	AndrewEdwardWaynePocketmans.c.fillRect (100, 180, 5, 5);

	AndrewEdwardWaynePocketmans.c.fillRect (285, 380, 5, 5);
	AndrewEdwardWaynePocketmans.c.fillRect (300, 380, 5, 5);

	AndrewEdwardWaynePocketmans.c.fillRect (835, 350, 5, 5);
	AndrewEdwardWaynePocketmans.c.fillRect (850, 350, 5, 5);

	AndrewEdwardWaynePocketmans.c.fillRect (480, 160, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (510, 160, 10, 10);

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Toad Kingdom", 30, 35);
    } // main method
} // Area5 class
