// The "Area2" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area2 extends Frame
{
    public Area2 ()
    {
    //Declares colour variables.
	Color grassGround = new Color (126, 213, 155);
	Color buildingGround = new Color (106, 202, 157);
	Color tree1 = new Color (42, 111, 55);
	Color tree2 = new Color (65, 169, 76);
	Color roof1 = new Color (1, 114, 149);
	Color roof2 = new Color (0, 153, 203);
	Color door = new Color (214, 74, 74);
	Color sign = new Color (212, 154, 44);
	Color shrub = new Color (195, 233, 94);

	//Draws the background.
	AndrewEdwardWaynePocketmans.c.setColor (buildingGround);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);
	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the house
	AndrewEdwardWaynePocketmans.c.setColor (roof1);
	AndrewEdwardWaynePocketmans.c.fillRect (150, 140, 250, 360);
	AndrewEdwardWaynePocketmans.c.setColor (roof2);
	AndrewEdwardWaynePocketmans.c.fillRect (180, 170, 190, 300);

	//Draws the path
	AndrewEdwardWaynePocketmans.c.setColor (grassGround);
	AndrewEdwardWaynePocketmans.c.fillRect (400, 250, 580, 140);
	
	//Draws the door
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (400, 280, 40, 80);

	//Draws the sign
	AndrewEdwardWaynePocketmans.c.setColor (sign);
	AndrewEdwardWaynePocketmans.c.fillRect (700, 170, 70, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (727, 220, 16, 30);

	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.drawLine (710, 180, 760, 180);
	AndrewEdwardWaynePocketmans.c.drawLine (710, 195, 760, 195);
	AndrewEdwardWaynePocketmans.c.drawLine (710, 210, 760, 210);

	//Draws multiple trees
	AndrewEdwardWaynePocketmans.c.setColor (tree1);
	AndrewEdwardWaynePocketmans.c.fillRect (50, 70, 80, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (40, 160, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (40, 270, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (40, 380, 100, 100);
	AndrewEdwardWaynePocketmans.c.fillRect (50, 490, 80, 80);

	AndrewEdwardWaynePocketmans.c.setColor (tree2);
	AndrewEdwardWaynePocketmans.c.fillRect (65, 85, 50, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (60, 180, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (60, 290, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (60, 400, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillRect (65, 505, 50, 50);

	//Draws two rows of shrubs containing flowers of different colours.
	AndrewEdwardWaynePocketmans.c.setColor (shrub);
	AndrewEdwardWaynePocketmans.c.fillRect (160, 75, 800, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (160, 515, 800, 50);

	AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	AndrewEdwardWaynePocketmans.c.fillRect (350, 85, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (590, 85, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (910, 85, 30, 30);

	AndrewEdwardWaynePocketmans.c.fillRect (830, 525, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 525, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (510, 525, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (670, 525, 30, 30);

	AndrewEdwardWaynePocketmans.c.setColor (Color.blue);
	AndrewEdwardWaynePocketmans.c.fillRect (270, 85, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (510, 85, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (670, 85, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (830, 85, 30, 30);

	AndrewEdwardWaynePocketmans.c.fillRect (190, 525, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (430, 525, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (750, 525, 30, 30);

	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRect (190, 85, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (430, 85, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (750, 85, 30, 30);

	AndrewEdwardWaynePocketmans.c.fillRect (350, 525, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (590, 525, 30, 30);
	AndrewEdwardWaynePocketmans.c.fillRect (910, 525, 30, 30);

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans. c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Road to Spruce's Lab", 30, 35);
    } // main method
} // Area2 class
