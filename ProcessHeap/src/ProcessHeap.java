/*
 * written by Dylan Desai
 */
import java.util.Arrays;

public class ProcessHeap {
	//instance variables
	private static final int size = 512;
	private Process[] heap;
	private int tailIndex;
	
	//constructors
	public ProcessHeap()
	{
		heap = new Process[size];
		tailIndex = 0;
	}
	public ProcessHeap(int aSize)
	{
		heap = new Process[aSize];
		tailIndex = 0;
	}
	
	//insert method
	public void insert(Process data)
	{
		//the heap is full
		if (tailIndex >= heap.length)
			heap = Arrays.copyOf(heap, heap.length*2);
			//return;
		//insert the data
		heap[tailIndex] = data;
		//bubble up		
		this.bubbleUp();
		//move the tail to the next null index
		tailIndex +=1;
	}
	
	//helper method for the insert
	private void bubbleUp()
	{
		int tempIndex = this.tailIndex;
		while (tempIndex >0 && heap[(tempIndex-1)/2].compareTo(heap[tempIndex]) <0)
		{
			//SWAP
			Process temp = heap[(tempIndex-1)/2];
			heap[(tempIndex-1)/2] = heap[tempIndex];
			heap[tempIndex] = temp;
			tempIndex = (tempIndex-1)/2;
		}
	}
	
	//peek method to return data at root
	public Process peek()
	{
		if (heap[0] ==null)
			return null;
		else
			return heap[0];		
	}
	
	//remove method to remove the first element
	public Process remove()
	{
		Process retVal = heap[0];
		//replace the root with the last non-empty element
		heap[0] = heap[tailIndex-1];
		//make sure to not duplicate it
		heap[tailIndex-1] = null;
		//make it null again
		tailIndex-=1;
		//bubble down
		this.bubbleDown();
		return retVal;
	}
	
	//helper method to bubble down for removing
	private void bubbleDown()
	{
		int tempIndex = 0; //temp at root
		while (tempIndex*2+1 < tailIndex)
		{
			//find larger child
			int bigIndex = tempIndex*2+1; //assume the left child is bigger
			if (tempIndex*2+2 < tailIndex && heap[tempIndex*2+1].compareTo(heap[tempIndex*2+2])<0)
			{
				//right child is bigger
				bigIndex = tempIndex*2+2;
			}
			//compare child to the parent
			if (heap[tempIndex].compareTo(heap[bigIndex])<0) //parent smaller than child
			{
				//SWAP
				Process temp = heap[tempIndex];
				heap[tempIndex] = heap[bigIndex];
				heap[bigIndex] = temp;
			}
			else
				break; //it is correct
			tempIndex = bigIndex;
		}
	}
	
	//method for printing the data
	public void printHeap()
	{
		for (Process data: heap)
			if (data!=null)
				System.out.println(data);
	}
	
	//method for checking empty heap
	public boolean isEmpty()
	{
		if (heap[0]==null)
			return true;
		else
			return false;
	}
}
