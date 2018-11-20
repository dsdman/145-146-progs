/*
 * Written by Dylan Desai
 */
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		/*
		 * VARIABLES
		 */
		Scanner input = new Scanner(System.in);
		Board gameBoard = new Board();
		int playerChoiceX = -2;
		int playerChoiceY = -2;
		String playerChoiceAgain = "";
		boolean validX = false;
		boolean validY = false;
		boolean validInput = false;
		boolean isOver = false;
		Item player = new Item();
		
		//greet the user and get the board ready
		System.out.println("Welcome to the mine walker. Get to the ice cream cone (\"^\") and avoid the mines.");
		gameBoard.initializeBoard();
		
		//the game loop
		while (!isOver)
		{
			//Draw the board and reset booleans
			System.out.println();
			gameBoard.drawBoard(player);
			validX = false;
			validY = false;
			validInput = false;
			
			//prompt the user about where to go
			System.out.println("Enter either a -1 (back), 0 (stay), or 1 (forward) in the X direction or 9 to quit");
			playerChoiceX = input.nextInt();
			if (playerChoiceX == 9)
			{
				isOver = true;
				System.exit(0);
			}
			System.out.println("Enter either a -1, (back),0 (stay), or 1 (forward) in the Y direction");
			playerChoiceY = input.nextInt();
			
			//check the answers
			if (playerChoiceX==-1 || playerChoiceX==0 || playerChoiceX==1)
				validX = true;
			if (playerChoiceY==-1 || playerChoiceY==0 || playerChoiceY==1)
				validY = true;
			
			if (validX && validY)
				validInput = true;
			
			//move the player and check for game over
			if (validInput)
			{
				gameBoard.clearSpace(player.getX(), player.getY());
				player.move(playerChoiceX, playerChoiceY);
			}			
			if (gameBoard.checkIsOver(player.getX(), player.getY()))
			{
				System.out.println("You got blown to bits by a mine. Play again?\n(Enter yes or no)");
				input.nextLine();
				playerChoiceAgain = input.nextLine();
				
				//if they enter yes, then run the method to reset the game
				if (playerChoiceAgain.equalsIgnoreCase("yes"))
				{
					//reset the game
					player.setX(0);
					player.setY(0);
					gameBoard.initializeBoard();
				}
				else if (playerChoiceAgain.equalsIgnoreCase("no"))
				{
					System.out.println("Bye!");
					isOver = true;
				}
				else
				{
					System.out.println("I'm going to assume to assume that was a no. Goodbye.");
					isOver = true;
				}
			}
			if (gameBoard.checkIsWon(player.getX(), player.getY()))
			{
				System.out.println("You were able to get the delicious ice cream. Play again?\n(Enter yes or no)");
				input.nextLine();
				playerChoiceAgain = input.nextLine();
				
				//if they enter yes, then run the method to reset the game
				if (playerChoiceAgain.equalsIgnoreCase("yes"))
				{
					//reset the game
					player.setX(0);
					player.setY(0);
					gameBoard.initializeBoard();
				}
				else if (playerChoiceAgain.equalsIgnoreCase("no"))
				{
					System.out.println("Bye!");
					isOver = true;
				}
				else
				{
					System.out.println("I'm going to assume to assume that was a no. Goodbye.");
					isOver = true;
				}		
			}
		}		
		input.close();	
	}
}
