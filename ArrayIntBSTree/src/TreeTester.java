public class TreeTester {

	public static void main(String[] args) {
		//greeting and create tree
		System.out.println("This tests the array implemnetation of the BS Tree\nCreating tree");
		IntBSTree tree = new IntBSTree();
		
		//test insreting values
		System.out.println("\nPopulating tree with values");
		tree.insert(4);
		tree.insert(2);
		tree.insert(8);
		tree.insert(1);
		tree.insert(3);
		tree.insert(7);
		tree.insert(10);
		tree.insert(5);
		tree.insert(9);
		tree.insert(6);
		
		//test in order print
		System.out.println("\nPrinting in-order traversal");
		tree.printInOrder();
		
		//test breadth order print
		System.out.println("\nPrinting breadth-order traversal");
		tree.printBreadthOrder();
		
		//test depth
		System.out.println("\nGetting depth of 6");
		System.out.println(tree.getDepth(6));
		System.out.println("\nGetting depth of 14");
		System.out.println(tree.getDepth(14));
	}

}
