//generic linked implementation of a binary search tree
/*
 * Written by Dylan Desai with the help of J.J. Shepherd's lecture
 */
public class LinkedBSTree<T extends Comparable> {
	//internal node class
	private class Node
	{
		//instance variables
		private T data;
		private Node leftChild;
		private Node rightChild;
		
		//constructor for node
		public Node(T aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	
	//instance variables
	private Node root; //head of the tree
	
	//constructor for trees
	public LinkedBSTree()
	{
		root = null;
	}
	
	//adding data to the tree
	public void insert(T data)
	{
		/*//add it if it is empty
		if (root==null)
		{
			root = new Node(data);
		}
		
		//insert recursive
		insert(root,data);*/
		root = insert(root,data);
	}
	
	//helper method for insert
	private Node insert(Node aNode, T data)
	{
		//stopping condition
		if (aNode ==null)
			aNode = new Node(data);
		//GO LEFT
		else if (data.compareTo(aNode.data)<0)
			aNode.leftChild = insert(aNode.leftChild,data);
		//GO RIGHT
		else if (data.compareTo(aNode.data)>=0) 
			aNode.rightChild = insert(aNode.rightChild,data);
		return aNode;
	}
	
	//searching for data
	public boolean search(T data)
	{
		//call recursive search
		return search(root,data);
	}
	
	//helper search method BIG O N when not balanced. BIG O LOG N when balanced
	private boolean search(Node aNode, T data)
	{
		if (aNode ==null)
			return false;
		if (data.compareTo(aNode.data) ==0)
		{
			return true;
		}
		//GO LEFT
		else if (data.compareTo(aNode.data) <0)
		{
			return search(aNode.leftChild,data);
		}
		//GO RIGHT
		else
		{
			return search(aNode.rightChild,data);
		}
	}
	
	//delete method
	public void delete(T data)
	{
		root = delete(root,data);
	}
	
	//delete helper method
	private Node delete(Node aNode, T data)
	{
		//look for the value
		if (aNode == null) //value is not in the tree
			return null;
		//go left
		if (data.compareTo(aNode.data) <0)
		{
			aNode.leftChild = delete(aNode.leftChild, data); 
		}
		// go right
		else if (data.compareTo(aNode.data) >0)
		{
			aNode.rightChild = delete(aNode.rightChild, data);
		}
		//found it. delete it
		else 
		{
			if (aNode.rightChild ==null) //No children or maybe a left child
				return aNode.leftChild;
			else if (aNode.leftChild ==null) //Only have a right child
				return aNode.rightChild;
			//it has two
			else
			{
				//temporary value that holds on to memory reference of the value to get rid of
				Node temp = aNode;
				//find min in right tree
				aNode = findMinInTree(aNode.rightChild);
				//delete min from right tree
				aNode.rightChild = deleteMinFromTree(temp.rightChild);
				// make sure left is still left
				aNode.leftChild = temp.leftChild;
			}
				
		}
		return aNode;
	}
	
	//helper method for delete
	private Node findMinInTree(Node aNode)
	{
		if (aNode ==null)
			return null;
		if (aNode.leftChild ==null)
			return aNode;
		else
			return findMinInTree(aNode.leftChild);
	}
	
	//helper method for delete
	private Node deleteMinFromTree(Node aNode)
	{
		if (aNode ==null)
			return null;
		if (aNode.leftChild ==null)
			return aNode.rightChild;
		aNode.leftChild = deleteMinFromTree(aNode.leftChild);
		return aNode;
		
	}
	
	//printing traversal (preorder)
	public void printPreOrder()
	{
		printPreOrder(root);
	}
	
	//helper recursive method for printing the preorder traversal
	private void printPreOrder(Node aNode)
	{
		if (aNode==null)
			return;
		
		//process, left, then right
		System.out.println(aNode.data);
		
		if (aNode.leftChild !=null)
		{
			printPreOrder(aNode.leftChild);
		}
		
		if (aNode.rightChild !=null)
		{
			printPreOrder(aNode.rightChild);
		}
	}
	
	//printing traversal (In order)
	public void printInOrder()
	{
		printInOrder(root);
	}
	
	//helper recursive method for printing the Inorder traversal
	private void printInOrder(Node aNode)
	{
		if (aNode==null)
			return;
		
		//Left, process, then right		
		if (aNode.leftChild !=null)
		{
			printInOrder(aNode.leftChild);
		}
		
		System.out.println(aNode.data);
		
		if (aNode.rightChild !=null)
		{
			printInOrder(aNode.rightChild);
		}
	}
	
	//printing traversal (post order)
	public void printPostOrder()
	{
		printPostOrder(root);
	}
	
	//helper recursive method for printing the Post order traversal
	private void printPostOrder(Node aNode)
	{
		if (aNode==null)
			return;
		
		//Left,right, then process		
		if (aNode.leftChild !=null)
		{
			printPostOrder(aNode.leftChild);
		}
		
		if (aNode.rightChild !=null)
		{
			printPostOrder(aNode.rightChild);
		}
		
		System.out.println(aNode.data);
	}
	
	
}
