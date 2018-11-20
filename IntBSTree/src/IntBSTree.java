/*
 * Written by Dylan Desai
 */
public class IntBSTree {
	//internal node class
	private class Node
	{
		//instance variables
		private int data;
		private Node leftChild;
		private Node rightChild;
		
		//constructor
		public Node(int aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	
	//instance variable and constructor
	private Node root;	
	public IntBSTree()
	{
		root = null;
	}
	
	//inserts data into tree
	public void insert(int data)
	{		
		//insert using recursive helper method
		root = insert(root,data);
	}
	
	//helper method for the insert
	private Node insert(Node aNode, int data)
	{
		//the stopping condition
		if (aNode ==null)	
		{
			aNode = new Node(data);
		}
		//check for going left
		else if (data < aNode.data)
		{
			aNode.leftChild = insert(aNode.leftChild,data);
		}
		//check for going right
		else 
		{
			aNode.rightChild = insert(aNode.rightChild,data);
		}
		
		//return the final node
		return aNode;
	}
	
	//removes data from tree
	public void remove(int data)
	{
		//start looking for value with recursive method
		root = remove(root,data);
	}
	private Node remove(Node aNode, int data)
	{
		//check for null current node
		if (aNode==null)
		{
			System.out.println("Value not found.");			
			return null;
		}
		//go left if data is less than current node
		if (data < aNode.data)
		{
			aNode.leftChild = remove(aNode.leftChild,data);
		}
		//go right if data is more than current node
		else if (data > aNode.data)
		{
			aNode.rightChild = remove(aNode.rightChild, data);
		}
		//otherwise, they are equal and we need to remove it
		else
		{
			//handle only one child
			if (aNode.rightChild ==null)
			{
				return aNode.leftChild;
			}
			else if (aNode.leftChild ==null)
			{
				return aNode.rightChild;
			}
			//handle two children
			else
			{
				//keep the current node for later
				Node temp = aNode;
				//find minimum value in right tree
				aNode = findMinInTree(aNode.rightChild);
				//delete minimum value in right tree
				aNode.rightChild = deleteMinFromTree(temp.rightChild);
				//keep the left tree
				aNode.leftChild = temp.leftChild;
			}
		}
		return aNode;
	}
	
	//helper method for delete to find min value
	private Node findMinInTree(Node aNode)
	{
		//check for null current node
		if (aNode ==null)
		{
			System.out.println("Does not exist in tree");
			return null;
		}
		//if current is left-most, then it is the minimum in tree
		if (aNode.leftChild ==null)
		{
			return aNode;
		}
		//otherwise keep going left
		else
		{
			return findMinInTree(aNode.leftChild);
		}
	}
	
	//helper method for delete to delete the min value
	private Node deleteMinFromTree(Node aNode)
	{
		if (aNode ==null)
		{
			System.out.println("Does not exist in tree");
		}
		//if current does not have left child, return right child
		if (aNode.leftChild ==null)
		{
			return aNode.rightChild;
		}
		//keep going left
		aNode.leftChild = deleteMinFromTree(aNode.leftChild);
		return aNode;
	}
	
	//prints the pre-order traversal (left, then right)
	public void printPreorder()
	{
		//call recursive method starting from root
		printPreorder(root);
	}
	
	//helper method for printing preorder traversal
	private void printPreorder(Node aNode)
	{
		//print if not null and then move to left and right subtrees
		if (aNode !=null)
		{
			System.out.println(aNode.data);
			printPreorder(aNode.leftChild);
			printPreorder(aNode.rightChild);
		}		
			
	}
	
	//get depth of tree
	public int getDepth(int data)
	{
		//call recursive method starting from root
		return getDepth(root,data,0);
	}
	
	//helper recursive method for getting the depth
	private int getDepth(Node aNode, int data, int depth)
	{		
		//recursive block of statments
		if (aNode ==null)
		{
			System.out.println("data is not in tree");
			return -1;
		}
		//go left and increase depth
		if (data < aNode.data)
		{
			depth +=1;
			return getDepth(aNode.leftChild,data,depth);
		}
		//go right and increase depth
		else if (data > aNode.data)
		{
			depth +=1;
			return getDepth(aNode.rightChild,data,depth);
		}
		//we have reached the number and should return depth to that point
		return depth;
	}
}
