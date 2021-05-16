// "Deaf" class
import java.awt.*;
import hsa.Console;

public class Death extends Frame
{
    public Death ()
    {
	new BattleMap ();
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.drawString ("Awedish fainted!", 30, 525);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
	AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
	AndrewEdwardWaynePocketmans.c.getChar ();

	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 1000, 600);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.drawString ("You blacked out.....GAME OVER", 100, 100);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
	while (true)
	{
	}
    }
}
