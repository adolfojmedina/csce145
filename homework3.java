//Adolfo Medina 
import java.util.Random;
import java.util.Scanner;

public class homework3 {
	public static final int MAX = 3;
	
	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		Random r = new Random(); // created random input for computer 
		
		int rock = 0; // create variables for rock paper and scissors
		int paper = 1;
		int scissors = 2;
		int playerChoice = MAX;
	
		boolean play = true;
		
		System.out.println("welcome to a game of rock paper scissors. Three rounds will be played!!!");
		
		while(play == true)
		{
			int playerScore = 0; // created variables inside loop so they'll reset if user chooses to play again
			int cpuScore = 0;
			
			for(int i = 0; i < 3; i++) // created for loop to set predetermined amount of games played to 3
			{
				System.out.println("\nChoose  \"paper\", \"rock\" or \"scissors\":");
		
				String playerInput = key.next(); //stores user input 
				int cpuChoice = r.nextInt(MAX); // stores random choice for computer
				
				if(playerInput.equalsIgnoreCase("rock"))
				{
					playerChoice = 0;
				 
					if(cpuChoice == 1)
					{
						System.out.println("You chose rock the cpu chose paper . You lost this round the Cpu gets 1 point");
						cpuScore++;
					}
					else if(cpuChoice == 2)
					{
					 	System.out.println("You chose rock the computer chose scissors. You beat the CPU you get 1 point");
					 	playerScore++;
					}
					else if(playerChoice == cpuChoice)
					{
							System.out.println("You tied No points are awarded ");
					}
				}
		
				else if(playerInput.equalsIgnoreCase("paper"))
				{
					playerChoice = 1;
					
					if(cpuChoice == 2)
					{
						System.out.println("You chose paper the computer chose scissors. You lost this round the CPU gets 1 point");
						cpuScore++; // adds plus 1 to computer score 
					}
					else if(cpuChoice == 0)
					{
						System.out.println("You chose paper the computer chose rock. You won this round you get 1 point");
						playerScore++; //adds plus 1 to user score 
					}
					else if(playerChoice == cpuChoice)
					{
						System.out.println("You tied No points are awarded ");
					}
				}
				else if(playerInput.equalsIgnoreCase("scissors"))
				{
					playerChoice = 2;
				
					if(cpuChoice == 0)
					{
						System.out.println(" You chose scissors the computer chose rock. You lost this round the CPU gets 1 point");
						cpuScore++;
					}
					else if(cpuChoice == 1)
					{
						System.out.println("You chose scissors the computer chose paper. You won this round you get 1 point");
						playerScore++;
					}
					else if(playerChoice == cpuChoice) 
					{
						System.out.println("You tied No points are awarded ");
					}
				}
				else //input validation
				{
					System.out.println("Invalid entry cpu gets 1 point \nPlease enter rock paper or scissors!!!");
					cpuScore++;
				}
			
				System.out.println("Player Score: "+ playerScore +"");
				System.out.println("Computer Score: " + cpuScore +"");
			}
		
			if(playerScore > cpuScore)
			{
				System.out.println("\ncongratulations you won ");
				System.out.println("Player Score: "+ playerScore +"");
				System.out.println("Computer Score: " + cpuScore +"");
			}
		
			else if(playerScore < cpuScore)
			{
				System.out.println("\nYou lost the game!!!");
				System.out.println("Player Score: "+ playerScore +"");
				System.out.println("Computer Score: " + cpuScore +"");
			}
			else if(playerScore == cpuScore)
			{
				System.out.println("\nYou tied with the computer");
				System.out.println("Player Score: "+ playerScore +"");
				System.out.println("Computer Score: " + cpuScore +"");
			}
		
			System.out.println("Do you want to play again? Enter \"Yes\" or \"No\":");
		
			String userInput = key.next();		
		
			if(userInput.equalsIgnoreCase("no")) // ends while loop if user doesnt want to play. continues loop if user wants to continue playing 
			{
				play = false;
				System.out.println("Exiting the program!");	
	
			}
		}
	}	
	
		
		

}
