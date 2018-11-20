/*
 * array implementation of a queue
 */
public class ArrayQueue<T> implements QueueInterface{
	//instance variables
	private T[] queue;
	private int tailIndex;
	public static final int DEFFAULT_SIZE = 50;
	
	//constructors and initialization
	public ArrayQueue()
	{
		this.init(DEFFAULT_SIZE);
	}
	public ArrayQueue(int size)
	{
		this.init(size);
	}
	private void init(int size)
	{
		tailIndex = 0;
		if (size > 0)
			queue = (T[])(new Object[size]);
	}
	
	//add an element to the queue
	public void enqueue(Object data)
	{
		if (this.queue.length <= this.tailIndex+1)
		{
			System.out.println("The queue is full");
			return;
		}
		this.queue[tailIndex] = (T)data;
		this.tailIndex++;
	}
	
	//returns and removes head of queue
	public T dequeue()
	{
		if (tailIndex ==0)
		{
			return null;
		}
		
		T retItem = queue[0];
		for (int i=0;i<tailIndex;i++)
		{
			queue[i] = queue[i+1];
		}
		tailIndex--;
		return retItem;
	}
	
	//returns the value of head
	public T peek()
	{
		return queue[0];
	}
	
	//prints the queue
	public void print()
	{
		for (int i=0;i<tailIndex;i++)
		{
			System.out.println(queue[i]);
		}
	}

}



