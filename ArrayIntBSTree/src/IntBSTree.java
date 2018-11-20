public class IntBSTree {
	//instance variables
		private int[] tree;
		public static final int DEF_SIZE = 1024;
		
		//constructors default and parameterized
		public IntBSTree()
		{
			tree = new int[DEF_SIZE];
			for (int i=0;i<tree.length;i++)
			{
				tree[i] = -1;
			}
		}
		public IntBSTree(int size)
		{
			if (size >0)
			{
				tree = new int[size];
				for (int i=0;i<tree.length;i++)
				{
					tree[i] = -1;
				}
			}
			
		}
		
		//insert to add data to the tree
		public void insert(int data)
		{
			/*if (tree[0] ==-1)
				tree[0] = data;
			else*/
			
			//call recursive method
			insert(0,data);
				
		}
		
		//recursive helper method
		private void insert(int index, int data)
		{
			//check for null index
			if (tree[index] ==-1)
			{
				//insert it
				tree[index] = data;
			}
			//go left
			else if(data < tree[index])
			{
				//in bounds of the array
				if ((index*2)+1<tree.length)
					insert((index*2)+1,data);
			}
			//go right
			else if (data >= tree[index])
			{
				//in bounds of the array
				if ((index*2)+2<tree.length)
					insert((index*2)+2,data);
			}
		}
		
		//inorder traversal
		public void printInOrder()
		{
			//call recursive method
			printInOrder(0);
		}
		
		//recursive helper method
		private void printInOrder(int index)
		{
			//check for a null index
			if (tree[index] ==-1)
			{
				return;
			}
			
			//go left,process, then go right			
			if (index*2+1 < tree.length)
				printInOrder(index*2+1);
			System.out.println(tree[index]);
			if (index*2+2 < tree.length)
				printInOrder(index*2+2);
		}
		
		//breath order traversal
		public void printBreadthOrder()
		{
			for (int val: tree)
			{
				if (val !=-1)
					System.out.println(val);				
			}
		}
		
		//get depth of tree
		public int getDepth(int data)
		{
			//call recursive method starting from root
			return getDepth(0,data,0);
		}
		
		//helper recursive method for getting the depth
		private int getDepth(int index,int data, int depth)
		{
			//recursive block of statments
			if (tree[index] ==-1)
			{
				System.out.println("data is not in tree");
				return -1;
			}
			//go left and increase depth
			if (data < tree[index]) //&& tree[index*2+1] < tree.length
			{
				depth +=1;
				return getDepth(index*2+1,data,depth);
			}
			//go right and increase depth
			else if (data > tree[index]) //&& tree[index*2+2] < tree.length
			{
				depth +=1;
				return getDepth(index*2+2,data,depth);
			}
			else 
			{
				//we have reached the number and should return depth to that point
				return depth;
			}
			
		}
}
