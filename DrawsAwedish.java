// The "DrawsAwedish" class.
import java.awt.*;
import hsa.Console;

public class DrawsAwedish extends Frame
{
    public DrawsAwedish ()
    {
	//Draws Awedish (60x75)
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.leafGreen);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.x, AndrewEdwardWaynePocketmans.y, 19, 30);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.x + 19, AndrewEdwardWaynePocketmans.y - 10, 20, 40);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.x + 39, AndrewEdwardWaynePocketmans.y, 19, 30);
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.aweBlue);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.x - 2, AndrewEdwardWaynePocketmans.y + 10, 60, 50);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.x - 2, AndrewEdwardWaynePocketmans.y + 50, 20, 15);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.x + 38, AndrewEdwardWaynePocketmans.y + 50, 20, 15);
	AndrewEdwardWaynePocketmans.c.setColor (Color.pink);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.x + 13, AndrewEdwardWaynePocketmans.y + 26, 11, 8);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.x + 33, AndrewEdwardWaynePocketmans.y + 26, 11, 8);
	AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.x + 19, AndrewEdwardWaynePocketmans.y + 29, 18, 24, 0, -180);
    }
}
