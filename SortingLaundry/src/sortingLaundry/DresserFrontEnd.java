/*
 * Dylan Desai
 */
package sortingLaundry;

import java.util.Scanner;

public class DresserFrontEnd {

	public static void main(String[] args) {
		/*
		 * VARIABLES
		 */
		Scanner input = new Scanner(System.in);
		String answer = "";
		int answerNum = 0;
		Clothing clothes;
		Dresser dresser = new Dresser();
		
		System.out.println("Welcome to the dresser!");
		//Run program as long as user doesn't input 9
		while (answerNum != 9)
		{
			//prompt user for choice
			System.out.println("Enter 1: to add an item\nEnter 2: to remove an item\nEnter 3: to print out the dresser contents\nEnter 9: to quit");
			answer = input.nextLine();
			if (answer.equalsIgnoreCase(""))
				System.out.println("No!");
			else
			{
				answerNum = Integer.parseInt(answer);
			}
				
			
			if (answerNum == 1)
			{
				clothes = new Clothing();
				
				//prompt for type 
				System.out.println("Enter the type.\nIt may be undergarmet, socks, stockings, top, bottom, or cape");
				answer = input.nextLine();
				answer = answer.toLowerCase();
				switch (answer)
				{
				case "undergarmet":
					clothes.setType(Type.Undergarmet);
					break;
				case "socks":
					clothes.setType(Type.Socks);
					break;
				case "stockings":
					clothes.setType(Type.Stockings);
					break;
				case "top":
					clothes.setType(Type.Top);
					break;
				case "bottom":
					clothes.setType(Type.Bottom);
					break;
				case "cape":
					clothes.setType(Type.Cape);
					break;
				default:
					System.out.println("No!");
					System.exit(0);
					break;
				}
				
				//prompt for color
				System.out.println("Enter a color\nIt may be brown, pink, orange, green, blue, purple, or grey");
				answer = input.nextLine();
				answer = answer.toLowerCase();
				switch(answer)
				{
				case "brown":
					clothes.setColor(Color.Brown);
					break;
				case "pink":
					clothes.setColor(Color.Pink);
					break;	
				case "orange":
					clothes.setColor(Color.Orange);
					break;
				case "green":
					clothes.setColor(Color.Green);
					break;
				case "blue":
					clothes.setColor(Color.Blue);
					break;
				case "purple":
					clothes.setColor(Color.Purple);
					break;
				case "grey":
					clothes.setColor(Color.Grey);
					break;
				default:
					System.out.println("No!");
					System.exit(0);
					break;
				}
				
				//add the clothing to the dresser
				dresser.add(clothes);
			}
			else if (answerNum == 2)
			{
				clothes = new Clothing();
				
				//prompt for type 
				System.out.println("Enter the type.\nIt may be undergarment, socks, stockings, top, bottom, or cape");
				answer = input.nextLine();
				answer = answer.toLowerCase();
				switch (answer)
				{
				case "undergarmet":
					clothes.setType(Type.Undergarmet);
					break;
				case "socks":
					clothes.setType(Type.Socks);
					break;
				case "stockings":
					clothes.setType(Type.Stockings);
					break;
				case "top":
					clothes.setType(Type.Top);
					break;
				case "bottom":
					clothes.setType(Type.Bottom);
					break;
				case "cape":
					clothes.setType(Type.Cape);
					break;
				default:
					System.out.println("No!");
					System.exit(0);
					break;
				}
				
				//prompt for color
				System.out.println("Enter a color\nIt may be brown, pink, orange, green, blue, purple, or grey");
				answer = input.nextLine();
				answer = answer.toLowerCase();
				switch(answer)
				{
				case "brown":
					clothes.setColor(Color.Brown);
					break;
				case "pink":
					clothes.setColor(Color.Pink);
					break;	
				case "orange":
					clothes.setColor(Color.Orange);
					break;
				case "green":
					clothes.setColor(Color.Green);
					break;
				case "blue":
					clothes.setColor(Color.Blue);
					break;
				case "purple":
					clothes.setColor(Color.Purple);
					break;
				case "grey":
					clothes.setColor(Color.Grey);
					break;
				default:
					System.out.println("No!");
					System.exit(0);
					break;
				}
				
				//remove the clothing from the dresser
				dresser.remove(clothes);
				
			}
			else if (answerNum == 3)
			{
				//print the dresser contents
				dresser.print();
			}
			else if (answerNum == 9)
			{
				System.out.println("goodbye");
			}
			else
			{
				System.out.println("That's not right.");
				System.exit(0);
			}
			
			//add a blank line for readibility purposes
			System.out.println();
		}
		input.close();
		

	}

}
