/*
 * linked list implementation of a stack
 * Written by Dylan Desai with the help of J.J. Shepherd's lecture
 */
public class LLStack<T> {
	//inner node class
	private class ListNode
	{
		//instance variables
		private T data;
		private ListNode link;
		
		//constructor
		public ListNode(T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	
	//instance variable
	private ListNode head;
	
	//constructor
	public LLStack()
	{
		head = null;
	}
	
	//push adds data
	public void push(Object data)
	{
		ListNode newNode = new ListNode((T)data,head);
		head = newNode;
	}
	
	//pop removes and returns data
	public T pop()
	{
		if (head ==null) //empty stack
			return null;
		
		//create temp value, move head forward, and return temp value
		T retVal = head.data;
		head = head.link;
		return retVal;
	}
	
	//peek, returns the data
	public T peek()
	{
		//return data
		if (head ==null)
			return null;
		else
			return head.data;		
	}
	
	//print prints data in the stack
	public void print()
	{
		//cycle through list and print data
		ListNode temp = head;
		while (temp !=null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
	//extra method that counts the number of elements in the stack
	public int getTotalNum()
	{
		//output variable
		int out=0;
		
		//cycle through list and return result
		ListNode temp = head;
		while (temp !=null)
		{
			out+=1;
			temp = temp.link;
		}		
		return out;
	}
}
