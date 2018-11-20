//Written by Dylan Desai

import java.util.Scanner;
import java.util.Random;

public class RPS {

	public static void main(String[] args) {
		/*
		 * ALL OF THE VARIABLES AND OBJECTS ARE GOING HERE!!!
		 */
		Random numGen = new Random();
		Scanner input = new Scanner(System.in);
		int playerWin = 0;
		int cpuWin = 0;
		int drawCount = 0;
		boolean play = true;
		boolean validInput = false;
		int choiceAsNum = 0;
		String playerChoice;
		String CPUChoice = "";
		
		//Prompt the user
		System.out.println("Hello, welcome to Dylan's Rock Paper Scissors best 2/3.\n");
		
				
		//while loop for running RPS while player wants to play
		while (play)
		{
			
			//for loop for best out of 3 matches of RPS
			for(int i = 0; i < 3; i++)
			{			
				
				//prompt user 
				System.out.println("Please choose Rock, Paper, or Scissors.");	
				playerChoice = input.nextLine();
				
				System.out.println("\nPLAYER CHOICE: " + playerChoice);
				
				//if the player's input is valid, then go on with the program, otherwise the CPU gets a point for the round
				if (playerChoice.equalsIgnoreCase("rock") || playerChoice.equalsIgnoreCase("paper") || playerChoice.equalsIgnoreCase("scissors"))
				{
					//random generator makes CPU's choice
					choiceAsNum = numGen.nextInt(3);
					switch(choiceAsNum)
					{
					case 0:
						CPUChoice = "Rock";
						break;
					case 1:
						CPUChoice = "Paper";
						break;
					case 2:
						CPUChoice = "Scissors";
						break;
					}
					
					System.out.println("CPU CHOICE: " + CPUChoice + "\n");
					
					
					//Compare player choice vs CPU choice for cpu wins
					if (playerChoice.equalsIgnoreCase("Rock") && CPUChoice.equalsIgnoreCase("paper"))
					{
						System.out.println("Rock VS Paper. CPU gets point");
						cpuWin += 1;
					}
					if (playerChoice.equalsIgnoreCase("Paper") && CPUChoice.equalsIgnoreCase("Scissors"))
					{
						System.out.println("Paper VS Scissors. CPU gets point");
						cpuWin +=1;
					}
					if (playerChoice.equalsIgnoreCase("scissors") && CPUChoice.equalsIgnoreCase("rock"))
					{
						System.out.println("Scissors vs Rock. CPU gets point.");
						cpuWin +=1;
					}		
					
					//compare player choice vs CPU choice for player wins
					if (playerChoice.equalsIgnoreCase("Paper") && CPUChoice.equalsIgnoreCase("Rock"))
					{
						System.out.println("Paper VS Rock. Player gets point");
						playerWin += 1;
					}
					if (playerChoice.equalsIgnoreCase("Scissors") && CPUChoice.equalsIgnoreCase("Paper"))
					{
						System.out.println("Scissors VS Paper. Player gets point");
						playerWin +=1;
					}
					if (playerChoice.equalsIgnoreCase("rock") && CPUChoice.equalsIgnoreCase("scissors"))
					{
						System.out.println("Rock VS Scissors. Player gets point.");
						playerWin +=1;
					}
					
					//draw
					if (playerChoice.equalsIgnoreCase(CPUChoice))
					{
						System.out.println("It's a draw.");
						drawCount += 1;
					}
				}
				else
				{
					System.out.println(playerChoice + " is not a choice. CPU automatically gets a point.");
					cpuWin += 1;
				}
				
				
				
				//Summarize the results of the rounds
				System.out.println("\nRound " + (i+1) + " summary:\n" + "Player wins: " + playerWin + " CPU wins: " + cpuWin + " Draws: " + drawCount + "\n" );
				
				
				//Check for a winner if it is the 2nd round and the winner has won twice
				if (i >=1)
				{
					if (playerWin > cpuWin && playerWin>= 2)
					{
						System.out.println("Player wins!");
						
						//ask to play again
						System.out.println("Play again? (enter yes or no)");
						playerChoice = input.nextLine();					
						if (playerChoice.equalsIgnoreCase("Yes"))
						{
							play = true;
							//reset the counters
							playerWin = 0;
							cpuWin = 0;
							drawCount = 0;
						}
						else if (playerChoice.equalsIgnoreCase("No"))
						{
							play = false;
							System.out.println("Bye!");
							System.exit(0);
						}
						else
						{
							System.out.println("Not an answer");
							System.exit(0);
						}
						
					}
					else if (playerWin< cpuWin && cpuWin >= 2)
					{
						System.out.println("CPU wins!");
						
						//ask to play again
						System.out.println("Play again? (enter yes or no)");
						playerChoice = input.nextLine();					
						if (playerChoice.equalsIgnoreCase("Yes"))
						{
							play = true;
							//reset the counters
							playerWin = 0;
							cpuWin = 0;
							drawCount = 0;
						}
						else if (playerChoice.equalsIgnoreCase("No"))
						{
							play = false;
							System.out.println("Bye!");
							System.exit(0);
						}
						else
						{
							System.out.println("Not an answer");
							System.exit(0);
						}
					}
					
				}
				
				
				//Check for wins at the end of the 3rd round 
				if (i == 2)
				{
					if (playerWin > cpuWin)
					{
						System.out.println("Player wins!");
						
						//ask to play again
						System.out.println("Play again? (enter yes or no)");
						playerChoice = input.nextLine();					
						if (playerChoice.equalsIgnoreCase("Yes"))
						{
							play = true;
							//reset the counters
							playerWin = 0;
							cpuWin = 0;
							drawCount = 0;
						}
						else if (playerChoice.equalsIgnoreCase("No"))
						{
							play = false;
							System.out.println("Bye!");
							System.exit(0);
						}
						else
						{
							System.out.println("Not an answer");
							System.exit(0);
						}
					}
					else if (playerWin < cpuWin)
					{
						System.out.println("CPU wins!");
						
						//ask to play again
						System.out.println("Play again? (enter yes or no)");
						playerChoice = input.nextLine();					
						if (playerChoice.equalsIgnoreCase("Yes"))
						{
							play = true;
							//reset the counters
							playerWin = 0;
							cpuWin = 0;
							drawCount = 0;
						}
						else if (playerChoice.equalsIgnoreCase("No"))
						{
							play = false;
							System.out.println("Bye!");
							System.exit(0);
						}
						else
						{
							System.out.println("Not an answer");
							System.exit(0);
						}
					}
					else
					{
						System.out.println("Nobody won.");
						
						//ask to play again
						System.out.println("Play again? (enter yes or no)");
						playerChoice = input.nextLine();					
						if (playerChoice.equalsIgnoreCase("Yes"))
						{
							play = true;
							//reset the counters
							playerWin = 0;
							cpuWin = 0;
							drawCount = 0;
						}
						else if (playerChoice.equalsIgnoreCase("No"))
						{
							play = false;
							System.out.println("Bye!");
							System.exit(0);
						}
						else
						{
							System.out.println("Not an answer");
							System.exit(0);
						}	
					}
					
					
				}
		}
		
			
		}	
		
		
	}

}
