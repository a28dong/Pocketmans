// The "AndrewEdwardWaynePocketmans" class.
// December 7th, 2017
// Andrew Dong, Edward Yang, Wayne Yu
// Mr Kordbacheh    ICS3U     L'Amoreaux C.I.

//The program is a game in which the player can engage in battles and follow through an interesting storyline.
//The player can catch other "pocketmans" while becoming stronger with each consecutive battle.
//The battle is done via a turn-based system where the player and the ai takes turns for attacks.
//The program uses a combination of both HSA and GUI. HSA is generally used for animation and graphics.
//GUI is used for the battles as the player clicks on buttons to perform attacks.

//Instructions are with the opening background story
//Repeat: wasd for movements w-up s-down a-left d-right 
//'e' is used to interact with things which includes: pocketballs, pocketmans, and signs.


//Imports packages with necessary classes and methods
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.*;
import hsa.Console;

public class AndrewEdwardWaynePocketmans
{
    public static Console c;           // The output console

    ////////////VARIABLES////////////
    //Declares the colors needed for graphics of characters and other aesthetics
    public static Color hudBrown = new Color (139, 69, 19);
    public static Color dweebGray = new Color (142, 131, 129);
    public static Color orange = new Color (232, 149, 83);
    public static Color sodaBrown = new Color (173, 138, 119);
    public static Color leafGreen = new Color (121, 221, 46);
    public static Color aweBlue = new Color (65, 100, 165);
    public static Color sodaSpots = new Color (243, 211, 69);
    public static Color toadc = new Color (254, 191, 120);
    public static Color darkBlue = new Color (15, 6, 196);
    public static Color koffpurple = new Color (146, 110, 143);
    public static Color digBrown = new Color (169, 117, 87);
    public static Color bronzeblue = new Color (73, 179, 200);
    public static Color geobrown = new Color (186, 169, 136);
    public static Color lickpink = new Color (215, 130, 149);
    public static Color lickypink = new Color (234, 160, 157);
    public static Color polyblue = new Color (169, 191, 219);
    public static Color snorbody = new Color (241, 223, 185);

    //Declares the fonts needed for text
    public static Font battle = new Font ("Agency FB", Font.BOLD, 22);
    public static Font dialog = new Font ("Agency FB", Font.BOLD, 30);
    public static Font button = new Font ("Agency FB", Font.BOLD, 40);
    public static Font cutscene = new Font ("Agency FB", Font.BOLD, 69);

    //Game variables
    public static int x = 460, y = 350, area = 1, movement = 0, sprint = 0;
    public static int boygirl = 0, choice = 0, pokemonCount = 1, pokeballs = 1;
    public static int tutorial = 0, fill = 0, cantmove = 0, life = 0;

    //Pokemon location and capture variables
    public static int dweebblex = 500, dweebbley = 290, dweebcap = 0;
    public static int sodawodax = 320, sodawoday = 330, sodacap = 0;
    public static int toadx = 470, toady = 200, toadcap = 0;
    public static int koffingx = 730, koffingy = 124, koffcap = 0;
    public static int wobblex = 640, wobbley = 306, wobblecap = 0;
    public static int diglettx = 720, digletty = 124, digcap = 0;
    public static int bronzox = 710, bronzoy = 124, bronzecap = 0;
    public static int geodudex = 730, geodudey = 124, geodudecap = 0;
    public static int lickyx = 720, lickyy = 124, lickycap = 0;
    public static int polygx = 710, polygy = 124, polygcap = 0;
    public static int snorlaxx = 450, snorlaxy = 460, snorcap = 0;
    public static int nopassx = 900, nopassy = 100;
    public static int voltorbx = 700, voltorby = 120;

    //Area-related variables
    public static int a1ball1 = 1, a1ball2 = 1, a1ball3 = 1, a4ball = 1, a9ball = 1; //Balls
    public static int r3encounter = 0, r6encounter = 0, r8encounter = 0, r9encounter = 0, r10encounter = 0; //Encounters
    public static int r11encounter = 0, r12gym = 0, r13encounter = 0, r17encounter = 0; // Encounters
    public static int a3nopass = 1, a3redraw = 1, pocketCenter = 0; //Misc

    //Fighting varaibles regarding stats and the ally vs enemy information
    public static String enemyPoke = "Sodawoda", teamPoke = "Awedish";
    public static double hp = 2.0, maxhp = 2.0, dweebhp = 4.0, dweebmaxhp = 4.0, sodahp = 3.0, sodamaxhp = 3.0, enemyhp = 3.0, enemymaxhp = 4.0, rng = 0.0;
    public static int teamLevel = 1, enemyLevel = 1, pokemonfighting = 1, turn = 1; //Fighting stuff
    public static int absorbAttack = 0, moonlightAttack = 0, acidAttack = 0, xscissorAttack = 0, blockAttack = 0, rockblastAttack = 0;
    public static int slamAttack = 0, tearfullookAttack = 0, woodhammerAttack = 0, pokeTeam = 1, battleframe = 0, events = 0;

    //Declares images icons to be used for the GUI
    public static ImageIcon startScreen = new ImageIcon ("startscreen.png");
    public static ImageIcon a1 = new ImageIcon ("a1.png");
    public static ImageIcon a2 = new ImageIcon ("a2.png");
    public static ImageIcon a3 = new ImageIcon ("a3.png");
    public static ImageIcon a4 = new ImageIcon ("a4.png");
    public static ImageIcon a5 = new ImageIcon ("a5.png");
    public static ImageIcon a6 = new ImageIcon ("a6.png");
    public static ImageIcon a7 = new ImageIcon ("a7.png");
    public static ImageIcon a8 = new ImageIcon ("a8.png");
    public static ImageIcon a9 = new ImageIcon ("a9.png");
    public static ImageIcon fightimage = new ImageIcon ("fight1.png");
    public static ImageIcon returnimage = new ImageIcon ("return1.png");
    public static ImageIcon captureimage = new ImageIcon ("catch1.jpg");
    public static ImageIcon switchimage = new ImageIcon ("swap.png");
    public static ImageIcon bellawesome = new ImageIcon ("Bellossom.png");
    public static ImageIcon awedishimage = new ImageIcon ("Awedish.png");
    public static ImageIcon dweebbleimage = new ImageIcon ("Dweebble.png");
    public static ImageIcon sodawodaimage = new ImageIcon ("Sodawoda.png");
    public static ImageIcon backimage = new ImageIcon ("back.png");

    //Declares JFrames of the GUI
    public static JFrame starting = new JFrame ();
    public static JFrame bag = new JFrame ();
    public static JFrame changepoke = new JFrame ();
    public static JFrame aweMoves = new JFrame ();
    public static JFrame dweebMoves = new JFrame ();
    public static JFrame sodaMoves = new JFrame ();
    public static JFrame endScreen = new JFrame ();

    //Declares JButtons for attacks and other options for battle as well as the initiator of the game.
    public static JButton startb = new JButton (startScreen);
    public static JButton awemove1 = new JButton (a1);
    public static JButton awemove2 = new JButton (a2);
    public static JButton awemove3 = new JButton (a3);
    public static JButton awemove4 = new JButton (returnimage);
    public static JButton dweebmove1 = new JButton (a4);
    public static JButton dweebmove2 = new JButton (a5);
    public static JButton dweebmove3 = new JButton (a6);
    public static JButton dweebmove4 = new JButton (returnimage);
    public static JButton sodamove1 = new JButton (a7);
    public static JButton sodamove2 = new JButton (a8);
    public static JButton sodamove3 = new JButton (a9);
    public static JButton sodamove4 = new JButton (returnimage);
    public static JButton fight = new JButton (fightimage);
    public static JButton capture = new JButton (captureimage);
    public static JButton switchp = new JButton (switchimage);
    public static JButton switchAwedish = new JButton (awedishimage);
    public static JButton switchDweebble = new JButton (dweebbleimage);
    public static JButton switchSodawoda = new JButton (sodawodaimage);
    public static JButton dontswitch = new JButton (backimage);
    public static JButton endingImage = new JButton (bellawesome);

    ////////////MAIN METHOD////////////
    public static void main (String[] args)
    {
	////////////GUI////////////
	//Sets the layouts of all the JFrames so they can display the contents
	starting.getContentPane ().setLayout (new FlowLayout ());
	bag.getContentPane ().setLayout (new GridLayout (3, 1));
	changepoke.getContentPane ().setLayout (new GridLayout (2, 2));
	aweMoves.getContentPane ().setLayout (new GridLayout (2, 3));
	dweebMoves.getContentPane ().setLayout (new GridLayout (2, 3));
	sodaMoves.getContentPane ().setLayout (new GridLayout (2, 3));
	endScreen.getContentPane ().setLayout (new FlowLayout ());

	//Sets the titles of the JFrames
	starting.setTitle ("POCKETMANS ADVENTURE");
	bag.setTitle ("What will you do?");
	aweMoves.setTitle ("What will Awedish do?");
	dweebMoves.setTitle ("What will Dweeble do?");
	sodaMoves.setTitle ("What will Sodawoda do?");
	endScreen.setTitle ("CONGRATULATIONS!");

	//Adds JButtons and JLabel to the frames
	starting.getContentPane ().add (startb);

	aweMoves.getContentPane ().add (awemove1);
	aweMoves.getContentPane ().add (awemove2);
	aweMoves.getContentPane ().add (awemove3);
	aweMoves.getContentPane ().add (awemove4);

	dweebMoves.getContentPane ().add (dweebmove1);
	dweebMoves.getContentPane ().add (dweebmove2);
	dweebMoves.getContentPane ().add (dweebmove3);
	dweebMoves.getContentPane ().add (dweebmove4);

	sodaMoves.getContentPane ().add (sodamove1);
	sodaMoves.getContentPane ().add (sodamove2);
	sodaMoves.getContentPane ().add (sodamove3);
	sodaMoves.getContentPane ().add (sodamove4);

	bag.getContentPane ().add (fight);
	bag.getContentPane ().add (capture);
	bag.getContentPane ().add (switchp);

	changepoke.getContentPane ().add (switchAwedish);
	changepoke.getContentPane ().add (switchDweebble);
	changepoke.getContentPane ().add (switchSodawoda);
	changepoke.getContentPane ().add (dontswitch);

	endScreen.getContentPane ().add (endingImage);

	//Adds action listeners to buttons so that they may function.
	startb.addActionListener (new closeframe ());

	awemove1.addActionListener (new absorb ());
	awemove2.addActionListener (new moonlight ());
	awemove3.addActionListener (new acid ());
	awemove4.addActionListener (new back ());

	dweebmove1.addActionListener (new xscissor ());
	dweebmove2.addActionListener (new block ());
	dweebmove3.addActionListener (new rockblast ());
	dweebmove4.addActionListener (new back ());

	sodamove1.addActionListener (new slam ());
	sodamove2.addActionListener (new tearfullook ());
	sodamove3.addActionListener (new woodhammer ());
	sodamove4.addActionListener (new back ());

	fight.addActionListener (new fightscreen ());
	capture.addActionListener (new capturescreen ());
	switchp.addActionListener (new switchscreen ());

	switchAwedish.addActionListener (new switchA ());
	switchDweebble.addActionListener (new switchB ());
	switchSodawoda.addActionListener (new switchC ());
	dontswitch.addActionListener (new back ());

	endingImage.addActionListener (new closeframe ());

	//Set up for the starting frame
	//Packages contents so that the contents can be seen without having to change the size of the frame.
	starting.pack ();
	//Sets the location of the frame.
	starting.setLocation (new Point (300, 0));
	//Sets the frame visible as the initiator of the program
	starting.setVisible (true);

	//Set up for the ending frame
	//Packages contents so that the contents can be seen without having to change the size of the frame.
	endScreen.pack ();
	//Sets the location of the frame.
	endScreen.setLocation (new Point (300, 0));

	//Packages the frames that are used for battle.
	//Allows content to be seen without having to change the size of the frames.
	bag.pack ();
	changepoke.pack ();
	aweMoves.pack ();
	dweebMoves.pack ();
	sodaMoves.pack ();

	////////////GAME////////////
	//Creates a while loop that prevents the console from being shown until the user presses on the starting frame.
	while (life == 0)
	{
	}
	c = new Console (30, 125); //Sets the dimensions to 1000x600 and creates the console.

	//Creates a while loop that checks if the user is still alive.
	//The while loops allows for refreshing and recieiving movement values of keys using getChar.
	while (life == 1)
	{
	    //Outputs the introduction/backstory of the game
	    if (tutorial == 0)
	    {
		//Outputs the first half of the story
		c.setColor (Color.black);
		c.fillRect (10, 0, 990, 600);
		c.setColor (Color.white);
		c.setFont (cutscene);
		c.drawString ("Once upon a time, on the regions", 60, 100);
		c.drawString ("of Club Pocketman Island,", 60, 200);
		c.drawString ("There was a young pocketman,", 60, 300);
		c.drawString ("whose name was Awedish.", 60, 400);
		c.setFont (dialog);
		c.drawString ("Press any key to continue....", 500, 540);
		//Temporarily stops the program until the user inputs a character.
		//Allows the user to continue when ready.
		c.getChar ();

		//Outputs the second half of the story
		c.setColor (Color.black);
		c.fillRect (10, 0, 990, 600);
		c.setColor (Color.white);
		c.setFont (cutscene);
		c.drawString ("One day, Awedish randomly appeared", 60, 100);
		c.drawString ("in the lab of Professor Spruce.", 60, 200);
		c.drawString ("Waking up, he noticed the Sodawoda", 60, 300);
		c.drawString ("and three empty pocketballs.", 60, 400);
		c.setFont (dialog);
		c.drawString ("Press any key to continue....", 500, 540);
		//Temporarily stops the program until the user inputs a character.
		//Allows the user to continue when ready.
		c.getChar ();

		//Instructions
		c.setColor (Color.black);
		c.fillRect (10, 0, 990, 600);
		c.setColor (Color.white);
		c.setFont (cutscene);
		c.drawString ("Instuctions:", 60, 100);
		c.drawString ("wasd controls for movement,", 60, 200);
		c.drawString ("'w'-Up, 'a'-Left, 's'-Down, 'd'-Right. ", 60, 300);
		c.drawString ("Press 'e' to interact with things.", 60, 400);
		c.setFont (dialog);
		c.drawString ("Press any key to continue....", 500, 540);
		//Temporarily stops the program until the user inputs a character.
		//Allows the user to continue when ready.
		c.getChar ();
	    }

	    //Draws the HUD that outputs various information regarding the game.
	    c.setColor (hudBrown);
	    c.fillRect (10, 0, 990, 40);
	    c.setFont (dialog);
	    c.setColor (Color.white);
	    c.drawString ("Pocketmans count: " + pokemonCount, 640, 35); //Counts the number of pocketmans that are caught.
	    c.drawString ("Pocketballs count: " + pokeballs, 400, 35); //Counts the number of remaining attempts to catch pocketmans.
	    //Indicates whether the user is sprinting(double the movement)
	    if (sprint % 2 == 0)
		c.drawString ("Sprint: OFF", 870, 35);
	    else if (sprint % 2 == 1)
		c.drawString ("Sprint: ON", 870, 35);
	    c.fillRect (0, 0, 10, 600);

	    ////////////GRAPHICS////////////
	    //Checks the value of the room.
	    //Calls upon majority of the drawn rooms using extends.
	    //There are some exceptions, they have the room drawn in the main program.
	    if (area == -1)
		new PocketmanCenter ();

	    if (area == 0)
	    {
		//Draws the people who are fighting and the map of battle in area 0.
		new BattleMap ();

		//Checks the fight to be outputted based upon the "tutorial" number which is used to count fights.
		//Fight number #1 (Introductary fight to the mechanics of the game)
		if (tutorial == 1)
		{
		    //Draws the combatants
		    new DrawsAwedish ();
		    new DrawsSoda ();
		    //Outputs introductary dialog
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Professor Spruce", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("This is the place where all fights happen. To your left, you can select which of your moves to use. ", 30, 525);
		    c.drawString ("Your enemy will also have a set of moves to use. Capture or kill your opponent to win.", 30, 555);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    //Temporarily stops the program until the user inputs a character.
		    //Allows the user to continue when ready.
		    c.getChar ();

		    //Continues the introductary dialog
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.setFont (dialog);
		    c.setColor (Color.black);
		    c.drawString ("Try using an attack on me now.", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue", 750, 585);
		    //Temporarily stops the program until the user inputs a character.
		    //Allows the user to continue when ready.
		    c.getChar ();

		    //Draws the map and characters.
		    new BattleMap ();
		    new DrawsAwedish ();
		    new DrawsSoda ();

		    //Creates a while loop for the battle so that it's continious until over.
		    while (tutorial == 1)
		    {
			//Player's turn
			if (turn % 2 == 1)
			{
			    //Sets the frame listing the possible attacks visible.
			    //Sets the specific size.
			    if (battleframe == 0)
			    {
				aweMoves.setSize (new Dimension (328, 164));
				dweebMoves.setSize (new Dimension (328, 164));
				sodaMoves.setSize (new Dimension (328, 164));
				aweMoves.setVisible (true);
				battleframe = 10;
			    }
			    battleframe -= 1; //Allows the frame to reappear if the user accidentally closes it

			    //Checks the button pressed and outputs a specific animation
			    if (absorbAttack == 1)
				absorbAnimation ();
			}
			//Enemy turn
			if (turn % 2 == 0 && events == 0)
			{
			    //Draws the characters
			    new DrawsAwedish ();
			    new DrawsSoda ();
			    //Outputs additional introductary dialog.
			    c.setColor (hudBrown);
			    c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("Good job! Pocketmans in this world have 3 moves. Basic attack, defense, and", 30, 525);
			    c.drawString ("a heavy attack. You must level up enough in order to unlock your heavy attack.", 30, 555);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();

			    //Outputs even more dialog
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setFont (dialog);
			    c.setColor (Color.black);
			    c.drawString ("Although your heavy attack will deal more damage than your basic attack,", 30, 525);
			    c.drawString ("it also has a lot more of a chance to miss, so use it carefully.", 30, 555);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();

			    //Outputs even more dialogx2
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setFont (dialog);
			    c.setColor (Color.black);
			    c.drawString ("Now it's time for me to attack you. Hopefully I don't accidently kill you, ", 30, 525);
			    c.drawString ("with your weak and measly max hp of 2 (LUL).", 30, 555);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();

			    //Outputs text regarding the enemy's attack
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setFont (dialog);
			    c.setColor (Color.black);
			    c.drawString ("Sodawoda used slam!", 30, 525);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();

			    //Animation for BODYSLAM
			    for (int i = sodawodax ; i >= x ; i -= 3)
			    {
				sodawodax -= 3;
				sodawoday += 2;
				//refreshes the graphics
				new BattleMap ();
				new DrawsSoda ();
				new DrawsAwedish ();
			    }
			    //Sets the health lower as the player recieves damage.
			    hp = 1;
			    //Animation of the enemy.
			    for (int i = sodawodax ; i <= 750 ; i += 3)
			    {
				sodawodax += 3;
				sodawoday -= 2;
				//Refreshes drawings
				new BattleMap ();
				new DrawsSoda ();
				new DrawsAwedish ();
			    }

			    //Continues the dialog
			    c.setColor (hudBrown);
			    c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("Wow great you survived, now the last thing I'll teach you is capturing pokemon.", 30, 525);
			    c.drawString ("You can press the 'go back' button on the bottom left to view your main screen.", 30, 555);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();
			    awemove4.setText ("go back");
			    events = 1;

			    //More introductary information is told.
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("The main screen shows 3 panes. FIGHT, CAPTURE, and SWITCH POKEMON. The lower your", 30, 525);
			    c.drawString ("opponent's hp, the more likely you are to capture them. I'll give you 3 balls to start off.", 30, 555);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    // Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();

			    //The "enemy" gives the player instructions.
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("Now try using ''Moonlight'' to end your tutorial, so you can go around and", 30, 525);
			    c.drawString ("add other pocketmans to your pocketdex.", 30, 555);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();

			    //sets values of variables to be for battle and continues the turn-based combat.
			    battleframe = 1;
			    turn += 1;
			    pokeballs += 3;
			}
			//Refreshes the drawings of characters
			new DrawsAwedish ();
			new DrawsSoda ();

			//Creates a delay to minimize flicker
			try
			{
			    Thread.sleep (50);
			}
			catch (Exception e)
			{
			}
		    }
		}

		//Fight number #2
		if (tutorial == 2 && area == 0)
		{
		    //Outputs the combatants and the map.
		    new BattleMap ();
		    new DrawsAwedish ();
		    new DrawsDweeb ();

		    //Creates a while loop for the turnbased combat.
		    while (tutorial == 2 && area == 0)
		    {
			//Player's turn
			if (turn % 2 == 1)
			{
			    //Sets the frame listing the possible attacks visible.
			    if (battleframe == 0)
			    {
				aweMoves.setVisible (true);
				battleframe = 10;
			    }
			    battleframe -= 1; //Used for refreshing the GUI in case of being accidentally closed.

			    //Checks the attack chosen and does a specific animation
			    if (absorbAttack == 1)
				absorbAnimation ();
			    if (moonlightAttack == 1)
				moonlightAnimation ();

			    //Makes sure dweebble doesnt die
			    if (enemyhp < 1)
				enemyhp = 1;
			}

			//Enemy turn
			if (turn % 2 == 0)
			{
			    //Outputs a specific attack pattern of the enemy
			    //x-scissor contents
			    if (events % 2 == 0)
			    {
				//Dweebble x-scissor
				//Refreshes the graphics of the map and combatants
				new BattleMap ();
				new DrawsAwedish ();
				new DrawsDweeb ();

				//Outputs the enemy's attack
				c.setColor (hudBrown);
				c.fillRoundRect (10, 475, 990, 125, 100, 50);
				c.setFont (dialog);
				c.setColor (Color.white);
				c.fillRoundRect (20, 485, 970, 105, 80, 30);
				c.setColor (Color.black);
				c.drawString ("Dweebble used X-Scissor!", 30, 525);
				c.setFont (battle);
				c.drawString ("Press any key to continue...", 750, 585);
				//Temporarily stops the program until the user inputs a character.
				//Allows the user to continue when ready.
				c.getChar ();

				//Draws an X as the animation of the skill
				c.setColor (orange);
				for (int i = x - 10 ; i <= x + 85 ; i++)
				{
				    fill += 1;
				    c.fillOval (i, 414 + fill, 6, 6);
				    for (int j = 0 ; j < 2500000 ; j++)
				    {
				    }
				}
				fill = 0;
				for (int i = x + 85 ; i >= x - 10 ; i--)
				{
				    fill += 1;
				    c.fillOval (i, 414 + fill, 6, 6);
				    for (int j = 0 ; j < 2500000 ; j++)
				    {
				    }
				}

				//Sets the health of the character
				fill = 0;
				hp = 1;

				//Refreshes graphics.
				new BattleMap ();
				new DrawsAwedish ();
				new DrawsDweeb ();
			    }

			    //block contents
			    if (events % 2 == 1)
			    {
				//Refreshes the graphics
				new BattleMap ();
				new DrawsAwedish ();
				new DrawsDweeb ();

				//Outputs the enemy's attack
				c.setColor (hudBrown);
				c.fillRoundRect (10, 475, 990, 125, 100, 50);
				c.setFont (dialog);
				c.setColor (Color.white);
				c.fillRoundRect (20, 485, 970, 105, 80, 30);
				c.setColor (Color.black);
				c.drawString ("Dweebble used block!", 30, 525);
				c.setFont (battle);
				c.drawString ("Press any key to continue...", 750, 585);
				//Temporarily stops the program until the user inputs a character.
				//Allows the user to continue when ready.
				c.getChar ();
			    }
			    //Sets battle values and allows for turn-based combat.
			    battleframe = 1;
			    turn += 1;
			    events += 1;
			}
			//Creates a delay to minimize flicker
			try
			{
			    Thread.sleep (50);
			}
			catch (Exception e)
			{
			}
		    }
		}
		//FIGHT 3 (toad)
		//Creates a while loop for the turnbased combat.
		while (tutorial == 3 && area == 0)
		{
		    //Player turn
		    if (turn % 2 == 1)
		    {
			//Sets the frame listing the possible attacks visible.
			if (battleframe == 0)
			{
			    //Draws the basic characters and map and shows the attacks
			    initialDrawing ();
			    battleframe = 10;

			    //Draws Toad (60x110)
			    c.setColor (Color.red);
			    c.fillOval (toadx + 4, toady + 90, 20, 20);
			    c.fillOval (toadx + 36, toady + 90, 20, 20);
			    c.setColor (Color.white);
			    c.fillRoundRect (toadx, toady, 60, 60, 30, 30);
			    c.fillRoundRect (toadx + 12, toady + 80, 38, 20, 20, 20);
			    c.setColor (Color.red);
			    c.fillArc (toadx - 15, toady + 10, 30, 30, 90, -180);
			    c.fillArc (toadx + 45, toady + 10, 30, 30, 90, 180);
			    c.fillArc (toadx + 15, toady - 15, 30, 30, 0, -180);
			    c.setColor (toadc);
			    c.fillRoundRect (toadx + 10, toady + 30, 40, 40, 20, 20);
			    c.fillRect (toadx + 22, toady + 70, 16, 20);
			    c.fillOval (toadx + 2, toady + 72, 16, 16);
			    c.fillOval (toadx + 44, toady + 72, 16, 16);
			    c.setColor (darkBlue);
			    c.fillRect (toadx + 12, toady + 70, 12, 20);
			    c.fillRect (toadx + 38, toady + 70, 12, 20);
			    c.setColor (Color.black);
			    c.fillOval (toadx + 15, toady + 40, 10, 13);
			    c.fillOval (toadx + 35, toady + 40, 10, 13);
			    c.setColor (Color.red);
			    c.fillArc (toadx + 21, toady + 45, 20, 20, 0, -180);
			}
			battleframe -= 1; //Used for refreshing the GUI in case of being accidentally closed.

			//Checks the attack chosen and does a specific animation
			attackCheck ();

			//Sees if toad dies and sends the player back to the original location
			if (enemyhp <= 0)
			{
			    area = 6;
			    tutorial = 4;
			    x = 472;
			    y = 340;
			}
		    }
		    //Enemy turn
		    if (turn % 2 == 0 && tutorial == 3)
		    {
			//Outputs a specific attack pattern of the enemy
			//Toad's mushroom stick contents
			if ((events % 3 == 0 || events % 3 == 1) && turn % 2 == 0)
			{
			    //Refreshes the graphics of the map and combatants
			    redrawing ();
			    //Draws Toad (60x110)
			    c.setColor (Color.red);
			    c.fillOval (toadx + 4, toady + 90, 20, 20);
			    c.fillOval (toadx + 36, toady + 90, 20, 20);
			    c.setColor (Color.white);
			    c.fillRoundRect (toadx, toady, 60, 60, 30, 30);
			    c.fillRoundRect (toadx + 12, toady + 80, 38, 20, 20, 20);
			    c.setColor (Color.red);
			    c.fillArc (toadx - 15, toady + 10, 30, 30, 90, -180);
			    c.fillArc (toadx + 45, toady + 10, 30, 30, 90, 180);
			    c.fillArc (toadx + 15, toady - 15, 30, 30, 0, -180);
			    c.setColor (toadc);
			    c.fillRoundRect (toadx + 10, toady + 30, 40, 40, 20, 20);
			    c.fillRect (toadx + 22, toady + 70, 16, 20);
			    c.fillOval (toadx + 2, toady + 72, 16, 16);
			    c.fillOval (toadx + 44, toady + 72, 16, 16);
			    c.setColor (darkBlue);
			    c.fillRect (toadx + 12, toady + 70, 12, 20);
			    c.fillRect (toadx + 38, toady + 70, 12, 20);
			    c.setColor (Color.black);
			    c.fillOval (toadx + 15, toady + 40, 10, 13);
			    c.fillOval (toadx + 35, toady + 40, 10, 13);
			    c.setColor (Color.red);
			    c.fillArc (toadx + 21, toady + 45, 20, 20, 0, -180);

			    //Outputs the enemy's attack
			    c.setColor (hudBrown);
			    c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("Toad used mushroom!", 30, 525);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();

			    //Draws a mushroom stick
			    c.setColor (Color.red);
			    fill = 0;
			    for (int i = 750 ; i >= 230 ; i -= 2)
			    {
				fill += 1;
				c.fillOval (i, 165 + fill, 6, 6);
				for (int j = 0 ; j < 2500000 ; j++)
				{
				}
			    }
			    //refreshes the map
			    new BattleMap ();

			    //Takes damage from the attack and sees if player is dead
			    if (pokeTeam == 1)
			    {
				new DrawsAwedish ();
				hp -= 2;
				if (hp <= 0)
				    new Death ();
			    }

			    //Takes damage from the attack and sees if the assistant pocketman has fainted
			    //Swaps back to Awedish(main pocketman)
			    if (pokeTeam == 2)
			    {
				new DrawsSoda ();
				sodahp -= 2;
				if (sodahp <= 0)
				{
				    pokeTeam = 1;
				    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				    AndrewEdwardWaynePocketmans.c.drawString ("Sodawoda fainted!", 30, 525);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				    AndrewEdwardWaynePocketmans.c.getChar ();
				    teamPoke = "Awedish";
				}
			    }

			    //Takes damage from the attack and sees if the assistant pocketman has fainted
			    //Swaps back to Awedish(main pocketman)
			    if (pokeTeam == 3)
			    {
				new DrawsDweeb ();
				dweebhp -= 2;
				if (dweebhp <= 0)
				{
				    pokeTeam = 1;
				    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				    AndrewEdwardWaynePocketmans.c.drawString ("Dweebble fainted!", 30, 525);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				    AndrewEdwardWaynePocketmans.c.getChar ();
				    teamPoke = "Awedish";
				}
			    }

			    //Draws Toad (60x110)
			    c.setColor (Color.red);
			    c.fillOval (toadx + 4, toady + 90, 20, 20);
			    c.fillOval (toadx + 36, toady + 90, 20, 20);
			    c.setColor (Color.white);
			    c.fillRoundRect (toadx, toady, 60, 60, 30, 30);
			    c.fillRoundRect (toadx + 12, toady + 80, 38, 20, 20, 20);
			    c.setColor (Color.red);
			    c.fillArc (toadx - 15, toady + 10, 30, 30, 90, -180);
			    c.fillArc (toadx + 45, toady + 10, 30, 30, 90, 180);
			    c.fillArc (toadx + 15, toady - 15, 30, 30, 0, -180);
			    c.setColor (toadc);
			    c.fillRoundRect (toadx + 10, toady + 30, 40, 40, 20, 20);
			    c.fillRect (toadx + 22, toady + 70, 16, 20);
			    c.fillOval (toadx + 2, toady + 72, 16, 16);
			    c.fillOval (toadx + 44, toady + 72, 16, 16);
			    c.setColor (darkBlue);
			    c.fillRect (toadx + 12, toady + 70, 12, 20);
			    c.fillRect (toadx + 38, toady + 70, 12, 20);
			    c.setColor (Color.black);
			    c.fillOval (toadx + 15, toady + 40, 10, 13);
			    c.fillOval (toadx + 35, toady + 40, 10, 13);
			    c.setColor (Color.red);
			    c.fillArc (toadx + 21, toady + 45, 20, 20, 0, -180);
			}

			//Outputs a specific attack pattern of the enemy
			//Toad's regrowth contents
			if (events % 3 == 2 && turn % 2 == 0)
			{
			    //Outputs the enemy's attack
			    c.setColor (hudBrown);
			    c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("Toad used regrowth!", 30, 525);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();
			    //heals toad for health
			    enemyhp += 2;
			    if (enemyhp > enemymaxhp)
				enemyhp = enemymaxhp;
			}
			//Sets battle values and allows for turn-based combat.
			events += 1;
			turn += 1;
			battleframe = 1;
		    }
		    //Refreshes the graphics
		    redrawing ();
		    //Draws Toad (60x110)
		    c.setColor (Color.red);
		    c.fillOval (toadx + 4, toady + 90, 20, 20);
		    c.fillOval (toadx + 36, toady + 90, 20, 20);
		    c.setColor (Color.white);
		    c.fillRoundRect (toadx, toady, 60, 60, 30, 30);
		    c.fillRoundRect (toadx + 12, toady + 80, 38, 20, 20, 20);
		    c.setColor (Color.red);
		    c.fillArc (toadx - 15, toady + 10, 30, 30, 90, -180);
		    c.fillArc (toadx + 45, toady + 10, 30, 30, 90, 180);
		    c.fillArc (toadx + 15, toady - 15, 30, 30, 0, -180);
		    c.setColor (toadc);
		    c.fillRoundRect (toadx + 10, toady + 30, 40, 40, 20, 20);
		    c.fillRect (toadx + 22, toady + 70, 16, 20);
		    c.fillOval (toadx + 2, toady + 72, 16, 16);
		    c.fillOval (toadx + 44, toady + 72, 16, 16);
		    c.setColor (darkBlue);
		    c.fillRect (toadx + 12, toady + 70, 12, 20);
		    c.fillRect (toadx + 38, toady + 70, 12, 20);
		    c.setColor (Color.black);
		    c.fillOval (toadx + 15, toady + 40, 10, 13);
		    c.fillOval (toadx + 35, toady + 40, 10, 13);
		    c.setColor (Color.red);
		    c.fillArc (toadx + 21, toady + 45, 20, 20, 0, -180);
		    //Creates a delay to minimize flicker
		    try
		    {
			Thread.sleep (50);
		    }
		    catch (Exception e)
		    {
		    }
		}
		//FIGHT 4 (COUGHING)
		//Creates a while loop for the turnbased combat.
		while (tutorial == 4 && area == 0)
		{
		    //Player turn
		    if (turn % 2 == 1)
		    {
			//Sets the frame listing the possible attacks visible.
			if (battleframe == 0)
			{
			    //Draws the basic characters and map and shows the attacks
			    initialDrawing ();
			    battleframe = 10;

			    //Draws Coughing (85x87)
			    c.setColor (koffpurple);
			    c.fillOval (koffingx, koffingy, 75, 75);
			    c.fillOval (koffingx + 15, koffingy - 7, 25, 25);
			    c.fillOval (koffingx + 50, koffingy + 5, 23, 23);
			    c.fillOval (koffingx + 25, koffingy + 50, 30, 30);
			    c.fillOval (koffingx, koffingy + 42, 33, 33);
			    c.fillOval (koffingx + 50, koffingy + 40, 30, 30);
			    c.fillOval (koffingx - 5, koffingy + 10, 30, 30);
			    c.setColor (Color.white);
			    c.fillArc (koffingx + 16, koffingy + 16, 20, 20, 0, 180);
			    c.fillArc (koffingx + 44, koffingy + 16, 20, 20, 0, 180);
			    c.setColor (Color.black);
			    c.fillOval (koffingx + 23, koffingy + 19, 6, 6);
			    c.fillOval (koffingx + 51, koffingy + 19, 6, 6);
			    c.setColor (Color.pink);
			    c.fillArc (koffingx + 26, koffingy + 26, 20, 20, 0, -180);
			    c.setColor (sodaBrown);
			    c.drawOval (koffingx + 28, koffingy + 48, 17, 13);
			    c.drawLine (koffingx + 21, koffingy + 57, koffingx + 51, koffingy + 66);
			    c.drawLine (koffingx + 21, koffingy + 66, koffingx + 51, koffingy + 57);
			}
			battleframe -= 1; //Used for refreshing the GUI in case of being accidentally closed.
			//Checks the attack chosen and does a specific animation
			attackCheck ();

			//Sees if coughing dies and sends the player back to the original location
			if (enemyhp <= 0)
			{
			    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
			    AndrewEdwardWaynePocketmans.c.drawString ("Coughing fainted!", 30, 525);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
			    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    AndrewEdwardWaynePocketmans.c.getChar ();
			    area = 8;
			    tutorial = 5;
			    x = 34;
			    y = 338;
			}
		    }
		    //Enemy turn
		    if (turn % 2 == 0 && tutorial == 4)
		    {
			//Outputs a specific attack pattern of the enemy
			//poison gas attack
			if ((events % 3 == 0 || events % 3 == 1) && turn % 2 == 0)
			{
			    //Refreshes the graphics of the map and combatants
			    redrawing ();
			    //Draws Coughing (85x87)
			    c.setColor (koffpurple);
			    c.fillOval (koffingx, koffingy, 75, 75);
			    c.fillOval (koffingx + 15, koffingy - 7, 25, 25);
			    c.fillOval (koffingx + 50, koffingy + 5, 23, 23);
			    c.fillOval (koffingx + 25, koffingy + 50, 30, 30);
			    c.fillOval (koffingx, koffingy + 42, 33, 33);
			    c.fillOval (koffingx + 50, koffingy + 40, 30, 30);
			    c.fillOval (koffingx - 5, koffingy + 10, 30, 30);
			    c.setColor (Color.white);
			    c.fillArc (koffingx + 16, koffingy + 16, 20, 20, 0, 180);
			    c.fillArc (koffingx + 44, koffingy + 16, 20, 20, 0, 180);
			    c.setColor (Color.black);
			    c.fillOval (koffingx + 23, koffingy + 19, 6, 6);
			    c.fillOval (koffingx + 51, koffingy + 19, 6, 6);
			    c.setColor (Color.pink);
			    c.fillArc (koffingx + 26, koffingy + 26, 20, 20, 0, -180);
			    c.setColor (sodaBrown);
			    c.drawOval (koffingx + 28, koffingy + 48, 17, 13);
			    c.drawLine (koffingx + 21, koffingy + 57, koffingx + 51, koffingy + 66);
			    c.drawLine (koffingx + 21, koffingy + 66, koffingx + 51, koffingy + 57);

			    //Outputs the enemy's attack
			    c.setColor (hudBrown);
			    c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("Koffing used poison gas!", 30, 525);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();

			    //Animates the gas
			    c.setColor (koffpurple);
			    for (int ig = 0 ; ig < 6 ; ig++)
			    {
				for (int i = 50 ; i <= 250 ; i += 5)
				{
				    redrawing ();
				    //Draws Coughing (85x87)
				    c.setColor (koffpurple);
				    c.fillOval (koffingx, koffingy, 75, 75);
				    c.fillOval (koffingx + 15, koffingy - 7, 25, 25);
				    c.fillOval (koffingx + 50, koffingy + 5, 23, 23);
				    c.fillOval (koffingx + 25, koffingy + 50, 30, 30);
				    c.fillOval (koffingx, koffingy + 42, 33, 33);
				    c.fillOval (koffingx + 50, koffingy + 40, 30, 30);
				    c.fillOval (koffingx - 5, koffingy + 10, 30, 30);
				    c.setColor (Color.white);
				    c.fillArc (koffingx + 16, koffingy + 16, 20, 20, 0, 180);
				    c.fillArc (koffingx + 44, koffingy + 16, 20, 20, 0, 180);
				    c.setColor (Color.black);
				    c.fillOval (koffingx + 23, koffingy + 19, 6, 6);
				    c.fillOval (koffingx + 51, koffingy + 19, 6, 6);
				    c.setColor (Color.pink);
				    c.fillArc (koffingx + 26, koffingy + 26, 20, 20, 0, -180);
				    c.setColor (sodaBrown);
				    c.drawOval (koffingx + 28, koffingy + 48, 17, 13);
				    c.drawLine (koffingx + 21, koffingy + 57, koffingx + 51, koffingy + 66);
				    c.drawLine (koffingx + 21, koffingy + 66, koffingx + 51, koffingy + 57);

				    c.drawOval (koffingx - i / 2 + 41, koffingy - i / 2 + 42, i, i);
				    for (int j = 0 ; j < 2500000 ; j++)
				    {
				    }
				}
			    }
			    //refreshes the map
			    new BattleMap ();

			    //Takes damage from the attack and sees if player is dead
			    if (pokeTeam == 1)
			    {
				new DrawsAwedish ();
				hp -= 3;
				if (hp <= 0)
				    new Death ();
			    }
			    //Takes damage from the attack and sees if the assistant pocketman has fainted
			    //Swaps back to Awedish(main pocketman)
			    if (pokeTeam == 2)
			    {
				new DrawsSoda ();
				sodahp -= 3;
				if (sodahp <= 0)
				{
				    pokeTeam = 1;
				    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				    AndrewEdwardWaynePocketmans.c.drawString ("Sodawoda fainted!", 30, 525);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				    AndrewEdwardWaynePocketmans.c.getChar ();
				    teamPoke = "Awedish";
				}
			    }
			    //Takes damage from the attack and sees if the assistant pocketman has fainted
			    //Swaps back to Awedish(main pocketman)
			    if (pokeTeam == 3)
			    {
				new DrawsDweeb ();
				dweebhp -= 3;
				if (dweebhp <= 0)
				{
				    pokeTeam = 1;
				    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				    AndrewEdwardWaynePocketmans.c.drawString ("Dweebble fainted!", 30, 525);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				    AndrewEdwardWaynePocketmans.c.getChar ();
				    teamPoke = "Awedish";
				}
			    }

			    //Draws Coughing (85x87)
			    c.setColor (koffpurple);
			    c.fillOval (koffingx, koffingy, 75, 75);
			    c.fillOval (koffingx + 15, koffingy - 7, 25, 25);
			    c.fillOval (koffingx + 50, koffingy + 5, 23, 23);
			    c.fillOval (koffingx + 25, koffingy + 50, 30, 30);
			    c.fillOval (koffingx, koffingy + 42, 33, 33);
			    c.fillOval (koffingx + 50, koffingy + 40, 30, 30);
			    c.fillOval (koffingx - 5, koffingy + 10, 30, 30);
			    c.setColor (Color.white);
			    c.fillArc (koffingx + 16, koffingy + 16, 20, 20, 0, 180);
			    c.fillArc (koffingx + 44, koffingy + 16, 20, 20, 0, 180);
			    c.setColor (Color.black);
			    c.fillOval (koffingx + 23, koffingy + 19, 6, 6);
			    c.fillOval (koffingx + 51, koffingy + 19, 6, 6);
			    c.setColor (Color.pink);
			    c.fillArc (koffingx + 26, koffingy + 26, 20, 20, 0, -180);
			    c.setColor (sodaBrown);
			    c.drawOval (koffingx + 28, koffingy + 48, 17, 13);
			    c.drawLine (koffingx + 21, koffingy + 57, koffingx + 51, koffingy + 66);
			    c.drawLine (koffingx + 21, koffingy + 66, koffingx + 51, koffingy + 57);
			}
			//Outputs a specific attack pattern of the enemy
			//Koffing tackle contents
			if (events % 3 == 2 && turn % 2 == 0 && tutorial == 4)
			{
			    c.setColor (hudBrown);
			    c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("Koffing used tackle!", 30, 525);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();

			    //Tackle animation Part 1
			    for (int i = koffingx ; i >= x ; i -= 3)
			    {
				koffingx -= 3;
				koffingy += 2;
				new BattleMap ();
				new DrawsAwedish ();
				//Draws Coughing (85x87)
				c.setColor (koffpurple);
				c.fillOval (koffingx, koffingy, 75, 75);
				c.fillOval (koffingx + 15, koffingy - 7, 25, 25);
				c.fillOval (koffingx + 50, koffingy + 5, 23, 23);
				c.fillOval (koffingx + 25, koffingy + 50, 30, 30);
				c.fillOval (koffingx, koffingy + 42, 33, 33);
				c.fillOval (koffingx + 50, koffingy + 40, 30, 30);
				c.fillOval (koffingx - 5, koffingy + 10, 30, 30);
				c.setColor (Color.white);
				c.fillArc (koffingx + 16, koffingy + 16, 20, 20, 0, 180);
				c.fillArc (koffingx + 44, koffingy + 16, 20, 20, 0, 180);
				c.setColor (Color.black);
				c.fillOval (koffingx + 23, koffingy + 19, 6, 6);
				c.fillOval (koffingx + 51, koffingy + 19, 6, 6);
				c.setColor (Color.pink);
				c.fillArc (koffingx + 26, koffingy + 26, 20, 20, 0, -180);
				c.setColor (sodaBrown);
				c.drawOval (koffingx + 28, koffingy + 48, 17, 13);
				c.drawLine (koffingx + 21, koffingy + 57, koffingx + 51, koffingy + 66);
				c.drawLine (koffingx + 21, koffingy + 66, koffingx + 51, koffingy + 57);
			    }
			    //Takes damage from the attack and sees if player is dead
			    if (pokeTeam == 1)
			    {
				new DrawsAwedish ();
				hp -= 2;
				if (hp <= 0)
				    new Death ();
			    }
			    //Takes damage from the attack and sees if the assistant pocketman has fainted
			    //Swaps back to Awedish(main pocketman)
			    if (pokeTeam == 2)
			    {
				new DrawsSoda ();
				sodahp -= 2;
				if (sodahp <= 0)
				{
				    pokeTeam = 1;
				    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				    AndrewEdwardWaynePocketmans.c.drawString ("Sodawoda fainted!", 30, 525);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				    AndrewEdwardWaynePocketmans.c.getChar ();
				    teamPoke = "Awedish";
				}
			    }
			    //Takes damage from the attack and sees if the assistant pocketman has fainted
			    //Swaps back to Awedish(main pocketman)
			    if (pokeTeam == 3)
			    {
				new DrawsDweeb ();
				dweebhp -= 2;
				if (dweebhp <= 0)
				{
				    pokeTeam = 1;
				    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				    AndrewEdwardWaynePocketmans.c.drawString ("Dweebble fainted!", 30, 525);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				    AndrewEdwardWaynePocketmans.c.getChar ();
				    teamPoke = "Awedish";
				}
			    }

			    //Tackle animation Part 2
			    for (int i = koffingx ; i <= 730 ; i += 3)
			    {
				koffingx += 3;
				koffingy -= 2;
				new BattleMap ();
				new DrawsAwedish ();
				//Draws Coughing (85x87)
				c.setColor (koffpurple);
				c.fillOval (koffingx, koffingy, 75, 75);
				c.fillOval (koffingx + 15, koffingy - 7, 25, 25);
				c.fillOval (koffingx + 50, koffingy + 5, 23, 23);
				c.fillOval (koffingx + 25, koffingy + 50, 30, 30);
				c.fillOval (koffingx, koffingy + 42, 33, 33);
				c.fillOval (koffingx + 50, koffingy + 40, 30, 30);
				c.fillOval (koffingx - 5, koffingy + 10, 30, 30);
				c.setColor (Color.white);
				c.fillArc (koffingx + 16, koffingy + 16, 20, 20, 0, 180);
				c.fillArc (koffingx + 44, koffingy + 16, 20, 20, 0, 180);
				c.setColor (Color.black);
				c.fillOval (koffingx + 23, koffingy + 19, 6, 6);
				c.fillOval (koffingx + 51, koffingy + 19, 6, 6);
				c.setColor (Color.pink);
				c.fillArc (koffingx + 26, koffingy + 26, 20, 20, 0, -180);
				c.setColor (sodaBrown);
				c.drawOval (koffingx + 28, koffingy + 48, 17, 13);
				c.drawLine (koffingx + 21, koffingy + 57, koffingx + 51, koffingy + 66);
				c.drawLine (koffingx + 21, koffingy + 66, koffingx + 51, koffingy + 57);
			    }
			}
			//Sets battle values and allows for turn-based combat.
			events += 1;
			turn += 1;
			battleframe = 1;
		    }
		    //Refreshes the graphics
		    redrawing ();
		    //Draws Coughing (85x87)
		    c.setColor (koffpurple);
		    c.fillOval (koffingx, koffingy, 75, 75);
		    c.fillOval (koffingx + 15, koffingy - 7, 25, 25);
		    c.fillOval (koffingx + 50, koffingy + 5, 23, 23);
		    c.fillOval (koffingx + 25, koffingy + 50, 30, 30);
		    c.fillOval (koffingx, koffingy + 42, 33, 33);
		    c.fillOval (koffingx + 50, koffingy + 40, 30, 30);
		    c.fillOval (koffingx - 5, koffingy + 10, 30, 30);
		    c.setColor (Color.white);
		    c.fillArc (koffingx + 16, koffingy + 16, 20, 20, 0, 180);
		    c.fillArc (koffingx + 44, koffingy + 16, 20, 20, 0, 180);
		    c.setColor (Color.black);
		    c.fillOval (koffingx + 23, koffingy + 19, 6, 6);
		    c.fillOval (koffingx + 51, koffingy + 19, 6, 6);
		    c.setColor (Color.pink);
		    c.fillArc (koffingx + 26, koffingy + 26, 20, 20, 0, -180);
		    c.setColor (sodaBrown);
		    c.drawOval (koffingx + 28, koffingy + 48, 17, 13);
		    c.drawLine (koffingx + 21, koffingy + 57, koffingx + 51, koffingy + 66);
		    c.drawLine (koffingx + 21, koffingy + 66, koffingx + 51, koffingy + 57);
		    //Delay to reduce flicker
		    try
		    {
			Thread.sleep (50);
		    }
		    catch (Exception e)
		    {
		    }
		}

		//FIGHT 5 (deglitt)
		//Creates a while loop for the turnbased combat.
		while (tutorial == 5 && area == 0)
		{
		    //Player turn
		    if (turn % 2 == 1)
		    {
			//Sets the frame listing the possible attacks visible.
			if (battleframe == 0)
			{
			    //Draws the basic characters and map and shows the attacks
			    initialDrawing ();
			    battleframe = 10;

			    //Draws Deglitt (105x100)
			    c.setColor (sodaSpots);
			    c.fillOval (diglettx - 15, digletty + 70, 90, 30);
			    c.setColor (digBrown);
			    c.fillOval (diglettx, digletty, 60, 50);
			    c.fillRect (diglettx, digletty + 25, 60, 60);
			    c.setColor (Color.black);
			    c.fillOval (diglettx + 15, digletty + 20, 10, 20);
			    c.fillOval (diglettx + 35, digletty + 20, 10, 20);
			    c.setColor (Color.pink);
			    c.fillOval (diglettx + 10, digletty + 45, 40, 20);
			    c.setColor (sodaSpots);
			    c.fillOval (diglettx - 10, digletty + 75, 20, 20);
			    c.fillOval (diglettx + 10, digletty + 75, 20, 20);
			    c.fillOval (diglettx + 30, digletty + 75, 20, 20);
			    c.fillOval (diglettx + 50, digletty + 75, 20, 20);
			}
			battleframe -= 1; //Used for refreshing the GUI in case of being accidentally closed.
			//Checks the attack chosen and does a specific animation
			attackCheck ();

			//Sees if Diglett dies and sends the player back to the original location
			if (enemyhp <= 0)
			{
			    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
			    AndrewEdwardWaynePocketmans.c.drawString ("Deglitt fainted!", 30, 525);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
			    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    AndrewEdwardWaynePocketmans.c.getChar ();

			    area = 10;
			    tutorial = 6;
			    x = 34;
			    y = 266;
			}
		    }
		    //Enemy turn
		    if (turn % 2 == 0 && tutorial == 5)
		    {
			//Refreshes the graphics of the map and combatants
			redrawing ();
			//Draws Deglitt (105x100)
			c.setColor (sodaSpots);
			c.fillOval (diglettx - 15, digletty + 70, 90, 30);
			c.setColor (digBrown);
			c.fillOval (diglettx, digletty, 60, 50);
			c.fillRect (diglettx, digletty + 25, 60, 60);
			c.setColor (Color.black);
			c.fillOval (diglettx + 15, digletty + 20, 10, 20);
			c.fillOval (diglettx + 35, digletty + 20, 10, 20);
			c.setColor (Color.pink);
			c.fillOval (diglettx + 10, digletty + 45, 40, 20);
			c.setColor (sodaSpots);
			c.fillOval (diglettx - 10, digletty + 75, 20, 20);
			c.fillOval (diglettx + 10, digletty + 75, 20, 20);
			c.fillOval (diglettx + 30, digletty + 75, 20, 20);
			c.fillOval (diglettx + 50, digletty + 75, 20, 20);

			//Outputs the enemy's attack
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.setColor (Color.black);
			c.drawString ("Diglett used scratch!", 30, 525);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			//Temporarily stops the program until the user inputs a character.
			//Allows the user to continue when ready.
			c.getChar ();

			//Animates the scratch
			c.setColor (sodaSpots);
			fill = 400;
			for (int ig = 0 ; ig < 3 ; ig++)
			{
			    for (int i = 320 ; i >= 220 ; i -= 2)
			    {
				c.drawOval (i, fill, 6, 6);
				fill += 1;
				for (int j = 0 ; j < 2500000 ; j++)
				{
				}
			    }
			}
			//Changes back to ally turn for turn-based combat
			turn = 1;
			battleframe = 0;
			//Refreshes the map
			new BattleMap ();

			//Takes damage from the attack and sees if player is dead
			if (pokeTeam == 1)
			{
			    new DrawsAwedish ();
			    hp -= 3;
			    if (hp <= 0)
				new Death ();
			}

			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 2)
			{
			    new DrawsSoda ();
			    sodahp -= 3;
			    if (sodahp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Sodawoda fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}

			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 3)
			{
			    new DrawsDweeb ();
			    dweebhp -= 3;
			    if (dweebhp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Dweebble fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}
			//Draws Deglitt (105x100)
			c.setColor (sodaSpots);
			c.fillOval (diglettx - 15, digletty + 70, 90, 30);
			c.setColor (digBrown);
			c.fillOval (diglettx, digletty, 60, 50);
			c.fillRect (diglettx, digletty + 25, 60, 60);
			c.setColor (Color.black);
			c.fillOval (diglettx + 15, digletty + 20, 10, 20);
			c.fillOval (diglettx + 35, digletty + 20, 10, 20);
			c.setColor (Color.pink);
			c.fillOval (diglettx + 10, digletty + 45, 40, 20);
			c.setColor (sodaSpots);
			c.fillOval (diglettx - 10, digletty + 75, 20, 20);
			c.fillOval (diglettx + 10, digletty + 75, 20, 20);
			c.fillOval (diglettx + 30, digletty + 75, 20, 20);
			c.fillOval (diglettx + 50, digletty + 75, 20, 20);
		    }
		    //Sets battle values and allows for turn-based combat.
		    events += 1;
		    turn = 1;

		    //Refreshes the graphics
		    redrawing ();
		    //Draws Deglitt (105x100)
		    c.setColor (sodaSpots);
		    c.fillOval (diglettx - 15, digletty + 70, 90, 30);
		    c.setColor (digBrown);
		    c.fillOval (diglettx, digletty, 60, 50);
		    c.fillRect (diglettx, digletty + 25, 60, 60);
		    c.setColor (Color.black);
		    c.fillOval (diglettx + 15, digletty + 20, 10, 20);
		    c.fillOval (diglettx + 35, digletty + 20, 10, 20);
		    c.setColor (Color.pink);
		    c.fillOval (diglettx + 10, digletty + 45, 40, 20);
		    c.setColor (sodaSpots);
		    c.fillOval (diglettx - 10, digletty + 75, 20, 20);
		    c.fillOval (diglettx + 10, digletty + 75, 20, 20);
		    c.fillOval (diglettx + 30, digletty + 75, 20, 20);
		    c.fillOval (diglettx + 50, digletty + 75, 20, 20);

		    //Delay to reduce flicker
		    try
		    {
			Thread.sleep (50);
		    }
		    catch (Exception e)
		    {
		    }
		}

		//FIGHT 6 (bronze-oh)
		//Creates a while loop for the turnbased combat.
		while (tutorial == 6 && area == 0)
		{
		    //Player turn
		    if (turn % 2 == 1)
		    {
			//Sets the frame listing the possible attacks visible.
			if (battleframe == 0)
			{
			    //Draws the basic characters and map and shows the attacks
			    initialDrawing ();
			    battleframe = 10;

			    //Draws Bronze-oh (86x94)
			    c.setColor (bronzeblue);
			    c.fillOval (bronzox, bronzoy, 70, 70);
			    c.setColor (aweBlue);
			    c.fillOval (bronzox + 10, bronzoy + 10, 50, 50);
			    c.fillOval (bronzox - 8, bronzoy + 8, 20, 20);
			    c.fillOval (bronzox - 8, bronzoy + 42, 20, 20);
			    c.fillOval (bronzox + 25, bronzoy - 12, 20, 20);
			    c.fillOval (bronzox + 25, bronzoy + 62, 20, 20);
			    c.fillOval (bronzox + 58, bronzoy + 8, 20, 20);
			    c.fillOval (bronzox + 58, bronzoy + 42, 20, 20);
			    c.setColor (bronzeblue);
			    c.fillOval (bronzox + 25, bronzoy + 25, 20, 20);
			    c.setColor (sodaSpots);
			    c.fillOval (bronzox + 12, bronzoy + 26, 13, 18);
			    c.fillOval (bronzox + 45, bronzoy + 26, 13, 18);
			    c.setColor (Color.black);
			    c.fillOval (bronzox + 16, bronzoy + 30, 5, 10);
			    c.fillOval (bronzox + 49, bronzoy + 30, 5, 10);
			}
			battleframe -= 1; //Used for refreshing the GUI in case of being accidentally closed.
			//Checks the attack chosen and does a specific animation
			attackCheck ();

			//Sees if Bronze-oh dies and sends the player back to the original location
			if (enemyhp <= 0)
			{
			    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
			    AndrewEdwardWaynePocketmans.c.drawString ("Bronze-oh fainted!", 30, 525);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
			    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    AndrewEdwardWaynePocketmans.c.getChar ();

			    area = 11;
			    tutorial = 7;
			    x = 476;
			    y = 386;
			}
		    }

		    //Enemy turn
		    if (turn % 2 == 0 && tutorial == 6)
		    {
			//Refreshes the graphics of the map and combatants
			redrawing ();
			//Draws Bronze-oh (86x94)
			c.setColor (bronzeblue);
			c.fillOval (bronzox, bronzoy, 70, 70);
			c.setColor (aweBlue);
			c.fillOval (bronzox + 10, bronzoy + 10, 50, 50);
			c.fillOval (bronzox - 8, bronzoy + 8, 20, 20);
			c.fillOval (bronzox - 8, bronzoy + 42, 20, 20);
			c.fillOval (bronzox + 25, bronzoy - 12, 20, 20);
			c.fillOval (bronzox + 25, bronzoy + 62, 20, 20);
			c.fillOval (bronzox + 58, bronzoy + 8, 20, 20);
			c.fillOval (bronzox + 58, bronzoy + 42, 20, 20);
			c.setColor (bronzeblue);
			c.fillOval (bronzox + 25, bronzoy + 25, 20, 20);
			c.setColor (sodaSpots);
			c.fillOval (bronzox + 12, bronzoy + 26, 13, 18);
			c.fillOval (bronzox + 45, bronzoy + 26, 13, 18);
			c.setColor (Color.black);
			c.fillOval (bronzox + 16, bronzoy + 30, 5, 10);
			c.fillOval (bronzox + 49, bronzoy + 30, 5, 10);

			//Outputs the enemy's attack
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.setColor (Color.black);
			c.drawString ("Bronze-oh used gyro ball!", 30, 525);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			//Temporarily stops the program until the user inputs a character.
			//Allows the user to continue when ready.
			c.getChar ();

			//Animates the ball
			c.setColor (aweBlue);
			fill = 124;
			for (int i = 710 ; i >= 230 ; i -= 3)
			{
			    c.fillOval (i, fill, 70, 70);
			    fill += 2;
			    for (int j = 0 ; j < 250000 ; j++)
			    {
			    }
			}
			//Changes back to ally turn for turn-based combat
			turn = 1;
			battleframe = 0;
			//Refreshes the map
			new BattleMap ();

			//Takes damage from the attack and sees if player is dead
			if (pokeTeam == 1)
			{
			    new DrawsAwedish ();
			    hp -= 3;
			    if (hp <= 0)
				new Death ();
			}
			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 2)
			{
			    new DrawsSoda ();
			    sodahp -= 3;
			    if (sodahp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Sodawoda fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}
			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 3)
			{
			    new DrawsDweeb ();
			    dweebhp -= 3;
			    if (dweebhp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Dweebble fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}
		    }
		    //Sets battle values and allows for turn-based combat.
		    turn = 1;

		    //Refreshes the graphics
		    redrawing ();
		    //Draws Bronze-oh (86x94)
		    c.setColor (bronzeblue);
		    c.fillOval (bronzox, bronzoy, 70, 70);
		    c.setColor (aweBlue);
		    c.fillOval (bronzox + 10, bronzoy + 10, 50, 50);
		    c.fillOval (bronzox - 8, bronzoy + 8, 20, 20);
		    c.fillOval (bronzox - 8, bronzoy + 42, 20, 20);
		    c.fillOval (bronzox + 25, bronzoy - 12, 20, 20);
		    c.fillOval (bronzox + 25, bronzoy + 62, 20, 20);
		    c.fillOval (bronzox + 58, bronzoy + 8, 20, 20);
		    c.fillOval (bronzox + 58, bronzoy + 42, 20, 20);
		    c.setColor (bronzeblue);
		    c.fillOval (bronzox + 25, bronzoy + 25, 20, 20);
		    c.setColor (sodaSpots);
		    c.fillOval (bronzox + 12, bronzoy + 26, 13, 18);
		    c.fillOval (bronzox + 45, bronzoy + 26, 13, 18);
		    c.setColor (Color.black);
		    c.fillOval (bronzox + 16, bronzoy + 30, 5, 10);
		    c.fillOval (bronzox + 49, bronzoy + 30, 5, 10);

		    //Delay to reduce flicker
		    try
		    {
			Thread.sleep (50);
		    }
		    catch (Exception e)
		    {
		    }
		}

		//Triple fight (GYM BATTLE) Tyler1 first
		//Creates a while loop for the turnbased combat.
		while (tutorial == 7 && area == 0)
		{
		    //Player turn
		    if (turn % 2 == 1)
		    {
			//Sets the frame listing the possible attacks visible.
			if (battleframe == 0)
			{
			    //Draws the basic characters and map and shows the attacks
			    initialDrawing ();
			    battleframe = 10;

			    //Draws Tyler1 (140x82)
			    c.setColor (geobrown);
			    c.fillOval (geodudex, geodudey, 60, 60);
			    c.fillRect (geodudex - 30, geodudey + 20, 40, 20);
			    c.fillRect (geodudex + 50, geodudey + 20, 40, 20);
			    c.fillOval (geodudex - 18, geodudey + 10, 20, 20);
			    c.fillOval (geodudex + 58, geodudey + 10, 20, 20);
			    c.fillRect (geodudex - 40, geodudey - 10, 20, 50);
			    c.fillRect (geodudex + 80, geodudey - 10, 20, 50);
			    c.fillRect (geodudex + 35, geodudey, 15, 15);
			    c.fillRect (geodudex + 13, geodudey + 47, 15, 15);
			    c.fillOval (geodudex - 40, geodudey - 20, 20, 20);
			    c.fillOval (geodudex + 80, geodudey - 20, 20, 20);
			    c.setColor (Color.white);
			    c.fillArc (geodudex + 7, geodudey + 20, 16, 16, 0, 180);
			    c.fillArc (geodudex + 37, geodudey + 20, 16, 16, 0, 180);
			    c.setColor (Color.black);
			    c.fillOval (geodudex + 12, geodudey + 24, 6, 6);
			    c.fillOval (geodudex + 42, geodudey + 24, 6, 6);
			    c.drawLine (geodudex - 34, geodudey - 20, geodudex - 34, geodudey - 10);
			    c.drawLine (geodudex - 26, geodudey - 20, geodudex - 26, geodudey - 10);
			    c.drawLine (geodudex + 86, geodudey - 20, geodudex + 86, geodudey - 10);
			    c.drawLine (geodudex + 94, geodudey - 20, geodudex + 94, geodudey - 10);
			    c.drawArc (geodudex + 20, geodudey + 39, 20, 10, 0, 180);
			}
			battleframe -= 1; //Used for refreshing the GUI in case of being accidentally closed.
			//Checks the attack chosen and does a specific animation
			attackCheck ();

			//Sees if Tyler1 dies and sends the player into the next battle
			if (enemyhp <= 0)
			{
			    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
			    AndrewEdwardWaynePocketmans.c.drawString ("Tyler1 fainted!", 30, 525);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
			    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    AndrewEdwardWaynePocketmans.c.getChar ();
			    tutorial = 8;
			    turn = 1;
			    battleframe = 10;
			    enemyhp = 9;
			    enemymaxhp = 9;
			    enemyPoke = "Licky";
			    events = 1;
			}
		    }

		    //Enemy turn
		    if (turn % 2 == 0 && tutorial == 7)
		    {
			//Refreshes the graphics of the map and combatants
			redrawing ();
			//Draws Tyler1 (140x82)
			c.setColor (geobrown);
			c.fillOval (geodudex, geodudey, 60, 60);
			c.fillRect (geodudex - 30, geodudey + 20, 40, 20);
			c.fillRect (geodudex + 50, geodudey + 20, 40, 20);
			c.fillOval (geodudex - 18, geodudey + 10, 20, 20);
			c.fillOval (geodudex + 58, geodudey + 10, 20, 20);
			c.fillRect (geodudex - 40, geodudey - 10, 20, 50);
			c.fillRect (geodudex + 80, geodudey - 10, 20, 50);
			c.fillRect (geodudex + 35, geodudey, 15, 15);
			c.fillRect (geodudex + 13, geodudey + 47, 15, 15);
			c.fillOval (geodudex - 40, geodudey - 20, 20, 20);
			c.fillOval (geodudex + 80, geodudey - 20, 20, 20);
			c.setColor (Color.white);
			c.fillArc (geodudex + 7, geodudey + 20, 16, 16, 0, 180);
			c.fillArc (geodudex + 37, geodudey + 20, 16, 16, 0, 180);
			c.setColor (Color.black);
			c.fillOval (geodudex + 12, geodudey + 24, 6, 6);
			c.fillOval (geodudex + 42, geodudey + 24, 6, 6);
			c.drawLine (geodudex - 34, geodudey - 20, geodudex - 34, geodudey - 10);
			c.drawLine (geodudex - 26, geodudey - 20, geodudex - 26, geodudey - 10);
			c.drawLine (geodudex + 86, geodudey - 20, geodudex + 86, geodudey - 10);
			c.drawLine (geodudex + 94, geodudey - 20, geodudex + 94, geodudey - 10);
			c.drawArc (geodudex + 20, geodudey + 39, 20, 10, 0, 180);

			//Checks the event and does a specific attack pattern
			//Tyler1 scream contents
			if (events % 2 == 0)
			{
			    //Outputs the enemy's attack
			    c.setColor (hudBrown);
			    c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("Tyler1 used scream loudly!", 30, 525);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();

			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("It had no effect!", 30, 525);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    c.getChar ();
			}
			//Tyler1 headbang contents
			else
			{
			    //Outputs the enemy's attack
			    c.setColor (hudBrown);
			    c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.setColor (Color.black);
			    c.drawString ("Tyler1 used headbang!", 30, 525);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    c.getChar ();

			    //Animates the movement Part 1
			    for (int i = geodudex ; i >= 230 ; i -= 3)
			    {
				//Draws Tyler1 (140x82)
				c.setColor (geobrown);
				c.fillOval (geodudex, geodudey, 60, 60);
				c.fillRect (geodudex - 30, geodudey + 20, 40, 20);
				c.fillRect (geodudex + 50, geodudey + 20, 40, 20);
				c.fillOval (geodudex - 18, geodudey + 10, 20, 20);
				c.fillOval (geodudex + 58, geodudey + 10, 20, 20);
				c.fillRect (geodudex - 40, geodudey - 10, 20, 50);
				c.fillRect (geodudex + 80, geodudey - 10, 20, 50);
				c.fillRect (geodudex + 35, geodudey, 15, 15);
				c.fillRect (geodudex + 13, geodudey + 47, 15, 15);
				c.fillOval (geodudex - 40, geodudey - 20, 20, 20);
				c.fillOval (geodudex + 80, geodudey - 20, 20, 20);
				c.setColor (Color.white);
				c.fillArc (geodudex + 7, geodudey + 20, 16, 16, 0, 180);
				c.fillArc (geodudex + 37, geodudey + 20, 16, 16, 0, 180);
				c.setColor (Color.black);
				c.fillOval (geodudex + 12, geodudey + 24, 6, 6);
				c.fillOval (geodudex + 42, geodudey + 24, 6, 6);
				c.drawLine (geodudex - 34, geodudey - 20, geodudex - 34, geodudey - 10);
				c.drawLine (geodudex - 26, geodudey - 20, geodudex - 26, geodudey - 10);
				c.drawLine (geodudex + 86, geodudey - 20, geodudex + 86, geodudey - 10);
				c.drawLine (geodudex + 94, geodudey - 20, geodudex + 94, geodudey - 10);
				c.drawArc (geodudex + 20, geodudey + 39, 20, 10, 0, 180);
				geodudex -= 3;
				geodudey += 2;
				for (int j = 0 ; j < 250000 ; j++)
				{
				}
			    }

			    //Refreshes the map
			    new BattleMap ();
			    //Takes damage from the attack and sees if player is dead
			    if (pokeTeam == 1)
			    {
				new DrawsAwedish ();
				hp -= 3;
				if (hp <= 0)
				    new Death ();
			    }
			    //Takes damage from the attack and sees if the assistant pocketman has fainted
			    //Swaps back to Awedish(main pocketman)
			    if (pokeTeam == 2)
			    {
				new DrawsSoda ();
				sodahp -= 3;
				if (sodahp <= 0)
				{
				    pokeTeam = 1;
				    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				    AndrewEdwardWaynePocketmans.c.drawString ("Sodawoda fainted!", 30, 525);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				    AndrewEdwardWaynePocketmans.c.getChar ();
				    teamPoke = "Awedish";
				}
			    }
			    //Takes damage from the attack and sees if the assistant pocketman has fainted
			    //Swaps back to Awedish(main pocketman)
			    if (pokeTeam == 3)
			    {
				new DrawsDweeb ();
				dweebhp -= 3;
				if (dweebhp <= 0)
				{
				    pokeTeam = 1;
				    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				    AndrewEdwardWaynePocketmans.c.drawString ("Dweebble fainted!", 30, 525);
				    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				    AndrewEdwardWaynePocketmans.c.getChar ();
				    teamPoke = "Awedish";
				}
			    }

			    //Animates the movement Part 2
			    for (int i = geodudex ; i <= 750 ; i += 3)
			    {
				//Draws Tyler1 (140x82)
				c.setColor (geobrown);
				c.fillOval (geodudex, geodudey, 60, 60);
				c.fillRect (geodudex - 30, geodudey + 20, 40, 20);
				c.fillRect (geodudex + 50, geodudey + 20, 40, 20);
				c.fillOval (geodudex - 18, geodudey + 10, 20, 20);
				c.fillOval (geodudex + 58, geodudey + 10, 20, 20);
				c.fillRect (geodudex - 40, geodudey - 10, 20, 50);
				c.fillRect (geodudex + 80, geodudey - 10, 20, 50);
				c.fillRect (geodudex + 35, geodudey, 15, 15);
				c.fillRect (geodudex + 13, geodudey + 47, 15, 15);
				c.fillOval (geodudex - 40, geodudey - 20, 20, 20);
				c.fillOval (geodudex + 80, geodudey - 20, 20, 20);
				c.setColor (Color.white);
				c.fillArc (geodudex + 7, geodudey + 20, 16, 16, 0, 180);
				c.fillArc (geodudex + 37, geodudey + 20, 16, 16, 0, 180);
				c.setColor (Color.black);
				c.fillOval (geodudex + 12, geodudey + 24, 6, 6);
				c.fillOval (geodudex + 42, geodudey + 24, 6, 6);
				c.drawLine (geodudex - 34, geodudey - 20, geodudex - 34, geodudey - 10);
				c.drawLine (geodudex - 26, geodudey - 20, geodudex - 26, geodudey - 10);
				c.drawLine (geodudex + 86, geodudey - 20, geodudex + 86, geodudey - 10);
				c.drawLine (geodudex + 94, geodudey - 20, geodudex + 94, geodudey - 10);
				c.drawArc (geodudex + 20, geodudey + 39, 20, 10, 0, 180);
				geodudex += 3;
				geodudey -= 2;
				for (int j = 0 ; j < 250000 ; j++)
				{
				}
			    }
			}
			//Sets battle values and allows for turn-based combat.
			events += 1;
			turn = 1;
			battleframe = 0;
		    }

		    //Delay to reduce flicker
		    try
		    {
			Thread.sleep (50);
		    }
		    catch (Exception e)
		    {
		    }
		}

		//Triple fight (GYM BATTLE) Lickylacky
		//Creates a while loop for the turnbased combat.
		while (tutorial == 8 && area == 0)
		{
		    //Player turn
		    if (turn % 2 == 1)
		    {
			//Sets the frame listing the possible attacks visible.
			if (battleframe == 0)
			{
			    initialDrawing ();
			    battleframe = 10;

			    //Draws Lickylacky (140x145)
			    c.setColor (lickpink);
			    c.fillOval (lickyx, lickyy, 100, 100);
			    c.fillOval (lickyx + 25, lickyy - 30, 50, 50);
			    c.fillOval (lickyx - 20, lickyy + 30, 40, 20);
			    c.fillOval (lickyx + 80, lickyy + 30, 40, 20);
			    c.fillOval (lickyx + 10, lickyy + 85, 30, 30);
			    c.fillOval (lickyx + 60, lickyy + 85, 30, 30);
			    c.setColor (sodaSpots);
			    c.drawArc (lickyx + 30, lickyy + 60, 40, 30, -20, -140);
			    c.drawArc (lickyx + 33, lickyy + 50, 34, 30, -30, -120);
			    c.drawArc (lickyx + 36, lickyy + 40, 28, 30, -40, -100);
			    c.setColor (lickypink);
			    c.fillRect (lickyx + 40, lickyy - 5, 20, 50);
			    c.fillOval (lickyx + 40, lickyy + 35, 20, 20);
			    c.setColor (Color.black);
			    c.fillOval (lickyx + 35, lickyy - 21, 10, 10);
			    c.fillOval (lickyx + 55, lickyy - 21, 10, 10);
			    c.drawLine (lickyx + 40, lickyy - 5, lickyx + 60, lickyy - 5);
			    c.drawArc (lickyx + 30, lickyy - 10, 10, 10, 90, -180);
			    c.drawArc (lickyx + 60, lickyy - 10, 10, 10, 90, 180);
			    c.setColor (Color.white);
			    c.fillOval (lickyx + 38, lickyy - 19, 4, 4);
			    c.fillOval (lickyx + 58, lickyy - 19, 4, 4);
			}
			battleframe -= 1; //Used for refreshing the GUI in case of being accidentally closed.

			attackCheck ();
			//Checks the attack chosen and does a specific animation

			//Sees if Licky dies and sends the player into the next battle
			if (enemyhp <= 0)
			{
			    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
			    AndrewEdwardWaynePocketmans.c.drawString ("Licky fainted!", 30, 525);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
			    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    AndrewEdwardWaynePocketmans.c.getChar ();
			    tutorial = 9;
			    turn = 1;
			    battleframe = 10;
			    enemyhp = 17;
			    enemymaxhp = 17;
			    enemyPoke = "Polygon";
			    events = 1;
			}
		    }

		    //Enemy turn
		    if (turn % 2 == 0 && tutorial == 8)
		    {
			//Refreshes the graphics of the map and combatants
			redrawing ();
			//Draws Lickylacky (140x145)
			c.setColor (lickpink);
			c.fillOval (lickyx, lickyy, 100, 100);
			c.fillOval (lickyx + 25, lickyy - 30, 50, 50);
			c.fillOval (lickyx - 20, lickyy + 30, 40, 20);
			c.fillOval (lickyx + 80, lickyy + 30, 40, 20);
			c.fillOval (lickyx + 10, lickyy + 85, 30, 30);
			c.fillOval (lickyx + 60, lickyy + 85, 30, 30);
			c.setColor (sodaSpots);
			c.drawArc (lickyx + 30, lickyy + 60, 40, 30, -20, -140);
			c.drawArc (lickyx + 33, lickyy + 50, 34, 30, -30, -120);
			c.drawArc (lickyx + 36, lickyy + 40, 28, 30, -40, -100);
			c.setColor (lickypink);
			c.fillRect (lickyx + 40, lickyy - 5, 20, 50);
			c.fillOval (lickyx + 40, lickyy + 35, 20, 20);
			c.setColor (Color.black);
			c.fillOval (lickyx + 35, lickyy - 21, 10, 10);
			c.fillOval (lickyx + 55, lickyy - 21, 10, 10);
			c.drawLine (lickyx + 40, lickyy - 5, lickyx + 60, lickyy - 5);
			c.drawArc (lickyx + 30, lickyy - 10, 10, 10, 90, -180);
			c.drawArc (lickyx + 60, lickyy - 10, 10, 10, 90, 180);
			c.setColor (Color.white);
			c.fillOval (lickyx + 38, lickyy - 19, 4, 4);
			c.fillOval (lickyx + 58, lickyy - 19, 4, 4);

			//Outputs the enemy's attack
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.setColor (Color.black);
			c.drawString ("Licky used clap!", 30, 525);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			c.getChar ();

			//Animates the clap
			c.setColor (lickpink);
			fill = 366;
			for (int i = 166 ; i <= 266 ; i += 2)
			{
			    c.fillRect (i, 420, 30, 70);
			    c.fillRect (fill, 420, 30, 70);
			    fill -= 2;
			    for (int j = 0 ; j < 2500000 ; j++)
			    {
			    }
			}
			//Sets the turn to the ally's for turn-based combat
			turn = 1;
			battleframe = 0;

			//Refreshes the map
			new BattleMap ();
			//Takes damage from the attack and sees if player is dead
			if (pokeTeam == 1)
			{
			    new DrawsAwedish ();
			    hp -= 3;
			    if (hp <= 0)
				new Death ();
			}
			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 2)
			{
			    new DrawsSoda ();
			    sodahp -= 3;
			    if (sodahp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Sodawoda fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}
			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 3)
			{
			    new DrawsDweeb ();
			    dweebhp -= 3;
			    if (dweebhp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Dweebble fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}
			//Draws Lickylacky (140x145)
			c.setColor (lickpink);
			c.fillOval (lickyx, lickyy, 100, 100);
			c.fillOval (lickyx + 25, lickyy - 30, 50, 50);
			c.fillOval (lickyx - 20, lickyy + 30, 40, 20);
			c.fillOval (lickyx + 80, lickyy + 30, 40, 20);
			c.fillOval (lickyx + 10, lickyy + 85, 30, 30);
			c.fillOval (lickyx + 60, lickyy + 85, 30, 30);
			c.setColor (sodaSpots);
			c.drawArc (lickyx + 30, lickyy + 60, 40, 30, -20, -140);
			c.drawArc (lickyx + 33, lickyy + 50, 34, 30, -30, -120);
			c.drawArc (lickyx + 36, lickyy + 40, 28, 30, -40, -100);
			c.setColor (lickypink);
			c.fillRect (lickyx + 40, lickyy - 5, 20, 50);
			c.fillOval (lickyx + 40, lickyy + 35, 20, 20);
			c.setColor (Color.black);
			c.fillOval (lickyx + 35, lickyy - 21, 10, 10);
			c.fillOval (lickyx + 55, lickyy - 21, 10, 10);
			c.drawLine (lickyx + 40, lickyy - 5, lickyx + 60, lickyy - 5);
			c.drawArc (lickyx + 30, lickyy - 10, 10, 10, 90, -180);
			c.drawArc (lickyx + 60, lickyy - 10, 10, 10, 90, 180);
			c.setColor (Color.white);
			c.fillOval (lickyx + 38, lickyy - 19, 4, 4);
			c.fillOval (lickyx + 58, lickyy - 19, 4, 4);
		    }
		    //Sets the turn for turn-based combat
		    turn = 1;
		    //Refreshes the graphics
		    redrawing ();

		    //Draws Lickylacky (140x145)
		    c.setColor (lickpink);
		    c.fillOval (lickyx, lickyy, 100, 100);
		    c.fillOval (lickyx + 25, lickyy - 30, 50, 50);
		    c.fillOval (lickyx - 20, lickyy + 30, 40, 20);
		    c.fillOval (lickyx + 80, lickyy + 30, 40, 20);
		    c.fillOval (lickyx + 10, lickyy + 85, 30, 30);
		    c.fillOval (lickyx + 60, lickyy + 85, 30, 30);
		    c.setColor (sodaSpots);
		    c.drawArc (lickyx + 30, lickyy + 60, 40, 30, -20, -140);
		    c.drawArc (lickyx + 33, lickyy + 50, 34, 30, -30, -120);
		    c.drawArc (lickyx + 36, lickyy + 40, 28, 30, -40, -100);
		    c.setColor (lickypink);
		    c.fillRect (lickyx + 40, lickyy - 5, 20, 50);
		    c.fillOval (lickyx + 40, lickyy + 35, 20, 20);
		    c.setColor (Color.black);
		    c.fillOval (lickyx + 35, lickyy - 21, 10, 10);
		    c.fillOval (lickyx + 55, lickyy - 21, 10, 10);
		    c.drawLine (lickyx + 40, lickyy - 5, lickyx + 60, lickyy - 5);
		    c.drawArc (lickyx + 30, lickyy - 10, 10, 10, 90, -180);
		    c.drawArc (lickyx + 60, lickyy - 10, 10, 10, 90, 180);
		    c.setColor (Color.white);
		    c.fillOval (lickyx + 38, lickyy - 19, 4, 4);
		    c.fillOval (lickyx + 58, lickyy - 19, 4, 4);

		    //Delay to reduce flicker
		    try
		    {
			Thread.sleep (50);
		    }
		    catch (Exception e)
		    {
		    }
		}

		//Triple fight (GYM BATTLE) Polygon
		//Creates a while loop for the turnbased combat.
		while (tutorial == 9 && area == 0)
		{
		    //Player turn
		    if (turn % 2 == 1)
		    {
			//Sets the frame listing the possible attacks visible.
			if (battleframe == 0)
			{
			    //Draws the basic characters and map and shows the attacks
			    initialDrawing ();
			    battleframe = 10;

			    //Draws Polygon (110x95)
			    c.setColor (bronzeblue);
			    c.fillOval (polygx + 50, polygy + 40, 60, 35);
			    c.setColor (polyblue);
			    c.fillOval (polygx, polygy, 80, 80);
			    c.fillOval (polygx + 5, polygy + 45, 30, 50);
			    c.fillOval (polygx + 45, polygy + 45, 30, 50);
			    c.fillRect (polygx + 50, polygy + 54, 50, 8);
			    c.setColor (Color.white);
			    c.fillOval (polygx + 15, polygy + 10, 15, 20);
			    c.fillOval (polygx + 50, polygy + 10, 15, 20);
			    c.fillOval (polygx + 20, polygy + 35, 40, 40);
			    c.setColor (Color.pink);
			    c.fillOval (polygx + 30, polygy + 28, 20, 15);
			    c.setColor (Color.black);
			    c.drawLine (polygx + 35, polygy + 35, polygx + 44, polygy + 35);
			    c.fillOval (polygx + 21, polygy + 12, 10, 15);
			    c.fillOval (polygx + 49, polygy + 12, 10, 15);
			    c.drawOval (polygx + 25, polygy + 40, 30, 30);
			    c.drawOval (polygx + 30, polygy + 45, 20, 20);
			    c.drawOval (polygx + 35, polygy + 50, 10, 10);
			}
			battleframe -= 1; //Used for refreshing the GUI in case of being accidentally closed.
			//Checks the attack chosen and does a specific animation
			attackCheck ();

			//Sees if Polygon dies and sends the player back the original location
			if (enemyhp <= 0)
			{
			    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
			    AndrewEdwardWaynePocketmans.c.drawString ("Polygon fainted!", 30, 525);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
			    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    AndrewEdwardWaynePocketmans.c.getChar ();
			    area = 12;
			    tutorial = 10;
			    x = 472;
			    y = 356;

			    //The player is rewarded and healed to full health
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
			    AndrewEdwardWaynePocketmans.c.drawString ("As a reward for beating the gym, your pocketmans have been restored to full HP.", 30, 525);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
			    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    AndrewEdwardWaynePocketmans.c.getChar ();
			    //Recovers health
			    hp = maxhp;
			    dweebhp = dweebmaxhp;
			    sodahp = sodamaxhp;
			}
		    }

		    //Enemy turn
		    if (turn % 2 == 0 && tutorial == 9)
		    {
			//Refreshes the graphics of the map and combatants
			redrawing ();
			//Draws Polygon (110x95)
			c.setColor (bronzeblue);
			c.fillOval (polygx + 50, polygy + 40, 60, 35);
			c.setColor (polyblue);
			c.fillOval (polygx, polygy, 80, 80);
			c.fillOval (polygx + 5, polygy + 45, 30, 50);
			c.fillOval (polygx + 45, polygy + 45, 30, 50);
			c.fillRect (polygx + 50, polygy + 54, 50, 8);
			c.setColor (Color.white);
			c.fillOval (polygx + 15, polygy + 10, 15, 20);
			c.fillOval (polygx + 50, polygy + 10, 15, 20);
			c.fillOval (polygx + 20, polygy + 35, 40, 40);
			c.setColor (Color.pink);
			c.fillOval (polygx + 30, polygy + 28, 20, 15);
			c.setColor (Color.black);
			c.drawLine (polygx + 35, polygy + 35, polygx + 44, polygy + 35);
			c.fillOval (polygx + 21, polygy + 12, 10, 15);
			c.fillOval (polygx + 49, polygy + 12, 10, 15);
			c.drawOval (polygx + 25, polygy + 40, 30, 30);
			c.drawOval (polygx + 30, polygy + 45, 20, 20);
			c.drawOval (polygx + 35, polygy + 50, 10, 10);

			//Outputs the enemy's attack
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.setColor (Color.black);
			c.drawString ("Polygon used Hypnosis!", 30, 525);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			//Temporarily stops the program until the user inputs a character.
			//Allows the user to continue when ready.
			c.getChar ();

			//Animates the swirl
			c.setColor (aweBlue);
			for (int i = 0 ; i <= 1080 ; i += 2)
			{
			    //Refreshes the graphics
			    redrawing ();
			    //Draws Polygon (110x95)
			    c.setColor (bronzeblue);
			    c.fillOval (polygx + 50, polygy + 40, 60, 35);
			    c.setColor (polyblue);
			    c.fillOval (polygx, polygy, 80, 80);
			    c.fillOval (polygx + 5, polygy + 45, 30, 50);
			    c.fillOval (polygx + 45, polygy + 45, 30, 50);
			    c.fillRect (polygx + 50, polygy + 54, 50, 8);
			    c.setColor (Color.white);
			    c.fillOval (polygx + 15, polygy + 10, 15, 20);
			    c.fillOval (polygx + 50, polygy + 10, 15, 20);
			    c.fillOval (polygx + 20, polygy + 35, 40, 40);
			    c.setColor (Color.pink);
			    c.fillOval (polygx + 30, polygy + 28, 20, 15);
			    c.setColor (Color.black);
			    c.drawLine (polygx + 35, polygy + 35, polygx + 44, polygy + 35);
			    c.fillOval (polygx + 21, polygy + 12, 10, 15);
			    c.fillOval (polygx + 49, polygy + 12, 10, 15);
			    c.drawOval (polygx + 25, polygy + 40, 30, 30);
			    c.drawOval (polygx + 30, polygy + 45, 20, 20);
			    c.drawOval (polygx + 35, polygy + 50, 10, 10);
			    //The attack
			    c.fillArc (200, 400, 150, 150, i, 60);
			    c.fillArc (200, 400, 150, 150, i + 120, 60);
			    c.fillArc (200, 400, 150, 150, i + 240, 60);
			    for (int j = 0 ; j < 90000 ; j++)
			    {
			    }
			}
			//Sets the turn to the ally's for turn-based combat
			turn = 1;
			battleframe = 0;

			//Refreshes the map
			new BattleMap ();
			//Takes damage from the attack and sees if player is dead
			if (pokeTeam == 1)
			{
			    new DrawsAwedish ();
			    hp -= 3;
			    if (hp <= 0)
				new Death ();
			}
			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 2)
			{
			    new DrawsSoda ();
			    sodahp -= 3;
			    if (sodahp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Sodawoda fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}
			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 3)
			{
			    new DrawsDweeb ();
			    dweebhp -= 3;
			    if (dweebhp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Dweebble fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}
		    }
		    //Sets the turn for turn-based combat
		    turn = 1;

		    //Refreshes the graphics
		    redrawing ();
		    //Draws Polygon (110x95)
		    c.setColor (bronzeblue);
		    c.fillOval (polygx + 50, polygy + 40, 60, 35);
		    c.setColor (polyblue);
		    c.fillOval (polygx, polygy, 80, 80);
		    c.fillOval (polygx + 5, polygy + 45, 30, 50);
		    c.fillOval (polygx + 45, polygy + 45, 30, 50);
		    c.fillRect (polygx + 50, polygy + 54, 50, 8);
		    c.setColor (Color.white);
		    c.fillOval (polygx + 15, polygy + 10, 15, 20);
		    c.fillOval (polygx + 50, polygy + 10, 15, 20);
		    c.fillOval (polygx + 20, polygy + 35, 40, 40);
		    c.setColor (Color.pink);
		    c.fillOval (polygx + 30, polygy + 28, 20, 15);
		    c.setColor (Color.black);
		    c.drawLine (polygx + 35, polygy + 35, polygx + 44, polygy + 35);
		    c.fillOval (polygx + 21, polygy + 12, 10, 15);
		    c.fillOval (polygx + 49, polygy + 12, 10, 15);
		    c.drawOval (polygx + 25, polygy + 40, 30, 30);
		    c.drawOval (polygx + 30, polygy + 45, 20, 20);
		    c.drawOval (polygx + 35, polygy + 50, 10, 10);

		    //Delay to reduce flicker
		    try
		    {
			Thread.sleep (50);
		    }
		    catch (Exception e)
		    {
		    }
		}

		//FIGHT 10 (SNOOZELAX)
		//Creates a while loop for the turnbased combat.
		while (tutorial == 10 && area == 0)
		{
		    //Player turn
		    if (turn % 2 == 1)
		    {
			//Sets the frame listing the possible attacks visible.
			if (battleframe == 0)
			{
			    //Draws the basic characters and map and shows the attacks
			    initialDrawing ();
			    battleframe = 10;

			    //Draws Snoozelax (140x140)
			    c.setColor (aweBlue);
			    c.fillOval (snorlaxx, snorlaxy, 100, 100);
			    c.fillOval (snorlaxx + 25, snorlaxy - 30, 50, 50);
			    c.fillOval (snorlaxx + 30, snorlaxy - 35, 20, 30);
			    c.fillOval (snorlaxx + 50, snorlaxy - 35, 20, 30);
			    c.fillOval (snorlaxx - 20, snorlaxy + 25, 35, 20);
			    c.fillOval (snorlaxx + 85, snorlaxy + 25, 35, 20);
			    c.setColor (snorbody);
			    c.fillOval (snorlaxx + 10, snorlaxy + 10, 80, 80);
			    c.fillOval (snorlaxx + 32, snorlaxy - 20, 36, 36);
			    c.fillOval (snorlaxx + 10, snorlaxy + 75, 30, 30);
			    c.fillOval (snorlaxx + 60, snorlaxy + 75, 30, 30);
			    c.setColor (Color.black);
			    c.drawLine (snorlaxx + 38, snorlaxy - 10, snorlaxx + 46, snorlaxy - 10);
			    c.drawLine (snorlaxx + 54, snorlaxy - 10, snorlaxx + 62, snorlaxy - 10);
			    c.drawArc (snorlaxx + 42, snorlaxy - 5, 16, 10, -25, -130);
			}
			battleframe -= 1; //Used for refreshing the GUI in case of being accidentally closed.
			//Checks the attack chosen and does a specific animation
			attackCheck ();

			//Sees if Snorlax dies and sends the player back to the original location
			if (enemyhp <= 0)
			{
			    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
			    AndrewEdwardWaynePocketmans.c.drawString ("Snoozelax fainted!", 30, 525);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
			    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    AndrewEdwardWaynePocketmans.c.getChar ();
			    area = 13;
			    tutorial = 11;
			    x = 472; //Send them back to where they encountered snoozelax
			    y = 358;
			}
		    }

		    //Enemy turn
		    if (turn % 2 == 0 && tutorial == 10)
		    {
			//Refreshes the graphics of the map and combatants
			redrawing ();
			//Draws Snoozelax (140x140)
			c.setColor (aweBlue);
			c.fillOval (snorlaxx, snorlaxy, 100, 100);
			c.fillOval (snorlaxx + 25, snorlaxy - 30, 50, 50);
			c.fillOval (snorlaxx + 30, snorlaxy - 35, 20, 30);
			c.fillOval (snorlaxx + 50, snorlaxy - 35, 20, 30);
			c.fillOval (snorlaxx - 20, snorlaxy + 25, 35, 20);
			c.fillOval (snorlaxx + 85, snorlaxy + 25, 35, 20);
			c.setColor (snorbody);
			c.fillOval (snorlaxx + 10, snorlaxy + 10, 80, 80);
			c.fillOval (snorlaxx + 32, snorlaxy - 20, 36, 36);
			c.fillOval (snorlaxx + 10, snorlaxy + 75, 30, 30);
			c.fillOval (snorlaxx + 60, snorlaxy + 75, 30, 30);
			c.setColor (Color.black);
			c.drawLine (snorlaxx + 38, snorlaxy - 10, snorlaxx + 46, snorlaxy - 10);
			c.drawLine (snorlaxx + 54, snorlaxy - 10, snorlaxx + 62, snorlaxy - 10);
			c.drawArc (snorlaxx + 42, snorlaxy - 5, 16, 10, -25, -130);

			//Outputs the enemy's attack
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.setColor (Color.black);
			c.drawString ("Snoozelax used Body slam!", 30, 525);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			c.getChar ();

			//Animates the jump
			for (int i = 0 ; i < 300 ; i += 2)
			{
			    //Refreshes the graphics
			    redrawing ();
			    //Draws Snoozelax (140x140)
			    c.setColor (aweBlue);
			    c.fillOval (snorlaxx, snorlaxy, 100, 100);
			    c.fillOval (snorlaxx + 25, snorlaxy - 30, 50, 50);
			    c.fillOval (snorlaxx + 30, snorlaxy - 35, 20, 30);
			    c.fillOval (snorlaxx + 50, snorlaxy - 35, 20, 30);
			    c.fillOval (snorlaxx - 20, snorlaxy + 25, 35, 20);
			    c.fillOval (snorlaxx + 85, snorlaxy + 25, 35, 20);
			    c.setColor (snorbody);
			    c.fillOval (snorlaxx + 10, snorlaxy + 10, 80, 80);
			    c.fillOval (snorlaxx + 32, snorlaxy - 20, 36, 36);
			    c.fillOval (snorlaxx + 10, snorlaxy + 75, 30, 30);
			    c.fillOval (snorlaxx + 60, snorlaxy + 75, 30, 30);
			    c.setColor (Color.black);
			    c.drawLine (snorlaxx + 38, snorlaxy - 10, snorlaxx + 46, snorlaxy - 10);
			    c.drawLine (snorlaxx + 54, snorlaxy - 10, snorlaxx + 62, snorlaxy - 10);
			    c.drawArc (snorlaxx + 42, snorlaxy - 5, 16, 10, -25, -130);
			    snorlaxy -= 2;
			    for (int j = 0 ; j < 90000 ; j++)
			    {
			    }
			}
			snorlaxx = 195;
			for (int i = 0 ; i < 600 ; i += 2)
			{
			    //Refreshes the graphics
			    redrawing ();
			    //Draws Snoozelax (140x140)
			    c.setColor (aweBlue);
			    c.fillOval (snorlaxx, snorlaxy, 100, 100);
			    c.fillOval (snorlaxx + 25, snorlaxy - 30, 50, 50);
			    c.fillOval (snorlaxx + 30, snorlaxy - 35, 20, 30);
			    c.fillOval (snorlaxx + 50, snorlaxy - 35, 20, 30);
			    c.fillOval (snorlaxx - 20, snorlaxy + 25, 35, 20);
			    c.fillOval (snorlaxx + 85, snorlaxy + 25, 35, 20);
			    c.setColor (snorbody);
			    c.fillOval (snorlaxx + 10, snorlaxy + 10, 80, 80);
			    c.fillOval (snorlaxx + 32, snorlaxy - 20, 36, 36);
			    c.fillOval (snorlaxx + 10, snorlaxy + 75, 30, 30);
			    c.fillOval (snorlaxx + 60, snorlaxy + 75, 30, 30);
			    c.setColor (Color.black);
			    c.drawLine (snorlaxx + 38, snorlaxy - 10, snorlaxx + 46, snorlaxy - 10);
			    c.drawLine (snorlaxx + 54, snorlaxy - 10, snorlaxx + 62, snorlaxy - 10);
			    c.drawArc (snorlaxx + 42, snorlaxy - 5, 16, 10, -25, -130);
			    snorlaxy += 2;
			    for (int j = 0 ; j < 90000 ; j++)
			    {
			    }
			}
			//Refreshes the map
			new BattleMap ();

			//Takes damage from the attack and sees if player is dead
			if (pokeTeam == 1)
			{
			    new DrawsAwedish ();
			    hp -= 3;
			    if (hp <= 0)
				new Death ();
			}
			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 2)
			{
			    new DrawsSoda ();
			    sodahp -= 3;
			    if (sodahp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Sodawoda fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}
			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 3)
			{
			    new DrawsDweeb ();
			    dweebhp -= 3;
			    if (dweebhp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Dweebble fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}

			//Part 2 of the attack animation
			for (int i = 0 ; i < 600 ; i += 2)
			{
			    //Refreshes the graphics
			    redrawing ();
			    //Draws Snoozelax (140x140)
			    c.setColor (aweBlue);
			    c.fillOval (snorlaxx, snorlaxy, 100, 100);
			    c.fillOval (snorlaxx + 25, snorlaxy - 30, 50, 50);
			    c.fillOval (snorlaxx + 30, snorlaxy - 35, 20, 30);
			    c.fillOval (snorlaxx + 50, snorlaxy - 35, 20, 30);
			    c.fillOval (snorlaxx - 20, snorlaxy + 25, 35, 20);
			    c.fillOval (snorlaxx + 85, snorlaxy + 25, 35, 20);
			    c.setColor (snorbody);
			    c.fillOval (snorlaxx + 10, snorlaxy + 10, 80, 80);
			    c.fillOval (snorlaxx + 32, snorlaxy - 20, 36, 36);
			    c.fillOval (snorlaxx + 10, snorlaxy + 75, 30, 30);
			    c.fillOval (snorlaxx + 60, snorlaxy + 75, 30, 30);
			    c.setColor (Color.black);
			    c.drawLine (snorlaxx + 38, snorlaxy - 10, snorlaxx + 46, snorlaxy - 10);
			    c.drawLine (snorlaxx + 54, snorlaxy - 10, snorlaxx + 62, snorlaxy - 10);
			    c.drawArc (snorlaxx + 42, snorlaxy - 5, 16, 10, -25, -130);
			    snorlaxy -= 2;
			    for (int j = 0 ; j < 90000 ; j++)
			    {
			    }
			}
			snorlaxx = 700;
			for (int i = 0 ; i < 300 ; i += 2)
			{
			    //Refreshes the graphics
			    redrawing ();
			    //Draws Snoozelax (140x140)
			    c.setColor (aweBlue);
			    c.fillOval (snorlaxx, snorlaxy, 100, 100);
			    c.fillOval (snorlaxx + 25, snorlaxy - 30, 50, 50);
			    c.fillOval (snorlaxx + 30, snorlaxy - 35, 20, 30);
			    c.fillOval (snorlaxx + 50, snorlaxy - 35, 20, 30);
			    c.fillOval (snorlaxx - 20, snorlaxy + 25, 35, 20);
			    c.fillOval (snorlaxx + 85, snorlaxy + 25, 35, 20);
			    c.setColor (snorbody);
			    c.fillOval (snorlaxx + 10, snorlaxy + 10, 80, 80);
			    c.fillOval (snorlaxx + 32, snorlaxy - 20, 36, 36);
			    c.fillOval (snorlaxx + 10, snorlaxy + 75, 30, 30);
			    c.fillOval (snorlaxx + 60, snorlaxy + 75, 30, 30);
			    c.setColor (Color.black);
			    c.drawLine (snorlaxx + 38, snorlaxy - 10, snorlaxx + 46, snorlaxy - 10);
			    c.drawLine (snorlaxx + 54, snorlaxy - 10, snorlaxx + 62, snorlaxy - 10);
			    c.drawArc (snorlaxx + 42, snorlaxy - 5, 16, 10, -25, -130);
			    snorlaxy += 2;
			    for (int j = 0 ; j < 90000 ; j++)
			    {
			    }
			}
			//Sets the turn to the ally's for turn-based combat
			turn = 1;
			battleframe = 0;
		    }
		    //Refreshes the graphics
		    redrawing ();
		    //Draws Snoozelax (140x140)
		    c.setColor (aweBlue);
		    c.fillOval (snorlaxx, snorlaxy, 100, 100);
		    c.fillOval (snorlaxx + 25, snorlaxy - 30, 50, 50);
		    c.fillOval (snorlaxx + 30, snorlaxy - 35, 20, 30);
		    c.fillOval (snorlaxx + 50, snorlaxy - 35, 20, 30);
		    c.fillOval (snorlaxx - 20, snorlaxy + 25, 35, 20);
		    c.fillOval (snorlaxx + 85, snorlaxy + 25, 35, 20);
		    c.setColor (snorbody);
		    c.fillOval (snorlaxx + 10, snorlaxy + 10, 80, 80);
		    c.fillOval (snorlaxx + 32, snorlaxy - 20, 36, 36);
		    c.fillOval (snorlaxx + 10, snorlaxy + 75, 30, 30);
		    c.fillOval (snorlaxx + 60, snorlaxy + 75, 30, 30);
		    c.setColor (Color.black);
		    c.drawLine (snorlaxx + 38, snorlaxy - 10, snorlaxx + 46, snorlaxy - 10);
		    c.drawLine (snorlaxx + 54, snorlaxy - 10, snorlaxx + 62, snorlaxy - 10);
		    c.drawArc (snorlaxx + 42, snorlaxy - 5, 16, 10, -25, -130);

		    //Delay to reduce flicker
		    try
		    {
			Thread.sleep (50);
		    }
		    catch (Exception e)
		    {
		    }
		}

		//Final boss battle
		//Creates a while loop for turn-based combat
		while (tutorial == 11 && area == 0)
		{
		    //Player turn
		    if (turn % 2 == 1)
		    {
			//Sets the frame listing the possible attacks visible.
			if (battleframe == 0)
			{
			    //Draws the basic characters and map and shows the attacks
			    initialDrawing ();
			    battleframe = 10;

			    //Draws Electrump (120x120)
			    c.setColor (Color.red);
			    c.fillArc (voltorbx, voltorby, 120, 120, 0, -180);
			    c.setColor (Color.white);
			    c.fillArc (voltorbx, voltorby, 120, 120, 0, 180);
			    c.fillArc (voltorbx + 35, voltorby + 50, 50, 50, 0, -180);
			    c.setColor (Color.black);
			    c.drawOval (voltorbx, voltorby, 119, 119);
			    c.fillOval (voltorbx + 30, voltorby + 27, 15, 25);
			    c.fillOval (voltorbx + 70, voltorby + 27, 15, 25);
			    c.drawArc (voltorbx + 35, voltorby + 50, 49, 49, 0, -180);
			    c.drawLine (voltorbx + 35, voltorby + 75, voltorbx + 85, voltorby + 75);
			    c.drawLine (voltorbx + 30, voltorby + 15, voltorbx + 45, voltorby + 25);
			    c.drawLine (voltorbx + 70, voltorby + 25, voltorbx + 85, voltorby + 15);
			    c.drawLine (voltorbx + 51, voltorby + 75, voltorbx + 51, voltorby + 97);
			    c.drawLine (voltorbx + 69, voltorby + 75, voltorbx + 69, voltorby + 97);
			}
			battleframe -= 1; //Used for refreshing the GUI in case of being accidentally closed.
			//Checks the attack chosen and does a specific animation
			attackCheck ();

			//Sees if Electrump has to explode and ends the game (player wins)
			if (enemyhp < 200)
			{
			    //Outputs the attack
			    AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.white);
			    AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    AndrewEdwardWaynePocketmans.c.setColor (Color.black);
			    AndrewEdwardWaynePocketmans.c.drawString ("Electrump is using self-destruct!", 30, 525);
			    AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
			    AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
			    //Temporarily stops the program until the user inputs a character.
			    //Allows the user to continue when ready.
			    AndrewEdwardWaynePocketmans.c.getChar ();

			    //Explosion animation
			    c.setColor (Color.red);
			    for (int i = 0 ; i < 2000 ; i += 10)
			    {
				c.fillOval (700 - i / 2, 120 - i / 2, i, i);
				for (int j = 0 ; j < 400000 ; j++)
				{
				}
			    }
			    //Shows the end game screen
			    AndrewEdwardWaynePocketmans.endScreen.setVisible (true);
			    life = 0;
			    //Creates a while loop that stops the HSA Console from continuing
			    while (life == 0)
			    {
			    }
			    area = 17;
			    tutorial = 999;
			    x = 472;
			    y = 244;
			    JOptionPane.showMessageDialog (null,"To play as the amazing Bellossom, you must pay for \nour DLC #5 for only $9999.99!");
			    JOptionPane.showMessageDialog (null,"By the way, you beat the game! Feel free to continue exploring our amazing map.");
			}
		    }
		    //Enemy turn
		    if (turn % 2 == 0 && tutorial == 11)
		    {
			//Refreshes the graphics of the map and combatants
			redrawing ();
			//Draws Electrump (120x120)
			c.setColor (Color.red);
			c.fillArc (voltorbx, voltorby, 120, 120, 0, -180);
			c.setColor (Color.white);
			c.fillArc (voltorbx, voltorby, 120, 120, 0, 180);
			c.fillArc (voltorbx + 35, voltorby + 50, 50, 50, 0, -180);
			c.setColor (Color.black);
			c.drawOval (voltorbx, voltorby, 119, 119);
			c.fillOval (voltorbx + 30, voltorby + 27, 15, 25);
			c.fillOval (voltorbx + 70, voltorby + 27, 15, 25);
			c.drawArc (voltorbx + 35, voltorby + 50, 49, 49, 0, -180);
			c.drawLine (voltorbx + 35, voltorby + 75, voltorbx + 85, voltorby + 75);
			c.drawLine (voltorbx + 30, voltorby + 15, voltorbx + 45, voltorby + 25);
			c.drawLine (voltorbx + 70, voltorby + 25, voltorbx + 85, voltorby + 15);
			c.drawLine (voltorbx + 51, voltorby + 75, voltorbx + 51, voltorby + 97);
			c.drawLine (voltorbx + 69, voltorby + 75, voltorbx + 69, voltorby + 97);

			//Outputs the enemy's attack
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.setColor (Color.black);
			c.drawString ("Electrump used spark!", 30, 525);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			//Temporarily stops the program until the user inputs a character.
			//Allows the user to continue when ready.
			c.getChar ();

			//Animates the circle
			for (int i = 120 ; i > 0 ; i--)
			{
			    c.setColor (Color.red);
			    c.drawOval (270 - i / 2, 450 - i / 2, i, i);
			    for (int j = 0 ; j < 500000 ; j++)
			    {
			    }
			}
			//Sets the turn to the ally's for turn-based combat
			turn = 1;
			battleframe = 0;

			//Refreshes the map
			new BattleMap ();
			//Takes damage from the attack and sees if player is dead
			if (pokeTeam == 1)
			{
			    new DrawsAwedish ();
			    hp -= 4;
			    if (hp <= 0)
				new Death ();
			}
			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 2)
			{
			    new DrawsSoda ();
			    sodahp -= 4;
			    if (sodahp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Sodawoda fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}
			//Takes damage from the attack and sees if the assistant pocketman has fainted
			//Swaps back to Awedish(main pocketman)
			if (pokeTeam == 3)
			{
			    new DrawsDweeb ();
			    dweebhp -= 4;
			    if (dweebhp <= 0)
			    {
				pokeTeam = 1;
				AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.drawString ("Dweebble fainted!", 30, 525);
				AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.battle);
				AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 750, 585);
				AndrewEdwardWaynePocketmans.c.getChar ();
				teamPoke = "Awedish";
			    }
			}
			//Draws Electrump (120x120)
			c.setColor (Color.red);
			c.fillArc (voltorbx, voltorby, 120, 120, 0, -180);
			c.setColor (Color.white);
			c.fillArc (voltorbx, voltorby, 120, 120, 0, 180);
			c.fillArc (voltorbx + 35, voltorby + 50, 50, 50, 0, -180);
			c.setColor (Color.black);
			c.drawOval (voltorbx, voltorby, 119, 119);
			c.fillOval (voltorbx + 30, voltorby + 27, 15, 25);
			c.fillOval (voltorbx + 70, voltorby + 27, 15, 25);
			c.drawArc (voltorbx + 35, voltorby + 50, 49, 49, 0, -180);
			c.drawLine (voltorbx + 35, voltorby + 75, voltorbx + 85, voltorby + 75);
			c.drawLine (voltorbx + 30, voltorby + 15, voltorbx + 45, voltorby + 25);
			c.drawLine (voltorbx + 70, voltorby + 25, voltorbx + 85, voltorby + 15);
			c.drawLine (voltorbx + 51, voltorby + 75, voltorbx + 51, voltorby + 97);
			c.drawLine (voltorbx + 69, voltorby + 75, voltorbx + 69, voltorby + 97);

		    }
		    //Sets the battle variables for turn-based combat
		    events += 1;
		    turn = 1;
		    //Refreshes the graphics
		    redrawing ();
		    //Draws Electrump (120x120)
		    c.setColor (Color.red);
		    c.fillArc (voltorbx, voltorby, 120, 120, 0, -180);
		    c.setColor (Color.white);
		    c.fillArc (voltorbx, voltorby, 120, 120, 0, 180);
		    c.fillArc (voltorbx + 35, voltorby + 50, 50, 50, 0, -180);
		    c.setColor (Color.black);
		    c.drawOval (voltorbx, voltorby, 119, 119);
		    c.fillOval (voltorbx + 30, voltorby + 27, 15, 25);
		    c.fillOval (voltorbx + 70, voltorby + 27, 15, 25);
		    c.drawArc (voltorbx + 35, voltorby + 50, 49, 49, 0, -180);
		    c.drawLine (voltorbx + 35, voltorby + 75, voltorbx + 85, voltorby + 75);
		    c.drawLine (voltorbx + 30, voltorby + 15, voltorbx + 45, voltorby + 25);
		    c.drawLine (voltorbx + 70, voltorby + 25, voltorbx + 85, voltorby + 15);
		    c.drawLine (voltorbx + 51, voltorby + 75, voltorbx + 51, voltorby + 97);
		    c.drawLine (voltorbx + 69, voltorby + 75, voltorbx + 69, voltorby + 97);

		    //Delay to reduce flicker
		    try
		    {
			Thread.sleep (50);
		    }
		    catch (Exception e)
		    {
		    }
		}

	    }

	    if (area == 1)
	    {
		new Area1 ();
		if (tutorial == 0)
		{
		    //Draws the character
		    new DrawsAwedish ();
		    cantmove = 1;

		    //Tutorial dialog with prompts and information
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Professor Spruce", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("Hello Awedish, and welcome to my laboratory.", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();

		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.setFont (dialog);
		    c.setColor (Color.black);
		    c.drawString ("First of all, are you a boy or a girl?", 30, 525);
		    c.setFont (battle);
		    c.drawString ("BOY", 640, 517);
		    c.drawString ("GIRL", 640, 557);
		    c.drawString ("Press 'w' and 's' to navigate, and 'e' to select.", 600, 585);
		    //User must choose if they're boy or girl
		    while (boygirl == 0)
		    {
			c.setColor (Color.white);
			c.fillRect (698, 490, 40, 68);
			c.setColor (Color.black);
			if (choice == 0)
			{
			    c.drawLine (700, 505, 730, 495);
			    c.drawLine (700, 505, 730, 515);
			}
			if (choice == 1)
			{
			    c.drawLine (700, 545, 730, 535);
			    c.drawLine (700, 545, 730, 555);
			}
			//Allows player to make inputs
			movement = c.getChar ();
			if (movement == 'w')
			    choice = 0;
			if (movement == 's')
			    choice = 1;
			if (movement == 'e')
			    boygirl = 1;
		    }

		    //Dialog
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.setColor (Color.black);
		    c.drawString ("Well, I really didn't care about your gender anyways. I just wanted to let you know that you can", 30, 525);
		    c.drawString ("use 'e' to do stuff like pick up pokeballs, and read signs. Now I'll teach you how some basics.", 30, 555);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.setColor (Color.black);
		    c.setFont (dialog);
		    c.drawString ("Let's send you to the battlefield so you can learn how to fight. and capture other Pocketmans", 30, 525);
		    c.drawString ("Don't disapoint me, I kidnapped you here because I thought you were really strong.", 30, 555);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);

		    //THE FIGHT VARIABLE SETTINGS
		    area = 0;
		    enemyhp = 3;
		    enemymaxhp = 3;
		    x = 238;
		    y = 424;
		    sodawodax = 750;
		    sodawoday = 124;
		    cantmove = 0;
		    tutorial = 1;
		}
	    }
	    if (area == 2)
		//Draws the map
		new Area2 ();
	    if (area == 3)
	    {
		//Minimizes flicker with area 3b
		if (a3redraw == 1)
		{
		    //Draws the map
		    new Area3 ();
		    a3redraw = 0;
		}
		//Draws the map
		new Area3b ();
	    }
	    if (area == 4)
		//Draws the map
		new Area4 ();
	    if (area == 5)
		//Draws the map
		new Area5 ();
	    if (area == 6)
		//Draws the map
		new Area6 ();
	    if (area == 7)
		//Draws the map
		new Area7 ();
	    if (area == 8)
		//Draws the map
		new Area8 ();
	    if (area == 9)
		//Draws the map
		new Area9 ();
	    if (area == 10)
		//Draws the map
		new Area10 ();
	    if (area == 11)
		//Draws the map
		new Area11 ();
	    if (area == 12)
		//Draws the map
		new Area12 ();
	    if (area == 13)
		//Draws the map
		new Area13 ();
	    if (area == 14)
		//Draws the map
		new Area14 ();
	    if (area == 15)
		//Draws the map
		new Area15 ();
	    if (area == 16)
		//Draws the map
		new Area16 ();
	    if (area == 17)
		//Draws the map
		new Area17 ();

	    //Draws Awedish (60x75)
	    new DrawsAwedish ();

	    //Movement, unless the player is in battle.
	    if (area != 0)
	    {
		if (cantmove == 1)
		    movement = 'v';
		if (cantmove == 0)
		{
		    movement = c.getChar ();
		    //Toggles sprint
		    if (movement == 'k')
			sprint += 1;

		    //Changes the x or y position according to which key was pressed.
		    if (sprint % 2 == 0)
		    {
			if (movement == 'a')
			    x = x - 6;
			if (movement == 'd')
			    x = x + 6;
			if (movement == 'w')
			    y = y - 6;
			if (movement == 's')
			    y = y + 6;
		    }
		    if (sprint % 2 == 1)
		    {
			if (movement == 'a')
			    x = x - 12;
			if (movement == 'd')
			    x = x + 12;
			if (movement == 'w')
			    y = y - 12;
			if (movement == 's')
			    y = y + 12;
		    }
		}
	    }

	    ////////Interactions///////
	    //Collisions prevent the player from moving through walls and objects
	    //Doors allow for map changes and resets location variables
	    //Signs provide information
	    //There are "expansion pack" messages
	    //Pocketballs may be picken up if not taken
	    //Encounters result into battle after determining battle variables
	    //Other area specific interactions are included


	    if (area == -1)
	    {
		//Doors (Reassigns location)
		if (x >= 472 && x <= 484 && y > 512 && pocketCenter == 1)
		{
		    area = 3;
		    x = 194;
		    y = 252;
		}
		if (x >= 472 && x <= 484 && y > 512 && pocketCenter == 2)
		{
		    area = 9;
		    x = 194;
		    y = 252;
		}
		if (x >= 472 && x <= 484 && y > 512 && pocketCenter == 3)
		{
		    area = 13;
		    x = 194;
		    y = 252;
		}

		//Heals the pocketmans
		if ((x == 652 || x == 646 || x == 658) && y == 350 && movement == 'e')
		{
		    hp = maxhp;
		    dweebhp = dweebmaxhp;
		    sodahp = sodamaxhp;
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.setColor (Color.black);
		    c.drawString ("You and your party is now quite healthy!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();
		}

		//Collision of walls
		if (y > 512)
		    y = 512;
		if (y < 170)
		    y = 170;
		if (x > 922)
		    x = 922;
		if (x < 64)
		    x = 64;
		//Collisions of the table counter
		if (area == -1)
		{
		    if (y < 350 && x > 129 && x < 821)
			y = 350;
		    if (x < 124 && y < 332 && x > 814)
			x = 832;
		    if (x < 124 && y < 332 && x > 106)
			x = 106;
		}
	    }
	    if (area == 1)
	    {
		//Collisions of all furniture and walls
		if (x > 340 && y > 80 && y < 206 && x < 360)
		    x = 340;
		if (x < 700 && y > 80 && y < 206 && x > 680)
		    x = 700;
		if (y < 206 && x < 700 && x > 340 && y > 189)
		    y = 206;
		if (y > 134 && y < 149 && (x > 790 || x < 160))
		    y = 134;
		if (y >= 518 && (x < 472 || x > 484))
		    y = 518;
		if (y > 80 && x < 700 && x > 340 && y < 100)
		    y = 80;
		if (x <= 160 && y > 134)
		    x = 160;
		if (y < 74)
		    y = 74;
		if (x >= 790 && y > 134)
		    x = 790;
		if (x <= 34)
		    x = 34;
		if (x >= 922)
		    x = 922;

		//Door (Reassigns location)
		if (x >= 472 && x <= 484 && y > 524)
		{
		    area = 2;
		    x = 446;
		    y = 294;
		}

		//Pocketballs to pick up if not taken
		if (y > 296 && x > 550 && x < 640 && y < 374 && movement == 'e' && a1ball1 == 1)
		{
		    a1ball1 = 0;
		    pokeballs += 1;
		}
		if (y > 296 && x > 604 && x < 688 && y < 374 && movement == 'e' && a1ball2 == 1)
		{
		    a1ball2 = 0;
		    pokeballs += 1;
		}
		if (y > 296 && x > 652 && x < 742 && y < 374 && movement == 'e' && a1ball3 == 1)
		{
		    a1ball3 = 0;
		    pokeballs += 1;
		}
	    }
	    if (area == 2)
	    {
		//Collisions of the walls and aesthetics
		if (y < 132)
		    y = 132;
		if (y > 450)
		    y = 450;
		if (x < 404 && !(y <= 294 && y >= 282))
		    x = 404;

		//Doors (Reassigns location)
		if (x < 404 && (y <= 294 && y >= 282))
		{
		    area = 1;
		    x = 478;
		    y = 494;
		}
		if (x > 926)
		{
		    area = 3;
		    x = 32;
		    y = 288;
		}

		//Sign that provides information
		if (y <= 270 && x >= 614 && x <= 812 && movement == 'e')
		{
		    c.setColor (hudBrown);
		    c.fillRoundRect (300, 150, 400, 300, 100, 150);
		    c.setColor (Color.white);
		    c.setFont (dialog);
		    c.drawString ("Feeling a little slow?", 400, 230);
		    c.drawString ("You can press 'k'", 405, 290);
		    c.drawString ("to toggle sprint.", 409, 350);
		    c.getChar ();
		}
	    }

	    if (area == 3)
	    {
		//Doors (Reassigns location)
		if (x < 32)
		{
		    area = 2;
		    x = 922;
		    a3redraw = 1;
		}
		if (x > 922)
		{
		    area = 17;
		    x = 34;
		    a3redraw = 1;
		}

		//Expansion pack message for one of the entrances
		if (y > 516)
		{
		    y = 516;
		    c.setColor (hudBrown);
		    c.fillRoundRect (300, 150, 400, 300, 100, 150);
		    c.setColor (Color.white);
		    c.setFont (dialog);
		    c.drawString ("Stop right there!", 400, 230);
		    c.drawString ("To enter the beach, you", 400, 290);
		    c.drawString ("must purchase out DLC #1", 392, 350);
		    c.drawString ("for only $19.99!", 400, 410);
		    a3redraw = 1;
		    c.getChar ();
		}
		if (y < 66)
		{
		    area = 4;
		    y = 512;
		    a3redraw = 1;
		}
		//Healing station door
		if (y < 252 && x > 193 && x < 207)
		{
		    area = -1;
		    y = 512;
		    x = 478;
		    a3redraw = 1;
		    pocketCenter = 1;
		}

		//Collisions of walls and houses
		if (x > 512 && !(y <= 338 && y >= 240))
		    x = 512;
		if (x < 434 && !(y <= 338 && y >= 240))
		    x = 434;
		if (y > 324 && (x < 434 || x > 512))
		    y = 324;
		if (y < 252 && (x < 434 || x > 512))
		    y = 252;

		//Sign that provides information
		if (x >= 584 && x <= 836 && movement == 'e')
		{
		    c.setColor (hudBrown);
		    c.fillRoundRect (300, 150, 400, 300, 100, 150);
		    c.setColor (Color.white);
		    c.setFont (dialog);
		    c.drawString ("To the right is a very", 400, 230);
		    c.drawString ("dangerous place. You", 400, 290);
		    c.drawString ("really shouldnt go there", 392, 350);
		    c.drawString ("unless you're strong...", 392, 410);
		    a3redraw = 1;
		    c.getChar ();
		}

		//No pass! Blocks character from continuing
		if (a3nopass == 1 && x >= 806 && area == 3)
		{
		    cantmove = 1;
		    movement = 'v';
		    a3redraw = 1;
		    //nopass moves down
		    for (int i = 0 ; i < 150 ; i++)
		    {
			new Area3b ();
			new DrawsAwedish ();
			nopassy += 1;
			for (int j = 0 ; j < 2500000 ; j++)
			{
			}
		    }
		    //nopass dialog
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.setFont (dialog);
		    c.drawString ("Kapriel", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("No pass! You're too weak scrub!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press 'enter' to continue...", 750, 585);
		    c.readLine ();
		    //Draws HUD
		    c.setColor (hudBrown);
		    c.fillRect (10, 0, 990, 40);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.drawString ("Pocketmans count: " + pokemonCount, 640, 35);
		    if (sprint % 2 == 0)
			c.drawString ("Sprint: OFF", 870, 35);
		    else if (sprint % 2 == 1)
			c.drawString ("Sprint: ON", 870, 35);

		    //Covers up the dialog
		    new Area3 ();
		    c.setColor (Color.white);
		    c.fillRect (0, 0, 10, 600);

		    //nopass moves down
		    for (int h = 0 ; h < 150 ; h++)
		    {
			new Area3b ();
			new DrawsAwedish ();
			nopassy -= 1;
			x -= 1;
			for (int j = 0 ; j < 2500000 ; j++)
			{
			}
		    }
		    //Allows player to move again
		    cantmove = 0;
		}

		//Encounter #1
		if (r3encounter == 0)
		{
		    c.setColor (hudBrown);
		    c.fillRect (10, 0, 300, 40);
		    new Area3 ();
		    cantmove = 1;
		    //Moves the dweebble
		    for (int i = 0 ; i < 300 ; i++)
		    {
			new Area3b ();
			new DrawsAwedish ();
			dweebblex -= 1;
			for (int j = 0 ; j < 250000 ; j++)
			{
			}
		    }
		    //Characters talking(dialog)
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Dweebble", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("Oh, hey there Awedish! I was just about to go and capture the ULTIMATE pocketman with my Ultra ball!", 30, 525);
		    c.drawString ("I've gotten so strong! I'm sure I can capture him. We should fight so I can show my strength!", 30, 555);
		    c.setFont (battle);
		    c.drawString ("Press enter to continue...", 750, 585);
		    c.readLine ();

		    new Area3 ();
		    new DrawsAwedish ();
		    c.setColor (bronzeblue);
		    c.fillRoundRect (765, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Awedish", 795, 462);
		    c.setColor (Color.black);
		    c.setFont (dialog);
		    c.drawString ("What? Ultimate pokemon? And I don't really want to fight you but ok...", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();

		    //Sends them to battlemap after assigning variables
		    teamLevel = 2;
		    hp = 3;
		    maxhp = 3;
		    r3encounter = 1;
		    cantmove = 0;
		    area = 0;
		    enemyhp = 4;
		    enemymaxhp = 4;
		    x = 238;
		    y = 424;
		    dweebblex = 750;
		    dweebbley = 124;
		    cantmove = 0;
		    events = 0;
		    fill = 0;
		    enemyPoke = "Dweebble";
		    enemyLevel = 2;
		    tutorial = 2;
		    battleframe = 1;
		}
	    }
	    if (area == 4)
	    {
		//Doors (Reassigns location)
		if (y > 512 && x < 520 && x > 424)
		{
		    area = 3;
		    x = 466;
		    y = 66;
		}
		if (y < 68 && area == 4)
		{
		    area = 5;
		    y = 512;
		    x = 472;
		}
		//Expansion pack message for one of the entrances
		if (x > 922 && y < 332)
		{
		    c.setColor (hudBrown);
		    c.fillRoundRect (300, 150, 400, 300, 100, 150);
		    c.setColor (Color.white);
		    c.setFont (dialog);
		    c.drawString ("Stop right there!", 400, 230);
		    c.drawString ("To enter the pond, you", 400, 290);
		    c.drawString ("must purchase out DLC #2", 392, 350);
		    c.drawString ("for only $99.99!", 400, 410);
		    c.getChar ();
		}

		//Collisions of walls and trees/pond
		if (x < 412 && y > 344 && x > 399)
		    x = 412;
		if (y < 236 && x > 372 && area == 4)
		    y = 236;
		if (y > 344 && x < 406)
		    y = 344;
		if (x < 760 && x > 740 && y > 362)
		    x = 760;
		if (x > 574 && x < 594 && y > 362)
		    x = 574;
		if (y > 356 && x > 580 && x < 754)
		    y = 356;
		if (x < 250)
		    x = 250;
		if (x > 358 && y < 236 && area == 4)
		    x = 358;
		if (y > 512)
		    y = 512;
		if (x > 922)
		    x = 922;

		//Pocketball if not taken
		if (y > 434 && x > 796 && x < 880 && movement == 'e' && a4ball == 1)
		{
		    a4ball = 0;
		    pokeballs += 1;
		}
	    }
	    if (area == 5)
	    {
		//Doors (Reassigns location)
		if (y < 236 && x >= 446 && x <= 478)
		{
		    area = 6;
		    y = 500;
		    x = 471;
		}
		if (y > 512)
		{
		    area = 4;
		    y = 68;
		    x = 206;
		}
		//Collision of walls
		if (x < 430)
		    x = 430;
		if (x > 514)
		    x = 514;
		if (y < 236)
		    y = 236;


		//Sign that provides information
		if (x > 484 && y > 320 && y < 416 && movement == 'e')
		{
		    c.setColor (hudBrown);
		    c.fillRoundRect (300, 150, 400, 300, 100, 150);
		    c.setColor (Color.white);
		    c.setFont (dialog);
		    c.drawString ("Very few people have ", 400, 230);
		    c.drawString ("entered the Frog Kingdom", 400, 290);
		    c.drawString ("Castle. You shouldn't go", 392, 350);
		    c.drawString ("unless you got balls", 392, 410);
		    c.getChar ();
		}
	    }
	    if (area == 6)
	    {
		//Encounter #2
		if (r6encounter == 0)
		{
		    c.setColor (hudBrown);
		    c.fillRect (10, 0, 300, 40);
		    new Area6 ();
		    new DrawsAwedish ();

		    //Toad speaks
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Toad", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("Oh look! I have another challenger! I'm sure you're going to lose because you're just", 30, 525);
		    c.drawString ("as weak as the others. I haven't even lost a single health point yet!", 30, 555);
		    c.setFont (battle);
		    c.drawString ("Press enter to continue...", 750, 585);
		    c.readLine ();

		    //SEND THEM TO BATTLE AFTER ASSIGNING VARIABLES
		    teamLevel = 3;
		    hp = 4;
		    maxhp = 4;
		    sodahp = 4;
		    sodamaxhp = 4;
		    dweebhp = 5;
		    dweebmaxhp = 5;
		    r6encounter = 1;
		    area = 0;
		    enemyhp = 8;
		    enemymaxhp = 8;
		    x = 238;
		    y = 424;
		    toadx = 750;
		    toady = 124;
		    events = 0;
		    fill = 0;
		    enemyPoke = "Toad";
		    enemyLevel = 4;
		    tutorial = 3;
		    battleframe = 1;
		    dweebblex = 238;
		    dweebbley = 424;
		    sodawodax = 238;
		    sodawoday = 424;
		}

		//Doors (Reassigns location)
		if (y > 512 && x > 424 && x < 520)
		{
		    area = 5;
		    x = 471;
		    y = 248;
		}
		if (y < 68 && x > 424 && x < 520)
		{
		    area = 7;
		    x = 267;
		    y = 512;
		}

		//Collision of walls
		if (y > 512)
		    y = 512;
		if (y < 68)
		    y = 68;
		if (x > 922)
		    x = 922;
		if (x < 34)
		    x = 34;
	    }
	    if (area == 7)
	    {
		//Doors (Reassigns location)
		if (y > 512 && x > 231 && x < 317)
		{
		    area = 6;
		    x = 471;
		    y = 68;
		}
		if (x > 922 && y > 301 && y < 387)
		{
		    area = 8;
		    x = 34;
		}
		//Expansion pack message for one of the entrances
		if (x > 339 && x < 365 && y < 290)
		{
		    c.setColor (hudBrown);
		    c.fillRoundRect (300, 150, 400, 300, 100, 150);
		    c.setColor (Color.white);
		    c.setFont (dialog);
		    c.drawString ("Stop right there!", 400, 230);
		    c.drawString ("To enter INOOBE STUDIOS,", 400, 290);
		    c.drawString ("you must purchase out DLC #3", 392, 350);
		    c.drawString ("for only $499.99!", 400, 410);
		    c.getChar ();
		}
		//Collision of walls
		if (area == 7)
		{
		    if (y > 512)
			y = 512;
		    if (y < 104)
			y = 104;
		    if (x > 922)
			x = 922;
		    if (x < 64)
			x = 64;
		    //Collision of inoobe studios
		    if (x > 118 && y > 103 && y < 284 && x < 140)
			x = 118;
		    if (x < 586 && y > 103 && y < 284 && x > 520)
			x = 586;
		    if (y < 290 && x > 129 && x < 575)
			y = 290;
		}
		//Read sign
		if (x > 640 && x <755 && y < 420 && y > 310 && movement == 'e')
		{
		    c.setColor (hudBrown);
		    c.fillRoundRect (300, 150, 400, 300, 100, 150);
		    c.setColor (Color.white);
		    c.setFont (dialog);
		    c.drawString ("Press 'e' to read signs.", 400, 230);
		    c.drawString ("You've been doing that the", 400, 290);
		    c.drawString ("entire time, right? Ok good.", 392, 350);
		    c.drawString ("yw for the helpful tips btw", 392, 410);
		    c.getChar ();
		}
	    }
	    if (area == 8)
	    {
		//Doors (Reassigns location)
		if (x < 34 && y > 307 && y < 387)
		{
		    area = 7;
		    x = 920;
		}
		if (x > 922 && y > 307 && y < 387)
		{
		    area = 9;
		    x = 34;
		    y = 290;
		}

		//Collision of walls
		if (y > 512)
		    y = 512;
		if (y < 104)
		    y = 104;
		if (x > 922)
		    x = 922;
		if (x < 34)
		    x = 34;

		//Encounter #3
		if (r8encounter == 0)
		{
		    c.setColor (hudBrown);
		    c.fillRect (10, 0, 300, 40);
		    new Area8 ();
		    new DrawsAwedish ();

		    //Gavan and Awedish dialog
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Coughing (Gavan)", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("Hey! You there! Give me all your money!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press enter to continue...", 750, 585);
		    c.readLine ();

		    new Area8 ();
		    new DrawsAwedish ();
		    c.setColor (bronzeblue);
		    c.fillRoundRect (765, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Awedish", 795, 462);
		    c.setColor (Color.black);
		    c.setFont (dialog);
		    c.drawString ("Uh, I don't really have money...", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();

		    new Area8 ();
		    new DrawsAwedish ();
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Coughing (Gavan)", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("Well I guess we're just going to have to battle then!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();

		    //SEND THEM TO BATTLE AFTER ASSIGNING VARIABLES
		    teamLevel = 5;
		    maxhp = 6;
		    sodamaxhp = 5;
		    dweebmaxhp = 6;
		    r8encounter = 1;
		    area = 0;
		    enemyhp = 10;
		    enemymaxhp = 10;
		    x = 238;
		    y = 424;
		    events = 0;
		    fill = 0;
		    enemyPoke = "Coughing";
		    enemyLevel = 5;
		    tutorial = 4;
		    battleframe = 1;
		    turn = 1;
		}
	    }

	    if (area == 9)
	    {
		//Doors (Reassigns location)
		if (x < 34 && y > 259 && y < 332)
		{
		    area = 8;
		    x = 920;
		}
		if (x > 922 && y > 259 && y < 332)
		{
		    area = 10;
		    x = 34;
		    y = 266;
		}

		//Entrance to healing station
		if (y < 252 && x > 193 && x < 207)
		{
		    area = -1;
		    y = 512;
		    x = 478;
		    pocketCenter = 2;
		}

		//Sign that provides information
		if (x > 381 && x < 443 && y < 261 && movement == 'e')
		{
		    c.setColor (hudBrown);
		    c.fillRoundRect (300, 150, 400, 300, 100, 150);
		    c.setColor (Color.white);
		    c.setFont (dialog);
		    c.drawString ("Residency of: ", 400, 230);
		    c.drawString ("Abody, Gordon, Gavan,", 400, 290);
		    c.drawString ("Frank, Edmound, Jimmy,", 392, 350);
		    c.drawString ("Eric, and Stefan", 392, 410);
		    c.getChar ();
		}

		//Collision of walls
		if (area == 9)
		{
		    if (y > 398)
			y = 398;
		    if (y < 74)
			y = 74;
		    if (x > 922)
			x = 922;
		    if (x < 34)
			x = 34;
		    //pocketcenter collision
		    if (x > 64 && x < 82 && y < 218)
			x = 64;
		    if (x < 334 && x > 316 && y < 218)
			x = 334;
		    if (x > 82 && x < 316 && y < 218)
			y = 218;
		    //house collision
		    if (x > 564 && x < 582 && y < 230)
			x = 564;
		    if (x < 834 && x > 816 && y < 230)
			x = 834;
		    if (x > 582 && x < 816 && y < 230)
			y = 230;
		    //Sign collision
		    if (x > 340 && x < 358 && y < 224 && y > 92)
			x = 340;
		    if (x < 472 && x > 452 && y < 224 && y > 92)
			x = 472;
		    if (x > 340 && x < 472 && y < 224 && y > 206)
			y = 224;
		    if (x > 340 && x < 472 && y > 92 && y < 110)
			y = 92;

		    //Wobblefeet Encounter
		    if (x > 570 && (r9encounter == 1 || r9encounter == 0))
			x = 570;
		    if (r9encounter == 0 && movement == 'e' && x == 570)
		    {
			//Dialog
			c.setColor (bronzeblue);
			c.fillRoundRect (25, 425, 220, 70, 20, 30);
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.drawString ("Wobblefeet", 50, 462);
			c.setColor (Color.black);
			c.drawString ("Oh hey there Awedish, whatcha up to? I'm just chilling over here.", 30, 525);
			c.setFont (battle);
			c.drawString ("Press 'u' to continue...", 750, 585);
			while (movement != 'u')
			{
			    movement = c.getChar ();
			}

			new Area9 ();
			new DrawsAwedish ();
			c.setColor (bronzeblue);
			c.fillRoundRect (765, 425, 220, 70, 20, 30);
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.drawString ("Awedish", 795, 462);
			c.setColor (Color.black);
			c.setFont (dialog);
			c.drawString ("Oh hey there Wayne, I'm just walking around to try and find some", 30, 525);
			c.drawString ("''ULTIMATE POCKETMAN'' that my friend talked about.", 30, 555);
			c.setFont (battle);
			c.drawString ("Press 'n' to continue...", 750, 585);
			while (movement != 'n')
			{
			    movement = c.getChar ();
			}

			new Area9 ();
			new DrawsAwedish ();
			c.setColor (bronzeblue);
			c.fillRoundRect (25, 425, 220, 70, 20, 30);
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.drawString ("Wobblefeet", 50, 462);
			c.setColor (Color.black);
			c.drawString ("Oh I see, well good luck with that. Meanwhile I'll just stand here like usual.", 30, 525);
			c.drawString ("You can capture me if you want, but I'm just a useless level 1 anyway.", 30, 555);
			c.setFont (battle);
			c.drawString ("Press 't' to continue...", 750, 585);
			while (movement != 't')
			{
			    movement = c.getChar ();
			}

			//Makes sure this conversation doesn't happen again
			r9encounter = 1;
			x = 564;
		    }
		    //Second dialog
		    if (r9encounter == 1 && movement == 'e' && x == 570)
		    {
			c.setColor (bronzeblue);
			c.fillRoundRect (25, 425, 220, 70, 20, 30);
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.drawString ("Wobblefeet", 50, 462);
			c.setColor (Color.black);
			c.drawString ("Am I in your way? Well I'm kinda too lazy to move so you'll have to capture me.", 30, 525);
			c.drawString ("If you're out of pocketballs, I heard theres one laying around hidden in a tree here.", 30, 555);
			c.setFont (battle);
			c.drawString ("Press 'q' to continue...", 750, 585);
			while (movement != 'q')
			{
			    movement = c.getChar ();
			}

			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.setColor (Color.black);
			c.drawString ("CAPTURE", 620, 517);
			c.drawString ("DON'T CAPTURE", 570, 557);
			c.drawString ("Press 'w' and 's' to navigate, and 'e' to select.", 600, 585);

			//User must choose if they want to capture wayne
			boygirl = 0;
			while (boygirl == 0)
			{
			    c.setColor (Color.white);
			    c.fillRect (698, 490, 40, 68);
			    c.setColor (Color.black);
			    if (choice == 0)
			    {
				c.drawLine (700, 505, 730, 495);
				c.drawLine (700, 505, 730, 515);
			    }
			    if (choice == 1)
			    {
				c.drawLine (700, 545, 730, 535);
				c.drawLine (700, 545, 730, 555);
			    }
			    //Allows player to make inputs
			    movement = c.getChar ();
			    if (movement == 'w')
				choice = 0;
			    if (movement == 's')
				choice = 1;
			    if (movement == 'e')
				boygirl = 1;
			}
			if (choice == 0 && pokeballs > 0)
			{
			    //Pocketball animation
			    for (int i = -600 ; i <= 1000 ; i += 16)
			    {
				//Draws pokeball
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillArc (i, 0, 600, 600, 180, 180);
				AndrewEdwardWaynePocketmans.c.setColor (Color.red);
				AndrewEdwardWaynePocketmans.c.fillArc (i, 0, 600, 600, 0, 180);
				AndrewEdwardWaynePocketmans.c.setColor (Color.black);
				AndrewEdwardWaynePocketmans.c.fillRoundRect (i, 290, 600, 20, 20, 20);
				AndrewEdwardWaynePocketmans.c.fillOval (i + 250, 250, 100, 100);
				AndrewEdwardWaynePocketmans.c.drawOval (i, 0, 600, 600);
				AndrewEdwardWaynePocketmans.c.setColor (Color.white);
				AndrewEdwardWaynePocketmans.c.fillOval (i + 270, 270, 60, 60);
				//Delay to minimize flicker
				try
				{
				    Thread.sleep (25);
				}
				catch (Exception e)
				{
				}
			    }
			    r9encounter = 2;
			    wobblecap = 1;
			    pokeballs -= 1;
			    pokemonCount += 1;
			}
			else if (choice == 0 && pokeballs == 0)
			{
			    c.setColor (bronzeblue);
			    c.fillRoundRect (25, 425, 220, 70, 20, 30);
			    c.setColor (hudBrown);
			    c.fillRoundRect (10, 475, 990, 125, 100, 50);
			    c.setFont (dialog);
			    c.setColor (Color.white);
			    c.fillRoundRect (20, 485, 970, 105, 80, 30);
			    c.drawString ("Wobblefeet", 50, 462);
			    c.setColor (Color.black);
			    c.drawString ("Wow, looks like you're out of pokeballs.", 30, 525);
			    c.drawString ("I heard theres one laying around hidden in a tree here.", 30, 555);
			    c.setFont (battle);
			    c.drawString ("Press any key to continue...", 750, 585);
			    c.getChar ();
			}
			x = 564;
		    }
		}
		//Pocketball if not taken
		if (y == 398 && x == 472 && movement == 'e' && a9ball == 1)
		{
		    a9ball = 0;
		    pokeballs += 1;
		    c.setColor (hudBrown);
		    c.fillRoundRect (300, 150, 400, 300, 100, 150);
		    c.setColor (Color.white);
		    c.setFont (dialog);
		    c.drawString ("You found the hidden pocketball!", 400, 230);
		    c.getChar ();
		}
	    }

	    if (area == 10)
	    {
		//Doors (Reassigns location)
		if (x < 34 && y > 241 && y < 303)
		{
		    area = 9;
		    x = 920;
		    y = 290;
		}
		if (y > 512 && x < 671 && x > 591)
		{
		    area = 11;
		    x = 476;
		    y = 74;
		}
		//Collision of walls
		if (y > 512)
		    y = 512;
		if (y < 74)
		    y = 74;
		if (x > 922)
		    x = 922;
		if (x < 34)
		    x = 34;

		//Collisions of the lake
		if (y > 314 && y < 599 && x < 592)
		    x = 592;
		if (x > 33 && x < 592 && y > 302)
		    y = 302;

		//Encounter #4
		if (r10encounter == 0)
		{
		    c.setColor (hudBrown);
		    c.fillRect (10, 0, 300, 40);
		    new Area10 ();
		    new DrawsAwedish ();

		    //Deglitt and Awedish dialog
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Deglitt (Fronk)", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("HEY! YOU KILLED GAVAN!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press enter to continue...", 750, 585);
		    c.readLine ();

		    new Area10 ();
		    new DrawsAwedish ();
		    c.setColor (bronzeblue);
		    c.fillRoundRect (765, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Awedish", 795, 462);
		    c.setColor (Color.black);
		    c.setFont (dialog);
		    c.drawString ("Uh, yeah?", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();

		    new Area10 ();
		    new DrawsAwedish ();
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Deglitt (Fronk)", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("I MUST AVENGE HIM!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();

		    //SEND THEM TO BATTLE AFTER ASSIGNING VARIABLES
		    teamLevel = 6;
		    maxhp = 7;
		    sodamaxhp = 6;
		    dweebmaxhp = 7;
		    r10encounter = 1;
		    area = 0;
		    enemyhp = 11;
		    enemymaxhp = 11;
		    x = 238;
		    y = 424;
		    events = 0;
		    fill = 0;
		    enemyPoke = "Deglitt";
		    enemyLevel = 6;
		    tutorial = 5;
		    battleframe = 0;
		    turn = 1;
		}
	    }
	    if (area == 11)
	    {
		//Doors (Reassigns location)
		if (x < 519 && x > 439 && y < 74)
		{
		    area = 10;
		    x = 632;
		    y = 512;
		}
		if (x < 519 && x > 439 && y > 512)
		{
		    area = 12;
		    x = 472;
		    y = 74;
		}

		//Collision of walls
		if (area == 11)
		{
		    if (y > 512)
			y = 512;
		    if (y < 74)
			y = 74;
		    if (x > 560)
			x = 560;
		    if (x < 398)
			x = 398;
		    //prevents the user from moving past a character if not defeated
		    if (r11encounter == 0)
		    {
			if (y > 350)
			    y = 350;
		    }
		}

		//Encounter #5
		if (r11encounter == 0 && y == 350 && movement == 'e')
		{
		    c.setColor (hudBrown);
		    c.fillRect (10, 0, 300, 40);
		    new Area11 ();
		    new DrawsAwedish ();

		    //Bronze-oh and Awedish dialog
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Bronze-oh (Shobe)", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("YOU SHALL NOT PASS!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press enter to continue...", 750, 585);
		    c.readLine ();

		    new Area11 ();
		    new DrawsAwedish ();
		    c.setColor (bronzeblue);
		    c.fillRoundRect (765, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Awedish", 795, 462);
		    c.setColor (Color.black);
		    c.setFont (dialog);
		    c.drawString ("What?", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();

		    new Area11 ();
		    new DrawsAwedish ();
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Bronze-oh (Shobe)", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("Die foolish child.", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();

		    //SEND THEM TO BATTLE AFTER ASSIGNING VARIABLES
		    teamLevel = 7;
		    maxhp = 8;
		    sodamaxhp = 7;
		    dweebmaxhp = 8;
		    r11encounter = 1;
		    area = 0;
		    enemyhp = 12;
		    enemymaxhp = 12;
		    x = 238;
		    y = 424;
		    events = 0;
		    fill = 0;
		    enemyPoke = "Bronze-oh";
		    enemyLevel = 7;
		    tutorial = 6;
		    battleframe = 0;
		    turn = 1;
		}
	    }
	    if (area == 12)
	    {
		//Doors (Reassigns location)
		if (y < 74 && x > 429 && x < 514)
		{
		    area = 11;
		    x = 476;
		    y = 314;
		}
		if (x > 922 && y > 259 && y < 332)
		{
		    area = 13;
		    x = 34;
		    y = 266;
		}

		//Collision of walls
		if (area == 12)
		{
		    if (y > 514)
			y = 514;
		    if (y < 74)
			y = 74;
		    if (x > 922)
			x = 922;
		    if (x < 34)
			x = 34;

		    //house 1 collision
		    if (x > 64 && x < 82 && y < 218)
			x = 64;
		    if (x < 334 && x > 316 && y < 218)
			x = 334;
		    if (x > 82 && x < 316 && y < 218)
			y = 218;
		    //house 2 collision
		    if (x > 614 && x < 632 && y < 218)
			x = 614;
		    if (x < 884 && x > 866 && y < 218)
			x = 884;
		    if (x > 632 && x < 866 && y < 218)
			y = 218;
		    //house 3 collision
		    if (x > 64 && x < 82 && y < 518 && y > 340)
			x = 64;
		    if (x < 334 && x > 316 && y < 518 && y > 340)
			x = 334;
		    if (x > 82 && x < 316 && y < 418 && y > 340)
			y = 340;
		    //house 4 collision
		    if (x > 614 && x < 632 && y < 518 && y > 340)
			x = 614;
		    if (x < 884 && x > 866 && y < 518 && y > 340)
			x = 884;
		    if (x > 632 && x < 866 && y < 418 && y > 340)
			y = 340;

		    //Gym collision
		    if (x < 596 && x > 580 && y > 364)
			x = 596;
		    if (x > 344 && x < 360 && y > 364)
			x = 344;
		    if (y > 356 && x > 344 && x < 590)
			y = 356;

		    //Entering the gym to battle
		    if (x >= 466 && x <= 478 && y == 356 && movement == 's' && r12gym == 0)
		    {
			c.setColor (bronzeblue);
			c.fillRoundRect (25, 425, 220, 70, 20, 30);
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.drawString ("Gym Master", 50, 462);
			c.setColor (Color.black);
			c.drawString ("You have entered the gym! For entering, your pocketmans have been restored to full HP.", 30, 525);
			c.drawString ("Due to the terrible epidemics and our low population, there are only 2 competing teams.", 30, 555);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			c.getChar ();

			//Healing and sends to battle after assigning variables
			teamLevel = 8;
			maxhp = 9;
			sodamaxhp = 8;
			dweebmaxhp = 9;
			hp = maxhp;
			sodahp = sodamaxhp;
			dweebhp = dweebmaxhp;
			tutorial = 7;
			events = 0;
			r12gym = 1;
			area = 0;
			enemyhp = 11;
			enemymaxhp = 11;
			x = 238;
			y = 424;
			events = 0;
			enemyPoke = "Tyler1";
			enemyLevel = 9;
			battleframe = 0;
			turn = 1;
		    }
		    //Prevents the user from re-entering if already defeated
		    if (x >= 466 && x <= 478 && y == 356 && movement == 's' && r12gym == 1)
		    {
			c.setColor (bronzeblue);
			c.fillRoundRect (25, 425, 220, 70, 20, 30);
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.drawString ("Gym Master", 50, 462);
			c.setColor (Color.black);
			c.drawString ("You have already beaten this gym. No need to come back just to flex on us.", 30, 525);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			c.getChar ();
		    }
		}
	    }
	    if (area == 13)
	    {
		//Doors (Reassigns Location)
		if (y > 512 && x > 429 && x < 514)
		{
		    area = 14;
		    x = 470;
		    y = 76;
		}
		if (x < 34 && y > 259 && y < 332)
		{
		    area = 12;
		    x = 922;
		    y = 266;
		}

		//Entrance to healing station
		if (y < 252 && x > 193 && x < 207)
		{
		    area = -1;
		    y = 512;
		    x = 478;
		    pocketCenter = 3;
		}

		//Expansion pack message for one of the entrances
		if (x > 429 && x < 514 && y < 74)
		{
		    c.setColor (hudBrown);
		    c.fillRoundRect (300, 150, 400, 300, 100, 150);
		    c.setColor (Color.white);
		    c.setFont (dialog);
		    c.drawString ("Stop right there!", 400, 230);
		    c.drawString ("To enter the Great Lake, you", 400, 290);
		    c.drawString ("must purchase out DLC #4", 392, 350);
		    c.drawString ("for only $2499.99!", 400, 410);
		    c.getChar ();
		}

		//Collision of walls
		if (area == 13)
		{
		    if (y > 514)
			y = 514;
		    if (y < 74)
			y = 74;
		    if (x > 922)
			x = 922;
		    if (x < 34)
			x = 34;
		    //house 1 Collision
		    if (x > 64 && x < 82 && y < 218)
			x = 64;
		    if (x < 334 && x > 316 && y < 218)
			x = 334;
		    if (x > 82 && x < 316 && y < 218)
			y = 218;
		    //house 2 Collision
		    if (x > 614 && x < 632 && y < 218)
			x = 614;
		    if (x < 884 && x > 866 && y < 218)
			x = 884;
		    if (x > 632 && x < 866 && y < 218)
			y = 218;

		    //house 3 Collision
		    if (x > 64 && x < 82 && y < 518 && y > 340)
			x = 64;
		    if (x < 334 && x > 316 && y < 518 && y > 340)
			x = 334;
		    if (x > 82 && x < 316 && y < 418 && y > 340)
			y = 340;
		    //house 4 Collision
		    if (x > 614 && x < 632 && y < 518 && y > 340)
			x = 614;
		    if (x < 884 && x > 866 && y < 518 && y > 340)
			x = 884;
		    if (x > 632 && x < 866 && y < 418 && y > 340)
			y = 340;

		    //Snoozelax blocking the path if not defeated
		    if (x > 370 && r13encounter == 0 && y > 376 && x < 412)
			x = 370;
		    if (x < 574 && r13encounter == 0 && y > 376 && x > 538)
			x = 574;
		    if (y > 358 && x > 406 && x < 532 && r13encounter == 0)
			y = 358;
		    if (r13encounter == 0 && movement == 'e' && ((y == 358 && x > 406 && x < 532) || (x == 574 && y > 376) || (x == 370 && y > 376)))
		    {
			//Dialog
			c.setColor (bronzeblue);
			c.fillRoundRect (765, 425, 220, 70, 20, 30);
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.drawString ("Awedish", 795, 462);
			c.setColor (Color.black);
			c.setFont (dialog);
			c.drawString ("Hey! Get out of my way!", 30, 525);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			c.getChar ();

			new Area13 ();
			new DrawsAwedish ();
			c.setColor (bronzeblue);
			c.fillRoundRect (25, 425, 220, 70, 20, 30);
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setFont (dialog);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.drawString ("Snoozelax", 50, 462);
			c.setColor (Color.black);
			c.drawString ("zzz...", 30, 525);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			c.getChar ();

			new Area13 ();
			new DrawsAwedish ();
			c.setColor (bronzeblue);
			c.fillRoundRect (765, 425, 220, 70, 20, 30);
			c.setColor (hudBrown);
			c.fillRoundRect (10, 475, 990, 125, 100, 50);
			c.setColor (Color.white);
			c.fillRoundRect (20, 485, 970, 105, 80, 30);
			c.drawString ("Awedish", 795, 462);
			c.setColor (Color.black);
			c.setFont (dialog);
			c.drawString ("I guess I'll just have to fight you then", 30, 525);
			c.setFont (battle);
			c.drawString ("Press any key to continue...", 750, 585);
			c.getChar ();

			//SEND THEM TO BATTLE AFTER ASSIGNING VARIABLES
			teamLevel = 8;
			maxhp = 9;
			sodamaxhp = 8;
			dweebmaxhp = 9;
			r13encounter = 1;
			area = 0;
			enemyhp = 25;
			enemymaxhp = 25;
			x = 238;
			y = 424;
			events = 0;
			enemyPoke = "Snoozelax";
			enemyLevel = 9;
			tutorial = 10;
			battleframe = 0;
			turn = 1;
			snorlaxx = 700;
			snorlaxy = 120;
		    }
		}
	    }
	    if (area == 14)
	    {
		//Doors (Reassigns Location)
		if (y < 74 && x > 429 && x < 514)
		{
		    area = 13;
		    x = 470;
		    y = 512;
		}
		if (x < 34 && y > 259 && y < 332)
		{
		    area = 15;
		    x = 922;
		    y = 284;
		}

		//Collision of walls
		if (area == 14)
		{
		    if (y > 422)
			y = 422;
		    if (y < 74)
			y = 74;
		    if (x > 766)
			x = 766;
		    if (x < 34)
			x = 34;

		    //Collision of maze
		    if (y < 135 && x < 434)
			x = 434;
		    if (y > 145 && y < 337 && x < 673 && x > 655)
			x = 674;
		    if (y > 134 && y < 152 && x > 433 && x < 673)
			y = 134;
		    if (y > 326 && y < 344 && x > 368 && x < 673)
			y = 344;
		    if (y > 338 && x < 272)
			x = 272;
		    if (y < 337 && x > 367 && x < 384)
			x = 368;
		    if (y > 326 && x < 272)
			y = 326;
		    if (y < 242 && x < 369)
			y = 242;
		}
	    }
	    if (area == 15)
	    {
		//Doors (Reassigns Location)
		if (x > 922 && y > 259 && y < 332)
		{
		    area = 14;
		    x = 34;
		    y = 284;
		}
		if (x < 34 && y > 259 && y < 332)
		{
		    area = 16;
		    x = 922;
		    y = 284;
		}

		//Collision of walls
		if (area == 15)
		{
		    if (y > 344)
			y = 344;
		    if (y < 242)
			y = 242;
		    if (x > 922)
			x = 922;
		    if (x < 34)
			x = 34;
		}
	    }

	    if (area == 16)
	    {
		//Doors (Reassigns Location)
		if (x > 922 && y > 259 && y < 332)
		{
		    area = 15;
		    x = 34;
		    y = 284;
		}
		if (x < 34 && y > 259 && y < 332)
		{
		    area = 17;
		    x = 922;
		    y = 284;
		}

		//Collision of walls
		if (area == 16)
		{
		    if (y > 320)
			y = 320;
		    if (y < 242)
			y = 242;
		    if (x > 922)
			x = 922;
		    if (x < 34)
			x = 34;
		}
	    }
	    if (area == 17)
	    {
		//Doors
		if (x < 34 && y >= 278 && y <= 290)
		{
		    area = 3;
		    a3nopass = 0;
		    x = 922;
		}
		if (x > 922 && y >= 278 && y <= 290)
		{
		    area = 16;
		    a3nopass = 0;
		    x = 34;
		}
		//Collision
		if (area == 17)
		{
		    if (y < 74)
			y = 74;
		    if (y > 512)
			y = 512;
		    if (x < 34)
			x = 34;
		    if (x > 922)
			x = 922;
		}

		//Final Encounter
		if (r17encounter == 0)
		{
		    c.setColor (hudBrown);
		    c.fillRect (10, 0, 300, 40);
		    new Area17 ();
		    new DrawsAwedish ();

		    //Electrode and Awedish dialog
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Electrump", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("What are you doing in my battlefield?", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press enter to continue...", 750, 585);
		    c.readLine ();

		    new Area17 ();
		    new DrawsAwedish ();
		    c.setColor (bronzeblue);
		    c.fillRoundRect (765, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Awedish", 795, 462);
		    c.setColor (Color.black);
		    c.setFont (dialog);
		    c.drawString ("Uhhh, I just came to visit I guess?", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();

		    new Area17 ();
		    new DrawsAwedish ();
		    c.setColor (bronzeblue);
		    c.fillRoundRect (25, 425, 220, 70, 20, 30);
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.drawString ("Electrump", 50, 462);
		    c.setColor (Color.black);
		    c.drawString ("Get outta here!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();

		    //SEND THEM TO BATTLE AFTER ASSIGNING VARIABLES
		    teamLevel = 10;
		    maxhp = 12;
		    sodamaxhp = 11;
		    dweebmaxhp = 11;
		    r17encounter = 1;
		    area = 0;
		    enemyhp = 250;
		    enemymaxhp = 250;
		    x = 238;
		    y = 424;
		    events = 0;
		    fill = 0;
		    enemyPoke = "Electrump";
		    enemyLevel = 99;
		    tutorial = 11;
		    battleframe = 0;
		    turn = 1;
		}
	    }
	}
    } //mainmethod


    //Draws the characters/map and shows the attack list
    public static void initialDrawing ()
    {
	new BattleMap ();
	if (pokeTeam == 1)
	{
	    aweMoves.setVisible (true);
	    new DrawsAwedish ();
	}
	if (pokeTeam == 2)
	{
	    sodaMoves.setVisible (true);
	    new DrawsSoda ();
	}
	if (pokeTeam == 3)
	{
	    dweebMoves.setVisible (true);
	    new DrawsDweeb ();
	}
    }


    //Refreshes the graphics by redrawing all the characters and maps
    public static void redrawing ()
    {
	new BattleMap ();
	if (pokeTeam == 1)
	    new DrawsAwedish ();
	if (pokeTeam == 2)
	    new DrawsSoda ();
	if (pokeTeam == 3)
	    new DrawsDweeb ();
    }


    //Checks the attack selected and outputs a specific animation
    public static void attackCheck ()
    {
	//Attacks and moves
	if (absorbAttack == 1)
	    absorbAnimation ();
	if (moonlightAttack == 1)
	    moonlightAnimation ();
	if (slamAttack == 1)
	    slamAnimation ();
	if (tearfullookAttack == 1)
	    tearfullookAnimation ();
	if (xscissorAttack == 1)
	    xscissorAnimation ();
	if (blockAttack == 1)
	    blockAnimation ();
    }


    public static void absorbAnimation ()  //Awedish attack
    {
	if (turn % 2 == 1)
	{
	    AndrewEdwardWaynePocketmans.aweMoves.setVisible (false);
	    rng = Math.random ();
	    // 95% chance to hit
	    if (rng > 0.05 || tutorial == 1 || tutorial == 2)
	    {
		c.setColor (hudBrown);
		c.fillRoundRect (10, 475, 990, 125, 100, 50);
		c.setFont (dialog);
		c.setColor (Color.white);
		c.fillRoundRect (20, 485, 970, 105, 80, 30);
		c.setColor (Color.black);
		c.drawString ("Awedish used absorb!", 30, 525);
		c.setFont (AndrewEdwardWaynePocketmans.battle);
		c.drawString ("Press any key to continue...", 750, 585);
		c.getChar ();

		//Absorb animation
		for (int i = 200 ; i > 0 ; i--)
		{
		    new BattleMap ();

		    if (pokeTeam == 1)
			new DrawsAwedish ();
		    if (pokeTeam == 2)
			new DrawsSoda ();
		    if (pokeTeam == 3)
			new DrawsDweeb ();
		    c.setColor (leafGreen);

		    //Absorb circle
		    c.fillOval (740 - i / 3, 115 - i / 3, i, i);

		    for (int j = 0 ; j < 250000 ; j++)
		    {
		    }
		}

		//Determines if its a normal, crit, or miss
		if (rng > 0.1 || tutorial == 1 || tutorial == 2)
		    enemyhp -= teamLevel; //Normal
		else
		{
		    enemyhp -= teamLevel * 2; // Super Effective
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.setColor (Color.black);
		    c.drawString ("It was super effective!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();
		}
		//Dweebble doesnt die
		if (tutorial == 2 && enemyhp < 0)
		    enemyhp = 1;
	    }
	    else //(This is a miss)
	    {
		c.setColor (hudBrown);
		c.fillRoundRect (10, 475, 990, 125, 100, 50);
		c.setFont (dialog);
		c.setColor (Color.white);
		c.fillRoundRect (20, 485, 970, 105, 80, 30);
		c.setColor (Color.black);
		c.drawString ("It missed!", 30, 525);
		c.setFont (battle);
		c.drawString ("Press any key to continue...", 750, 585);
		c.getChar ();
	    }
	}

	//Finishes the attack
	new BattleMap ();
	absorbAttack = 0;
	turn += 1;
    }


    public static void xscissorAnimation ()  // Dweebble attack
    {
	if (turn % 2 == 1)
	{
	    AndrewEdwardWaynePocketmans.dweebMoves.setVisible (false);
	    rng = Math.random ();
	    //95% chance to hit
	    if (rng > 0.05)
	    {
		c.setColor (hudBrown);
		c.fillRoundRect (10, 475, 990, 125, 100, 50);
		c.setFont (dialog);
		c.setColor (Color.white);
		c.fillRoundRect (20, 485, 970, 105, 80, 30);
		c.setColor (Color.black);
		c.drawString ("Dweebble used X-Scissor!", 30, 525);
		c.setFont (AndrewEdwardWaynePocketmans.battle);
		c.drawString ("Press any key to continue...", 750, 585);
		c.getChar ();

		//Draws an X // 750 124
		c.setColor (orange);
		fill = 0;
		for (int i = 740 ; i <= 830 ; i++)
		{
		    fill += 1;
		    c.fillOval (i, 110 + fill, 6, 6);
		    for (int j = 0 ; j < 2500000 ; j++)
		    {
		    }
		}
		fill = 0;
		for (int i = 830 ; i >= 740 ; i--)
		{
		    fill += 1;
		    c.fillOval (i, 110 + fill, 6, 6);
		    for (int j = 0 ; j < 2500000 ; j++)
		    {
		    }
		}
		fill = 0;
		new BattleMap ();
		new DrawsDweeb ();

		//Determines if its a normal, crit, or miss
		if (rng > 0.2)
		    enemyhp -= teamLevel; //Normal
		else
		{
		    enemyhp -= teamLevel * 2; //Super-effective
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.setColor (Color.black);
		    c.drawString ("It was super effective!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();
		}
	    }
	    else //(This is a miss)
	    {
		c.setColor (hudBrown);
		c.fillRoundRect (10, 475, 990, 125, 100, 50);
		c.setFont (dialog);
		c.setColor (Color.white);
		c.fillRoundRect (20, 485, 970, 105, 80, 30);
		c.setColor (Color.black);
		c.drawString ("It missed!", 30, 525);
		c.setFont (battle);
		c.drawString ("Press any key to continue...", 750, 585);
		c.getChar ();
	    }
	}

	//Finishes the attack
	new BattleMap ();
	xscissorAttack = 0;
	turn += 1;
    }


    public static void slamAnimation ()  //Sodawoda attack
    {
	if (turn % 2 == 1)
	{
	    AndrewEdwardWaynePocketmans.sodaMoves.setVisible (false);
	    rng = Math.random ();
	    //95% chance to hit
	    if (rng > 0.05)
	    {
		new BattleMap ();
		new DrawsSoda ();
		c.setColor (hudBrown);
		c.fillRoundRect (10, 475, 990, 125, 100, 50);
		c.setFont (dialog);
		c.setColor (Color.white);
		c.fillRoundRect (20, 485, 970, 105, 80, 30);
		c.setColor (Color.black);
		c.drawString ("Sodawoda used Slam!", 30, 525);
		c.setFont (AndrewEdwardWaynePocketmans.battle);
		c.drawString ("Press any key to continue...", 750, 585);
		c.getChar ();

		//BODYSLAM
		for (int i = sodawodax ; i <= 780 ; i += 3)
		{
		    sodawodax += 3;
		    sodawoday -= 2;
		    new DrawsSoda ();
		    for (int j = 0 ; j < 2500000 ; j++)
		    {
		    }
		}
		for (int i = 780 ; i >= 238 ; i -= 3)
		{
		    sodawodax -= 3;
		    sodawoday += 2;
		    new DrawsSoda ();
		    for (int j = 0 ; j < 2500000 ; j++)
		    {
		    }
		}
		new BattleMap ();

		//Determines if its a normal, crit, or miss
		if (rng > 0.2)
		    enemyhp -= teamLevel; //Normal
		else
		{
		    enemyhp -= teamLevel * 2; //Super-effective
		    c.setColor (hudBrown);
		    c.fillRoundRect (10, 475, 990, 125, 100, 50);
		    c.setFont (dialog);
		    c.setColor (Color.white);
		    c.fillRoundRect (20, 485, 970, 105, 80, 30);
		    c.setColor (Color.black);
		    c.drawString ("It was super effective!", 30, 525);
		    c.setFont (battle);
		    c.drawString ("Press any key to continue...", 750, 585);
		    c.getChar ();
		}
	    }
	    else //(This is a miss)
	    {
		c.setColor (hudBrown);
		c.fillRoundRect (10, 475, 990, 125, 100, 50);
		c.setFont (dialog);
		c.setColor (Color.white);
		c.fillRoundRect (20, 485, 970, 105, 80, 30);
		c.setColor (Color.black);
		c.drawString ("It missed!", 30, 525);
		c.setFont (battle);
		c.drawString ("Press any key to continue...", 750, 585);
		c.getChar ();
	    }
	}

	//Finishes the attack
	new BattleMap ();
	slamAttack = 0;
	turn += 1;
    }


    public static void moonlightAnimation ()  //Awedish defensive
    {
	if (turn % 2 == 1)
	{
	    AndrewEdwardWaynePocketmans.aweMoves.setVisible (false);
	    c.setColor (hudBrown);
	    c.fillRoundRect (10, 475, 990, 125, 100, 50);
	    c.setFont (dialog);
	    c.setColor (Color.white);
	    c.fillRoundRect (20, 485, 970, 105, 80, 30);
	    c.setColor (Color.black);
	    c.drawString ("Awedish used moonlight!", 30, 525);
	    c.setFont (battle);
	    c.drawString ("Press any key to continue...", 750, 585);
	    c.getChar ();

	    //Healing
	    hp += (int) (maxhp / 2.0);
	    if (hp > maxhp)
		hp = maxhp; //Makes sure you don't overheal

	    c.setFont (dialog);
	    c.setColor (Color.white);
	    c.fillRoundRect (20, 485, 970, 105, 80, 30);
	    c.setColor (Color.black);
	    c.drawString ("Awedish healed for " + (int) (maxhp / 2.0) + "hp!", 30, 525);
	    c.setFont (battle);
	    c.drawString ("Press any key to continue...", 750, 585);
	    c.getChar ();
	}

	//Finishes the heal
	new BattleMap ();
	moonlightAttack = 0;
	turn += 1;
    }


    public static void blockAnimation ()  //Dweebble defense
    {
	if (turn % 2 == 1)
	{
	    AndrewEdwardWaynePocketmans.dweebMoves.setVisible (false);
	    c.setColor (hudBrown);
	    c.fillRoundRect (10, 475, 990, 125, 100, 50);
	    c.setFont (dialog);
	    c.setColor (Color.white);
	    c.fillRoundRect (20, 485, 970, 105, 80, 30);
	    c.setColor (Color.black);
	    c.drawString ("Dweebble used block!", 30, 525);
	    c.setFont (battle);
	    c.drawString ("Press any key to continue...", 750, 585);
	    c.getChar ();
	}

	//Finishes the block
	new BattleMap ();
	blockAttack = 2;
	turn += 1;
    }


    public static void tearfullookAnimation ()  //Sodawoda defense
    {
	if (turn % 2 == 1)
	{
	    AndrewEdwardWaynePocketmans.sodaMoves.setVisible (false);
	    c.setColor (hudBrown);
	    c.fillRoundRect (10, 475, 990, 125, 100, 50);
	    c.setFont (dialog);
	    c.setColor (Color.white);
	    c.fillRoundRect (20, 485, 970, 105, 80, 30);
	    c.setColor (Color.black);
	    c.drawString ("Sodawoda used tearful look!", 30, 525);
	    c.setFont (battle);
	    c.drawString ("Press any key to continue...", 750, 585);
	    c.getChar ();

	    c.setFont (dialog);
	    c.setColor (Color.white);
	    c.fillRoundRect (20, 485, 970, 105, 80, 30);
	    c.setColor (Color.black);
	    c.drawString ("This move doesn't do anything by the way!", 30, 525);
	    c.setFont (battle);
	    c.drawString ("Press any key to continue...", 750, 585);
	    c.getChar ();
	}


	//Finishes defense
	new BattleMap ();
	tearfullookAttack = 0;
	turn += 1;
    }
} //AndrewEdwardWaynePocketmansclass


//Classes of the attacks
class absorb implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	if (AndrewEdwardWaynePocketmans.events == 1 && AndrewEdwardWaynePocketmans.tutorial == 1)
	    JOptionPane.showMessageDialog (null, "Why are you listening to that dumb tree? Just capture him.");
	else if (AndrewEdwardWaynePocketmans.enemyhp == 1 && AndrewEdwardWaynePocketmans.tutorial == 2)
	    JOptionPane.showMessageDialog (null, "Hmm..I don't feel like fighting him anymore. Let's just capture him!");
	else
	    AndrewEdwardWaynePocketmans.absorbAttack = 1;
    }
} // main method


class moonlight implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	if (AndrewEdwardWaynePocketmans.events == 0 && AndrewEdwardWaynePocketmans.tutorial == 1)
	    JOptionPane.showMessageDialog (null, "Moonlight is not an attack!");
	else if (AndrewEdwardWaynePocketmans.events == 1 && AndrewEdwardWaynePocketmans.tutorial == 1)
	    JOptionPane.showMessageDialog (null, "Why are you listening to that dumb tree? Just capture him.");
	else if (AndrewEdwardWaynePocketmans.enemyhp == 1 && AndrewEdwardWaynePocketmans.tutorial == 2)
	    JOptionPane.showMessageDialog (null, "Hmm..I don't feel like fighting him anymore. Let's just capture him!");
	else
	    AndrewEdwardWaynePocketmans.moonlightAttack = 1;
    }
} // main method


class acid implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	JOptionPane.showMessageDialog (null, "You will unlock Acid from leveling up.");
    }
} // main method


class xscissor implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	AndrewEdwardWaynePocketmans.xscissorAttack = 1;
    }
} // main method


class block implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	AndrewEdwardWaynePocketmans.blockAttack = 1;
    }
} // main method


class rockblast implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	JOptionPane.showMessageDialog (null, "You will unlock Rock Blast from leveling up.");
    }
} // main method


class slam implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	AndrewEdwardWaynePocketmans.slamAttack = 1;
    }
} // main method


class tearfullook implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	AndrewEdwardWaynePocketmans.tearfullookAttack = 1;
    }
} // main method


class woodhammer implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	JOptionPane.showMessageDialog (null, "You will unlock Woodhammer from leveling up.");
    }
} // main method


class back implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	if (AndrewEdwardWaynePocketmans.tutorial != 1 || AndrewEdwardWaynePocketmans.events != 0)
	{
	    AndrewEdwardWaynePocketmans.battleframe = -10;
	    AndrewEdwardWaynePocketmans.sodaMoves.setVisible (false);
	    AndrewEdwardWaynePocketmans.aweMoves.setVisible (false);
	    AndrewEdwardWaynePocketmans.dweebMoves.setVisible (false);
	    AndrewEdwardWaynePocketmans.bag.setSize (new Dimension (300, 400));
	    AndrewEdwardWaynePocketmans.bag.setVisible (true);
	}
	else
	    JOptionPane.showMessageDialog (null, "You should listen to the tree.");
    }
} // main method


//Classes of the action listeners for the bag
class fightscreen implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	if (AndrewEdwardWaynePocketmans.pokeTeam == 1)
	    AndrewEdwardWaynePocketmans.aweMoves.setVisible (true);
	if (AndrewEdwardWaynePocketmans.pokeTeam == 2)
	    AndrewEdwardWaynePocketmans.sodaMoves.setVisible (true);
	if (AndrewEdwardWaynePocketmans.pokeTeam == 3)
	    AndrewEdwardWaynePocketmans.dweebMoves.setVisible (true);
	AndrewEdwardWaynePocketmans.bag.setVisible (false);
    }
} // main method


class capturescreen implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	//Makes sure if player has pokeballs
	if (AndrewEdwardWaynePocketmans.pokeballs > 0)
	{
	    AndrewEdwardWaynePocketmans.bag.setVisible (false);
	    AndrewEdwardWaynePocketmans.pokeballs -= 1;

	    AndrewEdwardWaynePocketmans.c.setColor (Color.WHITE);
	    AndrewEdwardWaynePocketmans.c.fillRect (0, 0, 1000, 1000);
	    //Pocketball animation
	    for (int i = -600 ; i <= 1000 ; i += 16)
	    {
		//Draws pokeball
		AndrewEdwardWaynePocketmans.c.setColor (Color.white);
		AndrewEdwardWaynePocketmans.c.fillArc (i, 0, 600, 600, 180, 180);
		AndrewEdwardWaynePocketmans.c.setColor (Color.red);
		AndrewEdwardWaynePocketmans.c.fillArc (i, 0, 600, 600, 0, 180);
		AndrewEdwardWaynePocketmans.c.setColor (Color.black);
		AndrewEdwardWaynePocketmans.c.fillRoundRect (i, 290, 600, 20, 20, 20);
		AndrewEdwardWaynePocketmans.c.fillOval (i + 250, 250, 100, 100);
		AndrewEdwardWaynePocketmans.c.drawOval (i, 0, 600, 600);
		AndrewEdwardWaynePocketmans.c.setColor (Color.white);
		AndrewEdwardWaynePocketmans.c.fillOval (i + 270, 270, 60, 60);
		//Delay to minimize flicker
		try
		{
		    Thread.sleep (25);
		}
		catch (Exception e)
		{
		}
	    }
	    AndrewEdwardWaynePocketmans.c.clear ();
	    AndrewEdwardWaynePocketmans.rng = Math.random ();
	    //Catch rate is equal to ((10%)+(% of opponents missing hp))
	    if ((AndrewEdwardWaynePocketmans.rng + 0.1 > (AndrewEdwardWaynePocketmans.enemyhp / AndrewEdwardWaynePocketmans.enemymaxhp) || AndrewEdwardWaynePocketmans.tutorial == 1) && AndrewEdwardWaynePocketmans.tutorial != 7)
	    {
		if (AndrewEdwardWaynePocketmans.tutorial == 11)
		{
		    AndrewEdwardWaynePocketmans.snorcap = 1;
		    AndrewEdwardWaynePocketmans.area = 14;
		    AndrewEdwardWaynePocketmans.tutorial = 12;
		}
		if (AndrewEdwardWaynePocketmans.tutorial == 10)
		{
		    AndrewEdwardWaynePocketmans.polygcap = 1;
		    AndrewEdwardWaynePocketmans.area = 13;
		    AndrewEdwardWaynePocketmans.tutorial = 11;
		}
		if (AndrewEdwardWaynePocketmans.tutorial == 9)
		{
		    AndrewEdwardWaynePocketmans.lickycap = 1;
		    AndrewEdwardWaynePocketmans.tutorial = 10;
		}
		if (AndrewEdwardWaynePocketmans.tutorial == 8)
		{
		    AndrewEdwardWaynePocketmans.geodudecap = 1;
		    AndrewEdwardWaynePocketmans.tutorial = 9;
		}
		if (AndrewEdwardWaynePocketmans.tutorial == 6)
		{
		    AndrewEdwardWaynePocketmans.bronzecap = 1;
		    AndrewEdwardWaynePocketmans.area = 11;
		    AndrewEdwardWaynePocketmans.tutorial = 7;
		}
		if (AndrewEdwardWaynePocketmans.tutorial == 5)
		{
		    AndrewEdwardWaynePocketmans.digcap = 1;
		    AndrewEdwardWaynePocketmans.area = 10;
		    AndrewEdwardWaynePocketmans.tutorial = 6;
		}
		if (AndrewEdwardWaynePocketmans.tutorial == 4)
		{
		    AndrewEdwardWaynePocketmans.koffcap = 1;
		    AndrewEdwardWaynePocketmans.area = 8;
		    AndrewEdwardWaynePocketmans.tutorial = 5;
		}
		if (AndrewEdwardWaynePocketmans.tutorial == 3)
		{
		    AndrewEdwardWaynePocketmans.toadcap = 1;
		    AndrewEdwardWaynePocketmans.area = 6;
		    AndrewEdwardWaynePocketmans.tutorial = 4;
		}
		if (AndrewEdwardWaynePocketmans.tutorial == 2)
		{
		    AndrewEdwardWaynePocketmans.a3redraw = 1;
		    AndrewEdwardWaynePocketmans.area = 3;
		    AndrewEdwardWaynePocketmans.y = 280;
		    AndrewEdwardWaynePocketmans.dweebcap = 1;
		    AndrewEdwardWaynePocketmans.tutorial = 3;
		}
		if (AndrewEdwardWaynePocketmans.tutorial == 1)
		{
		    AndrewEdwardWaynePocketmans.area = 1;
		    AndrewEdwardWaynePocketmans.sodacap = 1;
		    AndrewEdwardWaynePocketmans.tutorial = 2;
		}
		//Adds to pokemon count
		AndrewEdwardWaynePocketmans.pokemonCount += 1;

		//Tells player if they succeeded or failed the capture
		AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
		AndrewEdwardWaynePocketmans.c.setColor (Color.black);
		AndrewEdwardWaynePocketmans.c.drawString ("Capture successful!", 100, 100);
		AndrewEdwardWaynePocketmans.c.drawString ("Press any key to continue...", 100, 200);
		AndrewEdwardWaynePocketmans.a3redraw = 1;
		AndrewEdwardWaynePocketmans.aweMoves.setVisible (false);
	    }
	    else
	    {
		AndrewEdwardWaynePocketmans.turn += 1;
		AndrewEdwardWaynePocketmans.c.setColor (AndrewEdwardWaynePocketmans.hudBrown);
		AndrewEdwardWaynePocketmans.c.fillRoundRect (10, 475, 990, 125, 100, 50);
		AndrewEdwardWaynePocketmans.c.setFont (AndrewEdwardWaynePocketmans.dialog);
		AndrewEdwardWaynePocketmans.c.setColor (Color.white);
		AndrewEdwardWaynePocketmans.c.fillRoundRect (20, 485, 970, 105, 80, 30);
		AndrewEdwardWaynePocketmans.c.setColor (Color.black);
		AndrewEdwardWaynePocketmans.c.drawString ("Capture failed!", 30, 525);
	    }
	    try
	    {
		Thread.sleep (2000);
	    }
	    catch (Exception e)
	    {
	    }
	}
	else
	    JOptionPane.showMessageDialog (null, "You ran out of pocketballs!");
    }
} // main method


class switchscreen implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	if (AndrewEdwardWaynePocketmans.dweebcap == 1)
	{
	    AndrewEdwardWaynePocketmans.changepoke.setVisible (true);
	    AndrewEdwardWaynePocketmans.bag.setVisible (false);
	}
	else
	    JOptionPane.showMessageDialog (null, "You must have at least 3 pocketmans first.");
    }
} // main method


//Allows player to change their pokemon during battle
class switchA implements ActionListener //Switches pokemon
{
    public void actionPerformed (ActionEvent event)
    {
	if (AndrewEdwardWaynePocketmans.pokeTeam != 1)
	{
	    AndrewEdwardWaynePocketmans.pokeTeam = 1;
	    AndrewEdwardWaynePocketmans.teamPoke = "Awedish";
	}
	else
	    JOptionPane.showMessageDialog (null, "You are already using this pocketman!");

	AndrewEdwardWaynePocketmans.changepoke.setVisible (false);

	try
	{
	    Thread.sleep (2500);
	}
	catch (Exception e)
	{
	}
	AndrewEdwardWaynePocketmans.bag.setVisible (true);
    }
} // main method


class switchB implements ActionListener //Switches pokemon
{
    public void actionPerformed (ActionEvent event)
    {
	if (AndrewEdwardWaynePocketmans.pokeTeam != 3)
	{
	    if (AndrewEdwardWaynePocketmans.dweebhp > 0)
	    {
		AndrewEdwardWaynePocketmans.pokeTeam = 3;
		AndrewEdwardWaynePocketmans.teamPoke = "Dweebble";
	    }
	    else
		JOptionPane.showMessageDialog (null, "You cannot swap to a dead pokemon");
	}
	else
	    JOptionPane.showMessageDialog (null, "You are already using this pocketman!");

	AndrewEdwardWaynePocketmans.changepoke.setVisible (false);

	try
	{
	    Thread.sleep (2500);
	}
	catch (Exception e)
	{
	}
	AndrewEdwardWaynePocketmans.bag.setVisible (true);
    }
} // main method


class switchC implements ActionListener //Switches pokemon
{
    public void actionPerformed (ActionEvent event)
    {
	if (AndrewEdwardWaynePocketmans.pokeTeam != 2)
	{
	    if (AndrewEdwardWaynePocketmans.sodahp > 0)
	    {
		AndrewEdwardWaynePocketmans.pokeTeam = 2;
		AndrewEdwardWaynePocketmans.teamPoke = "Sodawoda";
	    }
	    else
		JOptionPane.showMessageDialog (null, "You cannot swap to a dead pokemon");
	}
	else
	    JOptionPane.showMessageDialog (null, "You are already using this pocketman!");

	AndrewEdwardWaynePocketmans.changepoke.setVisible (false);

	try
	{
	    Thread.sleep (2500);
	}
	catch (Exception e)
	{
	}
	AndrewEdwardWaynePocketmans.bag.setVisible (true);
    }
} // main method


//Closes the starting screen
class closeframe implements ActionListener //Switches pokemon
{
    public void actionPerformed (ActionEvent event)
    {
	AndrewEdwardWaynePocketmans.life = 1;
	AndrewEdwardWaynePocketmans.starting.setVisible (false);
	AndrewEdwardWaynePocketmans.endScreen.setVisible (false);
    }
}
