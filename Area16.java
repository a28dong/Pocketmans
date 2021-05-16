// The "Area16" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area16 extends Frame
{
    public Area16 ()
    {
	//Declares colour variables.
	Color background = new Color (192, 186, 153);
	Color pathway = new Color (214, 206, 169);
	Color plantbase = new Color (216, 99, 73);
	Color dirt = new Color (158, 77, 60);
	Color plant = new Color (99, 139, 25);

	//Draws the background
	AndrewEdwardWaynePocketmans.c.setColor (background);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	//Draws the path
	AndrewEdwardWaynePocketmans.c.setColor (pathway);
	AndrewEdwardWaynePocketmans.c.fillRect (30, 240, 950, 150);

	//Bottom Left Plant
	AndrewEdwardWaynePocketmans.c.setColor (plantbase);
	AndrewEdwardWaynePocketmans.c.fillOval (55, 530, 35, 35);
	AndrewEdwardWaynePocketmans.c.setColor (dirt);
	AndrewEdwardWaynePocketmans.c.fillOval (60, 535, 25, 25);
	AndrewEdwardWaynePocketmans.c.fillRect (68, 515, 10, 40);
	AndrewEdwardWaynePocketmans.c.setColor (plant);
	AndrewEdwardWaynePocketmans.c.fillOval (53, 468, 40, 60);

	//Top Left Plant
	AndrewEdwardWaynePocketmans.c.setColor (plantbase);
	AndrewEdwardWaynePocketmans.c.fillOval (55, 130, 35, 35);
	AndrewEdwardWaynePocketmans.c.setColor (dirt);
	AndrewEdwardWaynePocketmans.c.fillOval (60, 135, 25, 25);
	AndrewEdwardWaynePocketmans.c.fillRect (68, 110, 10, 40);
	AndrewEdwardWaynePocketmans.c.setColor (plant);
	AndrewEdwardWaynePocketmans.c.fillOval (53, 65, 40, 60);

	//Bottom Right Plant
	AndrewEdwardWaynePocketmans.c.setColor (plantbase);
	AndrewEdwardWaynePocketmans.c.fillOval (920, 530, 35, 35);
	AndrewEdwardWaynePocketmans.c.setColor (dirt);
	AndrewEdwardWaynePocketmans.c.fillOval (925, 535, 25, 25);
	AndrewEdwardWaynePocketmans.c.fillRect (933, 515, 10, 40);
	AndrewEdwardWaynePocketmans.c.setColor (plant);
	AndrewEdwardWaynePocketmans.c.fillOval (918, 468, 40, 60);

	//Top Right Plant
	AndrewEdwardWaynePocketmans.c.setColor (plantbase);
	AndrewEdwardWaynePocketmans.c.fillOval (920, 130, 35, 35);
	AndrewEdwardWaynePocketmans.c.setColor (dirt);
	AndrewEdwardWaynePocketmans.c.fillOval (925, 135, 25, 25);
	AndrewEdwardWaynePocketmans.c.fillRect (933, 110, 10, 40);
	AndrewEdwardWaynePocketmans.c.setColor (plant);
	AndrewEdwardWaynePocketmans.c.fillOval (918, 65, 40, 60);

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Hallway to ...", 30, 35);
    } // main method
} // Area16 class
