/*
 * SEARCH ALGORITHMS
 */
package serach;

public class SearchAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//linear search iterative
	public static boolean linearsearchIter(int[] a, int value)
	{
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==value)
			{
				return true;
			}
			
		}
		return false;
	}
	
	//linear search non-iterative (recursive)
	public static boolean linearSearchRecur(int[] a, int value, int index)
	{
		//base case
		if (a[index]==value)
			return true;
		else
		{
			//recursive cases
			index++;
			if(index>a.length)
			{
				return false;
			}
			else
				return linearSearchRecur(a,value,index);		}
	}
	
	//non-iterative binary search
	public static boolean binarySearchRecur(int[] a, int value, int minIndex, int maxIndex)
	{
		//get middle index using midpoint
		int midIndex = (maxIndex + minIndex)/2;
		
		//check for false case
		if (minIndex > maxIndex) //value not in array
			return false;
		
		//base case 
		if (a[midIndex]==value)
			return true;
		else
		{
			//recursive cases
			if (value > a[midIndex])
			{
				return binarySearchRecur(a,value,midIndex+1,maxIndex);
			}
			else
			{
				return binarySearchRecur(a,value,minIndex,midIndex-1);
			}
		}
	}
}