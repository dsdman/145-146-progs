/*
 * linked implementation of queue
 */
public class LLQueue <T> implements QueueInterface {
	//inner node class
	private class ListNode
	{
		//instance variables
		T data;
		ListNode link;
		
		//parameterized constructor
		public ListNode(T aData, ListNode aLink)
		{
			this.data = aData;
			this.link = aLink;
		}
	}
	
	//instance variables
	private ListNode head;
	private ListNode tail;
	
	//default constructor
	public LLQueue()
	{
		head = tail = null;
	}
	
	//adds to queue
	public void enqueue(Object data)
	{
		ListNode newNode = new ListNode((T)data,null);
		if (head ==null) //empty list
		{
			head = newNode;
			tail = head;
			return;
		}
		tail.link = newNode;
		tail = newNode;
	}
	
	//removing first element and return item
	public T dequeue()
	{
		if (head ==null) //empty list
		{
			return null;
		}
		ListNode temp = head;
		head = head.link;
		return temp.data;		
	}
	
	//return data
	public T peek()
	{
		if (head ==null)
		{
			return null;
		}
		return head.data;
	}
	
	//prints the queue
	public void print()
	{
		ListNode temp = head;
		while (temp !=null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
}