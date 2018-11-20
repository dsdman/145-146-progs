/*
 * Written by Dylan Desai
 */
public class BoardGame {
	public static final int SPACES=3;
	public static void main(String[] args) {
		//VARIABLES
		TicBoard board = new TicBoard(SPACES);
		
		//greet the user
		System.out.println("Welcome to the random tic tac toe program. Below you will see the randomly generated board\n");
		
		//initialize, randomize, and draw the board, then determine winner
		board.intializeBoard();
		board.randomizeBoard();
		board.drawBoard();
		board.checkWinner();

	}

}
