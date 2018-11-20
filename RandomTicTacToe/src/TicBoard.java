/*
 * written by Dylan Desai
 */
import java.util.Random;

public class TicBoard {
	//A board is an array of spaces
	enum space{X,O,none};
	private space[][] board;
	
	//constructor
	public TicBoard(int numSpaces)
	{
		board = new space[numSpaces][numSpaces];
	}
	
	//method that gives board (debugging purposes)
	public space[][] getBoard()
	{
		return board;
	}
	
	//method that initializes the board
	public void intializeBoard()
	{
		for (int i=0; i < board.length; i++)
		{
			for (int j=0; j < board[i].length; j++)
			{
				board[i][j] = space.none;
			}
		}
	}
	
	//method that draws the board
	public void drawBoard()
	{
		for (int i=0; i < board.length; i++)
		{
			for (int j=0; j < board[i].length; j++)
			{
				switch(board[i][j])
				{
				case X:
					System.out.print("X");
					break;
				case O:
					System.out.print("O");
					break;
				case none:
					System.out.print("!");
					break;
				default:
					System.out.print("What!?");
					break;
					
				}
				
			}
			System.out.println();
		}
	}
	
	//method that randomizes the board
	public void randomizeBoard()
	{
		Random r = new Random();
		int result = -1;
		
		for (int i=0; i < board.length; i++)
		{
			for (int j=0; j<board[i].length;j++)
			{
				//if 1, then x, else o if 0
				result = r.nextInt(2);
				if (result == 0)
				{
					board[i][j] = space.O;
				}
				else if (result == 1)
				{
					board[i][j] = space.X;
				}
			}
		}
			
	}
	
	//method that determines winner
	public void checkWinner()
	{
		int x = 0;
		int y = 0;
		boolean isWinner = false;
		boolean xWon = false;
		boolean oWon = false;
		
		//check for rows
		for (int i = 0; i < board.length; i++)
		{
			int j = board.length - 1;
				if (board[i][j] == board[i][j-1] && board[i][j] == board[i][j-2])
				{
					if (board[i][j] == space.O)
					{
						oWon = true;
						isWinner = true;
					}
					else if (board[i][j] == space.X)
					{
						xWon = true;
						isWinner = true;
					}
				}
		}
		
		//check for columns
		for (int j =0; j < board.length; j++)
		{
			int i = board.length -1;
			if (board[i][j] == board[i-1][j] && board[i][j] == board[i-2][j])
			{
				if (board[i][j] == space.O)
				{
					oWon = true;
					isWinner = true;
				}
				else if (board[i][j] == space.X)
				{
					xWon = true;
					isWinner = true;
				}
			}
		}
		
		//check for diagonal 1
		if (board[x][y] == board[x+1][y+1] && board[x][y] == board[x+2][y+2])
		{
			if (board[x][y] == space.O)
			{
				oWon = true;
				isWinner = true;
			}
			else if (board[x][y] == space.X)
			{
				xWon = true;
				isWinner = true;
			}
		}
		
		//check for diagonal 2
		x = 0;
		y = board.length -1;
		if (board[x][y] == board[x+1][y-1] && board[x][y] == board[x+2][y-2])
		{
			if (board[x][y] == space.O)
			{
				oWon = true;
				isWinner = true;
			}
			else if (board[x][y] == space.X)
			{
				xWon = true;
				isWinner = true;
			}
		}
		
		//write who won
		if (xWon && !oWon)
		{
			System.out.println("\nX won!");
		}
		else if (oWon && !xWon)
		{
			System.out.println("\nO won!");
		}
		else if (xWon && oWon)
		{
			System.out.println("\nX and O won!");
		}
		else if (!isWinner)
		{
			System.out.println("\nCat! nobody won");
		}
		
	}
		
	
}
