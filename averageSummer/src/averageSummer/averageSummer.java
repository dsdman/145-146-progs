//Written by Dylan Desai


package averageSummer;
import java.util.Scanner;

public class averageSummer {

	public static void main(String[] args) {
		/*
	     * ALL OF THE VARIABLES AND OBJECTS ARE GOING HERE!!!
	     */
	    double[] dayTemp = new double[10];
	    Scanner input = new Scanner(System.in);
	    double tempSum = 0;
	    double averageTemp;
	    
	    //Greet the user
	    System.out.println("Welcome to the above average temperature calculator.");
	    
	    //for loop to populate the array with the temperatures
	    for (int i = 0; i < 10; i++)
	    {
	      System.out.println("Please enter the temperature for day " + (i + 1));
	      dayTemp[i] = input.nextDouble();
	    }
	    
	    //for loop to calculate the sum of the temperatures
	    for (int i = 0; i < 10; i++)
	    {
	      tempSum += dayTemp[i];
	    }
	    
	    
	    //calculate and display the average temperature 
	    averageTemp = tempSum / 10;
	    System.out.println("The average temperature was " + averageTemp);
	    
	    
	    System.out.println("The temperatures that were above average were");
	    //for loop to display the days that the temperature was above average
	    for (int i = 0; i < 10; i++)
	    {
	      if(dayTemp[i] > averageTemp)
	      {
	        System.out.println("Day " + (i+1) + " with " + dayTemp[i]);
	      }
	    }

	}

}
