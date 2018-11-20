//Dylan Desai
public class Stack<T> {
	//inner node class
	private class Node
	{
		//instance variables
		private T data;
		private Node link;
		
		//constructor
		public Node(T aData, Node aLink)
		{
			this.data = aData;
			this.link = aLink;
		}
	}
	
	//instance variables for stack
	private Node head;
	
	//constructor
	public Stack()
	{
		head = null;
	}
	
	//push data
	public void push(T data)
	{
		//new node to insert with next link being the current head
		Node newNode = new Node(data, head);
		
		//make head point to the new node
		head = newNode;
	}
	
	//pop data
	public T pop()
	{
		//can't pop empty stack
		if (head==null)
			return null;
		
		//create tempval, move head, and return the val
		T out = head.data;
		head = head.link;
		return out;
	}
	
	//peek data
	public T peek()
	{
		if (head==null)
			return null;
		else
			return head.data;
	}
	
	//print the data
	public void print()
	{
		Node temp = head;
		while (temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
}
