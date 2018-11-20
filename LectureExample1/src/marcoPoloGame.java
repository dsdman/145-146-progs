import java.util.Random;
import java.util.Scanner;

// This is dylan Desai
public class marcoPoloGame {
	enum spaces {Empty, Player, Walked_Path, Goal};
	public static final int BOARD_SIZE=10;
	
	public static void main(String[] args) {
		//initialize variables needed
		spaces[][] board = new spaces[BOARD_SIZE][BOARD_SIZE];
		int numberOfMoves = 0;
		int pX = 0;
		int pY = 0;
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int gX = r.nextInt(BOARD_SIZE);
		int gY = r.nextInt(BOARD_SIZE);
		
		
		//make the board empty
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = spaces.Empty;
			}
		}
		
		//spawn the player and the goal
		board[pX][pY] = spaces.Player;
		board[gX][gY] = spaces.Goal;
		
		//game loop
		boolean gameOver = false;
		while (!gameOver)
		{
			for (int y = 0; y < board.length; y++)
			{
				for (int x = 0; x < board[y].length; x++)
				{
					switch (board[x][y])
					{
					case Empty:
						System.out.print("");
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
						System.out.print("THIS SHOULD NOT FUCKING HAPPEN");
					}
					System.out.println();
				}
			}
		}
	
	}

}
