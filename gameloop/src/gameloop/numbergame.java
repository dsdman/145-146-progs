package gameloop;
import java.util.Scanner;
import java.util.Random;

public class numbergame {

	public static final int UPPER_NUMBER = 100; //Constant variable
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int secretNumber = r.nextInt(UPPER_NUMBER);
		
		//prompt the user
		System.out.println("I'm thinking of a number between 0 and " + (UPPER_NUMBER - 1));
		
		boolean correctGuess = false;
		
		while (correctGuess == false)
		{
			int guessNumber = keyboard.nextInt();
			if (guessNumber > secretNumber)
			{
				System.out.println("THat's too high!");
			}
			else if (guessNumber < secretNumber)
			{
				System.out.println("That's too low");
			}
			else
			{
				System.out.println("You are correct! Whee!!");
				correctGuess = true; //SUPER IMPORTANT
			}
		}

	}

}
