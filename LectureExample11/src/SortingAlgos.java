
public class SortingAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} 
	
	//selection sort big o of n^2
	public static int[] selectionSort(int[] a)
	{
		for (int i=0;i<a.length;i++)
		{
			int smallestIndex = i;
			for (int j=i+1;j<a.length;j++)
			{
				if (a[smallestIndex] > a[j])
				{
					//found smallest value
					smallestIndex = j;
				}
			}
			
			if (smallestIndex !=i)
			{
				int temp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = temp;
			}
		}
		return a;
	}
	
	//bubble sort big o of n^2
	public static int[] bubbleSort(int[] a)
	{
		boolean swapped = true;
		while (swapped)
		{
			swapped = false;
			for (int i =0;i <a.length-1;i++)
			{
				if (a[i] > a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true;
				}
			}
		}
		return a;
	}
	
	//merge sort big o of n log n 
	public static void mergeSort(int[] a)
	{
		int size = a.length;
		if (size <2)
		{
			return;
		}
		
		//get the sizes of everything
		int mid = size/2;
		int leftSize = mid;
		int rightSize = size-mid;
		
		//create split arrays
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		
		//populate split arrays
		for (int i=0;i<mid;i++)
		{
			left[i] = a[i];
		}
		
		for (int i=0;i<size;i++)
		{
			right[i-mid] = a[i];
		}
		
		//call again with recursion
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
		
	}
	
	//helper method for merge sort
	private static void merge(int[] left, int[] right, int[] a)
	{
		//get variables
		int leftSize = left.length;
		int rightSize = right.length;
		int i,j,k;
		i = j = k = 0;
		
		//do the sorting
		while (i<leftSize && j<rightSize)
		{
			if (left[i] <= right[j])
			{
				a[k] = left[i];
				i++;
				k++;
				
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		
		while (i<leftSize) //put the rest of left in
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while (j<rightSize) //put the rest of right in
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	//quick sort big o of n^2
	public static void quickSort(int[] a, int left, int right)
	{
		//partition
		int index = partition(a, left, right);
		if (left<index-1)
		{
			quickSort(a,left,index-1);
		}
		if (index<right)
		{
			quickSort(a,index,right);
		}
	}
	
	//quick sort helper method for partition
	private static int partition(int[] a, int left, int right)
	{
		int i =left;
		int j = right;
		int pivot = a[(left+right)/2]; //gets the middle value
		
		while (i<=j)
		{
			while(a[i]<pivot)
			{
				i+=1;
			}
			while (a[j]>pivot)
			{
				j-=1;
			}
			if (i<=j)
			{
				int temp = a[i];
				a[i] = a[j];
				i+=1;
				j-=1;
			}
		}
		return i;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
