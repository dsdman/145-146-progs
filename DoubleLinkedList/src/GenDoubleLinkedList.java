/*
 * Written by Dylan Desai
 */
public class GenDoubleLinkedList <T> {
	//node class
	private class ListNode
	{
		//instance variables
		private T data;
		private ListNode nextLink;
		private ListNode prevLink;
		
		//constructors
		public ListNode()
		{
			data = null;
			nextLink = null;
			prevLink = null;
		}
		public ListNode(T newData, ListNode newLinkNext, ListNode newLinkPrev)
		{
			data = newData;
			nextLink = newLinkNext;
			prevLink = newLinkPrev;
		}
	}
	
	//instance variables
	ListNode head;
	ListNode current;
	
	//constructor
	public GenDoubleLinkedList()
	{
		//initialize head and make current point to head
		current = new ListNode();
		head = null;
		current = head;
	}
	
	//getter and setter
	public T getDataAtCurrent()
	{
		if (current !=null)
		{
			return current.data;
		}
		else
		{
			return null;
		}
	}

	public void setDataAtCurrent(T newData)
	{
		current.data = newData;
	}
	
	//go to next node
	public void goToNext()
	{
		if (current.nextLink !=null)
		{
			//current.prevLink = current;
			current = current.nextLink;
		}
	}
	
	//go to previous node
	public void goToPrev()
	{
		if (current !=null)
		{
			//current.nextLink = current;
			current = current.prevLink;
		}
	}
	
	//insert and insert after current
	public void insertAfterCurrent(T newData)
	{
		ListNode newNode = new ListNode(newData,null,current);
		//start list if empty
		if (head ==null)
		{
			head = newNode;
			current = head;
			current.prevLink = null;
			return;
		}
		
		//add it after current if list is not empty
		if (current !=null)
		{
			newNode.prevLink = current;
			newNode.nextLink = current.nextLink;
			current.nextLink = newNode;
		}
		else if (head !=null)
		{
			System.out.println("iterated too far.");
		}
	}
	
	//deletes current node
	public void deleteCurrentNode()
	{
		if (current !=null && current.prevLink !=null) //current is in the middle of list
		{
			//make previous link's next link point to current's next link, then move current forward
			current.prevLink.nextLink = current.nextLink;
			current = current.nextLink;
		}
		else if (current !=null && current.prevLink ==null)//current is pointing at head
		{
			//moves the pointer over and make current point back at head
			head = current.nextLink;
			current = head;
		}
		else
		{
			System.out.println("Can't delete null current");
		}
	}
	
	//prints list
	public void showList()
	{
		//variable
		ListNode temp = head;
		
		//cycle through list and print
		while (temp !=null)
		{
			System.out.print(temp.data + "\n");
			temp = temp.nextLink;
		}
	}
	
	//checks whether data is in the list
	public boolean inList(T Data)
	{
		//variables
		boolean out = false;
		ListNode temp = head;
		
		//cycle through list to find data
		while (temp !=null)
		{
			if (temp.data == Data || temp.data.equals(Data))
			{
				out = true;
			}
			temp = temp.nextLink;
		}
		return out;
	}
}
