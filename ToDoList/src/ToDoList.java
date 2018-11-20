/*
 * Dylan Desai
 */

public class ToDoList {
	//internal class for the nodes
	private class ListNode
	{
		public String data;
		public ListNode link;
		
		//constructors
		public ListNode()
		{
			this.data = "";
			this.link = null;
		}
		public ListNode(String aData, ListNode aNode)
		{
			this.data = aData;
			this.link = aNode;
		}
	}
	
	//instance variables for Todo list
	ListNode head;
	ListNode current;
	ListNode previous;
	
	//constructor
	public ToDoList()
	{
		head = current = previous = null;
	}
	
	//go to next and go to previous
	public void goToNext()
	{
		if (current !=null)
		{
			//make previous current and make current equal to the next node
			previous = current;
			current = current.link;
		}
	}
	public void goToPrev()
	{
		if (previous !=null && current !=head)
		{
			//make current equal previous
			current = previous;
		}
	}
	
	//get and set data at current
	public String getDataAtCurrent()
	{
		if (current == null)
		{
			return null;
		}
		else
		{
			return current.data;
		}
	}
	public void setDataAtCurrent(String aData)
	{
		if (current == null)
		{
			return;
		}
		else
		{
			current.data = aData;
		}
	}
	
	//Add, insert, and delete
	public void addItem(String newData)
	{
		ListNode newNode = new ListNode(newData, null);
		//start list if head is null
		if (head ==null)
		{
			head = newNode;
			current = head;
			return;
		}
		
		//cycle through list using loop to insert at end
		ListNode temp = head;
		while (temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	public void insertAfterCurrent(String newData)
	{
		ListNode newNode = new ListNode(newData,null);
		//make current link to new node
		if (current !=null)
		{
			newNode.link = current.link;
			current.link = newNode;
		}
		
		
	}
	public void deleteCurrentNode()
	{
		//make previous link to current's next node and make current equal to the next node
		previous.link = current.link;
		current = current.link;
	}
	
	//print the list
	public void showList()
	{
		ListNode temp = head;
		//cycle through list and print
		while (temp !=null)
		{
			System.out.print(temp.data + "\n");
			temp = temp.link;
		}
	}
	
}
