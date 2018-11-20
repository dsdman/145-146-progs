//A node contains some data and a pointer(link) to the next node
//.link is accessing the link to move to the next node.

public class IntNodeStructure {
	//nested class for the nodes
	private class ListNode
	{
		//instance variables of nested class
		private int data;
		private ListNode link;
		//parameterized constructor of nested class
		public ListNode(int aData, ListNode aLink)
		{
			this.data = aData;
			this.link = aLink;
		}
	}
	
	//instance variables for main class	
	private ListNode head; //first element
	private ListNode curr; // current node of interest
	private ListNode prev; //node behind current
	
	//default constructor of main class
	public IntNodeStructure()
	{
		head = curr = prev = null;
	}
	
	//inserts new element at the end of the list
	public void insert(int newData)
	{
		ListNode newNode = new ListNode(newData,null);
		if (head == null) //empty list
		{
			head = newNode;
			curr = head;
			return;
		}
		//Adds to the end of the list
		ListNode temp = head;
		while (temp.link != null)
		{
			temp = temp.link; //keep moving to the next node
			
		}
		temp.link = newNode;
	}
	
	//insert after current
	public void insertAfterCurrent(int newData)
	{
		ListNode newNode = new ListNode(newData,null);
		if (curr !=null)
		{
			newNode.link = curr.link;
			curr.link = newNode;
		}
		else if (head !=null)
		{
			System.out.println("Current iterated too far");
		}
		else
		{
			System.out.println("Trying to insert in an empty list");
		}
	}
	
	//iterations
	public void moveToNext()
	{
		prev = curr;
		curr = curr.link;
	}
	public void resetIter()
	{
		prev = null;
		curr = head;
	}
	
	//getters and setters
	public int getDataAtCurrent()
	{
		return curr.data;
	}
	public void setDataAtCurrent(int aData)
	{
		if (curr != null)
		{
			curr.data = aData;
		}
	}
	
	//delete and print 
	public void deleteCurrent()
	{
		if (curr !=null && prev !=null) //middle of the list
		{
			prev.link = curr.link;
			curr = curr.link;
		}
		else if (curr !=null && prev==null) //first element is deleted
		{
			head = curr.link;
			curr = head;
		}
		else
		{
			System.out.println("list is empty, cannot delete from it.");
		}
	}
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
