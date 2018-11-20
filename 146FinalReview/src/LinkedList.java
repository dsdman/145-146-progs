//Written by Dylan Desai
public class LinkedList<T> {
	//inner node class
	private class Node
	{
		//instance variables
		private Node link;
		private T data;
		
		//parameterized constructor
		public Node(T data, Node newLink)
		{
			this.link = newLink;
			this.data = data;
		}
		//default constructor
		public Node()
		{
			data = null; 
			link = null;
		}
	}
	
	//instance variables for list
	private Node head;
	private Node current;
	private Node previous;
	
	//constructor
	public LinkedList()
	{
		head = current = previous = null;
	}
	
	//insert method
	public void insert(T data)
	{
		//create node to insert
		Node newNode = new Node(data,null);
		
		//insert if blank list
		if (head==null)
		{
			head = newNode;
			current = head;
			return;
		}
		
		//traverse to empty node and insert
		Node temp = head;
		while (temp.link !=null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	
	//method to insert after the current node
	public void insertAfterCurrent(T data)
	{
		//create a node to insert
		Node newNode = new Node(data, null);
		
		//insert the node after current
		newNode.link = current.link;
		current.link = newNode;
	}
	
	//go to next method
	public void goToNext()
	{
		//make current next and prev current
		if (current.link !=null)
		{
			this.previous = current;
			this.current = current.link;			
		}
	}
	
	//go to the previous link
	public void goToPrev()
	{
		if (this.previous !=null)
		{
			//set current to previous
			this.current = previous;
			
			//don't change previous if current is at head
			if (current ==head)
			{
				return;
			}
			
			//find link before current and set that to previous
			Node temp = head;
			
			while (temp.link !=current)
			{
				temp = temp.link;
			}
			previous = temp;
		}
		else
			System.out.println("previous does not exist or is null");
	}
	
	//print the list
	public void printList()
	{
		Node temp = head;
		while (temp !=null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
	//delete current link
	public void delete()
	{
		//current is somewhere in the middle
		if (current!=null && previous!=null)
		{
			previous.link = current.link;
			current = current.link;
		}
		//current is at head
		else if (current!=null && previous==null)
		{
			head = current.link;
			current = head;
		}
	}
	
	//gets current data
	public T getCurrentData()
	{
		if (current!=null)
			return current.data;
		else
			return null;
	}
	//set current data
	public void setCurrentData(T aData)
	{
		if (current !=null)
			current.data = aData;
	}
}
