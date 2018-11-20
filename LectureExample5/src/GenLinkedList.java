
public class GenLinkedList <T> {
	private class ListNode
	{
		//T is a generic type in java
		private T data;
		private ListNode link;
		//In a doubley linked list, add a current list and previous list
		public ListNode(T newData, ListNode newLink)
		{
			//parameterized constructor
			data = newData;
			link = newLink;
		}
		
	}
	//instance variables
	private ListNode head; //points to the start of list
	private ListNode curr; //points to node of interest
	private ListNode prev; //this is one node behind current NOT IN DOUBLY LINKEd
	
	public GenLinkedList()
	{
		head = curr = prev = null;
	}
	//insert at end of the list
	public void insert(T newData)
	{
		ListNode newNode = new ListNode(newData,null);
		//check your head
		if (head == null) // list is empty
		{
			head = newNode;
			curr = head;
			return;
		}
		//create new node to move through the list to the end
		ListNode temp = head;
		while (temp.link !=null)
		{
			temp = temp.link;
			
		}
		temp.link = newNode; // Point to last element
	}
	//insert after current
	public void insertAfterCurrent(T newData)
	{
		ListNode newNode = new ListNode(newData, null);
		if (curr !=null)
		{
			newNode.link = curr.link;
			curr.link = newNode;
		}
		else if (head !=null)
		{
			System.out.println("current interator has the end of the list");
		}
		else
		{
			System.out.println("Cannot use this to insert into empty list.");
		}
	}
	//delete current node
	public void deleteCurrentNode()
	{
		if (curr !=null && prev !=null) //current is in the middle
		{
			//move previous to current's link and make current equal to its link
			prev.link = curr.link;
			curr = curr.link;
		}
		else if (curr !=null && prev==null)//current is pointing at head
		{
			//scoots the pointer over and make current point back at head
			head = curr.link;
			curr = head;
		}
		else
		{
			System.out.println("can't delete current because it doesn't exist (null");
		}
	}
	//move current one element forward
	public void goToNext()
	{
		if (curr !=null)
		{
			//make prev point to current and curr point to curr.link
			prev = curr;
			curr = curr.link;
		}
	}
	public boolean moreToIterate()
	{
		return curr!=null;
	}
	public void resetIteration()
	{
		curr = head;
	}
	//getters and setters
	public T getDataAtCurrent()
	{
		if (curr !=null)
		{
			return curr.data;
		}
		else
		{
			return null;
		}
	}
	public void setDataAtCurrent(T newData)
	{
		if (curr !=null)
		{
			curr.data = newData;
		}
	}
	
}







