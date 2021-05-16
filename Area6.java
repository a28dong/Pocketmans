// The "Area6" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area6 extends Frame
{
    public Area6 ()
    {
	//Declares colour variables.
	Color grassGround2 = new Color (77, 114, 60);
	Color sign = new Color (212, 154, 44);
	Color castle1 = new Color (244, 233, 169);
	Color castle2 = new Color (212, 203, 155);
	Color door = new Color (214, 74, 74);
	Color floor = new Color (195, 217, 255);
	Color toadc = new Color (254, 191, 120);
	Color darkBlue = new Color (15, 6, 196);

	//Draws the background.
	AndrewEdwardWaynePocketmans.c.setColor (castle1);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);
	AndrewEdwardWaynePocketmans.c.setColor (castle2);
	AndrewEdwardWaynePocketmans.c.fillRect (50, 80, 910, 480);
	AndrewEdwardWaynePocketmans.c.setColor (floor);
	AndrewEdwardWaynePocketmans.c.fillRect (100, 130, 810, 380);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the carpet and the door paths
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (430, 60, 140, 520);
	AndrewEdwardWaynePocketmans.c.fillOval (350, 160, 300, 300);

	//Draws the body of the frogs
	AndrewEdwardWaynePocketmans.c.setColor (grassGround2);
	AndrewEdwardWaynePocketmans.c.fillRect (80, 450, 30, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (70, 450, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (110, 450, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (70, 440, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (110, 440, 10, 10);

	AndrewEdwardWaynePocketmans.c.fillRect (70, 490, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (110, 490, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (70, 500, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (110, 500, 10, 10);

	AndrewEdwardWaynePocketmans.c.fillRect (280, 250, 30, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 250, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (310, 250, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 240, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (310, 240, 10, 10);

	AndrewEdwardWaynePocketmans.c.fillRect (270, 290, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (310, 290, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 300, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (310, 300, 10, 10);

	AndrewEdwardWaynePocketmans.c.fillRect (830, 120, 30, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (820, 120, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (860, 120, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (820, 110, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (860, 110, 10, 10);

	AndrewEdwardWaynePocketmans.c.fillRect (820, 160, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (860, 160, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (820, 170, 10, 10);
	AndrewEdwardWaynePocketmans.c.fillRect (860, 170, 10, 10);

	//Draws the eyes of the frogs
	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.fillRect (85, 480, 5, 5);
	AndrewEdwardWaynePocketmans.c.fillRect (100, 480, 5, 5);

	AndrewEdwardWaynePocketmans.c.fillRect (285, 280, 5, 5);
	AndrewEdwardWaynePocketmans.c.fillRect (300, 280, 5, 5);

	AndrewEdwardWaynePocketmans.c.fillRect (835, 150, 5, 5);
	AndrewEdwardWaynePocketmans.c.fillRect (850, 150, 5, 5);

	//Draws fire and toad if still intact
	if (AndrewEdwardWaynePocketmans.r6encounter == 0)
	{
	    //Draws 4 fires
	    AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	    AndrewEdwardWaynePocketmans.c.fillRect (235, 190, 5, 30);
	    AndrewEdwardWaynePocketmans.c.fillRect (240, 180, 10, 50);
	    AndrewEdwardWaynePocketmans.c.fillRect (250, 165, 5, 65);
	    AndrewEdwardWaynePocketmans.c.fillRect (255, 145, 8, 85);
	    AndrewEdwardWaynePocketmans.c.fillRect (263, 175, 10, 50);
	    AndrewEdwardWaynePocketmans.c.fillRect (273, 190, 5, 30);

	    AndrewEdwardWaynePocketmans.c.fillRect (715, 190, 5, 30);
	    AndrewEdwardWaynePocketmans.c.fillRect (720, 180, 10, 50);
	    AndrewEdwardWaynePocketmans.c.fillRect (730, 165, 5, 65);
	    AndrewEdwardWaynePocketmans.c.fillRect (735, 145, 8, 85);
	    AndrewEdwardWaynePocketmans.c.fillRect (743, 175, 10, 50);
	    AndrewEdwardWaynePocketmans.c.fillRect (753, 190, 5, 30);

	    AndrewEdwardWaynePocketmans.c.fillRect (235, 390, 5, 30);
	    AndrewEdwardWaynePocketmans.c.fillRect (240, 380, 10, 50);
	    AndrewEdwardWaynePocketmans.c.fillRect (250, 365, 5, 65);
	    AndrewEdwardWaynePocketmans.c.fillRect (255, 345, 8, 85);
	    AndrewEdwardWaynePocketmans.c.fillRect (263, 375, 10, 50);
	    AndrewEdwardWaynePocketmans.c.fillRect (273, 390, 5, 30);

	    AndrewEdwardWaynePocketmans.c.fillRect (715, 390, 5, 30);
	    AndrewEdwardWaynePocketmans.c.fillRect (720, 380, 10, 50);
	    AndrewEdwardWaynePocketmans.c.fillRect (730, 365, 5, 65);
	    AndrewEdwardWaynePocketmans.c.fillRect (735, 345, 8, 85);
	    AndrewEdwardWaynePocketmans.c.fillRect (743, 375, 10, 50);
	    AndrewEdwardWaynePocketmans.c.fillRect (753, 390, 5, 30);

	    AndrewEdwardWaynePocketmans.c.setColor (Color.yellow);
	    AndrewEdwardWaynePocketmans.c.fillRect (245, 200, 8, 30);
	    AndrewEdwardWaynePocketmans.c.fillRect (253, 190, 5, 40);
	    AndrewEdwardWaynePocketmans.c.fillRect (258, 205, 8, 15);

	    AndrewEdwardWaynePocketmans.c.fillRect (725, 200, 8, 30);
	    AndrewEdwardWaynePocketmans.c.fillRect (733, 190, 5, 40);
	    AndrewEdwardWaynePocketmans.c.fillRect (738, 205, 8, 15);

	    AndrewEdwardWaynePocketmans.c.fillRect (245, 400, 8, 30);
	    AndrewEdwardWaynePocketmans.c.fillRect (253, 390, 5, 40);
	    AndrewEdwardWaynePocketmans.c.fillRect (258, 405, 8, 15);

	    AndrewEdwardWaynePocketmans.c.fillRect (725, 400, 8, 30);
	    AndrewEdwardWaynePocketmans.c.fillRect (733, 390, 5, 40);
	    AndrewEdwardWaynePocketmans.c.fillRect (738, 405, 8, 15);

	    
	    //Draws Toad (60x110)
	    AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.toadx + 4, AndrewEdwardWaynePocketmans.toady + 90, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.toadx + 36, AndrewEdwardWaynePocketmans.toady + 90, 20, 20);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (AndrewEdwardWaynePocketmans.toadx, AndrewEdwardWaynePocketmans.toady, 60, 60, 30, 30);
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (AndrewEdwardWaynePocketmans.toadx + 12, AndrewEdwardWaynePocketmans.toady + 80, 38, 20, 20, 20);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.toadx - 15, AndrewEdwardWaynePocketmans.toady + 10, 30, 30, 90, -180);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.toadx + 45, AndrewEdwardWaynePocketmans.toady + 10, 30, 30, 90, 180);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.toadx + 15, AndrewEdwardWaynePocketmans.toady - 15, 30, 30, 0, -180);
	    AndrewEdwardWaynePocketmans.c.setColor (toadc);
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (AndrewEdwardWaynePocketmans.toadx + 10, AndrewEdwardWaynePocketmans.toady + 30, 40, 40, 20, 20);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.toadx + 22, AndrewEdwardWaynePocketmans.toady + 70, 16, 20);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.toadx + 2, AndrewEdwardWaynePocketmans.toady + 72, 16, 16);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.toadx + 44, AndrewEdwardWaynePocketmans.toady + 72, 16, 16);
	    AndrewEdwardWaynePocketmans.c.setColor (darkBlue);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.toadx + 12, AndrewEdwardWaynePocketmans.toady + 70, 12, 20);
	    AndrewEdwardWaynePocketmans.c.fillRect (AndrewEdwardWaynePocketmans.toadx + 38, AndrewEdwardWaynePocketmans.toady + 70, 12, 20);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.toadx + 15, AndrewEdwardWaynePocketmans.toady + 40, 10, 13);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.toadx + 35, AndrewEdwardWaynePocketmans.toady + 40, 10, 13);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.toadx + 21, AndrewEdwardWaynePocketmans.toady + 45, 20, 20, 0, -180);
	}

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Inside the Castle", 30, 35);
    } // main method
} // Area6 class
