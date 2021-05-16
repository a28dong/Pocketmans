// The "BattleMap" class.
import java.awt.*;
import hsa.Console;

//Extended class of the main program.
public class BattleMap extends Frame
{
    public BattleMap ()
    {
    //Declares colour and font variables.
	Font battleText = new Font ("Agency FB", Font.BOLD, 30);
	Font battleText2 = new Font ("Agency FB", Font.BOLD, 20);
	Color battleBackground = new Color (240, 243, 244);
	Color outerGround = new Color (204, 204, 204);
	Color fightGround = new Color (247, 246, 248);
	Color outerBar = new Color (154, 156, 150);
	Color innerBar = new Color (248, 249, 220);
	Color hpBar = new Color (112, 210, 160);
	Color lostHPBar = new Color (83, 87, 90);
	Color hpText = new Color (231, 180, 97);

	//Draws the background
	AndrewEdwardWaynePocketmans.c.setColor (battleBackground);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 560);

	//Draws the outline of the map.
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 40, 990, 20);
	AndrewEdwardWaynePocketmans.c.fillRect (980, 40, 20, 560);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 580, 990, 20);

	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRect (0, 0, 10, 600);

	//Enemy team visuals
	//Fighting ground
	AndrewEdwardWaynePocketmans.c.setColor (outerGround);
	AndrewEdwardWaynePocketmans.c.fillOval (120, 420, 300, 150);
	AndrewEdwardWaynePocketmans.c.setColor (fightGround);
	AndrewEdwardWaynePocketmans.c.fillOval (135, 435, 270, 120);

	//HP and info bar
	AndrewEdwardWaynePocketmans.c.setColor (outerBar);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (100, 100, 400, 100, 30, 30);
	AndrewEdwardWaynePocketmans.c.setColor (innerBar);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (110, 110, 380, 80, 30, 30);
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.setFont (battleText);
	AndrewEdwardWaynePocketmans.c.drawString ("" + AndrewEdwardWaynePocketmans.enemyPoke, 135, 145);
	AndrewEdwardWaynePocketmans.c.drawString ("LVL " + AndrewEdwardWaynePocketmans.enemyLevel, 430, 145);

	AndrewEdwardWaynePocketmans.c.setColor (lostHPBar);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (230, 160, 240, 22, 22, 22);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (232, 162, 236, 18, 18, 18);
	AndrewEdwardWaynePocketmans.c.setColor (lostHPBar);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (234, 164, 232, 14, 14, 14);
	AndrewEdwardWaynePocketmans.c.setColor (hpBar);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (234, 164, (int) (232 * (AndrewEdwardWaynePocketmans.enemyhp / AndrewEdwardWaynePocketmans.enemymaxhp)), 14, 14, 14);


	//Ally team visuals
	//Fighting ground
	AndrewEdwardWaynePocketmans.c.setColor (outerGround);
	AndrewEdwardWaynePocketmans.c.fillOval (620, 140, 300, 150);
	AndrewEdwardWaynePocketmans.c.setColor (fightGround);
	AndrewEdwardWaynePocketmans.c.fillOval (635, 155, 270, 120);

	//HP and info bar
	AndrewEdwardWaynePocketmans.c.setColor (outerBar);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (500, 350, 400, 140, 30, 30);
	AndrewEdwardWaynePocketmans.c.setColor (innerBar);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (510, 360, 380, 120, 30, 30);
	AndrewEdwardWaynePocketmans.c.setColor (Color.black);
	AndrewEdwardWaynePocketmans.c.setFont (battleText);
	AndrewEdwardWaynePocketmans.c.drawString ("" + AndrewEdwardWaynePocketmans.teamPoke, 535, 395);
	AndrewEdwardWaynePocketmans.c.drawString ("LVL " + AndrewEdwardWaynePocketmans.teamLevel, 830, 395);
	if (AndrewEdwardWaynePocketmans.pokeTeam == 1)
	    AndrewEdwardWaynePocketmans.c.drawString ("" + (int) (AndrewEdwardWaynePocketmans.hp) + "/" + (int) (AndrewEdwardWaynePocketmans.maxhp), 780, 465);
	if (AndrewEdwardWaynePocketmans.pokeTeam == 2)
	    AndrewEdwardWaynePocketmans.c.drawString ("" + (int) (AndrewEdwardWaynePocketmans.sodahp) + "/" + (int) (AndrewEdwardWaynePocketmans.sodamaxhp), 780, 465);
	if (AndrewEdwardWaynePocketmans.pokeTeam == 3)
	    AndrewEdwardWaynePocketmans.c.drawString ("" + (int) (AndrewEdwardWaynePocketmans.dweebhp) + "/" + (int) (AndrewEdwardWaynePocketmans.dweebmaxhp), 780, 465);

	AndrewEdwardWaynePocketmans.c.setColor (lostHPBar);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (600, 410, 270, 22, 22, 22);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (632, 412, 236, 18, 18, 18);
	AndrewEdwardWaynePocketmans.c.setColor (lostHPBar);
	AndrewEdwardWaynePocketmans.c.fillRoundRect (634, 414, 232, 14, 14, 14);
	AndrewEdwardWaynePocketmans.c.setColor (hpBar);
	if (AndrewEdwardWaynePocketmans.pokeTeam == 1)
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (634, 414, (int) (232 * (AndrewEdwardWaynePocketmans.hp / AndrewEdwardWaynePocketmans.maxhp)), 14, 14, 14);
	if (AndrewEdwardWaynePocketmans.pokeTeam == 2)
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (634, 414, (int) (232 * (AndrewEdwardWaynePocketmans.sodahp / AndrewEdwardWaynePocketmans.sodamaxhp)), 14, 14, 14);
	if (AndrewEdwardWaynePocketmans.pokeTeam == 3)
	    AndrewEdwardWaynePocketmans.c.fillRoundRect (634, 414, (int) (232 * (AndrewEdwardWaynePocketmans.dweebhp / AndrewEdwardWaynePocketmans.dweebmaxhp)), 14, 14, 14);
	AndrewEdwardWaynePocketmans.c.setColor (hpText);
	AndrewEdwardWaynePocketmans.c.setFont (battleText2);
	AndrewEdwardWaynePocketmans.c.drawString ("HP", 610, 428);

	//Draws HUD      
	AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
	AndrewEdwardWaynePocketmans.c.fillRect (10, 0, 990, 40);
	AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
	AndrewEdwardWaynePocketmans.c.setColor (Color.white);
	AndrewEdwardWaynePocketmans.c.drawString ("Pocketmans count: " + AndrewEdwardWaynePocketmans.pokemonCount, 640, 35);
	AndrewEdwardWaynePocketmans.c.drawString ("Pocketballs count: " + AndrewEdwardWaynePocketmans.pokeballs, 400, 35);
	AndrewEdwardWaynePocketmans.c.drawString ("The Battle Arena", 30, 35);
	AndrewEdwardWaynePocketmans.c.fillRect (0, 0, 10, 600);
    } // main method
} // BattleMap class
