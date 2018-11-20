import java.util.Scanner;
import java.util.Random;
public class marcoPolo {
enum Spaces {Empty, Player, Walked_Path, Goal}
public static final int BOARD_SIZE = 10;
public static final int COLD_DIST = (BOARD_SIZE / 2) * (BOARD_SIZE / 2);
public static final int WARM_DIST = (BOARD_SIZE / 4) * (BOARD_SIZE / 4);

	public static void main(String[] args) {
		
		int numberOfMoves = 0;
		//player at top left
		int pX = 0;
		int pY = 0;
		
		Random r = new Random();
		int gX = r.nextInt(BOARD_SIZE);
		int gY = r.nextInt(BOARD_SIZE);
		
		Scanner keyboard = new Scanner(System.in);
		
		Spaces [][] board = new Spaces[BOARD_SIZE][BOARD_SIZE];
		
		for (int y=0; y < board.length; y++) //creates an empty board
		{
			for (int x = 0; x < board[y].length; x++)
			{
				board[x][y] = Spaces.Empty;
			}
		}
		board[pX][pY] = Spaces.Player;
		board[gX][gY] = Spaces.Goal;
		System.out.println("Welcome to marco polo game 9001");
		
		boolean gameOver = false;
		while (!gameOver) //game loop
		{
			//Draw the board
			for (int y = 0; y < board.length; y++)
			{
				for (int x = 0; x <board[y].length; x++)
				{
					switch(board[x][y])
					{
					case Empty:
						System.out.print("_");
						break;
					case Player:
						System.out.print("X");
						break;
					case Walked_Path:
						System.out.print("#");
						break;
					case Goal:
						System.out.print("_");
						break;
						default:
							System.out.print("?");
					}
				}
				System.out.println();
			}
		} // end for
		int distance = (pX-gX) * (pX-gX) + (pY-gY) * (pY-gY);
		
		
		//use distances
		if (distance > COLD_DIST)
		{
			System.out.println("You are cold");
		}
		else if (distance > WARM_DIST)
		{
			System.out.println("You are warm.");
		}
		else
		{
			System.out.println("You are hot.");
		}
		
		
		
	}

}
