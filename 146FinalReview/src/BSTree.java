//Dylan Desai
public class BSTree<T extends Comparable>  {
	//inner node class
	private class Node
	{
		//instance variables
		private T data;
		private Node leftChild;
		private Node rightChild;
		
		//constructor
		public Node(T aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	
	//instance variables
	private Node root;
	
	//constructor
	public BSTree()
	{
		this.root =null;
	}
	
	//insert method
	public void insert(T data)
	{
		//insert starting from root
		root = insert(root, data);
	}
	private Node insert(Node aNode, T data)
	{
		//stop and insert when aNode is null
		if (aNode ==null)
			aNode = new Node(data);
		//go left
		if (data.compareTo(aNode.data) <0)
			aNode.leftChild = insert(aNode.leftChild,data);
		else if (data.compareTo(aNode.data) >0)
			aNode.rightChild = insert(aNode.rightChild,data);
		//return the node
		return aNode;
	}
	
	//pre order traversal
	public void printPreOrder()
	{
		//print the preorder starting from root
		printPreOrder(root);
	}
	private void printPreOrder(Node aNode)
	{
		//exit when the node is null
		if (aNode==null)
			return;
		
		//process, left, then right
		System.out.println(aNode.data);
		if (aNode.leftChild !=null)
			printPreOrder(aNode.leftChild);
		
		if (aNode.rightChild !=null)
			printPreOrder(aNode.rightChild);
	}
	
	//in order traversal
	public void printInOrder()
	{
		//print the preorder starting from root
		printInOrder(root);
	}
	private void printInOrder(Node aNode)
	{
		//exit when the node is null
		if (aNode==null)
			return;
		
		//left,process, then right
		if (aNode.leftChild !=null)
			printInOrder(aNode.leftChild);
		
		System.out.println(aNode.data);
		
		if (aNode.rightChild !=null)
			printInOrder(aNode.rightChild);
	}
	
	//post order traversal
	public void printPostOrder()
	{
		//print the preorder starting from root
		printPostOrder(root);
	}
	private void printPostOrder(Node aNode)
	{
		//exit when the node is null
		if (aNode==null)
			return;
		
		//left,right, process
		if (aNode.leftChild !=null)
			printPostOrder(aNode.leftChild);
		
		if (aNode.rightChild !=null)
			printPostOrder(aNode.rightChild);
		
		System.out.println(aNode.data);
	}
	
	
}
