import java.util.Scanner;

public class homework2 {

	public static final int Health = 100; // constant for health
	
	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in); //creating scanner to accept user input
		
		
		String ogre = " Brute  "; //creating strings for if, else if statements
		String human = "Warrior";
		String druid = "Mage";
		
		String  straight = "go straight";
		String left = "go left";
		String right ="go right";
		
		int chupacabra = 110; //attack damage
		
		String flee = "ran away";
		String hide = "hid";
		String fight = "fought valiantly";		
		
		int remaininghealth = Health - chupacabra;
		
		String cross = "crossed";
		String around = "went around";
		String back = "turned back";

		String over ="go over bridge";
		String swim = "swim across river";
		String along ="walk along bank";
		
		
		
		System.out.println("Choose your Character. Enter \"Ogre\", \"Human\" or \"Druid\":");
		
		String character = key.next();
		if(character.equalsIgnoreCase("Ogre"))
		{
		character = ogre;
		System.out.println("you are a" + ogre +" to start the game");
		
		System.out.println("Your starting health is: "+ Health + "");
		}
		else if(character.equalsIgnoreCase("Human"))
		{
		character = human;
		System.out.println("You are a" + human +" to start the game");
		
		System.out.println("Your Starting Health is: "+ Health + "");
		}
		else if(character.equalsIgnoreCase("Druid"))
		{
		character = druid;
		
		System.out.println("You are a" + druid +" to start the game");
		
		System.out.println("Your Starting Health is: "+ Health + "");
		
		}
		else
		{
		System.out.println("Invalid Character Choice! Exiting game");
		
		System.exit(0);
		}
		
		System.out.println("You're walking in the forest you come to a split in the trail. Do you wish to go \"Straight\", \"Left\" or \"Right");
		
		String direction = key.next();
		
		if(direction.equalsIgnoreCase("Straight"))
		{
			direction = straight;
		System.out.println("You walked straight down the path and found a chest. Do you wish to open it \"yes\" or \"no\"");
		
		String choice = key.next();
		
		if(choice.equals("yes"))
			{
			System.out.println("You open the chest and find inside a magic orb.Congratulations you automatically won!!!");
			}
		else
			{
			System.out.println("You leave the chest alone and continue walking straight down the path.You Encounter a Chupacabra!!!");
			System.out.println("Do you wish to \"flee\", \"hide\" or \"fight\"");
			}
		String battle = key.next();
		
		if(battle.equalsIgnoreCase("flee"))
			{
			battle = flee;
			System.out.println("You tried to run away from the chupacabra, but he caught you and attacked");
			System.out.println(" Your health equals "+ remaininghealth +"");
			}
	
		
		else if(battle.equalsIgnoreCase("fight"))
			{
			battle = fight;

			System.out.println("You fought valiantly and defeated the chupacabra however you eventually succumbed to your injuries");
			System.out.println("GAME OVER!!!!");
			System.exit(0);
			}
			
				
		else if(battle.equalsIgnoreCase("Hide"))
			{
				battle = hide;
				System.out.println("You Successfully hid from the chupacabra");
				System.out.println("You sneak off into the forest and are rescued");
				System.out.println("Congrats you won the game");
			}
		else 
			{
			System.out.println("INVALID CHOICE! EXITING GAME!!!");
			System.exit(0);
			}
		
		
		}
		else if(direction.equalsIgnoreCase("left"))
		{
				direction = left;
				System.out.println("You come open a meadow and see a castle on the otherside");
			
			
			System.out.println("You can \"cross\",go \"around\" or turn \"back\"");
			
			String castle = key.next();
			
			if(castle.equalsIgnoreCase("cross"))
			{
				castle = cross;
				System.out.println("You tried to cross the meadow");
				System.out.println("your attempt was futile a griffin swoops down and carries you away");
				System.out.println("GAME OVER!!!");
				System.exit(0);
			}	
			else if(castle.equalsIgnoreCase("around"))
			{
				castle = around;
				System.out.println("You succesfully navigated around the meadow");
				System.out.println("You reached the castle and were greeted by the princess who gave you a magic orb ");
				System.out.println("CONGRATULATIONS YOU WON THE GAME!!!");
				System.exit(0);
			}
			else if(castle.equalsIgnoreCase("back"))
			{
				castle = back;
				System.out.println("You tried to turn back and walk into the forest");
				System.out.println("A band of thieves was waiting for you and took you prisoner");
				System.out.println("YOU LOSE!!!");
				System.exit(0);
			}
			else 
			{
				System.out.println("INVALID CHOICE!! EXITING GAME"); //input validation
				System.exit(0);
			}
		}
		else if(direction.equalsIgnoreCase("right"))
		{
			direction = right;
			System.out.println("After wandering down the path you walk through a clearing and approach a river");
			System.out.println("You can go \"over\"the bridge, \"swim\"across the river or walk \"along\"the bank");
			
			String bridge = key.next();
			
			if(bridge.equalsIgnoreCase("over"))
			{
				bridge = over;
				System.out.println("You tried to go over the bridge but were met by a troll"); //creating nest of if/ else if statements for user input
				System.out.println("You did not have the money to pay the troll toll");
				System.out.println("so he took your life as payment GAME OVER!!!");
				System.exit(0);
			}
			else if(bridge.equalsIgnoreCase("swim"))
			{
				bridge =swim;
				System.out.println("The current was too strong and the river over took you");
				System.out.println("You drowned to death!!! GAME OVER!!!");
				System.exit(0);
			}
			
			else if(bridge.equalsIgnoreCase("along"))
			{
				bridge = along;
				System.out.println("You walked along the bank until you found a shallow area in the river to cross");
				System.out.println("You succesfully crossed the river and found a treasure chest with a magic orb");
				System.out.println("CONGRATULATIONS YOU WON THE GAME");
			}
			else
			{
				System.out.println("INVALID CHOICE EXITING GAME!!!");
				System.exit(0);
			}
	
		}
		else 
		{
			System.out.println("INVALID CHOICE!! EXITING GAME!!!");
			System.exit(0);
		}
		if(remaininghealth < 0 || remaininghealth == 0)
		{
			System.out.println("You died!!! GAME OVER!!!");
			System.exit(0);
		}
	
			
			
	}
	
		
	
	
	}

	
		
	
	