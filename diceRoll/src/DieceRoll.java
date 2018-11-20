/**
 * Written by Dylan Desai
 */
import java.util.Scanner;
import java.util.Random;
public class DieceRoll {
  
  
  public static void main(String[] args) { 
  /*
   * ALL VARIABLES AND OBJECTS ARE GOING HERE!!!
   */
   Scanner input = new Scanner(System.in);
   int timesrolled;
   int rollcount = 0;
   int onecount = 0;
   int twocount = 0;
   int threecount = 0; 
   int fourcount = 0; 
   int fivecount = 0;
   int sixcount = 0;
   Random random = new Random();
   
   //ask for a number of times to rol
   System.out.println("Enter the number of times to roll the dice.");
   timesrolled = input.nextInt();
   
   //For loop to roll the dice and turn the statistics
   for (int i = 0; i < timesrolled; i++)
   {
     //generate a number for the roll
     int roll = random.nextInt(6) + 1;
     
     //switch statement for counting the rolls
     switch (roll)
     {
       case 1:
         onecount+=1;
         break;
       case 2:
         twocount+=1;
         break;
       case 3:
         threecount +=1;
         break;
       case 4:
         fourcount +=1;
         break;
       case 5:
         fivecount +=1;
         break;
       case 6:
         sixcount +=1;
         break;
     }
     //roll += 1;
     
     System.out.println("You rolled a " + roll);
   }
    //display the total count of numbers
   System.out.println("One: " + onecount + "\n"
                   + "Two: " + twocount + "\n"
                   + "Three: " + threecount + "\n"
                   + "Four: " + fourcount + "\n"
                   + "Five: " + fivecount + "\n"
                   + "Six: " + sixcount + "\n" );
   
   
   
   
    
  }
  
  
  
}
