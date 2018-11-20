/*
 * Array implementation of a binary search tree
 */
public class ArrayBSTree<T extends Comparable> {
	//instance variables
	private T[] tree;
	public static final int DEF_SIZE = 1024;
	
	//constructors default and parameterized
	public ArrayBSTree()
	{
		tree = (T[]) (new Comparable[DEF_SIZE]);
	}
	public ArrayBSTree(int size)
	{
		if (size >0)
		{
			tree = (T[]) (new Comparable[size]);
		}
	}
	
	//insert to add data to the tree
	public void insert(T data)
	{
		if (tree[0] ==null)
			tree[0] = data;
		else
			//call recursive method
			insert(0,data);
			
	}
	
	//recursive helper method
	private void insert(int index, T data)
	{
		//check for null index
		if (tree[index] ==null)
		{
			//insert it
			tree[index] = data;
		}
		//go left
		else if(data.compareTo(tree[index])<0)
		{
			//in bounds of the array
			if ((index*2)+1<tree.length)
				insert((index*2)+1,data);
		}
		//go right
		else if (data.compareTo(tree[index])>=0)
		{
			//in bounds of the array
			if ((index*2)+2<tree.length)
				insert((index*2)+2,data);
		}
	}
	
	//preorder traversal
	public void printPreOrder()
	{
		//call recursive method
		printPreOrder(0);
	}
	
	//recursive helper method
	private void printPreOrder(int index)
	{
		//check for a null index
		if (tree[index] ==null)
		{
			return;
		}
		
		//process, go left, then go right
		System.out.println(tree[index]);
		if (index*2+1 < tree.length)
			printPreOrder(index*2+1);
		if (index*2+2 < tree.length)
			printPreOrder(index*2+2);
	}
	
	//breath order traversal
	public void printBreadthOrder()
	{
		for (T val: tree)
		{
			if (val !=null)
				System.out.println(val);
			else
				System.out.println("null");
		}
	}
	
	//delete method
	public void delete(T data)
	{
		delete(0,data);
	}
	
	//private helper method
	private void delete(int index, T data)
	{
		//search for the value
		if (index >=tree.length || tree[index] ==null)
			return; //value not found
		
		//go left
		if (data.compareTo(tree[index])<0)
			delete(index*2+1,data);
		//go right
		else if (data.compareTo(tree[index])>0)
			delete(index*2+2,data);
		//found it
		else
		{
			//has left or none
			if (index*2+2 < tree.length && tree[index*2+2]==null)
			{
				//move left subtree
				moveLeftSubTree(index);
				return;
			}
			//has right child
			if (index*2+2 < tree.length && tree[index*2+1] ==null)
			{
				//move right subtree
			}
		}
			
	}
	
	//helper method to move the left tree
	private void moveLeftSubTree(int index)
	{
		if (index >= tree.length)
			return;
		boolean isLeft = index%2 !=0;
		if (isLeft || index==0)
		{
			if (index*2+1<tree.length)
			{
				tree[index] = tree[index*2+1];
			}
			else
			{
				tree[index] = null;
				return;
			}
		}
		else //it is a right child
		{
			if ((index-1)*2+2 < tree.length)
			{
				tree[index] = tree[(index-1)*2+2]; //set right child to parent's sibling
			}
			else
			{
				tree[index] = null;
				return;
			}
		}
		moveLeftSubTree(index*2+1);
		moveLeftSubTree(index*2+2);
	}
	//helper method
	private void moveRightSubTree(int index)
	{
		if (index >= tree.length)
			return;
		boolean isLeft = index%2 !=0;
		if (!isLeft || index ==0)
		{
			
		}
	}
}



























































