/*
 * linked implementation of the stack
 */
public class LLStack<T> implements StackInterface {
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
		ListNode newNode = new ListNode((T) data,head);
		//head.link = newNode;
		head = newNode;
	}
	
	//pop removes and returns data
	public T pop()
	{
		if (head ==null) //empty stack
			return null;
		
		//create temp value
		T retVal = head.data;
		head = head.link;
		return retVal;
	}
	
	//peek, returns the data
	public T peek()
	{
		if (head ==null)
		{
			return null;

		}
		else
		{
			return head.data;
		}
		
	}
	
	//print prints data
	public void print()
	{
		ListNode temp = head;
		while (temp !=null)
		{
			System.out.println(head.data);
			temp = temp.link;
		}
	}
	
	//extra method that counts the number of elements in the stack
	public int getTotalNum()
	{
		int out=0;
		ListNode temp = head;
		while (temp !=null)
		{
			out+=1;
			temp = temp.link;
		}		
		return out;
	}
}
