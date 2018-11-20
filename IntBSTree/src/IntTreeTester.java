/*
 * Written by Dylan Desai
 */
public class IntTreeTester {

	public static void main(String[] args) {
		//variable
		IntBSTree tree = new IntBSTree();
		
		//greeting and insert values into tree
		System.out.println("Testing the integer tree");
		System.out.println("Testing inserting ten numbers");
		System.out.println("Inserting 8");
		tree.insert(8);
		System.out.println("Inserting 13");
		tree.insert(13);
		System.out.println("Inserting 3");
		tree.insert(3);
		System.out.println("Inserting 4");
		tree.insert(4);
		System.out.println("Inserting 18");
		tree.insert(18);
		System.out.println("Inserting 19");
		tree.insert(19);
		System.out.println("Inserting 10");
		tree.insert(10);
		System.out.println("Inserting 1");
		tree.insert(1);
		System.out.println("Inserting 9");
		tree.insert(9);
		System.out.println("Inserting 2");
		tree.insert(2);
		
		//test printing pre-order traversal
		System.out.println("Printing pre-order traversal");
		tree.printPreorder();
		
		//test removing int
		System.out.println("Removing the number 4");
		tree.remove(4);
		tree.printPreorder();
		
		//test depth
		System.out.println("The depth of 9 is "+tree.getDepth(9));
	}

}
