/*
 * Written by Dylan Desai
 */
import java.util.Scanner;

public class ShowcaseGame {

	public static void main(String[] args) {
		/*
		 * VARIABLES
		 */
		Scanner input = new Scanner(System.in);
		int choice = -1;
		String choiceAgain = "";
		Showcase gamePrizes = new Showcase();
		boolean isOver = false;
		
		//greet the user and setup the game
		System.out.println("Welcome to the Showcase showdown!");
		gamePrizes.initializeShowcase();
		gamePrizes.fillShowcase();
		gamePrizes.fillRandomPrizes();
		
		//simple game loop
		while (!isOver)
		{
			//return names of prizes
			System.out.println("Your prizes are:\n"+gamePrizes.toString());
			
			//prompt the user
			System.out.println("Guess the total cost of the above items without going over or under by 2000."+
			"\nWhat is your guess? (Enter a whole number or \"-1\" to exit)");
			try
			{
				//System.out.println(gamePrizes.getTotalPrice());
				choice = input.nextInt();
				
				//handle exit
				if (choice == -1)
				{
					isOver = true;
					System.exit(0);
				}
				
				
				//check if win or loose and handle playing again
				if (Math.abs(choice - gamePrizes.getTotalPrice()) <= 2000 && choice-gamePrizes.getTotalPrice()<0)
				{
					System.out.println("You win! You were under by "+(Math.abs(choice-gamePrizes.getTotalPrice())));
					System.out.println("Play again?(Enter yes or no)");
					input.nextLine();
					try
					{
						choiceAgain=input.nextLine();
						if (choiceAgain.equalsIgnoreCase("yes"))
						{
							//reset the game
							gamePrizes.fillRandomPrizes();
						}
						else if (choiceAgain.equalsIgnoreCase("no"))
						{
							//exit the game
							System.out.println("Goodbye!");
							isOver = true;
						}
						else
						{
							System.out.println("I'm going to say that was a no. Goodbye!");
							isOver = true;
						}
					}
					catch(Exception e)
					{
						System.out.println("You didn't enter words. Goodbye!");
						System.exit(0);
					}
				}
				else if(Math.abs(choice - gamePrizes.getTotalPrice()) <= 2000 && choice-gamePrizes.getTotalPrice()>0)
				{
					System.out.println("You win! You were Over by "+(Math.abs(choice-gamePrizes.getTotalPrice())));
					System.out.println("Play again?(Enter yes or no)");
					input.nextLine();
					try
					{
						choiceAgain=input.nextLine();
						if (choiceAgain.equalsIgnoreCase("yes"))
						{
							//reset the game
							gamePrizes.fillRandomPrizes();
						}
						else if (choiceAgain.equalsIgnoreCase("no"))
						{
							//exit the game
							System.out.println("Goodbye!");
							isOver = true;
						}
						else
						{
							System.out.println("I'm going to say that was a no. Goodbye!");
							isOver = true;
						}
					}
					catch(Exception e)
					{
						System.out.println("You didn't enter words. Goodbye!");
						System.exit(0);
					}
				}
				else
				{
					System.out.println("You lose! You were off by "+(Math.abs(choice-gamePrizes.getTotalPrice())));
					System.out.println("Better luck next time. Play again?(Enter yes or no)");
					input.nextLine();
					try
					{
						choiceAgain=input.nextLine();
						if (choiceAgain.equalsIgnoreCase("yes"))
						{
							//reset the game
							gamePrizes.fillRandomPrizes();
						}
						else if (choiceAgain.equalsIgnoreCase("no"))
						{
							//exit the game
							System.out.println("Goodbye!");
							isOver = true;
						}
						else
						{
							System.out.println("I'm going to say that was a no. Goodbye!");
							isOver = true;
						}
					}
					catch(Exception e)
					{
						System.out.println("You didn't enter words. Goodbye!");
						System.exit(0);
					}
				}
			}
			catch (Exception e)
			{
				System.out.println("You didn't enter a whole number or -1. Goodbye!");
				System.exit(0);
			}
		}
		input.close();
	}

}
