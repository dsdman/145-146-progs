/**
 * Dylan Desai
 * Lab exam 1
 */
import java.util.Scanner;
public class balls {
  public static void main(String[] args) { 
    /*VARIALBES
     * 
     */
    Scanner input = new Scanner(System.in);
    double velocity = 0.0;
    double height = 0.0;
    int seconds = 0;
    int bounceCount = 0;
    
    //prompt user for the velocity
    System.out.println("Enter the initial velocity");
    velocity = input.nextDouble();
    
    //while loop to bounce while the bounce count is less than 5
    while (bounceCount < 5)
    {
      //display the statistics so far
      System.out.println("Time: " + seconds + " Height: " + height);
      
      //increment the time, add to the height, and decrease velocity
      seconds += 1;
      height += velocity;
      velocity -= 32;
      
      //check for a bounce
      if (height < 0)
      {
        System.out.println("BOUNCE!!!");
        bounceCount += 1;
        height *= -0.5;
        velocity *= -0.5;
      }
    }
  }
}
