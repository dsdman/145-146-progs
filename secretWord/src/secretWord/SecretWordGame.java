package secretWord;
import java.util.Scanner;

public class SecretWordGame {
	  
	  
	  public static void main(String[] args) {
	    /*
	     * Variables
	     */
	    SecretWord word = new SecretWord();
	    String wordGuess;
	    word.setSecretWord("cat");
	    word.setHintWord("***");
	    boolean finished = false;
	    word.setNumberOfTurns(0);
	    char guess;
	    Scanner input = new Scanner(System.in);
	 
	    //greet the user
	    System.out.println("Welcome to the word game. Can you guess the secret word?");
	    
	    //game loop
	    while (word.getNumberOfTurns() < 5 && !finished)
	    {
	       //prompt user for the character and word
	       System.out.println("You have " +  (word.getNumberOfTurns()) + " Number of Turns." + "\nThe current hint is  " + word.getHintWord());
	       System.out.println("Guess a character.");
	       guess = input.nextLine().charAt(0);
	       word.guessLetter(guess);
	       word.setNumberOfTurns(word.getNumberOfTurns() +1);
	       System.out.println("Try to guess the word.");
	       wordGuess = input.nextLine();
	       
	       //show current word
	       System.out.println("Current word: " + word.getHintWord());
	       
	       //check if finished
	       if (word.getHintWord().contains("*") == false || wordGuess.equals(word.getSecretWord()) )
	       {
	         finished = true;
	         System.out.println("Congrats. You are done!");
	       }
	    
	       
	       
	    }
	    
	  
	  }
	  
	  /* ADD YOUR CODE HERE */
	  
	}