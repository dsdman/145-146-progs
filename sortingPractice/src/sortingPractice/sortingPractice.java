package sortingPractice;
import java.util.Scanner;
public class sortingPractice {

	public static void main(String[] args) {
		/*
		 * VARIABLES
		 */
		Scanner keyboard = new Scanner(System.in);
		int[] array;
		boolean ascending = false;
		boolean sort = true;
		int temp;
		int answer;
		
		
		//prompt the user
		System.out.println("How much data?");
		answer = keyboard.nextInt();
		array = new int[answer];
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Enter data for element " + (i+1));
			array[i] = keyboard.nextInt();
		}
		
		
		//prompt 2
		System.out.println("Ascending order or descending order?"
				+ "\nEnter 1 for ascending and 2 for descending");
		answer = keyboard.nextInt();
		while (answer != 1 && answer != 2)
		{
			System.out.println("Only enter 1 for ascending and 2 for descending");
			answer = keyboard.nextInt();
		}
		if (answer == 1)
		{
			ascending = true;
		}
		else
		{
			ascending = false;
		}
		
		
		//do the sorting
		while(sort)
		{
			sort = false;
			for (int i = 0; i < array.length - 1; i++)
			{
				//ascending sorting
				if (ascending)
				{
					if (array[i] > array[i + 1])
					{
						temp = array[i];
						array[i] = array[i + 1];
						array[i + 1] = temp;
						sort = true;
					}
					
				}
				//descending
				else if (!ascending)
				{
					if (array[i] < array[i + 1])
					{
						temp = array[i];
						array[i] = array[i + 1];
						array[i + 1] = temp;
						sort = true;
					}
				}
			}
		}
		
		//show the sort
		System.out.println("Sorted data");
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		

	}

}
