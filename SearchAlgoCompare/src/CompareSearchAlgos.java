import java.util.Arrays;
import java.util.Random;

public class CompareSearchAlgos {

	public static void main(String[] args) {
		//variables
		Random r = new Random();
		int[] randomArray;
		int sum = 0;
		int avg = 0;
		int searchNum = 0;
		int[] binCount = new int[20];
		int[] linearCount = new int[20];
		
		//greeting
		System.out.println("This is a search tester. This tests which algorithm runs the fastest.");
		
		//search 20 times
		for (int i=0;i<20;i++)
		{
			//get array and random number to search
			randomArray = getRandomArray();
			searchNum = r.nextInt(1000);
			
			//run linear
			System.out.println("Running linear search.");
			linearCount[i] = linearSearchIter(randomArray,searchNum);
			System.out.println("Linear checks: "+linearCount[i]);
			
			//run binary
			System.out.println("Running binary search.");
			binCount[i] = binarySearchRecur(randomArray,searchNum,0,randomArray.length-1,0);
			System.out.println("binary checks: "+binCount[i]);
		
			System.out.println();
		}
		
		System.out.println("The average number of checks when run 20 times were:");
		//get the linear average and display it
		for (int j=0;j<20;j++)
		{
			sum+= linearCount[j];
		}
		avg = sum/20;
		System.out.println("Linear search "+avg);
		
		sum = avg = 0;
		
		//get the binary average and display it
		for (int j=0;j<20;j++)
		{
			sum+= binCount[j];
		}
		avg = sum/20;
		System.out.println("binary search "+avg);
	}
	
	//method that gets random sorted array
	public static int[] getRandomArray()
	{
		//variables
		Random r = new Random();
		int[] out = new int[1000];
		boolean swapped = true;
		
		//populate the array with numbers and sort it
		for (int i=0;i<out.length;i++)
		{
			out[i] = r.nextInt(1000);
		}		
		Arrays.sort(out);
		
		//return the array
		return out;		
	}
	
	//linear search method
	public static int linearSearchIter(int[] a, int value)
	{
		//counts the number of times it runs
		int checkNum = 0;
		
		for (int i=0;i<a.length;i++)
		{
			//increment counter
			checkNum +=1;
			
			if (a[i]==value)
			{
				System.out.println("Found!");
				return checkNum;
			}
			
		}
		
		System.out.println("Not found.");
		return checkNum;
	}
	
	//binary search method
	public static int binarySearchRecur(int[] a, int value, int minIndex, int maxIndex, int counter)
	{
		//increment counter
		counter +=1;
		
		//get middle index using midpoint
		int midIndex = (maxIndex + minIndex)/2;		
		
		//check for false case
		if (minIndex > maxIndex)
		{
			System.out.println("Not found.");
			return counter;
		}
		
		//base case 
		if (a[midIndex]==value)
		{
			System.out.println("Found!");
			return counter;
		}
		else
		{		
			
			//recursive cases
			if (value > a[midIndex])
			{
				return binarySearchRecur(a,value,midIndex+1,maxIndex,counter);
			}
			else
			{
				return binarySearchRecur(a,value,minIndex,midIndex-1,counter);
			}
		}
	}
	
	//method that returns a number given (for returning counter)
	public static int returnNum(int num)
	{
		return num;
	}

}
