/*
 * Array implementation of a max heap
 */
public class ArrayHeap<T extends Comparable> {
	//instance variables
	private T[] heap;
	public static final int DEF_SIZE = 128;
	private int tailIndex; //first null index
	
	//constructors
	public ArrayHeap()
	{
		heap = (T[])(new Comparable[DEF_SIZE]);
		tailIndex = 0;
	}	
	public ArrayHeap (int aSize)
	{
		if (aSize <=0)
			return;
		heap = (T[]) (new Comparable[aSize]);
		tailIndex = 0;
	}
	
	//insert method
	public void insert(T data)
	{
		//the heap is full
		if (tailIndex >= heap.length)
			return;
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
		//keep swapping while the temp hasn't reached the root and the parent is less than the temp
		while (tempIndex >0 && heap[(tempIndex-1)/2].compareTo(heap[tempIndex]) <0)
		{
			//SWAP
			T temp = heap[(tempIndex-1)/2];
			heap[(tempIndex-1)/2] = heap[tempIndex];
			heap[tempIndex] = temp;
			tempIndex = (tempIndex-1)/2;
		}
	}
	
	//remove method to remove the first element
	public T remove()
	{
		T retVal = heap[0];
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
		//keep finding the bigIndex until the end of the tree
		while (tempIndex*2+1 < tailIndex)
		{
			//find larger child
			int bigIndex = tempIndex*2+1; //assume the left child is bigger
			//check whether the tmp's right isn't null and the temp's left is less than the temp's right 
			if (tempIndex*2+2 < tailIndex && heap[tempIndex*2+1].compareTo(heap[tempIndex*2+2])<0)
			{
				//right child is bigger
				bigIndex = tempIndex*2+2;
			}
			//compare child to the parent
			if (heap[tempIndex].compareTo(heap[bigIndex])<0) //parent smaller than child
			{
				//SWAP
				T temp = heap[tempIndex];
				heap[tempIndex] = heap[bigIndex];
				heap[bigIndex] = temp;
			}
			else
				break; //it is correct so far
			//move the temp index to the big index
			tempIndex = bigIndex;
		}
	}
	
	//sort it big oh olog n
	public void heapSort()
	{
		for (int i=tailIndex;i>0;i--)
		{
			System.out.println(this.remove());
		}
	}
}
