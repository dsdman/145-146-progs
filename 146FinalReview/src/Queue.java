//Dylan Desai
public class Queue<T> {
	//inner node class
	private class Node
	{
		//instance varaibels
		T data;
		Node link;
		
		//constructor
		public Node(T aData, Node aLink)
		{
			this.data = aData;
			this.link = aLink;
		}
	}
	//instance variables
	private Node head;
	private Node tail;
	
	//constructor
	public Queue()
	{
		head = tail = null;
	}
	
	//enqueue
	public void enqueue(T data)
	{
		Node newNode = new Node(data, null);
		//add to empty list
		if (head ==null)
		{
			head = newNode;
			tail = head;
			return;
		}
		//add it to end of list otherwise
		tail.link = newNode;
		tail = tail.link;
	}
	
	//dequeue
	public T dequeue()
	{
		//can't dequeue empty list
		if (head==null)
			return null;
		
		//delete head and return its data
		Node temp = head;
		head = head.link;
		return temp.data;
	}
	
	//peek
	public T peek()
	{
		//can't peek empty list
		if (head==null)
			return null;
		
		//otherwise return the data at head
		return head.data;
	}
	
	//print
	public void print()
	{
		//traverse queue and print
		Node temp = head;
		while (temp !=null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
}
