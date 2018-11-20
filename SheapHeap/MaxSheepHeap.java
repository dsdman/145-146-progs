import java.util.Arrays;

/*
 * Written by Dylan Desai
 */
public class SheepHeap {
	//instance variables
	private Sheep[] heap;
	public static final int DEF_SIZE = 128;
	private int tailIndex; //first null index
	
	//constructors
	public SheepHeap()
	{
		heap = new Sheep[DEF_SIZE];
		tailIndex = 0;
	}	
	public SheepHeap (int aSize)
	{
		if (aSize <=0)
			return;
		heap = new Sheep[aSize];
		tailIndex = 0;
	}
	
	//insert method
	public void addSheep(Sheep data)
	{
		//the heap is full
		if (tailIndex >= heap.length)
			return;
		//insert the data
		heap[tailIndex] = data;
		//climb up		
		this.climbUp();
		//move the tail to the next null index
		tailIndex +=1;
	}
	
	//helper method for the insert
	private void climbUp()
	{
		int tempIndex = this.tailIndex;
		while (tempIndex >0 && heap[(tempIndex-1)/2].compareTo(heap[tempIndex]) <0)
		{
			//SWAP
			Sheep temp = heap[(tempIndex-1)/2];
			heap[(tempIndex-1)/2] = heap[tempIndex];
			heap[tempIndex] = temp;
			tempIndex = (tempIndex-1)/2;
		}
	}
	
	//remove method to remove the first element
	public Sheep removeSheep()
	{
		Sheep retVal = heap[0];
		//replace the root with the last non-empty element
		heap[0] = heap[tailIndex-1];
		//make sure to not duplicate it
		heap[tailIndex-1] = null;
		//make it null again
		tailIndex-=1;
		//climb down
		this.climbDown();
		return retVal;
	}
	
	//helper method to climb down for removing
	private void climbDown()
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
				Sheep temp = heap[tempIndex];
				heap[tempIndex] = heap[bigIndex];
				heap[bigIndex] = temp;
			}
			else
				break; //it is correct 
			tempIndex = bigIndex;
		}
	}
	
	//sheep roll call ie breadth order traversal
	public void sheepRollCall()
	{
		for (Sheep data: heap)
		{
			if (data !=null)
				System.out.println(data);
		}
	}
	
	//return sorted array of sheep
	public Sheep[] sheepHeapSort()
	{
		//sheep to return
		Sheep[] out = new Sheep[heap.length];
		
		//populate with equal values
		for (int i=0;i<out.length;i++)
			if (heap[i]!=null)
				out[i] = heap[i];
		
		//sort and return
		Arrays.sort(out);
		return out;
		
		/*
		for (int i=tailIndex;i>0;i--)
		{
			System.out.println(this.removeSheep());
		}*/
	}
	
}
