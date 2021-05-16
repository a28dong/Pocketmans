// The "DrawsDweeb" class.
import java.awt.*;
import hsa.Console;

public class DrawsDweeb extends Frame
{
    public DrawsDweeb ()
    {
	//Draws Dweebble
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.dweebGray);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.dweebblex, AndrewEdwardWaynePocketmans.dweebbley, 60, 60);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.dweebblex + 25, AndrewEdwardWaynePocketmans.dweebbley - 15, 45, 45);
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.orange);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.dweebblex + 10, AndrewEdwardWaynePocketmans.dweebbley + 15, 12, 22);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.dweebblex + 25, AndrewEdwardWaynePocketmans.dweebbley + 15, 12, 22);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.dweebblex + 3, AndrewEdwardWaynePocketmans.dweebbley + 30, 40, 30);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.dweebblex - 5, AndrewEdwardWaynePocketmans.dweebbley + 40, 20, 35);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.dweebblex + 30, AndrewEdwardWaynePocketmans.dweebbley + 40, 20, 35);
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.dweebblex + 25, AndrewEdwardWaynePocketmans.dweebbley + 15, 12, 12);
	AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.dweebblex + 10, AndrewEdwardWaynePocketmans.dweebbley + 15, 12, 12);
	AndrewEdwardWaynePocketmans.c.drawOval (AndrewEdwardWaynePocketmans.dweebblex + 17, AndrewEdwardWaynePocketmans.dweebbley + 41, 7, 9);
    }
}
