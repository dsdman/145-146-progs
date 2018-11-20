/*
 * Written by Dylan Desai
 */
import java.util.Random;

public class Board {
	//instance variables
	public static final int BOARD_SIZE=10; //10x10 board for this game (mine walker)
	public static final int MINE_NUM = (BOARD_SIZE*BOARD_SIZE)/10;
	enum Space{Player,Mine,Goal,None};	
	private Space[][] board;
	private Item[] mines; 
	private Item goal;
	
	//constructor
	public Board()
	{
		board = new Space[BOARD_SIZE][BOARD_SIZE];
		mines = new Item[MINE_NUM];
		goal = new Item();
	}
	
	//method that initializes the board
	public void initializeBoard()
	{
		Random r = new Random();
		int randomX = 0;
		int randomY = 0;
		int mineNum = 0;
		
		for (int i=0; i<board.length;i++)
		{
			for (int j=0; j<board[i].length;j++)
			{
				board[i][j] = Space.None;
			}
		}
		
		//spawn goal
		goal.setX(r.nextInt(BOARD_SIZE));
		goal.setY(r.nextInt(BOARD_SIZE));
		board[goal.getX()][goal.getY()] = Space.Goal;
		
		//spawn mines
		while (mineNum<MINE_NUM)
		{
			for (int i=mineNum;i<mines.length;i++)
			{
				mines[i] = new Item();
				randomX = r.nextInt(BOARD_SIZE);
				randomY = r.nextInt(BOARD_SIZE);
				if (board[randomX][randomY] == Space.None)
				{
					mines[i].setX(randomX);
					mines[i].setY(randomY);
					board[mines[i].getX()][mines[i].getY()] = Space.Mine;
					mineNum +=1;
				}
			}
		}
	}
	
	//method that turns old player positions into regular spaces
	public void clearSpace(int oldX, int oldY)
	{
		board[oldX][oldY] = Space.None;
	}
	
	//method that checks game over
	public boolean checkIsOver(int playerX, int playerY)
	{
		boolean out = false;
		if (board[playerX][playerY] == Space.Mine)
			out = true;
		return out;
	}
	
	//method that checks whether game won
	public boolean checkIsWon(int playerX, int playerY)
	{
		boolean out = false;
		if (board[playerX][playerY] == Space.Goal)
			out = true;
		return out;
	}
	
	//method that draws the board
	public void drawBoard(Item aPlayer)
	{
		//always update the player
		board[aPlayer.getX()][aPlayer.getY()] = Space.Player;
		
		for (int j=0; j<board.length;j++)
		{
			for (int i=0; i<board[j].length;i++)
			{
				switch(board[i][j])
				{
				case None:
					System.out.print("_");
					break;
				case Mine:
					System.out.print("_");
					break;
				case Goal:
					System.out.print("^");
					break;
				case Player:
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}
}
