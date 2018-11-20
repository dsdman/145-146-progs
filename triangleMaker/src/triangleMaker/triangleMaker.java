/**
 * Written by Dylan Desai /
 */


package triangleMaker;

import java.util.Scanner;

public class triangleMaker {
	 public static void main(String[] args) { 
		    /*
		     * ALL OF THE OBJECTS AND VARIABLES ARE GOING HERE!!!!
		     */
		     Scanner input = new Scanner(System.in);
		     //int i = 0; //represents the length
		     //int j = 0; // represents the height
		     int size = 0; //size of the triangle
		     
		     //prompt the user for the size of the triangle
		     System.out.println("Hello, please enter the size of the triangle so that this program can make the triangle for you");
		     size = input.nextInt();
		     	
		     //check if the size is valid or not
		     if (size <= 0)
		     {
		       System.out.println("Get out of here!");
		       System.exit(0);
		     }
		     
		     //run the for loop to generate the triangle for the first half
		     // It prints a blank line the first time it runs, and then prints stars thereafter.
		     
		     for(int i=1; i <= size + 1; i++)
		     {
		       for (int j = 1; j < i; j++)
		       {         
		         System.out.print("*");
		           
		       }
		       System.out.println();
		     }
		     
		     
		     //run the for loop to generate the triangle for the bottom half
		     for (int i = size -1; i > 0; i--)
		     {
		       for (int j = 0; j < i; j++)
		       {
		         System.out.print("*");
		       }
		       System.out.println();
		     }

		    
		  }
}
