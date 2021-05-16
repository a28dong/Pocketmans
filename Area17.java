// The "Area17" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class Area17 extends Frame
{
    public Area17 ()
    {
	//Declares colour variables.
	Color FinalRoom = new Color (189, 145, 98);
	Color BallTop = new Color (149, 155, 152);
	Color BallBottom = new Color (152, 117, 72);
	Color door = new Color (214, 74, 74);

	//Draws the background
	AndrewEdwardWaynePocketmans.c.setColor (FinalRoom);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRect (340, 150, 350, 350);

	AndrewEdwardWaynePocketmans.c.setColor (FinalRoom);
	AndrewEdwardWaynePocketmans.c.fillRect (353, 163, 325, 325);

	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRect (353, 320, 325, 13);

	//Draws Pokeball in the center of room
	AndrewEdwardWaynePocketmans.c.setColor (BallTop);
	AndrewEdwardWaynePocketmans.c.fillArc (403, 208, 225, 225, 0, 180);
	AndrewEdwardWaynePocketmans.c.setColor (BallBottom);
	AndrewEdwardWaynePocketmans.c.fillArc (403, 221, 225, 225, 180, 180);

	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillOval (480, 291, 70, 70);

	AndrewEdwardWaynePocketmans.c.setColor (FinalRoom);
	AndrewEdwardWaynePocketmans.c.fillOval (490, 301, 50, 50);

	//Draws the doors
	AndrewEdwardWaynePocketmans.c.setColor (door);
	AndrewEdwardWaynePocketmans.c.fillRect (20, 277, 30, 80);
	AndrewEdwardWaynePocketmans.c.fillRect (960, 277, 30, 80);

	//Draws Electrump if still intact
	if (AndrewEdwardWaynePocketmans.r17encounter == 0)
	{
	    //Draws Electrump (120x120)
	    AndrewEdwardWaynePocketmans.c.setColor (Color.red);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.voltorbx - 260, AndrewEdwardWaynePocketmans.voltorby, 120, 120, 0, -180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.voltorbx - 260, AndrewEdwardWaynePocketmans.voltorby, 120, 120, 0, 180);
	    AndrewEdwardWaynePocketmans.c.fillArc (AndrewEdwardWaynePocketmans.voltorbx + 35 - 260, AndrewEdwardWaynePocketmans.voltorby + 50, 50, 50, 0, -180);
	    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	    AndrewEdwardWaynePocketmans.c.drawOval (AndrewEdwardWaynePocketmans.voltorbx - 260, AndrewEdwardWaynePocketmans.voltorby, 119, 119);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.voltorbx + 30 - 260, AndrewEdwardWaynePocketmans.voltorby + 27, 15, 25);
	    AndrewEdwardWaynePocketmans.c.fillOval (AndrewEdwardWaynePocketmans.voltorbx + 70 - 260, AndrewEdwardWaynePocketmans.voltorby + 27, 15, 25);
	    AndrewEdwardWaynePocketmans.c.drawArc (AndrewEdwardWaynePocketmans.voltorbx + 35 - 260, AndrewEdwardWaynePocketmans.voltorby + 50, 49, 49, 0, -180);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.voltorbx + 35 - 260, AndrewEdwardWaynePocketmans.voltorby + 75, AndrewEdwardWaynePocketmans.voltorbx + 85 - 260, AndrewEdwardWaynePocketmans.voltorby + 75);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.voltorbx + 30 - 260, AndrewEdwardWaynePocketmans.voltorby + 15, AndrewEdwardWaynePocketmans.voltorbx + 45 - 260, AndrewEdwardWaynePocketmans.voltorby + 25);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.voltorbx + 70 - 260, AndrewEdwardWaynePocketmans.voltorby + 25, AndrewEdwardWaynePocketmans.voltorbx + 85 - 260, AndrewEdwardWaynePocketmans.voltorby + 15);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.voltorbx + 51 - 260, AndrewEdwardWaynePocketmans.voltorby + 75, AndrewEdwardWaynePocketmans.voltorbx + 51 - 260, AndrewEdwardWaynePocketmans.voltorby + 97);
	    AndrewEdwardWaynePocketmans.c.drawLine (AndrewEdwardWaynePocketmans.voltorbx + 69 - 260, AndrewEdwardWaynePocketmans.voltorby + 75, AndrewEdwardWaynePocketmans.voltorbx + 69 - 260, AndrewEdwardWaynePocketmans.voltorby + 97);
	}

	//Draws the HUD and map location
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 300, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("FINAL BOSS BABY", 30, 35);
     
    } // main method
} // Area17 class
