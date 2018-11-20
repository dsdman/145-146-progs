import java.util.Scanner;
public class sorting2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter size");
		
		int size = keyboard.nextInt();
		
		if (size <= 0)
		{
			System.out.println("Invalid");
			System.exit(0);
		}
		
		int [] a = new int[size];
		
		for (int i = 0; i < a.length;i++)
		{
			System.out.println("Enter value at position " + i );
			a[i] = keyboard.nextInt();
		}
		
	/*	//selection sort
		for (int i = 0; i < a.length; i++)
		{
			int smallestIndex = i;
			for (int j = i; j<a.length; j++)
			{
				if (a[j] < a[smallestIndex])
				{
					smallestIndex = j;
				}
			}
			if (smallestIndex != i) //swap
			{
				int temp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = temp;
			}
		}*/
	
		
		// Bubblesort
	boolean hasSwapped = true;
	while (hasSwapped)
	{
		hasSwapped = false;
		for (int i = 0; i < a.length - 1; i++)
		{
			if (a[i] > a[i+1])
			{
				int temp = a[i];
				a[i] = a[i + 1];
				hasSwapped = true;
			}
		}
	}

	}

}
