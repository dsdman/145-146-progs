/*
 * Written by Dylan Desai
 */
import java.util.Scanner;

public class thing
{

	public static void main(String[] args)
	{
		//variables
		Scanner input = new Scanner(System.in);
		//Greet the user
		System.out.println("Hello, what would you like to do.");
		String response = input.nextLine();
		
		while (response.equalsIgnoreCase("yes"))
		{
			System.out.println("Your response was: "+response);
			System.out.println("Another response?");
			response = input.nextLine();
		}
	}
}
