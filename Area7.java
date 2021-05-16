// The "Area7" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area7 extends Frame
{
    public Area7 ()
    {
	//Declares colour and font variables.
	Font inoobe = new Font ("Agency FB", Font.BOLD, 60);
	Color sign = new Color (212, 154, 44);
	Color path = new Color (120, 120, 120);
	Color background = new Color (181, 181, 181);
	Color tree = new Color (78, 139, 113);
	Color pub = new Color (64, 145, 200);

	//Draws the background.
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
	AndrewEdwardWaynePocketmans.c.fillRect (225, 300, 150, 280);
	AndrewEdwardWaynePocketmans.c.fillRect (225, 300, 755, 150);
	
	//Draws the sign
	AndrewEdwardWaynePocketmans.c.setColor (sign);
	AndrewEdwardWaynePocketmans.c.fillRect (690, 370, 70, 50);
	AndrewEdwardWaynePocketmans.c.fillRect (717, 420, 16, 30);
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.drawLine (700, 380, 750, 380);
	AndrewEdwardWaynePocketmans.c.drawLine (700, 395, 750, 395);
	AndrewEdwardWaynePocketmans.c.drawLine (700, 410, 750, 410);

	//Draws the shrubs/mini-trees
	AndrewEdwardWaynePocketmans.c.setColor (tree);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 60, 30, 520);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 60, 950, 30);

	//Draws a building (INOOBE STUDIOS)
	AndrewEdwardWaynePocketmans.c.setColor (pub);
	AndrewEdwardWaynePocketmans.c.fillRect (180, 100, 400, 180);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRect (335, 240, 90, 40);
	AndrewEdwardWaynePocketmans.c.setColor (Color.yellow);
	AndrewEdwardWaynePocketmans.c.setFont (inoobe);
	AndrewEdwardWaynePocketmans.c.drawString ("INOOBE STUDIOS", 208, 180);

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Kerning City", 30, 35);

    } // main method
} // Area7 class
