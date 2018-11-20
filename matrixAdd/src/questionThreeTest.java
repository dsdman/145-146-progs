import java.util.Scanner;
public class questionThreeTest {

	public static void main(String[] args) {
		/*
		 * VARIABLES AND OBJECTS
		 */
		Scanner input = new Scanner(System.in);
		int iIndex = 0;
		int jIndex = 0;
		final double pi = 3.14159;				
		int [][] Array = new int [][] { {1, 2, 3},{4, 5, 6},{7,8,9} };
		
		
		//display array as matrix or table
		for (int i = 0; i < Array.length; i++)
		{
			for (int j = 0; j < Array[i].length; j++)
			{
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//prompt user
		System.out.println("What element in above array would you like to display the index i,j of?\n" +
		"(Enter integer to represent an element 1-9)");
		int xElement = input.nextInt();
		
		//check validity of xElement
		while(xElement < 1 || xElement > 9)
		{
			System.out.println("Not valid. Please enter an element 1 - 9.");
			xElement = input.nextInt();
	
		}
		
		
		//for loops to try to get index i,j of x element somehow ??
		for (int i = 0; i < Array.length; i++)
		{
			for (int j = 0; j < Array[i].length; j++)
			{
				if (xElement % i == 0 && xElement % j == 0)
				{
					iIndex = i;
					jIndex = j;
				}
			}
		
		}
		
		System.out.println("The index i,j of element " + xElement + " is: " + iIndex + "," + jIndex);
		

	}

}
