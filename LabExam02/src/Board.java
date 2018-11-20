/**
 * Dylan Desai
 * Lab exam 2 from: https://cse.sc.edu/~shephejj/csce145/Labs/LabExam2SecretSecret.html
 */
import java.util.Random;
public class Board {
  
  //instance variables
  public static final int BOARD_SIZE = 5;
  private Space[][] board;
  
  //default constructor
  public Board()
  {
    board = new Space[BOARD_SIZE][BOARD_SIZE];
  }
  
  //one accessor for board 
  public Space[][] getBoard()
  {
    return this.board;
  }
  
  //other methods
  public void initialize()
  {
    //initialize each element of the array
    for (int i = 0; i < board.length; i++)
    {
      for (int j = 0; j < board.length; j++)
      {
        board[i][j] = new Space();
      }
    }
    
    //take a random number and make that the secret square
    Random random = new Random();
    int randomX = random.nextInt(BOARD_SIZE);
    int randomY = random.nextInt(BOARD_SIZE);
    board[randomX][randomY].setIsSecretSquare(true);    
  }
  public boolean isSecretSquare(int aX, int aY)
  { 
        //make the spot uncovered
        board[aX][aY].setHasBeenUncovered(true);
        //if there is a match, return true
        if (board[aX][aY].getIsSecretSquare() == true)
        {
          return true;
        }
        else
        {
          return false; 
        }    
  }
  
  public void printBoard()
  {
    //go through the array and print everything
    for (int i = 0; i < board.length; i++)
      {
        for (int j = 0; j < board[i].length; j++)
        {
          String printThis = board[i][j].toString();
          System.out.print(printThis);
        }
        System.out.println();
      }

  }
  
  
  
}
